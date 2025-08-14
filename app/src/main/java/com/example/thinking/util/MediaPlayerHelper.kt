package com.example.thinking.util

import android.content.Context
import android.net.Uri
import android.view.View
import androidx.media3.common.C
import androidx.media3.common.MediaItem
import androidx.media3.common.MediaMetadata
import androidx.media3.common.Metadata
import androidx.media3.common.PlaybackException
import androidx.media3.common.PlaybackParameters
import androidx.media3.common.Player
import androidx.media3.common.Timeline
import androidx.media3.common.Tracks
import androidx.media3.datasource.DataSource
import androidx.media3.datasource.DefaultDataSource
import androidx.media3.exoplayer.DefaultRenderersFactory
import androidx.media3.exoplayer.ExoPlaybackException
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.exoplayer.source.BehindLiveWindowException
import androidx.media3.exoplayer.source.MediaSource
import androidx.media3.exoplayer.source.ProgressiveMediaSource
import androidx.media3.extractor.DefaultExtractorsFactory
import androidx.media3.ui.PlayerView
import com.example.thinking.BuildConfig
import java.net.CookieHandler
import java.net.CookieManager
import java.net.CookiePolicy
import kotlin.also
import kotlin.apply
import kotlin.collections.all
import kotlin.collections.any
import kotlin.collections.joinToString
import kotlin.ranges.until
import kotlin.run
import kotlin.sequences.any
import kotlin.sequences.joinToString
import kotlin.sequences.toList
import kotlin.text.startsWith
import kotlin.to

