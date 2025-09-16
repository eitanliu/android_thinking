package com.example.thinking.speech

import android.app.Activity.RESULT_OK
import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import android.speech.RecognitionListener
import android.speech.RecognitionService
import android.speech.RecognizerIntent
import android.speech.SpeechRecognizer
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class SpeechUtil(val activity: AppCompatActivity) {

    companion object {
        private const val TAG = "SpeechUtil"

        const val XIAOMI_ASR = "com.xiaomi.mibrain.action.RECOGNIZE_SPEECH"
    }

    private lateinit var speechRecognizer: SpeechRecognizer
    private lateinit var listeningIntent: Intent

    private val recognitionLauncher = activity.registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) {
        if (it.resultCode == RESULT_OK) {
            Log.d(TAG, "recognition result:${it.data}")
            val matches = it.data?.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS)
            if (!matches.isNullOrEmpty() && matches[0].isNotEmpty()) {
                Log.d(TAG, "recognition result :${matches}")
                // binding.text.text = matches[0]
            }
        }
    }

    fun queryActivity() {
        val intent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH)
        val infos = activity.packageManager.queryIntentActivities(intent, 0)
        Log.e(TAG, "queryActivity:${infos.size}")
        for (info in infos) {
            val label = info.loadLabel(activity.packageManager)
            val pkgInfo = info.activityInfo.run { "$packageName/$name" }
            Log.d(TAG, "queryActivity: $pkgInfo; $label")
        }
    }

    fun launchRecognizer() {
        // 创建 Intent
        // val intent = Intent(XIAOMI_ASR)
        val intent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH)
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form")
        val localeString = "en-US"
        intent.putExtra("android.speech.extra.LANGUAGE", localeString)
        intent.putExtra("android.speech.extra.PROMPT", "")
        intent.putExtra(RecognizerIntent.EXTRA_SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS, 3000)
        intent.putExtra(
            RecognizerIntent.EXTRA_SPEECH_INPUT_POSSIBLY_COMPLETE_SILENCE_LENGTH_MILLIS,
            3000
        )
        intent.putExtra(RecognizerIntent.EXTRA_SPEECH_INPUT_MINIMUM_LENGTH_MILLIS, 3000)
        recognitionLauncher.launch(intent)
    }

    fun queryService() {
        val intent = Intent(RecognitionService.SERVICE_INTERFACE)
        val infos = activity.packageManager.queryIntentServices(intent, 0)
        Log.e(TAG, "queryService:${infos.size}")
        for (info in infos) {
            val label = info.loadLabel(activity.packageManager)
            val pkgInfo = info.serviceInfo.run { "$packageName/$name" }
            Log.d(TAG, "queryService: $pkgInfo; $label")
        }
    }

    fun startListening() {
        speechRecognizer.startListening(listeningIntent)
    }

    fun createRecognizer() {

        // 初始化 SpeechRecognizer

        var serviceComponent: ComponentName? = null
        // Android System Intelligence https://play.google.com/store/apps/details?id=com.google.android.as
        // serviceComponent = ComponentName(
        //     "com.google.android.as",
        //     "com.google.android.apps.miphone.aiai.app.AiAiSpeechRecognitionService"
        // )

        // Speech Recognition and Synthesis from Google https://play.google.com/store/apps/details?id=com.google.android.tts
        // com.google.android.tts/com.google.android.apps.speech.tts.googletts.local.voicepack.ui.VoiceDataInstallActivity
        serviceComponent = ComponentName(
            "com.google.android.tts",
            "com.google.android.apps.speech.tts.googletts.service.GoogleTTSRecognitionService"
        )

        // Samsung: Bixby Recognition Service
        // serviceComponent = ComponentName(
        //     "com.samsung.android.bixby.agent",
        //     "com.samsung.android.bixby.agent.mainui.voiceinteraction.RecognitionServiceTrampoline"
        // )

        // Xiaomi: 系统语音引擎
        // serviceComponent = ComponentName(
        //     "com.xiaomi.mibrain.speech",
        //     "com.xiaomi.mibrain.speech.asr.AsrService"
        // )
        speechRecognizer = SpeechRecognizer.createSpeechRecognizer(activity, serviceComponent)
        speechRecognizer.setRecognitionListener(object : RecognitionListener {
            override fun onReadyForSpeech(params: Bundle) {
                changeState(1)
                // 准备就绪
            }

            override fun onBeginningOfSpeech() {
                changeState(2)
                // 开始说话
            }

            override fun onRmsChanged(rmsdB: Float) {
                // 音量变化
            }

            override fun onBufferReceived(buffer: ByteArray) {
                Log.d(TAG, "receive buffer ${buffer.size}")
                // 接收到音频数据
            }

            override fun onEndOfSpeech() {
                Log.d(TAG, "end speech")
                // 结束说话
            }

            override fun onError(error: Int) {
                Log.d(TAG, "error:${error}")
                // 处理错误
                changeState(5)
            }

            override fun onResults(results: Bundle) {
                // 处理识别结果
                Log.d(TAG, "on result")
                val matches = results.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION)
                if (!matches.isNullOrEmpty() && matches[0].isNotEmpty()) {
                    Log.d(TAG, "on result :${matches}")
                }
                changeState(3)
            }

            override fun onPartialResults(partialResults: Bundle) {
                // 处理部分结果
                Log.d(TAG, "on partly result")
                val matches = partialResults
                    .getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION)
                if (!matches.isNullOrEmpty() && matches[0].isNotEmpty()) {
                    Log.d(TAG, "on partly result :${matches}")
                }
            }

            override fun onEvent(eventType: Int, params: Bundle) {
                Log.d(TAG, "on event:${eventType}")
                // 处理事件
            }
        })

        // 创建识别意图
        var intent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH)
        intent.putExtra(
            RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM
        )
        val localeString = "en-US"
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, localeString) // 设置语言
        intent.putExtra(RecognizerIntent.EXTRA_PARTIAL_RESULTS, true)
        intent.putExtra(RecognizerIntent.EXTRA_SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS, 3000)
        intent.putExtra(
            RecognizerIntent.EXTRA_SPEECH_INPUT_POSSIBLY_COMPLETE_SILENCE_LENGTH_MILLIS, 3000
        )
        intent.putExtra(RecognizerIntent.EXTRA_SPEECH_INPUT_MINIMUM_LENGTH_MILLIS, 3000)

        listeningIntent = intent
    }

    private fun changeState(i: Int) {
        Log.d(TAG, "change state:${i}")
    }
}