@Suppress("UnsafeOptInUsageError")
class MediaPlayerHelper(
    private val playerView: PlayerView
) {
    private val context: Context = playerView.context
    private val helper = this

    var extractorsFactory = DefaultExtractorsFactory()
        .setConstantBitrateSeekingEnabled(true)
    var sourceFactory: MediaSource.Factory? = null
    var uri: Uri? = null
        set(value) {
            val oldUri = field
            if (value != oldUri) {
                playerNeedPrepare = true
                clearResumePosition()
            }
            playWhenReady = autoPlay
            field = value
        }
    var autoPlay = true
    var playWhenReady = autoPlay
        set(value) {
            field = value
            player?.playWhenReady = value
        }

    var player: ExoPlayer? = null
        private set
    var playerNeedPrepare = false
        private set
    private var resumePause = false
    private var resumeWindow = C.INDEX_UNSET
    private var resumePosition: Long = C.TIME_UNSET
    private var willSeekTo: Long? = null

    var progressListener: ProgressListener? = null
    var playerListener: Player.Listener? = null
        set(value) {
            field = value
            playerListenerDelegate.listener = value
        }

    private val playerListenerDelegate = object : PlayerListenerDelegate(playerListener) {

        init {
            debug = BuildConfig.DEBUG
        }

        override fun onEvents(player: Player, events: Player.Events) {
            super.onEvents(player, events)
        }

        override fun onTimelineChanged(timeline: Timeline, reason: Int) {
            val duration = player?.duration
            val haveResumePosition = resumePosition != C.TIME_UNSET || willSeekTo != null
            val hasDuration = duration != null && duration != C.TIME_UNSET
            if (haveResumePosition && hasDuration) {
                val position = willSeekTo?.also {
                    willSeekTo = null
                } ?: run {
                    if (resumePosition != C.TIME_UNSET) {
                        resumePosition
                    } else null
                }
                // 跳过播放结束内容
                if (position != null && position + FIX_PLAY_END < duration) {
                    player?.seekTo(position)
                }
                if (resumePause) player?.pause()
                Logcat.msg(TAG, "onTimelineChanged seek $position")
                clearResumePosition()
            }
            if (hasDuration) updateProgress()
            super.onTimelineChanged(timeline, reason)
        }

        override fun onMediaItemTransition(mediaItem: MediaItem?, reason: Int) {
            super.onMediaItemTransition(mediaItem, reason)
        }

        override fun onTracksChanged(tracks: Tracks) {
            super.onTracksChanged(tracks)
        }

        override fun onMediaMetadataChanged(mediaMetadata: MediaMetadata) {
            super.onMediaMetadataChanged(mediaMetadata)
        }

        override fun onIsLoadingChanged(isLoading: Boolean) {
            super.onIsLoadingChanged(isLoading)
        }

        override fun onAvailableCommandsChanged(availableCommands: Player.Commands) {
            super.onAvailableCommandsChanged(availableCommands)
        }

        override fun onPlaybackStateChanged(playbackState: Int) {
            super.onPlaybackStateChanged(playbackState)
        }

        override fun onPlayWhenReadyChanged(playWhenReady: Boolean, reason: Int) {
            helper.playWhenReady = playWhenReady
            super.onPlayWhenReadyChanged(playWhenReady, reason)
        }

        override fun onPlaybackSuppressionReasonChanged(playbackSuppressionReason: Int) {
            super.onPlaybackSuppressionReasonChanged(playbackSuppressionReason)
        }

        override fun onIsPlayingChanged(isPlaying: Boolean) {
            if (isPlaying) {
                playerView.postDelayed(updateProgressRunnable, UPDATE_PROGRESS_INTERVAL)
            } else {
                playerView.removeCallbacks(updateProgressRunnable)
                updateProgress()
            }
            super.onIsPlayingChanged(isPlaying)
        }

        override fun onPlayerError(error: PlaybackException) {
            playerNeedPrepare = true
            if (isBehindLiveWindow(error)) {
                clearResumePosition()
                initializePlayer()
            } else {
                updateResumePosition()
                showControls()
            }

            super.onPlayerError(error)
        }

        override fun onPlayerErrorChanged(error: PlaybackException?) {
            super.onPlayerErrorChanged(error)
        }

        override fun onPositionDiscontinuity(
            oldPosition: Player.PositionInfo,
            newPosition: Player.PositionInfo,
            reason: @Player.DiscontinuityReason Int
        ) {
            if (playerNeedPrepare) {
                updateResumePosition()
            }
            super.onPositionDiscontinuity(oldPosition, newPosition, reason)
        }

        override fun onPlaybackParametersChanged(playbackParameters: PlaybackParameters) {
            super.onPlaybackParametersChanged(playbackParameters)
        }

        override fun onRenderedFirstFrame() {
            updateProgress()
            super.onRenderedFirstFrame()
        }

        override fun onMetadata(metadata: Metadata) {
            super.onMetadata(metadata)
        }

    }

    private val updateProgressRunnable = object : Runnable {
        override fun run() {
            updateProgress()
            if (progressListener != null) {
                playerView.postDelayed(this, UPDATE_PROGRESS_INTERVAL)
            }
        }
    }

    val needLoading get() = player == null || playerNeedPrepare
    val duration get() = player?.duration ?: 0L

    fun seekTo(position: Long?) {
        if (needLoading) {
            willSeekTo = position
        } else {
            position ?: return
            player?.seekTo(position)
        }
    }

    fun start() {
        initializePlayer()
    }

    fun resume() {
        if (resumePosition > 0) {
            resumePause = false
        }
        if (needLoading) {
            initializePlayer()
        } else {
            player?.apply {
                if (isPlayEnded()) {
                    clearResumePosition()
                    seekTo(0)
                }
                play()
            }
        }
    }

    fun pause() {
        if (resumePosition > 0) {
            resumePause = true
        } else {
            player?.pause()
        }
    }

    fun stop() {
        releasePlayer()
    }

    private fun initializePlayer() {
        val uri = uri ?: return

        val player = this.player ?: buildPlayer()
        if (playerNeedPrepare) {
            playerNeedPrepare = false
            val dataSourceFactory: DataSource.Factory = DefaultDataSource.Factory(context)
            val mediaItem = MediaItem.fromUri(uri)
            val factory = sourceFactory ?: ProgressiveMediaSource.Factory(
                dataSourceFactory, extractorsFactory
            )
            val mediaSource = factory.createMediaSource(mediaItem)
            player.setMediaSource(mediaSource)
            player.prepare()

            setSurfaceViewVisibility(View.VISIBLE)
        }
        if (player.isPlayEnded()) {
            clearResumePosition()
            player.seekTo(0)
        }
        player.playWhenReady = playWhenReady // play
        // Logcat.msg(TAG,"initializePlayer ${player.playbackState}")
    }


    private fun buildPlayer(): ExoPlayer {
        val rf = DefaultRenderersFactory(context)
            .setExtensionRendererMode(DefaultRenderersFactory.EXTENSION_RENDERER_MODE_PREFER)
        val player = ExoPlayer.Builder(context, rf).build()
        // Logcat.msg(TAG,"buildPlayer ${player.playbackState}")
        this.player = player
        player.addListener(playerListenerDelegate)
        playerView.player = player
        playerNeedPrepare = true
        return player
    }

    private fun releasePlayer() {
        if (uri == null) {
            return
        }
        if (player != null) {
            playerView.removeCallbacks(updateProgressRunnable)
            if (player?.isPlayEnded() != true) {
                updateResumePosition()
            }
            player?.release()
            player = null
            playerView.player = null
        }
    }

    private fun setSurfaceViewVisibility(visibility: Int) {
        val surfaceView = playerView.videoSurfaceView
        if (surfaceView != null) {
            surfaceView.visibility = visibility
        }
    }

    private fun updateProgress() {
        val player = this.player ?: return
        val position = player.currentPosition
        val duration = player.duration
        progressListener?.onProgressChanged(position, duration)
    }

    private fun updateResumePosition() {
        player?.apply {
            resumeWindow = currentMediaItemIndex
            resumePosition = if (isCurrentMediaItemSeekable) currentPosition else C.TIME_UNSET
        }
    }

    private fun clearResumePosition() {
        resumePause = false
        resumeWindow = C.INDEX_UNSET
        resumePosition = C.TIME_UNSET
    }

    fun isAudioOnly(): Boolean {
        return player?.isAudioOnly() ?: false
    }

    private fun showControls() {
        playerView.showController()
    }

    fun interface ProgressListener {
        fun onProgressChanged(progress: Long, duration: Long)
    }

    open class PlayerListenerDelegate(
        var listener: Player.Listener? = null
    ) : Player.Listener {
        open var TAG = getTAG<PlayerListenerDelegate>()
        open var debug = false

        val filterEvents = mutableListOf<Int>(
            Player.EVENT_IS_LOADING_CHANGED
        )

        val filterCommands = mutableListOf<Int>()

        override fun onEvents(player: Player, events: Player.Events) {
            val flags = events.flags().toList()
            val isFilter = flags.any { flag -> filterEvents.any { it == flag } }
            if (debug && !isFilter) {
                Logcat.msg(TAG, "onEvents ${flags.joinEventsName()}")
            }
            listener?.onEvents(player, events)
        }

        override fun onTimelineChanged(timeline: Timeline, reason: Int) {
            if (debug) Logcat.msg(TAG, "onTimelineChanged $reason, ${timeline.toBundle()}")
            listener?.onTimelineChanged(timeline, reason)
        }

        override fun onMediaItemTransition(mediaItem: MediaItem?, reason: Int) {
            if (debug) Logcat.msg(TAG, "onMediaItemTransition $reason ${mediaItem?.toBundle()}")
            listener?.onMediaItemTransition(mediaItem, reason)
        }

        override fun onTracksChanged(tracks: Tracks) {
            if (debug) Logcat.msg(TAG, "onTracksChanged $tracks")
            listener?.onTracksChanged(tracks)
        }

        override fun onMediaMetadataChanged(mediaMetadata: MediaMetadata) {
            if (debug) Logcat.msg(TAG, "onMediaMetadataChanged ${mediaMetadata.toBundle()}}")
            listener?.onMediaMetadataChanged(mediaMetadata)
        }

        override fun onIsLoadingChanged(isLoading: Boolean) {
            // if (debug) Logcat.msg(TAG, "onIsLoadingChanged $isLoading")
            listener?.onIsLoadingChanged(isLoading)
        }

        override fun onAvailableCommandsChanged(availableCommands: Player.Commands) {
            val flags = availableCommands.flags()
            val isFilter = flags.any { flag -> filterCommands.any { it == flag } }
            if (debug && !isFilter) {
                Logcat.msg(TAG, "onAvailableCommandsChanged ${flags.joinCommandsName()}")
            }
            listener?.onAvailableCommandsChanged(availableCommands)
        }

        override fun onPlaybackStateChanged(playbackState: Int) {
            if (debug) Logcat.msg(TAG, "onPlaybackStateChanged $playbackState")
            listener?.onPlaybackStateChanged(playbackState)
        }

        override fun onPlayWhenReadyChanged(playWhenReady: Boolean, reason: Int) {
            if (debug) Logcat.msg(TAG, "onPlayWhenReadyChanged $playWhenReady $reason")
            listener?.onPlayWhenReadyChanged(playWhenReady, reason)
        }

        override fun onPlaybackSuppressionReasonChanged(playbackSuppressionReason: Int) {
            if (debug) Logcat.msg(
                TAG,
                "onPlaybackSuppressionReasonChanged $playbackSuppressionReason"
            )
            listener?.onPlaybackSuppressionReasonChanged(playbackSuppressionReason)
        }

        override fun onIsPlayingChanged(isPlaying: Boolean) {
            if (debug) Logcat.msg(TAG, "onIsPlayingChanged $isPlaying")
            listener?.onIsPlayingChanged(isPlaying)
        }

        override fun onPlayerError(error: PlaybackException) {
            if (debug) Logcat.msg(TAG, "onPlayerError $error")
            listener?.onPlayerError(error)
        }

        override fun onPlayerErrorChanged(error: PlaybackException?) {
            if (debug) Logcat.msg(TAG, "onPlayerErrorChanged $error")
            listener?.onPlayerErrorChanged(error)
        }

        override fun onPositionDiscontinuity(
            oldPosition: Player.PositionInfo,
            newPosition: Player.PositionInfo,
            reason: @Player.DiscontinuityReason Int
        ) {
            if (debug) Logcat.msg(TAG, "onPositionDiscontinuity $reason")
            listener?.onPositionDiscontinuity(oldPosition, newPosition, reason)
        }

        override fun onPlaybackParametersChanged(playbackParameters: PlaybackParameters) {
            if (debug) Logcat.msg(TAG, "onPlaybackParametersChanged $playbackParameters")
            listener?.onPlaybackParametersChanged(playbackParameters)
        }

        override fun onRenderedFirstFrame() {
            if (debug) Logcat.msg(TAG, "onRenderedFirstFrame")
            listener?.onRenderedFirstFrame()
        }

        override fun onMetadata(metadata: Metadata) {
            if (debug) Logcat.msg(TAG, "onMetadata $metadata")
            listener?.onMetadata(metadata)
        }

    }

    companion object {
        val TAG = getTAG<MediaPlayerHelper>()
        private const val FIX_PLAY_END = 200
        private const val UPDATE_PROGRESS_INTERVAL = 200L
        private val DEFAULT_COOKIE_MANAGER = CookieManager().apply {
            setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER)
        }

        val eventFlagsMap = mapOf(
            Player.EVENT_TIMELINE_CHANGED to "EVENT_TIMELINE_CHANGED",
            Player.EVENT_MEDIA_ITEM_TRANSITION to "EVENT_MEDIA_ITEM_TRANSITION",
            Player.EVENT_TRACKS_CHANGED to "EVENT_TRACKS_CHANGED",
            Player.EVENT_IS_LOADING_CHANGED to "EVENT_IS_LOADING_CHANGED",
            Player.EVENT_PLAYBACK_STATE_CHANGED to "EVENT_PLAYBACK_STATE_CHANGED",
            Player.EVENT_PLAY_WHEN_READY_CHANGED to "EVENT_PLAY_WHEN_READY_CHANGED",
            Player.EVENT_PLAYBACK_SUPPRESSION_REASON_CHANGED to "EVENT_PLAYBACK_SUPPRESSION_REASON_CHANGED",
            Player.EVENT_IS_PLAYING_CHANGED to "EVENT_IS_PLAYING_CHANGED",
            Player.EVENT_REPEAT_MODE_CHANGED to "EVENT_REPEAT_MODE_CHANGED",
            Player.EVENT_SHUFFLE_MODE_ENABLED_CHANGED to "EVENT_SHUFFLE_MODE_ENABLED_CHANGED",
            Player.EVENT_PLAYER_ERROR to "EVENT_PLAYER_ERROR",
            Player.EVENT_POSITION_DISCONTINUITY to "EVENT_POSITION_DISCONTINUITY",
            Player.EVENT_PLAYBACK_PARAMETERS_CHANGED to "EVENT_PLAYBACK_PARAMETERS_CHANGED",
            Player.EVENT_AVAILABLE_COMMANDS_CHANGED to "EVENT_AVAILABLE_COMMANDS_CHANGED",
            Player.EVENT_MEDIA_METADATA_CHANGED to "EVENT_MEDIA_METADATA_CHANGED",
            Player.EVENT_PLAYLIST_METADATA_CHANGED to "EVENT_PLAYLIST_METADATA_CHANGED",
            Player.EVENT_SEEK_BACK_INCREMENT_CHANGED to "EVENT_SEEK_BACK_INCREMENT_CHANGED",
            Player.EVENT_SEEK_FORWARD_INCREMENT_CHANGED to "EVENT_SEEK_FORWARD_INCREMENT_CHANGED",
            Player.EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED to "EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED",
            Player.EVENT_TRACK_SELECTION_PARAMETERS_CHANGED to "EVENT_TRACK_SELECTION_PARAMETERS_CHANGED",
            Player.EVENT_AUDIO_ATTRIBUTES_CHANGED to "EVENT_AUDIO_ATTRIBUTES_CHANGED",
            Player.EVENT_AUDIO_SESSION_ID to "EVENT_AUDIO_SESSION_ID",
            Player.EVENT_VOLUME_CHANGED to "EVENT_VOLUME_CHANGED",
            Player.EVENT_SKIP_SILENCE_ENABLED_CHANGED to "EVENT_SKIP_SILENCE_ENABLED_CHANGED",
            Player.EVENT_SURFACE_SIZE_CHANGED to "EVENT_SURFACE_SIZE_CHANGED",
            Player.EVENT_VIDEO_SIZE_CHANGED to "EVENT_VIDEO_SIZE_CHANGED",
            Player.EVENT_RENDERED_FIRST_FRAME to "EVENT_RENDERED_FIRST_FRAME",
            Player.EVENT_CUES to "EVENT_CUES",
            Player.EVENT_METADATA to "EVENT_METADATA",
            Player.EVENT_DEVICE_INFO_CHANGED to "EVENT_DEVICE_INFO_CHANGED",
            Player.EVENT_DEVICE_VOLUME_CHANGED to "EVENT_DEVICE_VOLUME_CHANGED",
        )

        val commandsFlagsMap = mapOf(
            Player.COMMAND_INVALID to "COMMAND_INVALID",
            Player.COMMAND_PLAY_PAUSE to "COMMAND_PLAY_PAUSE",
            Player.COMMAND_PREPARE to "COMMAND_PREPARE",
            Player.COMMAND_STOP to "COMMAND_STOP",
            Player.COMMAND_SEEK_TO_DEFAULT_POSITION to "COMMAND_SEEK_TO_DEFAULT_POSITION",
            Player.COMMAND_SEEK_IN_CURRENT_MEDIA_ITEM to "COMMAND_SEEK_IN_CURRENT_MEDIA_ITEM",
            Player.COMMAND_SEEK_TO_PREVIOUS_MEDIA_ITEM to "COMMAND_SEEK_TO_PREVIOUS_MEDIA_ITEM",
            Player.COMMAND_SEEK_TO_PREVIOUS to "COMMAND_SEEK_TO_PREVIOUS",
            Player.COMMAND_SEEK_TO_NEXT_MEDIA_ITEM to "COMMAND_SEEK_TO_NEXT_MEDIA_ITEM",
            Player.COMMAND_SEEK_TO_NEXT to "COMMAND_SEEK_TO_NEXT",
            Player.COMMAND_SEEK_TO_MEDIA_ITEM to "COMMAND_SEEK_TO_MEDIA_ITEM",
            Player.COMMAND_SEEK_BACK to "COMMAND_SEEK_BACK",
            Player.COMMAND_SEEK_FORWARD to "COMMAND_SEEK_FORWARD",
            Player.COMMAND_SET_SPEED_AND_PITCH to "COMMAND_SET_SPEED_AND_PITCH",
            Player.COMMAND_SET_SHUFFLE_MODE to "COMMAND_SET_SHUFFLE_MODE",
            Player.COMMAND_SET_REPEAT_MODE to "COMMAND_SET_REPEAT_MODE",
            Player.COMMAND_GET_CURRENT_MEDIA_ITEM to "COMMAND_GET_CURRENT_MEDIA_ITEM",
            Player.COMMAND_GET_TIMELINE to "COMMAND_GET_TIMELINE",
            Player.COMMAND_GET_MEDIA_ITEMS_METADATA to "COMMAND_GET_MEDIA_ITEMS_METADATA",
            Player.COMMAND_GET_METADATA to "COMMAND_GET_METADATA",
            Player.COMMAND_SET_MEDIA_ITEMS_METADATA to "COMMAND_SET_MEDIA_ITEMS_METADATA",
            Player.COMMAND_SET_PLAYLIST_METADATA to "COMMAND_SET_PLAYLIST_METADATA",
            Player.COMMAND_SET_MEDIA_ITEM to "COMMAND_SET_MEDIA_ITEM",
            Player.COMMAND_CHANGE_MEDIA_ITEMS to "COMMAND_CHANGE_MEDIA_ITEMS",
            Player.COMMAND_GET_AUDIO_ATTRIBUTES to "COMMAND_GET_AUDIO_ATTRIBUTES",
            Player.COMMAND_GET_VOLUME to "COMMAND_GET_VOLUME",
            Player.COMMAND_GET_DEVICE_VOLUME to "COMMAND_GET_DEVICE_VOLUME",
            Player.COMMAND_SET_VOLUME to "COMMAND_SET_VOLUME",
            Player.COMMAND_SET_DEVICE_VOLUME to "COMMAND_SET_DEVICE_VOLUME",
            Player.COMMAND_SET_DEVICE_VOLUME_WITH_FLAGS to "COMMAND_SET_DEVICE_VOLUME_WITH_FLAGS",
            Player.COMMAND_ADJUST_DEVICE_VOLUME to "COMMAND_ADJUST_DEVICE_VOLUME",
            Player.COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS to "COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS",
            Player.COMMAND_SET_AUDIO_ATTRIBUTES to "COMMAND_SET_AUDIO_ATTRIBUTES",
            Player.COMMAND_SET_VIDEO_SURFACE to "COMMAND_SET_VIDEO_SURFACE",
            Player.COMMAND_GET_TEXT to "COMMAND_GET_TEXT",
            Player.COMMAND_SET_TRACK_SELECTION_PARAMETERS to "COMMAND_SET_TRACK_SELECTION_PARAMETERS",
            Player.COMMAND_GET_TRACKS to "COMMAND_GET_TRACKS",
            Player.COMMAND_RELEASE to "COMMAND_RELEASE",
        )

        fun resetCookieHandler() {
            if (CookieHandler.getDefault() !== DEFAULT_COOKIE_MANAGER) {
                CookieHandler.setDefault(DEFAULT_COOKIE_MANAGER)
            }
        }

        private fun isBehindLiveWindow(e: PlaybackException): Boolean {
            if (e.errorCode != ExoPlaybackException.TYPE_SOURCE) {
                return false
            }
            var cause = e.cause
            while (cause != null) {
                if (cause is BehindLiveWindowException) {
                    return true
                }
                cause = cause.cause
            }
            return false
        }

        fun Player.isAudioOnly(): Boolean {

            // 获取当前的轨道组
            val tracks = currentTracks
            for (group in tracks.groups) {
                for (i in 0 until group.length) {
                    val format = group.getTrackFormat(i)
                    val mimeType = format.sampleMimeType
                    group.type
                    if (mimeType != null) {
                        // 如果发现非音频轨道，返回 false
                        val isNonAudioTrack = arrayOf(
                            "audio/", "application/"
                        ).all { !mimeType.startsWith(it) }
                        if (isNonAudioTrack) return false
                    }
                }
            }
            return true // 如果所有轨道都是音频轨道，返回 true
        }

        fun Player.isPlayEnded(): Boolean {
            return playbackState == Player.STATE_ENDED ||
                    (duration != C.TIME_UNSET && currentPosition >= duration - FIX_PLAY_END)
        }

        fun Player.Events.flags() = sequence {
            for (i in 0 until size()) {
                yield(get(i))
            }
        }

        fun Player.Commands.flags() = sequence {
            for (i in 0 until size()) {
                yield(get(i))
            }
        }

        fun Iterable<Int>.joinEventsName() = joinToString {
            eventFlagsMap[it] ?: it.toString()
        }

        fun Iterable<Int>.joinCommandsName() = joinToString {
            commandsFlagsMap[it] ?: it.toString()
        }

        fun Sequence<Int>.joinEventsName() = joinToString {
            eventFlagsMap[it] ?: it.toString()
        }

        fun Sequence<Int>.joinCommandsName() = joinToString {
            commandsFlagsMap[it] ?: it.toString()
        }
    }
}