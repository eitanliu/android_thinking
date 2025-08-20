package com.example.thinking.util

import java.lang.Deprecated

/**
 * [android.R](https://developer.android.com/reference/android/R)
 */
@Suppress("DEPRECATED_JAVA_ANNOTATION")
object OsR {

    fun get(type: String, name: String): Int {
        try {
            val clazz = Class.forName("android.R$$type")
            val f = clazz.getField(name)
            return f.getInt(null)
        } catch (_: Throwable) {
        }
        return 0
    }

    object anim {
        const val accelerate_decelerate_interpolator = android.R.anim.accelerate_decelerate_interpolator
        const val accelerate_interpolator = android.R.anim.accelerate_interpolator
        const val anticipate_interpolator = android.R.anim.anticipate_interpolator
        const val anticipate_overshoot_interpolator = android.R.anim.anticipate_overshoot_interpolator
        const val bounce_interpolator = android.R.anim.bounce_interpolator
        const val cycle_interpolator = android.R.anim.cycle_interpolator
        const val decelerate_interpolator = android.R.anim.decelerate_interpolator
        const val fade_in = android.R.anim.fade_in
        const val fade_out = android.R.anim.fade_out
        const val linear_interpolator = android.R.anim.linear_interpolator
        const val overshoot_interpolator = android.R.anim.overshoot_interpolator
        const val slide_in_left = android.R.anim.slide_in_left
        const val slide_out_right = android.R.anim.slide_out_right
    }

    object animator {
        const val fade_in = android.R.animator.fade_in
        const val fade_out = android.R.animator.fade_out
    }

    object array {
        const val emailAddressTypes = android.R.array.emailAddressTypes
        const val imProtocols = android.R.array.imProtocols
        const val organizationTypes = android.R.array.organizationTypes
        const val phoneTypes = android.R.array.phoneTypes
        const val postalAddressTypes = android.R.array.postalAddressTypes
    }

    object attr {
        const val absListViewStyle = android.R.attr.absListViewStyle
        const val accessibilityDataSensitive = android.R.attr.accessibilityDataSensitive
        const val accessibilityEventTypes = android.R.attr.accessibilityEventTypes
        const val accessibilityFeedbackType = android.R.attr.accessibilityFeedbackType
        const val accessibilityFlags = android.R.attr.accessibilityFlags
        const val accessibilityHeading = android.R.attr.accessibilityHeading
        const val accessibilityLiveRegion = android.R.attr.accessibilityLiveRegion
        const val accessibilityPaneTitle = android.R.attr.accessibilityPaneTitle
        const val accessibilityTraversalAfter = android.R.attr.accessibilityTraversalAfter
        const val accessibilityTraversalBefore = android.R.attr.accessibilityTraversalBefore
        const val accountPreferences = android.R.attr.accountPreferences
        const val accountType = android.R.attr.accountType
        const val action = android.R.attr.action
        const val actionBarDivider = android.R.attr.actionBarDivider
        const val actionBarItemBackground = android.R.attr.actionBarItemBackground
        const val actionBarPopupTheme = android.R.attr.actionBarPopupTheme
        const val actionBarSize = android.R.attr.actionBarSize
        const val actionBarSplitStyle = android.R.attr.actionBarSplitStyle
        const val actionBarStyle = android.R.attr.actionBarStyle
        const val actionBarTabBarStyle = android.R.attr.actionBarTabBarStyle
        const val actionBarTabStyle = android.R.attr.actionBarTabStyle
        const val actionBarTabTextStyle = android.R.attr.actionBarTabTextStyle
        const val actionBarTheme = android.R.attr.actionBarTheme
        const val actionBarWidgetTheme = android.R.attr.actionBarWidgetTheme
        const val actionButtonStyle = android.R.attr.actionButtonStyle
        const val actionDropDownStyle = android.R.attr.actionDropDownStyle
        const val actionLayout = android.R.attr.actionLayout
        const val actionMenuTextAppearance = android.R.attr.actionMenuTextAppearance
        const val actionMenuTextColor = android.R.attr.actionMenuTextColor
        const val actionModeBackground = android.R.attr.actionModeBackground
        const val actionModeCloseButtonStyle = android.R.attr.actionModeCloseButtonStyle
        const val actionModeCloseDrawable = android.R.attr.actionModeCloseDrawable
        const val actionModeCopyDrawable = android.R.attr.actionModeCopyDrawable
        const val actionModeCutDrawable = android.R.attr.actionModeCutDrawable
        const val actionModeFindDrawable = android.R.attr.actionModeFindDrawable
        const val actionModePasteDrawable = android.R.attr.actionModePasteDrawable
        const val actionModeSelectAllDrawable = android.R.attr.actionModeSelectAllDrawable
        const val actionModeShareDrawable = android.R.attr.actionModeShareDrawable
        const val actionModeSplitBackground = android.R.attr.actionModeSplitBackground
        const val actionModeStyle = android.R.attr.actionModeStyle
        const val actionModeWebSearchDrawable = android.R.attr.actionModeWebSearchDrawable
        const val actionOverflowButtonStyle = android.R.attr.actionOverflowButtonStyle
        const val actionOverflowMenuStyle = android.R.attr.actionOverflowMenuStyle
        const val actionProviderClass = android.R.attr.actionProviderClass
        const val actionViewClass = android.R.attr.actionViewClass
        const val activatedBackgroundIndicator = android.R.attr.activatedBackgroundIndicator
        const val activityCloseEnterAnimation = android.R.attr.activityCloseEnterAnimation
        const val activityCloseExitAnimation = android.R.attr.activityCloseExitAnimation
        const val activityOpenEnterAnimation = android.R.attr.activityOpenEnterAnimation
        const val activityOpenExitAnimation = android.R.attr.activityOpenExitAnimation
        const val addPrintersActivity = android.R.attr.addPrintersActivity
        const val addStatesFromChildren = android.R.attr.addStatesFromChildren
        const val adjustViewBounds = android.R.attr.adjustViewBounds
        const val advancedPrintOptionsActivity = android.R.attr.advancedPrintOptionsActivity
        const val alertDialogIcon = android.R.attr.alertDialogIcon
        const val alertDialogStyle = android.R.attr.alertDialogStyle
        const val alertDialogTheme = android.R.attr.alertDialogTheme
        const val alignmentMode = android.R.attr.alignmentMode
        const val allContactsName = android.R.attr.allContactsName
        const val allow = android.R.attr.allow
        const val allowAudioPlaybackCapture = android.R.attr.allowAudioPlaybackCapture
        const val allowBackup = android.R.attr.allowBackup
        const val allowClearUserData = android.R.attr.allowClearUserData
        const val allowClickWhenDisabled = android.R.attr.allowClickWhenDisabled
        const val allowCrossUidActivitySwitchFromBelow = android.R.attr.allowCrossUidActivitySwitchFromBelow
        const val allowEmbedded = android.R.attr.allowEmbedded
        const val allowGameAngleDriver = android.R.attr.allowGameAngleDriver
        const val allowGameDownscaling = android.R.attr.allowGameDownscaling
        const val allowGameFpsOverride = android.R.attr.allowGameFpsOverride
        const val allowNativeHeapPointerTagging = android.R.attr.allowNativeHeapPointerTagging
        const val allowParallelSyncs = android.R.attr.allowParallelSyncs
        const val allowSharedIsolatedProcess = android.R.attr.allowSharedIsolatedProcess
        const val allowSingleTap = android.R.attr.allowSingleTap
        const val allowTaskReparenting = android.R.attr.allowTaskReparenting
        const val allowUndo = android.R.attr.allowUndo
        const val allowUntrustedActivityEmbedding = android.R.attr.allowUntrustedActivityEmbedding
        const val allowUpdateOwnership = android.R.attr.allowUpdateOwnership
        const val alpha = android.R.attr.alpha
        const val alphabeticModifiers = android.R.attr.alphabeticModifiers
        const val alphabeticShortcut = android.R.attr.alphabeticShortcut
        const val alwaysDrawnWithCache = android.R.attr.alwaysDrawnWithCache
        const val alwaysRetainTaskState = android.R.attr.alwaysRetainTaskState

        @Deprecated
        const val amPmBackgroundColor = android.R.attr.amPmBackgroundColor

        @Deprecated
        const val amPmTextColor = android.R.attr.amPmTextColor
        const val ambientShadowAlpha = android.R.attr.ambientShadowAlpha
        const val angle = android.R.attr.angle
        const val animateFirstView = android.R.attr.animateFirstView
        const val animateLayoutChanges = android.R.attr.animateLayoutChanges
        const val animateOnClick = android.R.attr.animateOnClick
        const val animatedImageDrawable = android.R.attr.animatedImageDrawable
        const val animation = android.R.attr.animation
        const val animationCache = android.R.attr.animationCache
        const val animationDuration = android.R.attr.animationDuration
        const val animationOrder = android.R.attr.animationOrder

        @Deprecated
        const val animationResolution = android.R.attr.animationResolution
        const val antialias = android.R.attr.antialias

        @Deprecated
        const val anyDensity = android.R.attr.anyDensity
        const val apduServiceBanner = android.R.attr.apduServiceBanner
        const val apiKey = android.R.attr.apiKey
        const val appCategory = android.R.attr.appCategory
        const val appComponentFactory = android.R.attr.appComponentFactory
        const val attributionTags = android.R.attr.attributionTags
        const val attributionsAreUserVisible = android.R.attr.attributionsAreUserVisible
        const val author = android.R.attr.author
        const val authorities = android.R.attr.authorities
        const val autoAdvanceViewId = android.R.attr.autoAdvanceViewId
        const val autoCompleteTextViewStyle = android.R.attr.autoCompleteTextViewStyle
        const val autoHandwritingEnabled = android.R.attr.autoHandwritingEnabled
        const val autoLink = android.R.attr.autoLink
        const val autoMirrored = android.R.attr.autoMirrored
        const val autoRemoveFromRecents = android.R.attr.autoRemoveFromRecents
        const val autoRevokePermissions = android.R.attr.autoRevokePermissions
        const val autoSizeMaxTextSize = android.R.attr.autoSizeMaxTextSize
        const val autoSizeMinTextSize = android.R.attr.autoSizeMinTextSize
        const val autoSizePresetSizes = android.R.attr.autoSizePresetSizes
        const val autoSizeStepGranularity = android.R.attr.autoSizeStepGranularity
        const val autoSizeTextType = android.R.attr.autoSizeTextType
        const val autoStart = android.R.attr.autoStart

        @Deprecated
        const val autoText = android.R.attr.autoText
        const val autoTransact = android.R.attr.autoTransact
        const val autoUrlDetect = android.R.attr.autoUrlDetect
        const val autoVerify = android.R.attr.autoVerify
        const val autofillHints = android.R.attr.autofillHints
        const val autofilledHighlight = android.R.attr.autofilledHighlight
        const val backdropColor = android.R.attr.backdropColor
        const val background = android.R.attr.background
        const val backgroundDimAmount = android.R.attr.backgroundDimAmount
        const val backgroundDimEnabled = android.R.attr.backgroundDimEnabled
        const val backgroundSplit = android.R.attr.backgroundSplit
        const val backgroundStacked = android.R.attr.backgroundStacked
        const val backgroundTint = android.R.attr.backgroundTint
        const val backgroundTintMode = android.R.attr.backgroundTintMode
        const val backupAgent = android.R.attr.backupAgent
        const val backupInForeground = android.R.attr.backupInForeground
        const val banner = android.R.attr.banner
        const val baseline = android.R.attr.baseline
        const val baselineAlignBottom = android.R.attr.baselineAlignBottom
        const val baselineAligned = android.R.attr.baselineAligned
        const val baselineAlignedChildIndex = android.R.attr.baselineAlignedChildIndex
        const val bitmap = android.R.attr.bitmap
        const val borderlessButtonStyle = android.R.attr.borderlessButtonStyle
        const val bottom = android.R.attr.bottom
        const val bottomBright = android.R.attr.bottomBright
        const val bottomDark = android.R.attr.bottomDark
        const val bottomLeftRadius = android.R.attr.bottomLeftRadius
        const val bottomMedium = android.R.attr.bottomMedium
        const val bottomOffset = android.R.attr.bottomOffset
        const val bottomRightRadius = android.R.attr.bottomRightRadius
        const val breadCrumbShortTitle = android.R.attr.breadCrumbShortTitle
        const val breadCrumbTitle = android.R.attr.breadCrumbTitle
        const val breakStrategy = android.R.attr.breakStrategy
        const val bufferType = android.R.attr.bufferType
        const val button = android.R.attr.button
        const val buttonBarButtonStyle = android.R.attr.buttonBarButtonStyle
        const val buttonBarNegativeButtonStyle = android.R.attr.buttonBarNegativeButtonStyle
        const val buttonBarNeutralButtonStyle = android.R.attr.buttonBarNeutralButtonStyle
        const val buttonBarPositiveButtonStyle = android.R.attr.buttonBarPositiveButtonStyle
        const val buttonBarStyle = android.R.attr.buttonBarStyle
        const val buttonCornerRadius = android.R.attr.buttonCornerRadius
        const val buttonGravity = android.R.attr.buttonGravity
        const val buttonStyle = android.R.attr.buttonStyle
        const val buttonStyleInset = android.R.attr.buttonStyleInset
        const val buttonStyleSmall = android.R.attr.buttonStyleSmall
        const val buttonStyleToggle = android.R.attr.buttonStyleToggle
        const val buttonTint = android.R.attr.buttonTint
        const val buttonTintMode = android.R.attr.buttonTintMode
        const val cacheColorHint = android.R.attr.cacheColorHint
        const val calendarTextColor = android.R.attr.calendarTextColor
        const val calendarViewShown = android.R.attr.calendarViewShown
        const val calendarViewStyle = android.R.attr.calendarViewStyle
        const val canControlMagnification = android.R.attr.canControlMagnification
        const val canDisplayOnRemoteDevices = android.R.attr.canDisplayOnRemoteDevices
        const val canPauseRecording = android.R.attr.canPauseRecording
        const val canPerformGestures = android.R.attr.canPerformGestures
        const val canRecord = android.R.attr.canRecord

        @Deprecated
        const val canRequestEnhancedWebAccessibility = android.R.attr.canRequestEnhancedWebAccessibility
        const val canRequestFilterKeyEvents = android.R.attr.canRequestFilterKeyEvents
        const val canRequestFingerprintGestures = android.R.attr.canRequestFingerprintGestures
        const val canRequestTouchExplorationMode = android.R.attr.canRequestTouchExplorationMode
        const val canRetrieveWindowContent = android.R.attr.canRetrieveWindowContent
        const val canTakeScreenshot = android.R.attr.canTakeScreenshot
        const val candidatesTextStyleSpans = android.R.attr.candidatesTextStyleSpans
        const val cantSaveState = android.R.attr.cantSaveState
        const val capability = android.R.attr.capability

        @Deprecated
        const val capitalize = android.R.attr.capitalize
        const val category = android.R.attr.category
        const val centerBright = android.R.attr.centerBright
        const val centerColor = android.R.attr.centerColor
        const val centerDark = android.R.attr.centerDark
        const val centerMedium = android.R.attr.centerMedium
        const val centerX = android.R.attr.centerX
        const val centerY = android.R.attr.centerY
        const val certDigest = android.R.attr.certDigest
        const val checkBoxPreferenceStyle = android.R.attr.checkBoxPreferenceStyle
        const val checkMark = android.R.attr.checkMark
        const val checkMarkTint = android.R.attr.checkMarkTint
        const val checkMarkTintMode = android.R.attr.checkMarkTintMode
        const val checkable = android.R.attr.checkable
        const val checkableBehavior = android.R.attr.checkableBehavior
        const val checkboxStyle = android.R.attr.checkboxStyle
        const val checked = android.R.attr.checked
        const val checkedButton = android.R.attr.checkedButton
        const val checkedTextViewStyle = android.R.attr.checkedTextViewStyle
        const val childDivider = android.R.attr.childDivider
        const val childIndicator = android.R.attr.childIndicator
        const val childIndicatorEnd = android.R.attr.childIndicatorEnd
        const val childIndicatorLeft = android.R.attr.childIndicatorLeft
        const val childIndicatorRight = android.R.attr.childIndicatorRight
        const val childIndicatorStart = android.R.attr.childIndicatorStart
        const val choiceMode = android.R.attr.choiceMode
        const val classLoader = android.R.attr.classLoader
        const val clearTaskOnLaunch = android.R.attr.clearTaskOnLaunch
        const val clickable = android.R.attr.clickable
        const val clipChildren = android.R.attr.clipChildren
        const val clipOrientation = android.R.attr.clipOrientation
        const val clipToOutline = android.R.attr.clipToOutline
        const val clipToPadding = android.R.attr.clipToPadding
        const val closeIcon = android.R.attr.closeIcon

        @Deprecated
        const val codes = android.R.attr.codes
        const val collapseColumns = android.R.attr.collapseColumns
        const val collapseContentDescription = android.R.attr.collapseContentDescription
        const val collapseIcon = android.R.attr.collapseIcon
        const val color = android.R.attr.color
        const val colorAccent = android.R.attr.colorAccent
        const val colorActivatedHighlight = android.R.attr.colorActivatedHighlight
        const val colorBackground = android.R.attr.colorBackground
        const val colorBackgroundCacheHint = android.R.attr.colorBackgroundCacheHint
        const val colorBackgroundFloating = android.R.attr.colorBackgroundFloating
        const val colorButtonNormal = android.R.attr.colorButtonNormal
        const val colorControlActivated = android.R.attr.colorControlActivated
        const val colorControlHighlight = android.R.attr.colorControlHighlight
        const val colorControlNormal = android.R.attr.colorControlNormal
        const val colorEdgeEffect = android.R.attr.colorEdgeEffect
        const val colorError = android.R.attr.colorError
        const val colorFocusedHighlight = android.R.attr.colorFocusedHighlight
        const val colorForeground = android.R.attr.colorForeground
        const val colorForegroundInverse = android.R.attr.colorForegroundInverse
        const val colorLongPressedHighlight = android.R.attr.colorLongPressedHighlight
        const val colorMode = android.R.attr.colorMode
        const val colorMultiSelectHighlight = android.R.attr.colorMultiSelectHighlight
        const val colorPressedHighlight = android.R.attr.colorPressedHighlight
        const val colorPrimary = android.R.attr.colorPrimary
        const val colorPrimaryDark = android.R.attr.colorPrimaryDark
        const val colorSecondary = android.R.attr.colorSecondary
        const val columnCount = android.R.attr.columnCount
        const val columnDelay = android.R.attr.columnDelay
        const val columnOrderPreserved = android.R.attr.columnOrderPreserved
        const val columnWidth = android.R.attr.columnWidth
        const val commitIcon = android.R.attr.commitIcon
        const val compatibleWidthLimitDp = android.R.attr.compatibleWidthLimitDp
        const val completionHint = android.R.attr.completionHint
        const val completionHintView = android.R.attr.completionHintView
        const val completionThreshold = android.R.attr.completionThreshold
        const val configChanges = android.R.attr.configChanges
        const val configure = android.R.attr.configure
        const val constantSize = android.R.attr.constantSize
        const val content = android.R.attr.content
        const val contentAgeHint = android.R.attr.contentAgeHint
        const val contentAuthority = android.R.attr.contentAuthority
        const val contentDescription = android.R.attr.contentDescription
        const val contentInsetEnd = android.R.attr.contentInsetEnd
        const val contentInsetEndWithActions = android.R.attr.contentInsetEndWithActions
        const val contentInsetLeft = android.R.attr.contentInsetLeft
        const val contentInsetRight = android.R.attr.contentInsetRight
        const val contentInsetStart = android.R.attr.contentInsetStart
        const val contentInsetStartWithNavigation = android.R.attr.contentInsetStartWithNavigation
        const val contentSensitivity = android.R.attr.contentSensitivity
        const val contextClickable = android.R.attr.contextClickable
        const val contextDescription = android.R.attr.contextDescription
        const val contextPopupMenuStyle = android.R.attr.contextPopupMenuStyle
        const val contextUri = android.R.attr.contextUri
        const val controlX1 = android.R.attr.controlX1
        const val controlX2 = android.R.attr.controlX2
        const val controlY1 = android.R.attr.controlY1
        const val controlY2 = android.R.attr.controlY2
        const val countDown = android.R.attr.countDown
        const val country = android.R.attr.country
        const val cropToPadding = android.R.attr.cropToPadding
        const val crossProfile = android.R.attr.crossProfile
        const val cursorVisible = android.R.attr.cursorVisible
        const val customNavigationLayout = android.R.attr.customNavigationLayout
        const val customTokens = android.R.attr.customTokens
        const val cycles = android.R.attr.cycles
        const val dashGap = android.R.attr.dashGap
        const val dashWidth = android.R.attr.dashWidth
        const val data = android.R.attr.data
        const val dataExtractionRules = android.R.attr.dataExtractionRules
        const val datePickerDialogTheme = android.R.attr.datePickerDialogTheme
        const val datePickerMode = android.R.attr.datePickerMode
        const val datePickerStyle = android.R.attr.datePickerStyle
        const val dateTextAppearance = android.R.attr.dateTextAppearance

        @Deprecated
        const val dayOfWeekBackground = android.R.attr.dayOfWeekBackground

        @Deprecated
        const val dayOfWeekTextAppearance = android.R.attr.dayOfWeekTextAppearance
        const val debuggable = android.R.attr.debuggable
        const val defaultFocusHighlightEnabled = android.R.attr.defaultFocusHighlightEnabled
        const val defaultHeight = android.R.attr.defaultHeight
        const val defaultLocale = android.R.attr.defaultLocale
        const val defaultToDeviceProtectedStorage = android.R.attr.defaultToDeviceProtectedStorage
        const val defaultValue = android.R.attr.defaultValue
        const val defaultWidth = android.R.attr.defaultWidth
        const val delay = android.R.attr.delay
        const val dependency = android.R.attr.dependency
        const val descendantFocusability = android.R.attr.descendantFocusability
        const val description = android.R.attr.description
        const val detachWallpaper = android.R.attr.detachWallpaper
        const val detailColumn = android.R.attr.detailColumn
        const val detailSocialSummary = android.R.attr.detailSocialSummary
        const val detailsElementBackground = android.R.attr.detailsElementBackground
        const val dial = android.R.attr.dial
        const val dialTint = android.R.attr.dialTint
        const val dialTintMode = android.R.attr.dialTintMode
        const val dialogCornerRadius = android.R.attr.dialogCornerRadius
        const val dialogIcon = android.R.attr.dialogIcon
        const val dialogLayout = android.R.attr.dialogLayout
        const val dialogMessage = android.R.attr.dialogMessage
        const val dialogPreferenceStyle = android.R.attr.dialogPreferenceStyle
        const val dialogPreferredPadding = android.R.attr.dialogPreferredPadding
        const val dialogTheme = android.R.attr.dialogTheme
        const val dialogTitle = android.R.attr.dialogTitle
        const val digits = android.R.attr.digits
        const val directBootAware = android.R.attr.directBootAware
        const val direction = android.R.attr.direction

        @Deprecated
        const val directionDescriptions = android.R.attr.directionDescriptions
        const val directionPriority = android.R.attr.directionPriority
        const val disableDependentsState = android.R.attr.disableDependentsState
        const val disabledAlpha = android.R.attr.disabledAlpha
        const val displayOptions = android.R.attr.displayOptions
        const val dither = android.R.attr.dither
        const val divider = android.R.attr.divider
        const val dividerHeight = android.R.attr.dividerHeight
        const val dividerHorizontal = android.R.attr.dividerHorizontal
        const val dividerPadding = android.R.attr.dividerPadding
        const val dividerVertical = android.R.attr.dividerVertical
        const val documentLaunchMode = android.R.attr.documentLaunchMode
        const val drawSelectorOnTop = android.R.attr.drawSelectorOnTop
        const val drawable = android.R.attr.drawable
        const val drawableBottom = android.R.attr.drawableBottom
        const val drawableEnd = android.R.attr.drawableEnd
        const val drawableLeft = android.R.attr.drawableLeft
        const val drawablePadding = android.R.attr.drawablePadding
        const val drawableRight = android.R.attr.drawableRight
        const val drawableStart = android.R.attr.drawableStart
        const val drawableTint = android.R.attr.drawableTint
        const val drawableTintMode = android.R.attr.drawableTintMode
        const val drawableTop = android.R.attr.drawableTop
        const val drawingCacheQuality = android.R.attr.drawingCacheQuality
        const val dropDownAnchor = android.R.attr.dropDownAnchor
        const val dropDownHeight = android.R.attr.dropDownHeight
        const val dropDownHintAppearance = android.R.attr.dropDownHintAppearance
        const val dropDownHorizontalOffset = android.R.attr.dropDownHorizontalOffset
        const val dropDownItemStyle = android.R.attr.dropDownItemStyle
        const val dropDownListViewStyle = android.R.attr.dropDownListViewStyle
        const val dropDownSelector = android.R.attr.dropDownSelector
        const val dropDownSpinnerStyle = android.R.attr.dropDownSpinnerStyle
        const val dropDownVerticalOffset = android.R.attr.dropDownVerticalOffset
        const val dropDownWidth = android.R.attr.dropDownWidth
        const val duplicateParentState = android.R.attr.duplicateParentState
        const val duration = android.R.attr.duration
        const val editTextBackground = android.R.attr.editTextBackground
        const val editTextColor = android.R.attr.editTextColor
        const val editTextPreferenceStyle = android.R.attr.editTextPreferenceStyle
        const val editTextStyle = android.R.attr.editTextStyle

        @Deprecated
        const val editable = android.R.attr.editable
        const val editorExtras = android.R.attr.editorExtras
        const val effectColor = android.R.attr.effectColor
        const val elegantTextHeight = android.R.attr.elegantTextHeight
        const val elevation = android.R.attr.elevation
        const val ellipsize = android.R.attr.ellipsize
        const val ems = android.R.attr.ems
        const val enableOnBackInvokedCallback = android.R.attr.enableOnBackInvokedCallback
        const val enableTextStylingShortcuts = android.R.attr.enableTextStylingShortcuts
        const val enableVrMode = android.R.attr.enableVrMode
        const val enabled = android.R.attr.enabled
        const val end = android.R.attr.end
        const val endColor = android.R.attr.endColor
        const val endX = android.R.attr.endX
        const val endY = android.R.attr.endY

        @Deprecated
        const val endYear = android.R.attr.endYear
        const val enforceNavigationBarContrast = android.R.attr.enforceNavigationBarContrast

        @Deprecated
        const val enforceStatusBarContrast = android.R.attr.enforceStatusBarContrast
        const val enterFadeDuration = android.R.attr.enterFadeDuration
        const val entries = android.R.attr.entries
        const val entryValues = android.R.attr.entryValues
        const val eventsInterceptionEnabled = android.R.attr.eventsInterceptionEnabled
        const val excludeClass = android.R.attr.excludeClass
        const val excludeFromRecents = android.R.attr.excludeFromRecents
        const val excludeId = android.R.attr.excludeId
        const val excludeName = android.R.attr.excludeName
        const val exitFadeDuration = android.R.attr.exitFadeDuration
        const val expandableListPreferredChildIndicatorLeft = android.R.attr.expandableListPreferredChildIndicatorLeft
        const val expandableListPreferredChildIndicatorRight = android.R.attr.expandableListPreferredChildIndicatorRight
        const val expandableListPreferredChildPaddingLeft = android.R.attr.expandableListPreferredChildPaddingLeft
        const val expandableListPreferredItemIndicatorLeft = android.R.attr.expandableListPreferredItemIndicatorLeft
        const val expandableListPreferredItemIndicatorRight = android.R.attr.expandableListPreferredItemIndicatorRight
        const val expandableListPreferredItemPaddingLeft = android.R.attr.expandableListPreferredItemPaddingLeft
        const val expandableListViewStyle = android.R.attr.expandableListViewStyle
        const val expandableListViewWhiteStyle = android.R.attr.expandableListViewWhiteStyle
        const val exported = android.R.attr.exported
        const val externalService = android.R.attr.externalService
        const val extraTension = android.R.attr.extraTension
        const val extractNativeLibs = android.R.attr.extractNativeLibs
        const val factor = android.R.attr.factor
        const val fadeDuration = android.R.attr.fadeDuration
        const val fadeEnabled = android.R.attr.fadeEnabled
        const val fadeOffset = android.R.attr.fadeOffset
        const val fadeScrollbars = android.R.attr.fadeScrollbars
        const val fadingEdge = android.R.attr.fadingEdge
        const val fadingEdgeLength = android.R.attr.fadingEdgeLength
        const val fadingMode = android.R.attr.fadingMode
        const val fallbackLineSpacing = android.R.attr.fallbackLineSpacing
        const val fastScrollAlwaysVisible = android.R.attr.fastScrollAlwaysVisible
        const val fastScrollEnabled = android.R.attr.fastScrollEnabled
        const val fastScrollOverlayPosition = android.R.attr.fastScrollOverlayPosition
        const val fastScrollPreviewBackgroundLeft = android.R.attr.fastScrollPreviewBackgroundLeft
        const val fastScrollPreviewBackgroundRight = android.R.attr.fastScrollPreviewBackgroundRight
        const val fastScrollStyle = android.R.attr.fastScrollStyle
        const val fastScrollTextColor = android.R.attr.fastScrollTextColor
        const val fastScrollThumbDrawable = android.R.attr.fastScrollThumbDrawable
        const val fastScrollTrackDrawable = android.R.attr.fastScrollTrackDrawable
        const val fillAfter = android.R.attr.fillAfter
        const val fillAlpha = android.R.attr.fillAlpha
        const val fillBefore = android.R.attr.fillBefore
        const val fillColor = android.R.attr.fillColor
        const val fillEnabled = android.R.attr.fillEnabled
        const val fillType = android.R.attr.fillType
        const val fillViewport = android.R.attr.fillViewport
        const val filter = android.R.attr.filter
        const val filterTouchesWhenObscured = android.R.attr.filterTouchesWhenObscured
        const val fingerprintAuthDrawable = android.R.attr.fingerprintAuthDrawable
        const val finishOnCloseSystemDialogs = android.R.attr.finishOnCloseSystemDialogs
        const val finishOnTaskLaunch = android.R.attr.finishOnTaskLaunch
        const val firstBaselineToTopHeight = android.R.attr.firstBaselineToTopHeight
        const val firstDayOfWeek = android.R.attr.firstDayOfWeek
        const val fitsSystemWindows = android.R.attr.fitsSystemWindows
        const val flipInterval = android.R.attr.flipInterval
        const val focusable = android.R.attr.focusable
        const val focusableInTouchMode = android.R.attr.focusableInTouchMode
        const val focusedByDefault = android.R.attr.focusedByDefault

        @Deprecated
        const val focusedMonthDateColor = android.R.attr.focusedMonthDateColor
        const val focusedSearchResultHighlightColor = android.R.attr.focusedSearchResultHighlightColor
        const val font = android.R.attr.font
        const val fontFamily = android.R.attr.fontFamily
        const val fontFeatureSettings = android.R.attr.fontFeatureSettings

        @Deprecated
        const val fontProviderAuthority = android.R.attr.fontProviderAuthority

        @Deprecated
        const val fontProviderCerts = android.R.attr.fontProviderCerts

        @Deprecated
        const val fontProviderPackage = android.R.attr.fontProviderPackage

        @Deprecated
        const val fontProviderQuery = android.R.attr.fontProviderQuery
        const val fontProviderSystemFontFamily = android.R.attr.fontProviderSystemFontFamily
        const val fontStyle = android.R.attr.fontStyle
        const val fontVariationSettings = android.R.attr.fontVariationSettings
        const val fontWeight = android.R.attr.fontWeight
        const val footerDividersEnabled = android.R.attr.footerDividersEnabled
        const val forceDarkAllowed = android.R.attr.forceDarkAllowed
        const val forceHasOverlappingRendering = android.R.attr.forceHasOverlappingRendering
        const val forceQueryable = android.R.attr.forceQueryable
        const val forceUriPermissions = android.R.attr.forceUriPermissions
        const val foreground = android.R.attr.foreground
        const val foregroundGravity = android.R.attr.foregroundGravity
        const val foregroundServiceType = android.R.attr.foregroundServiceType
        const val foregroundTint = android.R.attr.foregroundTint
        const val foregroundTintMode = android.R.attr.foregroundTintMode
        const val format = android.R.attr.format
        const val format12Hour = android.R.attr.format12Hour
        const val format24Hour = android.R.attr.format24Hour
        const val fraction = android.R.attr.fraction
        const val fragment = android.R.attr.fragment
        const val fragmentAdvancedPattern = android.R.attr.fragmentAdvancedPattern
        const val fragmentAllowEnterTransitionOverlap = android.R.attr.fragmentAllowEnterTransitionOverlap
        const val fragmentAllowReturnTransitionOverlap = android.R.attr.fragmentAllowReturnTransitionOverlap
        const val fragmentCloseEnterAnimation = android.R.attr.fragmentCloseEnterAnimation
        const val fragmentCloseExitAnimation = android.R.attr.fragmentCloseExitAnimation
        const val fragmentEnterTransition = android.R.attr.fragmentEnterTransition
        const val fragmentExitTransition = android.R.attr.fragmentExitTransition
        const val fragmentFadeEnterAnimation = android.R.attr.fragmentFadeEnterAnimation
        const val fragmentFadeExitAnimation = android.R.attr.fragmentFadeExitAnimation
        const val fragmentOpenEnterAnimation = android.R.attr.fragmentOpenEnterAnimation
        const val fragmentOpenExitAnimation = android.R.attr.fragmentOpenExitAnimation
        const val fragmentPattern = android.R.attr.fragmentPattern
        const val fragmentPrefix = android.R.attr.fragmentPrefix
        const val fragmentReenterTransition = android.R.attr.fragmentReenterTransition
        const val fragmentReturnTransition = android.R.attr.fragmentReturnTransition
        const val fragmentSharedElementEnterTransition = android.R.attr.fragmentSharedElementEnterTransition
        const val fragmentSharedElementReturnTransition = android.R.attr.fragmentSharedElementReturnTransition
        const val fragmentSuffix = android.R.attr.fragmentSuffix
        const val freezesText = android.R.attr.freezesText
        const val fromAlpha = android.R.attr.fromAlpha
        const val fromDegrees = android.R.attr.fromDegrees
        const val fromExtendBottom = android.R.attr.fromExtendBottom
        const val fromExtendLeft = android.R.attr.fromExtendLeft
        const val fromExtendRight = android.R.attr.fromExtendRight
        const val fromExtendTop = android.R.attr.fromExtendTop
        const val fromId = android.R.attr.fromId
        const val fromScene = android.R.attr.fromScene
        const val fromXDelta = android.R.attr.fromXDelta
        const val fromXScale = android.R.attr.fromXScale
        const val fromYDelta = android.R.attr.fromYDelta
        const val fromYScale = android.R.attr.fromYScale
        const val fullBackupContent = android.R.attr.fullBackupContent
        const val fullBackupOnly = android.R.attr.fullBackupOnly
        const val fullBright = android.R.attr.fullBright
        const val fullDark = android.R.attr.fullDark
        const val functionalTest = android.R.attr.functionalTest
        const val galleryItemBackground = android.R.attr.galleryItemBackground
        const val galleryStyle = android.R.attr.galleryStyle
        const val gestureColor = android.R.attr.gestureColor
        const val gestureStrokeAngleThreshold = android.R.attr.gestureStrokeAngleThreshold
        const val gestureStrokeLengthThreshold = android.R.attr.gestureStrokeLengthThreshold
        const val gestureStrokeSquarenessThreshold = android.R.attr.gestureStrokeSquarenessThreshold
        const val gestureStrokeType = android.R.attr.gestureStrokeType
        const val gestureStrokeWidth = android.R.attr.gestureStrokeWidth
        const val glEsVersion = android.R.attr.glEsVersion
        const val goIcon = android.R.attr.goIcon
        const val gradientRadius = android.R.attr.gradientRadius
        const val grantUriPermissions = android.R.attr.grantUriPermissions
        const val gravity = android.R.attr.gravity
        const val gridViewStyle = android.R.attr.gridViewStyle
        const val groupIndicator = android.R.attr.groupIndicator
        const val gwpAsanMode = android.R.attr.gwpAsanMode
        const val hand_hour = android.R.attr.hand_hour
        const val hand_hourTint = android.R.attr.hand_hourTint
        const val hand_hourTintMode = android.R.attr.hand_hourTintMode
        const val hand_minute = android.R.attr.hand_minute
        const val hand_minuteTint = android.R.attr.hand_minuteTint
        const val hand_minuteTintMode = android.R.attr.hand_minuteTintMode
        const val hand_second = android.R.attr.hand_second
        const val hand_secondTint = android.R.attr.hand_secondTint
        const val hand_secondTintMode = android.R.attr.hand_secondTintMode
        const val handle = android.R.attr.handle
        const val handleProfiling = android.R.attr.handleProfiling
        const val handwritingBoundsOffsetBottom = android.R.attr.handwritingBoundsOffsetBottom
        const val handwritingBoundsOffsetLeft = android.R.attr.handwritingBoundsOffsetLeft
        const val handwritingBoundsOffsetRight = android.R.attr.handwritingBoundsOffsetRight
        const val handwritingBoundsOffsetTop = android.R.attr.handwritingBoundsOffsetTop
        const val hapticFeedbackEnabled = android.R.attr.hapticFeedbackEnabled
        const val hardwareAccelerated = android.R.attr.hardwareAccelerated
        const val hasCode = android.R.attr.hasCode
        const val hasFragileUserData = android.R.attr.hasFragileUserData

        @Deprecated
        const val headerAmPmTextAppearance = android.R.attr.headerAmPmTextAppearance
        const val headerBackground = android.R.attr.headerBackground

        @Deprecated
        const val headerDayOfMonthTextAppearance = android.R.attr.headerDayOfMonthTextAppearance
        const val headerDividersEnabled = android.R.attr.headerDividersEnabled

        @Deprecated
        const val headerMonthTextAppearance = android.R.attr.headerMonthTextAppearance

        @Deprecated
        const val headerTimeTextAppearance = android.R.attr.headerTimeTextAppearance

        @Deprecated
        const val headerYearTextAppearance = android.R.attr.headerYearTextAppearance
        const val height = android.R.attr.height
        const val hideOnContentScroll = android.R.attr.hideOnContentScroll
        const val hint = android.R.attr.hint
        const val homeAsUpIndicator = android.R.attr.homeAsUpIndicator
        const val homeLayout = android.R.attr.homeLayout
        const val horizontalDivider = android.R.attr.horizontalDivider

        @Deprecated
        const val horizontalGap = android.R.attr.horizontalGap
        const val horizontalScrollViewStyle = android.R.attr.horizontalScrollViewStyle
        const val horizontalSpacing = android.R.attr.horizontalSpacing
        const val host = android.R.attr.host
        const val hotSpotX = android.R.attr.hotSpotX
        const val hotSpotY = android.R.attr.hotSpotY
        const val htmlDescription = android.R.attr.htmlDescription
        const val hyphenationFrequency = android.R.attr.hyphenationFrequency
        const val icon = android.R.attr.icon

        @Deprecated
        const val iconPreview = android.R.attr.iconPreview
        const val iconSpaceReserved = android.R.attr.iconSpaceReserved
        const val iconTint = android.R.attr.iconTint
        const val iconTintMode = android.R.attr.iconTintMode
        const val iconifiedByDefault = android.R.attr.iconifiedByDefault
        const val id = android.R.attr.id
        const val identifier = android.R.attr.identifier
        const val ignoreGravity = android.R.attr.ignoreGravity
        const val imageButtonStyle = android.R.attr.imageButtonStyle
        const val imageWellStyle = android.R.attr.imageWellStyle
        const val imeActionId = android.R.attr.imeActionId
        const val imeActionLabel = android.R.attr.imeActionLabel
        const val imeExtractEnterAnimation = android.R.attr.imeExtractEnterAnimation
        const val imeExtractExitAnimation = android.R.attr.imeExtractExitAnimation
        const val imeFullscreenBackground = android.R.attr.imeFullscreenBackground
        const val imeOptions = android.R.attr.imeOptions
        const val imeSubtypeExtraValue = android.R.attr.imeSubtypeExtraValue
        const val imeSubtypeLocale = android.R.attr.imeSubtypeLocale
        const val imeSubtypeMode = android.R.attr.imeSubtypeMode
        const val immersive = android.R.attr.immersive
        const val importantForAccessibility = android.R.attr.importantForAccessibility
        const val importantForAutofill = android.R.attr.importantForAutofill
        const val importantForContentCapture = android.R.attr.importantForContentCapture
        const val inAnimation = android.R.attr.inAnimation
        const val includeFontPadding = android.R.attr.includeFontPadding
        const val includeInGlobalSearch = android.R.attr.includeInGlobalSearch
        const val indeterminate = android.R.attr.indeterminate
        const val indeterminateBehavior = android.R.attr.indeterminateBehavior
        const val indeterminateDrawable = android.R.attr.indeterminateDrawable
        const val indeterminateDuration = android.R.attr.indeterminateDuration
        const val indeterminateOnly = android.R.attr.indeterminateOnly
        const val indeterminateProgressStyle = android.R.attr.indeterminateProgressStyle
        const val indeterminateTint = android.R.attr.indeterminateTint
        const val indeterminateTintMode = android.R.attr.indeterminateTintMode
        const val indicatorEnd = android.R.attr.indicatorEnd
        const val indicatorLeft = android.R.attr.indicatorLeft
        const val indicatorRight = android.R.attr.indicatorRight
        const val indicatorStart = android.R.attr.indicatorStart
        const val inflatedId = android.R.attr.inflatedId
        const val inheritShowWhenLocked = android.R.attr.inheritShowWhenLocked
        const val initOrder = android.R.attr.initOrder
        const val initialKeyguardLayout = android.R.attr.initialKeyguardLayout
        const val initialLayout = android.R.attr.initialLayout
        const val innerRadius = android.R.attr.innerRadius
        const val innerRadiusRatio = android.R.attr.innerRadiusRatio

        @Deprecated
        const val inputMethod = android.R.attr.inputMethod
        const val inputType = android.R.attr.inputType
        const val inset = android.R.attr.inset
        const val insetBottom = android.R.attr.insetBottom
        const val insetLeft = android.R.attr.insetLeft
        const val insetRight = android.R.attr.insetRight
        const val insetTop = android.R.attr.insetTop
        const val installLocation = android.R.attr.installLocation
        const val interactiveUiTimeout = android.R.attr.interactiveUiTimeout
        const val interpolator = android.R.attr.interpolator
        const val intro = android.R.attr.intro
        const val isAccessibilityTool = android.R.attr.isAccessibilityTool
        const val isAlwaysSyncable = android.R.attr.isAlwaysSyncable
        const val isAsciiCapable = android.R.attr.isAsciiCapable
        const val isAuxiliary = android.R.attr.isAuxiliary
        const val isCredential = android.R.attr.isCredential
        const val isDefault = android.R.attr.isDefault
        const val isFeatureSplit = android.R.attr.isFeatureSplit
        const val isGame = android.R.attr.isGame
        const val isIndicator = android.R.attr.isIndicator
        const val isLightTheme = android.R.attr.isLightTheme

        @Deprecated
        const val isModifier = android.R.attr.isModifier

        @Deprecated
        const val isRepeatable = android.R.attr.isRepeatable
        const val isScrollContainer = android.R.attr.isScrollContainer

        @Deprecated
        const val isSplitRequired = android.R.attr.isSplitRequired
        const val isStatic = android.R.attr.isStatic

        @Deprecated
        const val isSticky = android.R.attr.isSticky
        const val isolatedProcess = android.R.attr.isolatedProcess
        const val isolatedSplits = android.R.attr.isolatedSplits
        const val itemBackground = android.R.attr.itemBackground
        const val itemIconDisabledAlpha = android.R.attr.itemIconDisabledAlpha
        const val itemPadding = android.R.attr.itemPadding
        const val itemTextAppearance = android.R.attr.itemTextAppearance
        const val justificationMode = android.R.attr.justificationMode
        const val keepScreenOn = android.R.attr.keepScreenOn
        const val key = android.R.attr.key

        @Deprecated
        const val keyBackground = android.R.attr.keyBackground

        @Deprecated
        const val keyEdgeFlags = android.R.attr.keyEdgeFlags

        @Deprecated
        const val keyHeight = android.R.attr.keyHeight

        @Deprecated
        const val keyIcon = android.R.attr.keyIcon

        @Deprecated
        const val keyLabel = android.R.attr.keyLabel

        @Deprecated
        const val keyOutputText = android.R.attr.keyOutputText

        @Deprecated
        const val keyPreviewHeight = android.R.attr.keyPreviewHeight

        @Deprecated
        const val keyPreviewLayout = android.R.attr.keyPreviewLayout

        @Deprecated
        const val keyPreviewOffset = android.R.attr.keyPreviewOffset
        const val keySet = android.R.attr.keySet

        @Deprecated
        const val keyTextColor = android.R.attr.keyTextColor

        @Deprecated
        const val keyTextSize = android.R.attr.keyTextSize

        @Deprecated
        const val keyWidth = android.R.attr.keyWidth
        const val keyboardLayout = android.R.attr.keyboardLayout
        const val keyboardLayoutType = android.R.attr.keyboardLayoutType
        const val keyboardLocale = android.R.attr.keyboardLocale

        @Deprecated
        const val keyboardMode = android.R.attr.keyboardMode
        const val keyboardNavigationCluster = android.R.attr.keyboardNavigationCluster
        const val keycode = android.R.attr.keycode
        const val killAfterRestore = android.R.attr.killAfterRestore
        const val knownActivityEmbeddingCerts = android.R.attr.knownActivityEmbeddingCerts
        const val knownCerts = android.R.attr.knownCerts
        const val lStar = android.R.attr.lStar
        const val label = android.R.attr.label
        const val labelFor = android.R.attr.labelFor

        @Deprecated
        const val labelTextSize = android.R.attr.labelTextSize
        const val languageTag = android.R.attr.languageTag
        const val largeHeap = android.R.attr.largeHeap
        const val largeScreens = android.R.attr.largeScreens
        const val largestWidthLimitDp = android.R.attr.largestWidthLimitDp
        const val lastBaselineToBottomHeight = android.R.attr.lastBaselineToBottomHeight
        const val launchMode = android.R.attr.launchMode
        const val launchTaskBehindSourceAnimation = android.R.attr.launchTaskBehindSourceAnimation
        const val launchTaskBehindTargetAnimation = android.R.attr.launchTaskBehindTargetAnimation
        const val layerType = android.R.attr.layerType
        const val layout = android.R.attr.layout
        const val layoutAnimation = android.R.attr.layoutAnimation
        const val layoutDirection = android.R.attr.layoutDirection
        const val layoutMode = android.R.attr.layoutMode
        const val layout_above = android.R.attr.layout_above
        const val layout_alignBaseline = android.R.attr.layout_alignBaseline
        const val layout_alignBottom = android.R.attr.layout_alignBottom
        const val layout_alignEnd = android.R.attr.layout_alignEnd
        const val layout_alignLeft = android.R.attr.layout_alignLeft
        const val layout_alignParentBottom = android.R.attr.layout_alignParentBottom
        const val layout_alignParentEnd = android.R.attr.layout_alignParentEnd
        const val layout_alignParentLeft = android.R.attr.layout_alignParentLeft
        const val layout_alignParentRight = android.R.attr.layout_alignParentRight
        const val layout_alignParentStart = android.R.attr.layout_alignParentStart
        const val layout_alignParentTop = android.R.attr.layout_alignParentTop
        const val layout_alignRight = android.R.attr.layout_alignRight
        const val layout_alignStart = android.R.attr.layout_alignStart
        const val layout_alignTop = android.R.attr.layout_alignTop
        const val layout_alignWithParentIfMissing = android.R.attr.layout_alignWithParentIfMissing
        const val layout_below = android.R.attr.layout_below
        const val layout_centerHorizontal = android.R.attr.layout_centerHorizontal
        const val layout_centerInParent = android.R.attr.layout_centerInParent
        const val layout_centerVertical = android.R.attr.layout_centerVertical
        const val layout_column = android.R.attr.layout_column
        const val layout_columnSpan = android.R.attr.layout_columnSpan
        const val layout_columnWeight = android.R.attr.layout_columnWeight
        const val layout_gravity = android.R.attr.layout_gravity
        const val layout_height = android.R.attr.layout_height
        const val layout_margin = android.R.attr.layout_margin
        const val layout_marginBottom = android.R.attr.layout_marginBottom
        const val layout_marginEnd = android.R.attr.layout_marginEnd
        const val layout_marginHorizontal = android.R.attr.layout_marginHorizontal
        const val layout_marginLeft = android.R.attr.layout_marginLeft
        const val layout_marginRight = android.R.attr.layout_marginRight
        const val layout_marginStart = android.R.attr.layout_marginStart
        const val layout_marginTop = android.R.attr.layout_marginTop
        const val layout_marginVertical = android.R.attr.layout_marginVertical
        const val layout_row = android.R.attr.layout_row
        const val layout_rowSpan = android.R.attr.layout_rowSpan
        const val layout_rowWeight = android.R.attr.layout_rowWeight
        const val layout_scale = android.R.attr.layout_scale
        const val layout_span = android.R.attr.layout_span
        const val layout_toEndOf = android.R.attr.layout_toEndOf
        const val layout_toLeftOf = android.R.attr.layout_toLeftOf
        const val layout_toRightOf = android.R.attr.layout_toRightOf
        const val layout_toStartOf = android.R.attr.layout_toStartOf
        const val layout_weight = android.R.attr.layout_weight
        const val layout_width = android.R.attr.layout_width
        const val layout_x = android.R.attr.layout_x
        const val layout_y = android.R.attr.layout_y
        const val left = android.R.attr.left
        const val letterSpacing = android.R.attr.letterSpacing
        const val level = android.R.attr.level
        const val lineBreakStyle = android.R.attr.lineBreakStyle
        const val lineBreakWordStyle = android.R.attr.lineBreakWordStyle
        const val lineHeight = android.R.attr.lineHeight
        const val lineSpacingExtra = android.R.attr.lineSpacingExtra
        const val lineSpacingMultiplier = android.R.attr.lineSpacingMultiplier
        const val lines = android.R.attr.lines
        const val linksClickable = android.R.attr.linksClickable
        const val listChoiceBackgroundIndicator = android.R.attr.listChoiceBackgroundIndicator
        const val listChoiceIndicatorMultiple = android.R.attr.listChoiceIndicatorMultiple
        const val listChoiceIndicatorSingle = android.R.attr.listChoiceIndicatorSingle
        const val listDivider = android.R.attr.listDivider
        const val listDividerAlertDialog = android.R.attr.listDividerAlertDialog
        const val listMenuViewStyle = android.R.attr.listMenuViewStyle
        const val listPopupWindowStyle = android.R.attr.listPopupWindowStyle
        const val listPreferredItemHeight = android.R.attr.listPreferredItemHeight
        const val listPreferredItemHeightLarge = android.R.attr.listPreferredItemHeightLarge
        const val listPreferredItemHeightSmall = android.R.attr.listPreferredItemHeightSmall
        const val listPreferredItemPaddingEnd = android.R.attr.listPreferredItemPaddingEnd
        const val listPreferredItemPaddingLeft = android.R.attr.listPreferredItemPaddingLeft
        const val listPreferredItemPaddingRight = android.R.attr.listPreferredItemPaddingRight
        const val listPreferredItemPaddingStart = android.R.attr.listPreferredItemPaddingStart
        const val listSelector = android.R.attr.listSelector
        const val listSeparatorTextViewStyle = android.R.attr.listSeparatorTextViewStyle
        const val listViewStyle = android.R.attr.listViewStyle
        const val listViewWhiteStyle = android.R.attr.listViewWhiteStyle
        const val localeConfig = android.R.attr.localeConfig
        const val lockTaskMode = android.R.attr.lockTaskMode
        const val logo = android.R.attr.logo
        const val logoDescription = android.R.attr.logoDescription
        const val longClickable = android.R.attr.longClickable
        const val loopViews = android.R.attr.loopViews
        const val manageSpaceActivity = android.R.attr.manageSpaceActivity
        const val mapViewStyle = android.R.attr.mapViewStyle
        const val marqueeRepeatLimit = android.R.attr.marqueeRepeatLimit
        const val matchOrder = android.R.attr.matchOrder
        const val max = android.R.attr.max
        const val maxAspectRatio = android.R.attr.maxAspectRatio
        const val maxButtonHeight = android.R.attr.maxButtonHeight
        const val maxDate = android.R.attr.maxDate
        const val maxEms = android.R.attr.maxEms
        const val maxHeight = android.R.attr.maxHeight
        const val maxItemsPerRow = android.R.attr.maxItemsPerRow
        const val maxLength = android.R.attr.maxLength
        const val maxLevel = android.R.attr.maxLevel
        const val maxLines = android.R.attr.maxLines
        const val maxLongVersionCode = android.R.attr.maxLongVersionCode
        const val maxRecents = android.R.attr.maxRecents
        const val maxResizeHeight = android.R.attr.maxResizeHeight
        const val maxResizeWidth = android.R.attr.maxResizeWidth
        const val maxRows = android.R.attr.maxRows
        const val maxSdkVersion = android.R.attr.maxSdkVersion
        const val maxWidth = android.R.attr.maxWidth
        const val maximumAngle = android.R.attr.maximumAngle
        const val measureAllChildren = android.R.attr.measureAllChildren
        const val measureWithLargestChild = android.R.attr.measureWithLargestChild
        const val mediaRouteButtonStyle = android.R.attr.mediaRouteButtonStyle
        const val mediaRouteTypes = android.R.attr.mediaRouteTypes
        const val memtagMode = android.R.attr.memtagMode
        const val menuCategory = android.R.attr.menuCategory
        const val mimeGroup = android.R.attr.mimeGroup
        const val mimeType = android.R.attr.mimeType
        const val min = android.R.attr.min
        const val minAspectRatio = android.R.attr.minAspectRatio
        const val minDate = android.R.attr.minDate
        const val minEms = android.R.attr.minEms
        const val minHeight = android.R.attr.minHeight
        const val minLevel = android.R.attr.minLevel
        const val minLines = android.R.attr.minLines
        const val minResizeHeight = android.R.attr.minResizeHeight
        const val minResizeWidth = android.R.attr.minResizeWidth
        const val minSdkVersion = android.R.attr.minSdkVersion
        const val minWidth = android.R.attr.minWidth
        const val minimumHorizontalAngle = android.R.attr.minimumHorizontalAngle
        const val minimumVerticalAngle = android.R.attr.minimumVerticalAngle
        const val mipMap = android.R.attr.mipMap
        const val mirrorForRtl = android.R.attr.mirrorForRtl
        const val mode = android.R.attr.mode
        const val moreIcon = android.R.attr.moreIcon
        const val multiArch = android.R.attr.multiArch
        const val multiprocess = android.R.attr.multiprocess
        const val name = android.R.attr.name
        const val nativeHeapZeroInitialized = android.R.attr.nativeHeapZeroInitialized

        @Deprecated
        const val navigationBarColor = android.R.attr.navigationBarColor

        @Deprecated
        const val navigationBarDividerColor = android.R.attr.navigationBarDividerColor
        const val navigationContentDescription = android.R.attr.navigationContentDescription
        const val navigationIcon = android.R.attr.navigationIcon
        const val navigationMode = android.R.attr.navigationMode
        const val negativeButtonText = android.R.attr.negativeButtonText
        const val nestedScrollingEnabled = android.R.attr.nestedScrollingEnabled
        const val networkSecurityConfig = android.R.attr.networkSecurityConfig
        const val nextClusterForward = android.R.attr.nextClusterForward
        const val nextFocusDown = android.R.attr.nextFocusDown
        const val nextFocusForward = android.R.attr.nextFocusForward
        const val nextFocusLeft = android.R.attr.nextFocusLeft
        const val nextFocusRight = android.R.attr.nextFocusRight
        const val nextFocusUp = android.R.attr.nextFocusUp
        const val noHistory = android.R.attr.noHistory
        const val nonInteractiveUiTimeout = android.R.attr.nonInteractiveUiTimeout
        const val normalScreens = android.R.attr.normalScreens
        const val notificationTimeout = android.R.attr.notificationTimeout
        const val numColumns = android.R.attr.numColumns
        const val numStars = android.R.attr.numStars
        const val numberPickerStyle = android.R.attr.numberPickerStyle
        const val numbersBackgroundColor = android.R.attr.numbersBackgroundColor
        const val numbersInnerTextColor = android.R.attr.numbersInnerTextColor
        const val numbersSelectorColor = android.R.attr.numbersSelectorColor
        const val numbersTextColor = android.R.attr.numbersTextColor

        @Deprecated
        const val numeric = android.R.attr.numeric
        const val numericModifiers = android.R.attr.numericModifiers
        const val numericShortcut = android.R.attr.numericShortcut
        const val offset = android.R.attr.offset

        @Deprecated
        const val onClick = android.R.attr.onClick
        const val oneshot = android.R.attr.oneshot
        const val opacity = android.R.attr.opacity
        const val opticalInsetBottom = android.R.attr.opticalInsetBottom
        const val opticalInsetLeft = android.R.attr.opticalInsetLeft
        const val opticalInsetRight = android.R.attr.opticalInsetRight
        const val opticalInsetTop = android.R.attr.opticalInsetTop
        const val order = android.R.attr.order
        const val orderInCategory = android.R.attr.orderInCategory
        const val ordering = android.R.attr.ordering
        const val orderingFromXml = android.R.attr.orderingFromXml
        const val orientation = android.R.attr.orientation
        const val outAnimation = android.R.attr.outAnimation
        const val outlineAmbientShadowColor = android.R.attr.outlineAmbientShadowColor
        const val outlineProvider = android.R.attr.outlineProvider
        const val outlineSpotShadowColor = android.R.attr.outlineSpotShadowColor
        const val overScrollFooter = android.R.attr.overScrollFooter
        const val overScrollHeader = android.R.attr.overScrollHeader
        const val overScrollMode = android.R.attr.overScrollMode
        const val overlapAnchor = android.R.attr.overlapAnchor
        const val overridesImplicitlyEnabledSubtype = android.R.attr.overridesImplicitlyEnabledSubtype
        const val packageNames = android.R.attr.packageNames
        const val packageType = android.R.attr.packageType
        const val padding = android.R.attr.padding
        const val paddingBottom = android.R.attr.paddingBottom
        const val paddingEnd = android.R.attr.paddingEnd
        const val paddingHorizontal = android.R.attr.paddingHorizontal
        const val paddingLeft = android.R.attr.paddingLeft
        const val paddingMode = android.R.attr.paddingMode
        const val paddingRight = android.R.attr.paddingRight
        const val paddingStart = android.R.attr.paddingStart
        const val paddingTop = android.R.attr.paddingTop
        const val paddingVertical = android.R.attr.paddingVertical
        const val panelBackground = android.R.attr.panelBackground
        const val panelColorBackground = android.R.attr.panelColorBackground
        const val panelColorForeground = android.R.attr.panelColorForeground
        const val panelFullBackground = android.R.attr.panelFullBackground
        const val panelTextAppearance = android.R.attr.panelTextAppearance
        const val parentActivityName = android.R.attr.parentActivityName

        @Deprecated
        const val password = android.R.attr.password
        const val passwordsActivity = android.R.attr.passwordsActivity
        const val path = android.R.attr.path
        const val pathAdvancedPattern = android.R.attr.pathAdvancedPattern
        const val pathData = android.R.attr.pathData
        const val pathPattern = android.R.attr.pathPattern
        const val pathPrefix = android.R.attr.pathPrefix
        const val pathSuffix = android.R.attr.pathSuffix
        const val patternPathData = android.R.attr.patternPathData
        const val permission = android.R.attr.permission
        const val permissionFlags = android.R.attr.permissionFlags
        const val permissionGroup = android.R.attr.permissionGroup
        const val permissionGroupFlags = android.R.attr.permissionGroupFlags
        const val persistableMode = android.R.attr.persistableMode
        const val persistent = android.R.attr.persistent
        const val persistentDrawingCache = android.R.attr.persistentDrawingCache
        const val persistentWhenFeatureAvailable = android.R.attr.persistentWhenFeatureAvailable

        @Deprecated
        const val phoneNumber = android.R.attr.phoneNumber
        const val physicalKeyboardHintLanguageTag = android.R.attr.physicalKeyboardHintLanguageTag
        const val physicalKeyboardHintLayoutType = android.R.attr.physicalKeyboardHintLayoutType
        const val pivotX = android.R.attr.pivotX
        const val pivotY = android.R.attr.pivotY
        const val pointerIcon = android.R.attr.pointerIcon
        const val popupAnimationStyle = android.R.attr.popupAnimationStyle
        const val popupBackground = android.R.attr.popupBackground

        @Deprecated
        const val popupCharacters = android.R.attr.popupCharacters
        const val popupElevation = android.R.attr.popupElevation
        const val popupEnterTransition = android.R.attr.popupEnterTransition
        const val popupExitTransition = android.R.attr.popupExitTransition

        @Deprecated
        const val popupKeyboard = android.R.attr.popupKeyboard

        @Deprecated
        const val popupLayout = android.R.attr.popupLayout
        const val popupMenuStyle = android.R.attr.popupMenuStyle
        const val popupTheme = android.R.attr.popupTheme
        const val popupWindowStyle = android.R.attr.popupWindowStyle
        const val port = android.R.attr.port
        const val positiveButtonText = android.R.attr.positiveButtonText
        const val preferKeepClear = android.R.attr.preferKeepClear
        const val preferMinimalPostProcessing = android.R.attr.preferMinimalPostProcessing
        const val preferenceCategoryStyle = android.R.attr.preferenceCategoryStyle
        const val preferenceFragmentStyle = android.R.attr.preferenceFragmentStyle
        const val preferenceInformationStyle = android.R.attr.preferenceInformationStyle
        const val preferenceLayoutChild = android.R.attr.preferenceLayoutChild
        const val preferenceScreenStyle = android.R.attr.preferenceScreenStyle
        const val preferenceStyle = android.R.attr.preferenceStyle
        const val presentationTheme = android.R.attr.presentationTheme
        const val preserveLegacyExternalStorage = android.R.attr.preserveLegacyExternalStorage
        const val previewImage = android.R.attr.previewImage
        const val previewLayout = android.R.attr.previewLayout
        const val primaryContentAlpha = android.R.attr.primaryContentAlpha
        const val priority = android.R.attr.priority
        const val privateImeOptions = android.R.attr.privateImeOptions
        const val process = android.R.attr.process
        const val progress = android.R.attr.progress
        const val progressBackgroundTint = android.R.attr.progressBackgroundTint
        const val progressBackgroundTintMode = android.R.attr.progressBackgroundTintMode
        const val progressBarPadding = android.R.attr.progressBarPadding
        const val progressBarStyle = android.R.attr.progressBarStyle
        const val progressBarStyleHorizontal = android.R.attr.progressBarStyleHorizontal
        const val progressBarStyleInverse = android.R.attr.progressBarStyleInverse
        const val progressBarStyleLarge = android.R.attr.progressBarStyleLarge
        const val progressBarStyleLargeInverse = android.R.attr.progressBarStyleLargeInverse
        const val progressBarStyleSmall = android.R.attr.progressBarStyleSmall
        const val progressBarStyleSmallInverse = android.R.attr.progressBarStyleSmallInverse
        const val progressBarStyleSmallTitle = android.R.attr.progressBarStyleSmallTitle
        const val progressDrawable = android.R.attr.progressDrawable
        const val progressTint = android.R.attr.progressTint
        const val progressTintMode = android.R.attr.progressTintMode
        const val prompt = android.R.attr.prompt
        const val propertyName = android.R.attr.propertyName
        const val propertyXName = android.R.attr.propertyXName
        const val propertyYName = android.R.attr.propertyYName
        const val protectionLevel = android.R.attr.protectionLevel
        const val publicKey = android.R.attr.publicKey
        const val query = android.R.attr.query
        const val queryActionMsg = android.R.attr.queryActionMsg
        const val queryAdvancedPattern = android.R.attr.queryAdvancedPattern
        const val queryAfterZeroResults = android.R.attr.queryAfterZeroResults
        const val queryBackground = android.R.attr.queryBackground
        const val queryHint = android.R.attr.queryHint
        const val queryPattern = android.R.attr.queryPattern
        const val queryPrefix = android.R.attr.queryPrefix
        const val querySuffix = android.R.attr.querySuffix
        const val quickContactBadgeStyleSmallWindowLarge = android.R.attr.quickContactBadgeStyleSmallWindowLarge
        const val quickContactBadgeStyleSmallWindowMedium = android.R.attr.quickContactBadgeStyleSmallWindowMedium
        const val quickContactBadgeStyleSmallWindowSmall = android.R.attr.quickContactBadgeStyleSmallWindowSmall
        const val quickContactBadgeStyleWindowLarge = android.R.attr.quickContactBadgeStyleWindowLarge
        const val quickContactBadgeStyleWindowMedium = android.R.attr.quickContactBadgeStyleWindowMedium
        const val quickContactBadgeStyleWindowSmall = android.R.attr.quickContactBadgeStyleWindowSmall
        const val radioButtonStyle = android.R.attr.radioButtonStyle
        const val radius = android.R.attr.radius
        const val rating = android.R.attr.rating
        const val ratingBarStyle = android.R.attr.ratingBarStyle
        const val ratingBarStyleIndicator = android.R.attr.ratingBarStyleIndicator
        const val ratingBarStyleSmall = android.R.attr.ratingBarStyleSmall
        const val readPermission = android.R.attr.readPermission
        const val recognitionService = android.R.attr.recognitionService
        const val recreateOnConfigChanges = android.R.attr.recreateOnConfigChanges
        const val recycleEnabled = android.R.attr.recycleEnabled
        const val relinquishTaskIdentity = android.R.attr.relinquishTaskIdentity
        const val reparent = android.R.attr.reparent
        const val reparentWithOverlay = android.R.attr.reparentWithOverlay
        const val repeatCount = android.R.attr.repeatCount
        const val repeatMode = android.R.attr.repeatMode
        const val reqFiveWayNav = android.R.attr.reqFiveWayNav
        const val reqHardKeyboard = android.R.attr.reqHardKeyboard
        const val reqKeyboardType = android.R.attr.reqKeyboardType
        const val reqNavigation = android.R.attr.reqNavigation
        const val reqTouchScreen = android.R.attr.reqTouchScreen
        const val requestLegacyExternalStorage = android.R.attr.requestLegacyExternalStorage
        const val requestRawExternalStorageAccess = android.R.attr.requestRawExternalStorageAccess
        const val requireContentUriPermissionFromCaller = android.R.attr.requireContentUriPermissionFromCaller
        const val requireDeviceScreenOn = android.R.attr.requireDeviceScreenOn
        const val requireDeviceUnlock = android.R.attr.requireDeviceUnlock
        const val required = android.R.attr.required
        const val requiredAccountType = android.R.attr.requiredAccountType
        const val requiredDisplayCategory = android.R.attr.requiredDisplayCategory
        const val requiredFeature = android.R.attr.requiredFeature
        const val requiredForAllUsers = android.R.attr.requiredForAllUsers
        const val requiredNotFeature = android.R.attr.requiredNotFeature
        const val requiredSplitTypes = android.R.attr.requiredSplitTypes
        const val requiresFadingEdge = android.R.attr.requiresFadingEdge
        const val requiresSmallestWidthDp = android.R.attr.requiresSmallestWidthDp
        const val resetEnabledSettingsOnAppDataCleared = android.R.attr.resetEnabledSettingsOnAppDataCleared
        const val resizeClip = android.R.attr.resizeClip
        const val resizeMode = android.R.attr.resizeMode
        const val resizeable = android.R.attr.resizeable
        const val resizeableActivity = android.R.attr.resizeableActivity
        const val resource = android.R.attr.resource
        const val resourcesMap = android.R.attr.resourcesMap
        const val restoreAnyVersion = android.R.attr.restoreAnyVersion

        @Deprecated
        const val restoreNeedsApplication = android.R.attr.restoreNeedsApplication
        const val restrictedAccountType = android.R.attr.restrictedAccountType
        const val restrictionType = android.R.attr.restrictionType
        const val resumeWhilePausing = android.R.attr.resumeWhilePausing
        const val reversible = android.R.attr.reversible
        const val revisionCode = android.R.attr.revisionCode
        const val right = android.R.attr.right
        const val ringtonePreferenceStyle = android.R.attr.ringtonePreferenceStyle
        const val ringtoneType = android.R.attr.ringtoneType
        const val rollbackDataPolicy = android.R.attr.rollbackDataPolicy
        const val rotation = android.R.attr.rotation
        const val rotationAnimation = android.R.attr.rotationAnimation
        const val rotationX = android.R.attr.rotationX
        const val rotationY = android.R.attr.rotationY
        const val roundIcon = android.R.attr.roundIcon
        const val rowCount = android.R.attr.rowCount
        const val rowDelay = android.R.attr.rowDelay

        @Deprecated
        const val rowEdgeFlags = android.R.attr.rowEdgeFlags
        const val rowHeight = android.R.attr.rowHeight
        const val rowOrderPreserved = android.R.attr.rowOrderPreserved
        const val saveEnabled = android.R.attr.saveEnabled
        const val scaleGravity = android.R.attr.scaleGravity
        const val scaleHeight = android.R.attr.scaleHeight
        const val scaleType = android.R.attr.scaleType
        const val scaleWidth = android.R.attr.scaleWidth
        const val scaleX = android.R.attr.scaleX
        const val scaleY = android.R.attr.scaleY
        const val scheme = android.R.attr.scheme
        const val screenDensity = android.R.attr.screenDensity
        const val screenOrientation = android.R.attr.screenOrientation
        const val screenReaderFocusable = android.R.attr.screenReaderFocusable
        const val screenSize = android.R.attr.screenSize
        const val scrollHorizontally = android.R.attr.scrollHorizontally
        const val scrollIndicators = android.R.attr.scrollIndicators
        const val scrollViewStyle = android.R.attr.scrollViewStyle
        const val scrollX = android.R.attr.scrollX
        const val scrollY = android.R.attr.scrollY
        const val scrollbarAlwaysDrawHorizontalTrack = android.R.attr.scrollbarAlwaysDrawHorizontalTrack
        const val scrollbarAlwaysDrawVerticalTrack = android.R.attr.scrollbarAlwaysDrawVerticalTrack
        const val scrollbarDefaultDelayBeforeFade = android.R.attr.scrollbarDefaultDelayBeforeFade
        const val scrollbarFadeDuration = android.R.attr.scrollbarFadeDuration
        const val scrollbarSize = android.R.attr.scrollbarSize
        const val scrollbarStyle = android.R.attr.scrollbarStyle
        const val scrollbarThumbHorizontal = android.R.attr.scrollbarThumbHorizontal
        const val scrollbarThumbVertical = android.R.attr.scrollbarThumbVertical
        const val scrollbarTrackHorizontal = android.R.attr.scrollbarTrackHorizontal
        const val scrollbarTrackVertical = android.R.attr.scrollbarTrackVertical
        const val scrollbars = android.R.attr.scrollbars
        const val scrollingCache = android.R.attr.scrollingCache

        @Deprecated
        const val searchButtonText = android.R.attr.searchButtonText
        const val searchHintIcon = android.R.attr.searchHintIcon
        const val searchIcon = android.R.attr.searchIcon
        const val searchMode = android.R.attr.searchMode
        const val searchResultHighlightColor = android.R.attr.searchResultHighlightColor
        const val searchSettingsDescription = android.R.attr.searchSettingsDescription
        const val searchSuggestAuthority = android.R.attr.searchSuggestAuthority
        const val searchSuggestIntentAction = android.R.attr.searchSuggestIntentAction
        const val searchSuggestIntentData = android.R.attr.searchSuggestIntentData
        const val searchSuggestPath = android.R.attr.searchSuggestPath
        const val searchSuggestSelection = android.R.attr.searchSuggestSelection
        const val searchSuggestThreshold = android.R.attr.searchSuggestThreshold
        const val searchViewStyle = android.R.attr.searchViewStyle
        const val secondaryContentAlpha = android.R.attr.secondaryContentAlpha
        const val secondaryProgress = android.R.attr.secondaryProgress
        const val secondaryProgressTint = android.R.attr.secondaryProgressTint
        const val secondaryProgressTintMode = android.R.attr.secondaryProgressTintMode
        const val secureElementName = android.R.attr.secureElementName
        const val seekBarStyle = android.R.attr.seekBarStyle
        const val segmentedButtonStyle = android.R.attr.segmentedButtonStyle
        const val selectAllOnFocus = android.R.attr.selectAllOnFocus
        const val selectable = android.R.attr.selectable
        const val selectableAsDefault = android.R.attr.selectableAsDefault
        const val selectableItemBackground = android.R.attr.selectableItemBackground
        const val selectableItemBackgroundBorderless = android.R.attr.selectableItemBackgroundBorderless

        @Deprecated
        const val selectedDateVerticalBar = android.R.attr.selectedDateVerticalBar

        @Deprecated
        const val selectedWeekBackgroundColor = android.R.attr.selectedWeekBackgroundColor
        const val selectionDividerHeight = android.R.attr.selectionDividerHeight
        const val sessionService = android.R.attr.sessionService
        const val settingsActivity = android.R.attr.settingsActivity
        const val settingsSliceUri = android.R.attr.settingsSliceUri
        const val settingsSubtitle = android.R.attr.settingsSubtitle
        const val setupActivity = android.R.attr.setupActivity
        const val shadowColor = android.R.attr.shadowColor
        const val shadowDx = android.R.attr.shadowDx
        const val shadowDy = android.R.attr.shadowDy
        const val shadowRadius = android.R.attr.shadowRadius
        const val shape = android.R.attr.shape
        const val shareInterpolator = android.R.attr.shareInterpolator

        @Deprecated
        const val sharedUserId = android.R.attr.sharedUserId

        @Deprecated
        const val sharedUserLabel = android.R.attr.sharedUserLabel
        const val sharedUserMaxSdkVersion = android.R.attr.sharedUserMaxSdkVersion
        const val shell = android.R.attr.shell
        const val shiftDrawingOffsetForStartOverhang = android.R.attr.shiftDrawingOffsetForStartOverhang
        const val shortcutDisabledMessage = android.R.attr.shortcutDisabledMessage
        const val shortcutId = android.R.attr.shortcutId
        const val shortcutLongLabel = android.R.attr.shortcutLongLabel
        const val shortcutShortLabel = android.R.attr.shortcutShortLabel
        const val shouldDefaultToObserveMode = android.R.attr.shouldDefaultToObserveMode
        const val shouldDisableView = android.R.attr.shouldDisableView
        const val shouldUseDefaultUnfoldTransition = android.R.attr.shouldUseDefaultUnfoldTransition
        const val showAsAction = android.R.attr.showAsAction
        const val showBackdrop = android.R.attr.showBackdrop
        const val showClockAndComplications = android.R.attr.showClockAndComplications
        const val showDefault = android.R.attr.showDefault
        const val showDividers = android.R.attr.showDividers
        const val showForAllUsers = android.R.attr.showForAllUsers
        const val showInInputMethodPicker = android.R.attr.showInInputMethodPicker
        const val showMetadataInPreview = android.R.attr.showMetadataInPreview

        @Deprecated
        const val showOnLockScreen = android.R.attr.showOnLockScreen
        const val showSilent = android.R.attr.showSilent
        const val showText = android.R.attr.showText

        @Deprecated
        const val showWeekNumber = android.R.attr.showWeekNumber
        const val showWhenLocked = android.R.attr.showWhenLocked

        @Deprecated
        const val shownWeekCount = android.R.attr.shownWeekCount
        const val shrinkColumns = android.R.attr.shrinkColumns

        @Deprecated
        const val singleLine = android.R.attr.singleLine
        const val singleLineTitle = android.R.attr.singleLineTitle
        const val singleUser = android.R.attr.singleUser
        const val slideEdge = android.R.attr.slideEdge
        const val smallIcon = android.R.attr.smallIcon
        const val smallScreens = android.R.attr.smallScreens
        const val smoothScrollbar = android.R.attr.smoothScrollbar
        const val soundEffectsEnabled = android.R.attr.soundEffectsEnabled
        const val spacing = android.R.attr.spacing
        const val spinnerDropDownItemStyle = android.R.attr.spinnerDropDownItemStyle
        const val spinnerItemStyle = android.R.attr.spinnerItemStyle
        const val spinnerMode = android.R.attr.spinnerMode
        const val spinnerStyle = android.R.attr.spinnerStyle
        const val spinnersShown = android.R.attr.spinnersShown
        const val splashScreenTheme = android.R.attr.splashScreenTheme
        const val splitMotionEvents = android.R.attr.splitMotionEvents
        const val splitName = android.R.attr.splitName
        const val splitTrack = android.R.attr.splitTrack
        const val splitTypes = android.R.attr.splitTypes
        const val spotShadowAlpha = android.R.attr.spotShadowAlpha
        const val src = android.R.attr.src
        const val ssp = android.R.attr.ssp
        const val sspAdvancedPattern = android.R.attr.sspAdvancedPattern
        const val sspPattern = android.R.attr.sspPattern
        const val sspPrefix = android.R.attr.sspPrefix
        const val sspSuffix = android.R.attr.sspSuffix
        const val stackFromBottom = android.R.attr.stackFromBottom
        const val stackViewStyle = android.R.attr.stackViewStyle
        const val starStyle = android.R.attr.starStyle
        const val start = android.R.attr.start
        const val startColor = android.R.attr.startColor
        const val startDelay = android.R.attr.startDelay
        const val startOffset = android.R.attr.startOffset
        const val startX = android.R.attr.startX
        const val startY = android.R.attr.startY

        @Deprecated
        const val startYear = android.R.attr.startYear
        const val stateListAnimator = android.R.attr.stateListAnimator
        const val stateNotNeeded = android.R.attr.stateNotNeeded
        const val state_above_anchor = android.R.attr.state_above_anchor
        const val state_accelerated = android.R.attr.state_accelerated
        const val state_activated = android.R.attr.state_activated
        const val state_active = android.R.attr.state_active
        const val state_checkable = android.R.attr.state_checkable
        const val state_checked = android.R.attr.state_checked
        const val state_drag_can_accept = android.R.attr.state_drag_can_accept
        const val state_drag_hovered = android.R.attr.state_drag_hovered
        const val state_empty = android.R.attr.state_empty
        const val state_enabled = android.R.attr.state_enabled
        const val state_expanded = android.R.attr.state_expanded
        const val state_first = android.R.attr.state_first
        const val state_focused = android.R.attr.state_focused
        const val state_hovered = android.R.attr.state_hovered
        const val state_last = android.R.attr.state_last

        @Deprecated
        const val state_long_pressable = android.R.attr.state_long_pressable
        const val state_middle = android.R.attr.state_middle
        const val state_multiline = android.R.attr.state_multiline
        const val state_pressed = android.R.attr.state_pressed
        const val state_selected = android.R.attr.state_selected
        const val state_single = android.R.attr.state_single
        const val state_window_focused = android.R.attr.state_window_focused
        const val staticWallpaperPreview = android.R.attr.staticWallpaperPreview

        @Deprecated
        const val statusBarColor = android.R.attr.statusBarColor
        const val stepSize = android.R.attr.stepSize
        const val stopWithTask = android.R.attr.stopWithTask
        const val streamType = android.R.attr.streamType
        const val stretchColumns = android.R.attr.stretchColumns
        const val stretchMode = android.R.attr.stretchMode
        const val strokeAlpha = android.R.attr.strokeAlpha
        const val strokeColor = android.R.attr.strokeColor
        const val strokeLineCap = android.R.attr.strokeLineCap
        const val strokeLineJoin = android.R.attr.strokeLineJoin
        const val strokeMiterLimit = android.R.attr.strokeMiterLimit
        const val strokeWidth = android.R.attr.strokeWidth
        const val stylusHandwritingSettingsActivity = android.R.attr.stylusHandwritingSettingsActivity
        const val subMenuArrow = android.R.attr.subMenuArrow
        const val submitBackground = android.R.attr.submitBackground
        const val subtitle = android.R.attr.subtitle
        const val subtitleTextAppearance = android.R.attr.subtitleTextAppearance
        const val subtitleTextColor = android.R.attr.subtitleTextColor
        const val subtitleTextStyle = android.R.attr.subtitleTextStyle
        const val subtypeExtraValue = android.R.attr.subtypeExtraValue
        const val subtypeId = android.R.attr.subtypeId
        const val subtypeLocale = android.R.attr.subtypeLocale
        const val suggestActionMsg = android.R.attr.suggestActionMsg
        const val suggestActionMsgColumn = android.R.attr.suggestActionMsgColumn
        const val suggestionRowLayout = android.R.attr.suggestionRowLayout
        const val summary = android.R.attr.summary
        const val summaryColumn = android.R.attr.summaryColumn
        const val summaryOff = android.R.attr.summaryOff
        const val summaryOn = android.R.attr.summaryOn
        const val supportedTypes = android.R.attr.supportedTypes
        const val supportsAssist = android.R.attr.supportsAssist
        const val supportsBatteryGameMode = android.R.attr.supportsBatteryGameMode
        const val supportsConnectionlessStylusHandwriting = android.R.attr.supportsConnectionlessStylusHandwriting
        const val supportsInlineSuggestions = android.R.attr.supportsInlineSuggestions
        const val supportsInlineSuggestionsWithTouchExploration = android.R.attr.supportsInlineSuggestionsWithTouchExploration
        const val supportsLaunchVoiceAssistFromKeyguard = android.R.attr.supportsLaunchVoiceAssistFromKeyguard
        const val supportsLocalInteraction = android.R.attr.supportsLocalInteraction
        const val supportsMultipleDisplays = android.R.attr.supportsMultipleDisplays
        const val supportsPerformanceGameMode = android.R.attr.supportsPerformanceGameMode
        const val supportsPictureInPicture = android.R.attr.supportsPictureInPicture
        const val supportsRtl = android.R.attr.supportsRtl
        const val supportsStylusHandwriting = android.R.attr.supportsStylusHandwriting
        const val supportsSwitchingToNextInputMethod = android.R.attr.supportsSwitchingToNextInputMethod
        const val supportsUploading = android.R.attr.supportsUploading
        const val suppressesSpellChecker = android.R.attr.suppressesSpellChecker
        const val switchMinWidth = android.R.attr.switchMinWidth
        const val switchPadding = android.R.attr.switchPadding
        const val switchPreferenceStyle = android.R.attr.switchPreferenceStyle
        const val switchStyle = android.R.attr.switchStyle
        const val switchTextAppearance = android.R.attr.switchTextAppearance
        const val switchTextOff = android.R.attr.switchTextOff
        const val switchTextOn = android.R.attr.switchTextOn
        const val syncable = android.R.attr.syncable
        const val systemUserOnly = android.R.attr.systemUserOnly
        const val tabStripEnabled = android.R.attr.tabStripEnabled
        const val tabStripLeft = android.R.attr.tabStripLeft
        const val tabStripRight = android.R.attr.tabStripRight
        const val tabWidgetStyle = android.R.attr.tabWidgetStyle
        const val tag = android.R.attr.tag
        const val targetActivity = android.R.attr.targetActivity
        const val targetCellHeight = android.R.attr.targetCellHeight
        const val targetCellWidth = android.R.attr.targetCellWidth
        const val targetClass = android.R.attr.targetClass

        @Deprecated
        const val targetDescriptions = android.R.attr.targetDescriptions
        const val targetId = android.R.attr.targetId
        const val targetName = android.R.attr.targetName
        const val targetPackage = android.R.attr.targetPackage
        const val targetProcesses = android.R.attr.targetProcesses

        @Deprecated
        const val targetSandboxVersion = android.R.attr.targetSandboxVersion
        const val targetSdkVersion = android.R.attr.targetSdkVersion
        const val taskAffinity = android.R.attr.taskAffinity
        const val taskCloseEnterAnimation = android.R.attr.taskCloseEnterAnimation
        const val taskCloseExitAnimation = android.R.attr.taskCloseExitAnimation
        const val taskOpenEnterAnimation = android.R.attr.taskOpenEnterAnimation
        const val taskOpenExitAnimation = android.R.attr.taskOpenExitAnimation
        const val taskToBackEnterAnimation = android.R.attr.taskToBackEnterAnimation
        const val taskToBackExitAnimation = android.R.attr.taskToBackExitAnimation
        const val taskToFrontEnterAnimation = android.R.attr.taskToFrontEnterAnimation
        const val taskToFrontExitAnimation = android.R.attr.taskToFrontExitAnimation
        const val tension = android.R.attr.tension
        const val testOnly = android.R.attr.testOnly
        const val text = android.R.attr.text
        const val textAlignment = android.R.attr.textAlignment
        const val textAllCaps = android.R.attr.textAllCaps
        const val textAppearance = android.R.attr.textAppearance
        const val textAppearanceButton = android.R.attr.textAppearanceButton
        const val textAppearanceInverse = android.R.attr.textAppearanceInverse
        const val textAppearanceLarge = android.R.attr.textAppearanceLarge
        const val textAppearanceLargeInverse = android.R.attr.textAppearanceLargeInverse
        const val textAppearanceLargePopupMenu = android.R.attr.textAppearanceLargePopupMenu
        const val textAppearanceListItem = android.R.attr.textAppearanceListItem
        const val textAppearanceListItemSecondary = android.R.attr.textAppearanceListItemSecondary
        const val textAppearanceListItemSmall = android.R.attr.textAppearanceListItemSmall
        const val textAppearanceMedium = android.R.attr.textAppearanceMedium
        const val textAppearanceMediumInverse = android.R.attr.textAppearanceMediumInverse
        const val textAppearancePopupMenuHeader = android.R.attr.textAppearancePopupMenuHeader
        const val textAppearanceSearchResultSubtitle = android.R.attr.textAppearanceSearchResultSubtitle
        const val textAppearanceSearchResultTitle = android.R.attr.textAppearanceSearchResultTitle
        const val textAppearanceSmall = android.R.attr.textAppearanceSmall
        const val textAppearanceSmallInverse = android.R.attr.textAppearanceSmallInverse
        const val textAppearanceSmallPopupMenu = android.R.attr.textAppearanceSmallPopupMenu
        const val textCheckMark = android.R.attr.textCheckMark
        const val textCheckMarkInverse = android.R.attr.textCheckMarkInverse
        const val textColor = android.R.attr.textColor
        const val textColorAlertDialogListItem = android.R.attr.textColorAlertDialogListItem
        const val textColorHighlight = android.R.attr.textColorHighlight
        const val textColorHighlightInverse = android.R.attr.textColorHighlightInverse
        const val textColorHint = android.R.attr.textColorHint
        const val textColorHintInverse = android.R.attr.textColorHintInverse
        const val textColorLink = android.R.attr.textColorLink
        const val textColorLinkInverse = android.R.attr.textColorLinkInverse
        const val textColorPrimary = android.R.attr.textColorPrimary
        const val textColorPrimaryDisableOnly = android.R.attr.textColorPrimaryDisableOnly
        const val textColorPrimaryInverse = android.R.attr.textColorPrimaryInverse
        const val textColorPrimaryInverseDisableOnly = android.R.attr.textColorPrimaryInverseDisableOnly
        const val textColorPrimaryInverseNoDisable = android.R.attr.textColorPrimaryInverseNoDisable
        const val textColorPrimaryNoDisable = android.R.attr.textColorPrimaryNoDisable
        const val textColorSecondary = android.R.attr.textColorSecondary
        const val textColorSecondaryInverse = android.R.attr.textColorSecondaryInverse
        const val textColorSecondaryInverseNoDisable = android.R.attr.textColorSecondaryInverseNoDisable
        const val textColorSecondaryNoDisable = android.R.attr.textColorSecondaryNoDisable
        const val textColorTertiary = android.R.attr.textColorTertiary
        const val textColorTertiaryInverse = android.R.attr.textColorTertiaryInverse
        const val textCursorDrawable = android.R.attr.textCursorDrawable
        const val textDirection = android.R.attr.textDirection
        const val textEditNoPasteWindowLayout = android.R.attr.textEditNoPasteWindowLayout
        const val textEditPasteWindowLayout = android.R.attr.textEditPasteWindowLayout
        const val textEditSideNoPasteWindowLayout = android.R.attr.textEditSideNoPasteWindowLayout
        const val textEditSidePasteWindowLayout = android.R.attr.textEditSidePasteWindowLayout
        const val textEditSuggestionItemLayout = android.R.attr.textEditSuggestionItemLayout
        const val textFilterEnabled = android.R.attr.textFilterEnabled
        const val textFontWeight = android.R.attr.textFontWeight
        const val textIsSelectable = android.R.attr.textIsSelectable
        const val textLocale = android.R.attr.textLocale
        const val textOff = android.R.attr.textOff
        const val textOn = android.R.attr.textOn
        const val textScaleX = android.R.attr.textScaleX
        const val textSelectHandle = android.R.attr.textSelectHandle
        const val textSelectHandleLeft = android.R.attr.textSelectHandleLeft
        const val textSelectHandleRight = android.R.attr.textSelectHandleRight
        const val textSelectHandleWindowStyle = android.R.attr.textSelectHandleWindowStyle
        const val textSize = android.R.attr.textSize
        const val textStyle = android.R.attr.textStyle
        const val textSuggestionsWindowStyle = android.R.attr.textSuggestionsWindowStyle
        const val textViewStyle = android.R.attr.textViewStyle
        const val theme = android.R.attr.theme
        const val thickness = android.R.attr.thickness
        const val thicknessRatio = android.R.attr.thicknessRatio
        const val thumb = android.R.attr.thumb
        const val thumbOffset = android.R.attr.thumbOffset
        const val thumbPosition = android.R.attr.thumbPosition
        const val thumbTextPadding = android.R.attr.thumbTextPadding
        const val thumbTint = android.R.attr.thumbTint
        const val thumbTintMode = android.R.attr.thumbTintMode
        const val thumbnail = android.R.attr.thumbnail
        const val tickMark = android.R.attr.tickMark
        const val tickMarkTint = android.R.attr.tickMarkTint
        const val tickMarkTintMode = android.R.attr.tickMarkTintMode
        const val tileMode = android.R.attr.tileMode
        const val tileModeX = android.R.attr.tileModeX
        const val tileModeY = android.R.attr.tileModeY
        const val tileService = android.R.attr.tileService
        const val timePickerDialogTheme = android.R.attr.timePickerDialogTheme
        const val timePickerMode = android.R.attr.timePickerMode
        const val timePickerStyle = android.R.attr.timePickerStyle
        const val timeZone = android.R.attr.timeZone
        const val tint = android.R.attr.tint
        const val tintMode = android.R.attr.tintMode
        const val title = android.R.attr.title
        const val titleCondensed = android.R.attr.titleCondensed
        const val titleMargin = android.R.attr.titleMargin
        const val titleMarginBottom = android.R.attr.titleMarginBottom
        const val titleMarginEnd = android.R.attr.titleMarginEnd
        const val titleMarginStart = android.R.attr.titleMarginStart
        const val titleMarginTop = android.R.attr.titleMarginTop
        const val titleTextAppearance = android.R.attr.titleTextAppearance
        const val titleTextColor = android.R.attr.titleTextColor
        const val titleTextStyle = android.R.attr.titleTextStyle
        const val toAlpha = android.R.attr.toAlpha
        const val toDegrees = android.R.attr.toDegrees
        const val toExtendBottom = android.R.attr.toExtendBottom
        const val toExtendLeft = android.R.attr.toExtendLeft
        const val toExtendRight = android.R.attr.toExtendRight
        const val toExtendTop = android.R.attr.toExtendTop
        const val toId = android.R.attr.toId
        const val toScene = android.R.attr.toScene
        const val toXDelta = android.R.attr.toXDelta
        const val toXScale = android.R.attr.toXScale
        const val toYDelta = android.R.attr.toYDelta
        const val toYScale = android.R.attr.toYScale
        const val toolbarStyle = android.R.attr.toolbarStyle
        const val tooltipText = android.R.attr.tooltipText
        const val top = android.R.attr.top
        const val topBright = android.R.attr.topBright
        const val topDark = android.R.attr.topDark
        const val topLeftRadius = android.R.attr.topLeftRadius
        const val topOffset = android.R.attr.topOffset
        const val topRightRadius = android.R.attr.topRightRadius
        const val touchscreenBlocksFocus = android.R.attr.touchscreenBlocksFocus
        const val track = android.R.attr.track
        const val trackTint = android.R.attr.trackTint
        const val trackTintMode = android.R.attr.trackTintMode
        const val transcriptMode = android.R.attr.transcriptMode
        const val transformPivotX = android.R.attr.transformPivotX
        const val transformPivotY = android.R.attr.transformPivotY
        const val transition = android.R.attr.transition
        const val transitionGroup = android.R.attr.transitionGroup
        const val transitionName = android.R.attr.transitionName
        const val transitionOrdering = android.R.attr.transitionOrdering
        const val transitionVisibilityMode = android.R.attr.transitionVisibilityMode
        const val translateX = android.R.attr.translateX
        const val translateY = android.R.attr.translateY
        const val translationX = android.R.attr.translationX
        const val translationY = android.R.attr.translationY
        const val translationZ = android.R.attr.translationZ
        const val trimPathEnd = android.R.attr.trimPathEnd
        const val trimPathOffset = android.R.attr.trimPathOffset
        const val trimPathStart = android.R.attr.trimPathStart
        const val ttcIndex = android.R.attr.ttcIndex
        const val tunerCount = android.R.attr.tunerCount
        const val turnScreenOn = android.R.attr.turnScreenOn
        const val type = android.R.attr.type
        const val typeface = android.R.attr.typeface
        const val uiOptions = android.R.attr.uiOptions
        const val uncertainGestureColor = android.R.attr.uncertainGestureColor

        @Deprecated
        const val unfocusedMonthDateColor = android.R.attr.unfocusedMonthDateColor
        const val unselectedAlpha = android.R.attr.unselectedAlpha
        const val updatePeriodMillis = android.R.attr.updatePeriodMillis
        const val use32bitAbi = android.R.attr.use32bitAbi
        const val useAppZygote = android.R.attr.useAppZygote
        const val useBoundsForWidth = android.R.attr.useBoundsForWidth
        const val useDefaultMargins = android.R.attr.useDefaultMargins
        const val useEmbeddedDex = android.R.attr.useEmbeddedDex
        const val useIntrinsicSizeAsMinimum = android.R.attr.useIntrinsicSizeAsMinimum
        const val useLevel = android.R.attr.useLevel
        const val useLocalePreferredLineHeightForMinimum = android.R.attr.useLocalePreferredLineHeightForMinimum
        const val userVisible = android.R.attr.userVisible
        const val usesCleartextTraffic = android.R.attr.usesCleartextTraffic
        const val usesPermissionFlags = android.R.attr.usesPermissionFlags
        const val value = android.R.attr.value
        const val valueFrom = android.R.attr.valueFrom
        const val valueTo = android.R.attr.valueTo
        const val valueType = android.R.attr.valueType
        const val variablePadding = android.R.attr.variablePadding
        const val vendor = android.R.attr.vendor
        const val version = android.R.attr.version
        const val versionCode = android.R.attr.versionCode
        const val versionCodeMajor = android.R.attr.versionCodeMajor
        const val versionMajor = android.R.attr.versionMajor
        const val versionName = android.R.attr.versionName

        @Deprecated
        const val verticalCorrection = android.R.attr.verticalCorrection
        const val verticalDivider = android.R.attr.verticalDivider

        @Deprecated
        const val verticalGap = android.R.attr.verticalGap
        const val verticalScrollbarPosition = android.R.attr.verticalScrollbarPosition
        const val verticalSpacing = android.R.attr.verticalSpacing
        const val viewportHeight = android.R.attr.viewportHeight
        const val viewportWidth = android.R.attr.viewportWidth
        const val visibility = android.R.attr.visibility
        const val visible = android.R.attr.visible
        const val visibleToInstantApps = android.R.attr.visibleToInstantApps
        const val vmSafeMode = android.R.attr.vmSafeMode
        const val voiceIcon = android.R.attr.voiceIcon
        const val voiceLanguage = android.R.attr.voiceLanguage
        const val voiceLanguageModel = android.R.attr.voiceLanguageModel
        const val voiceMaxResults = android.R.attr.voiceMaxResults
        const val voicePromptText = android.R.attr.voicePromptText
        const val voiceSearchMode = android.R.attr.voiceSearchMode
        const val wallpaperCloseEnterAnimation = android.R.attr.wallpaperCloseEnterAnimation
        const val wallpaperCloseExitAnimation = android.R.attr.wallpaperCloseExitAnimation
        const val wallpaperIntraCloseEnterAnimation = android.R.attr.wallpaperIntraCloseEnterAnimation
        const val wallpaperIntraCloseExitAnimation = android.R.attr.wallpaperIntraCloseExitAnimation
        const val wallpaperIntraOpenEnterAnimation = android.R.attr.wallpaperIntraOpenEnterAnimation
        const val wallpaperIntraOpenExitAnimation = android.R.attr.wallpaperIntraOpenExitAnimation
        const val wallpaperOpenEnterAnimation = android.R.attr.wallpaperOpenEnterAnimation
        const val wallpaperOpenExitAnimation = android.R.attr.wallpaperOpenExitAnimation
        const val webTextViewStyle = android.R.attr.webTextViewStyle
        const val webViewStyle = android.R.attr.webViewStyle
        const val weekDayTextAppearance = android.R.attr.weekDayTextAppearance

        @Deprecated
        const val weekNumberColor = android.R.attr.weekNumberColor

        @Deprecated
        const val weekSeparatorLineColor = android.R.attr.weekSeparatorLineColor
        const val weightSum = android.R.attr.weightSum
        const val widgetCategory = android.R.attr.widgetCategory
        const val widgetFeatures = android.R.attr.widgetFeatures
        const val widgetLayout = android.R.attr.widgetLayout
        const val width = android.R.attr.width
        const val windowActionBar = android.R.attr.windowActionBar
        const val windowActionBarOverlay = android.R.attr.windowActionBarOverlay
        const val windowActionModeOverlay = android.R.attr.windowActionModeOverlay
        const val windowActivityTransitions = android.R.attr.windowActivityTransitions
        const val windowAllowEnterTransitionOverlap = android.R.attr.windowAllowEnterTransitionOverlap
        const val windowAllowReturnTransitionOverlap = android.R.attr.windowAllowReturnTransitionOverlap
        const val windowAnimationStyle = android.R.attr.windowAnimationStyle
        const val windowBackground = android.R.attr.windowBackground
        const val windowBackgroundBlurRadius = android.R.attr.windowBackgroundBlurRadius
        const val windowBackgroundFallback = android.R.attr.windowBackgroundFallback
        const val windowBlurBehindEnabled = android.R.attr.windowBlurBehindEnabled
        const val windowBlurBehindRadius = android.R.attr.windowBlurBehindRadius
        const val windowClipToOutline = android.R.attr.windowClipToOutline
        const val windowCloseOnTouchOutside = android.R.attr.windowCloseOnTouchOutside
        const val windowContentOverlay = android.R.attr.windowContentOverlay
        const val windowContentTransitionManager = android.R.attr.windowContentTransitionManager
        const val windowContentTransitions = android.R.attr.windowContentTransitions
        const val windowDisablePreview = android.R.attr.windowDisablePreview
        const val windowDrawsSystemBarBackgrounds = android.R.attr.windowDrawsSystemBarBackgrounds
        const val windowElevation = android.R.attr.windowElevation
        const val windowEnableSplitTouch = android.R.attr.windowEnableSplitTouch
        const val windowEnterAnimation = android.R.attr.windowEnterAnimation
        const val windowEnterTransition = android.R.attr.windowEnterTransition
        const val windowExitAnimation = android.R.attr.windowExitAnimation
        const val windowExitTransition = android.R.attr.windowExitTransition
        const val windowFrame = android.R.attr.windowFrame
        const val windowFullscreen = android.R.attr.windowFullscreen
        const val windowHideAnimation = android.R.attr.windowHideAnimation
        const val windowIsFloating = android.R.attr.windowIsFloating
        const val windowIsFrameRatePowerSavingsBalanced = android.R.attr.windowIsFrameRatePowerSavingsBalanced
        const val windowIsTranslucent = android.R.attr.windowIsTranslucent
        const val windowLayoutAffinity = android.R.attr.windowLayoutAffinity
        const val windowLayoutInDisplayCutoutMode = android.R.attr.windowLayoutInDisplayCutoutMode
        const val windowLightNavigationBar = android.R.attr.windowLightNavigationBar
        const val windowLightStatusBar = android.R.attr.windowLightStatusBar
        const val windowMinWidthMajor = android.R.attr.windowMinWidthMajor
        const val windowMinWidthMinor = android.R.attr.windowMinWidthMinor
        const val windowNoDisplay = android.R.attr.windowNoDisplay
        const val windowNoMoveAnimation = android.R.attr.windowNoMoveAnimation
        const val windowNoTitle = android.R.attr.windowNoTitle
        const val windowOptOutEdgeToEdgeEnforcement = android.R.attr.windowOptOutEdgeToEdgeEnforcement

        @Deprecated
        const val windowOverscan = android.R.attr.windowOverscan
        const val windowReenterTransition = android.R.attr.windowReenterTransition
        const val windowReturnTransition = android.R.attr.windowReturnTransition
        const val windowSharedElementEnterTransition = android.R.attr.windowSharedElementEnterTransition
        const val windowSharedElementExitTransition = android.R.attr.windowSharedElementExitTransition
        const val windowSharedElementReenterTransition = android.R.attr.windowSharedElementReenterTransition
        const val windowSharedElementReturnTransition = android.R.attr.windowSharedElementReturnTransition
        const val windowSharedElementsUseOverlay = android.R.attr.windowSharedElementsUseOverlay
        const val windowShowAnimation = android.R.attr.windowShowAnimation
        const val windowShowWallpaper = android.R.attr.windowShowWallpaper
        const val windowSoftInputMode = android.R.attr.windowSoftInputMode
        const val windowSplashScreenAnimatedIcon = android.R.attr.windowSplashScreenAnimatedIcon

        @Deprecated
        const val windowSplashScreenAnimationDuration = android.R.attr.windowSplashScreenAnimationDuration
        const val windowSplashScreenBackground = android.R.attr.windowSplashScreenBackground
        const val windowSplashScreenBehavior = android.R.attr.windowSplashScreenBehavior
        const val windowSplashScreenBrandingImage = android.R.attr.windowSplashScreenBrandingImage
        const val windowSplashScreenIconBackgroundColor = android.R.attr.windowSplashScreenIconBackgroundColor

        @Deprecated
        const val windowSplashscreenContent = android.R.attr.windowSplashscreenContent

        @Deprecated
        const val windowSwipeToDismiss = android.R.attr.windowSwipeToDismiss
        const val windowTitleBackgroundStyle = android.R.attr.windowTitleBackgroundStyle
        const val windowTitleSize = android.R.attr.windowTitleSize
        const val windowTitleStyle = android.R.attr.windowTitleStyle
        const val windowTransitionBackgroundFadeDuration = android.R.attr.windowTransitionBackgroundFadeDuration
        const val windowTranslucentNavigation = android.R.attr.windowTranslucentNavigation
        const val windowTranslucentStatus = android.R.attr.windowTranslucentStatus
        const val writePermission = android.R.attr.writePermission
        const val x = android.R.attr.x
        const val xlargeScreens = android.R.attr.xlargeScreens
        const val y = android.R.attr.y

        @Deprecated
        const val yearListItemTextAppearance = android.R.attr.yearListItemTextAppearance

        @Deprecated
        const val yearListSelectorColor = android.R.attr.yearListSelectorColor
        const val yesNoPreferenceStyle = android.R.attr.yesNoPreferenceStyle
        const val zAdjustment = android.R.attr.zAdjustment
        const val zygotePreloadName = android.R.attr.zygotePreloadName
    }

    object bool {
    }

    object color {
        const val background_dark = android.R.color.background_dark
        const val background_light = android.R.color.background_light
        const val black = android.R.color.black
        const val darker_gray = android.R.color.darker_gray
        const val holo_blue_bright = android.R.color.holo_blue_bright
        const val holo_blue_dark = android.R.color.holo_blue_dark
        const val holo_blue_light = android.R.color.holo_blue_light
        const val holo_green_dark = android.R.color.holo_green_dark
        const val holo_green_light = android.R.color.holo_green_light
        const val holo_orange_dark = android.R.color.holo_orange_dark
        const val holo_orange_light = android.R.color.holo_orange_light
        const val holo_purple = android.R.color.holo_purple
        const val holo_red_dark = android.R.color.holo_red_dark
        const val holo_red_light = android.R.color.holo_red_light

        @Deprecated
        const val primary_text_dark = android.R.color.primary_text_dark

        @Deprecated
        const val primary_text_dark_nodisable = android.R.color.primary_text_dark_nodisable

        @Deprecated
        const val primary_text_light = android.R.color.primary_text_light

        @Deprecated
        const val primary_text_light_nodisable = android.R.color.primary_text_light_nodisable

        @Deprecated
        const val secondary_text_dark = android.R.color.secondary_text_dark

        @Deprecated
        const val secondary_text_dark_nodisable = android.R.color.secondary_text_dark_nodisable

        @Deprecated
        const val secondary_text_light = android.R.color.secondary_text_light

        @Deprecated
        const val secondary_text_light_nodisable = android.R.color.secondary_text_light_nodisable
        const val system_accent1_0 = android.R.color.system_accent1_0
        const val system_accent1_10 = android.R.color.system_accent1_10
        const val system_accent1_100 = android.R.color.system_accent1_100
        const val system_accent1_1000 = android.R.color.system_accent1_1000
        const val system_accent1_200 = android.R.color.system_accent1_200
        const val system_accent1_300 = android.R.color.system_accent1_300
        const val system_accent1_400 = android.R.color.system_accent1_400
        const val system_accent1_50 = android.R.color.system_accent1_50
        const val system_accent1_500 = android.R.color.system_accent1_500
        const val system_accent1_600 = android.R.color.system_accent1_600
        const val system_accent1_700 = android.R.color.system_accent1_700
        const val system_accent1_800 = android.R.color.system_accent1_800
        const val system_accent1_900 = android.R.color.system_accent1_900
        const val system_accent2_0 = android.R.color.system_accent2_0
        const val system_accent2_10 = android.R.color.system_accent2_10
        const val system_accent2_100 = android.R.color.system_accent2_100
        const val system_accent2_1000 = android.R.color.system_accent2_1000
        const val system_accent2_200 = android.R.color.system_accent2_200
        const val system_accent2_300 = android.R.color.system_accent2_300
        const val system_accent2_400 = android.R.color.system_accent2_400
        const val system_accent2_50 = android.R.color.system_accent2_50
        const val system_accent2_500 = android.R.color.system_accent2_500
        const val system_accent2_600 = android.R.color.system_accent2_600
        const val system_accent2_700 = android.R.color.system_accent2_700
        const val system_accent2_800 = android.R.color.system_accent2_800
        const val system_accent2_900 = android.R.color.system_accent2_900
        const val system_accent3_0 = android.R.color.system_accent3_0
        const val system_accent3_10 = android.R.color.system_accent3_10
        const val system_accent3_100 = android.R.color.system_accent3_100
        const val system_accent3_1000 = android.R.color.system_accent3_1000
        const val system_accent3_200 = android.R.color.system_accent3_200
        const val system_accent3_300 = android.R.color.system_accent3_300
        const val system_accent3_400 = android.R.color.system_accent3_400
        const val system_accent3_50 = android.R.color.system_accent3_50
        const val system_accent3_500 = android.R.color.system_accent3_500
        const val system_accent3_600 = android.R.color.system_accent3_600
        const val system_accent3_700 = android.R.color.system_accent3_700
        const val system_accent3_800 = android.R.color.system_accent3_800
        const val system_accent3_900 = android.R.color.system_accent3_900
        const val system_background_dark = android.R.color.system_background_dark
        const val system_background_light = android.R.color.system_background_light
        const val system_control_activated_dark = android.R.color.system_control_activated_dark
        const val system_control_activated_light = android.R.color.system_control_activated_light
        const val system_control_highlight_dark = android.R.color.system_control_highlight_dark
        const val system_control_highlight_light = android.R.color.system_control_highlight_light
        const val system_control_normal_dark = android.R.color.system_control_normal_dark
        const val system_control_normal_light = android.R.color.system_control_normal_light
        const val system_error_0 = android.R.color.system_error_0
        const val system_error_10 = android.R.color.system_error_10
        const val system_error_100 = android.R.color.system_error_100
        const val system_error_1000 = android.R.color.system_error_1000
        const val system_error_200 = android.R.color.system_error_200
        const val system_error_300 = android.R.color.system_error_300
        const val system_error_400 = android.R.color.system_error_400
        const val system_error_50 = android.R.color.system_error_50
        const val system_error_500 = android.R.color.system_error_500
        const val system_error_600 = android.R.color.system_error_600
        const val system_error_700 = android.R.color.system_error_700
        const val system_error_800 = android.R.color.system_error_800
        const val system_error_900 = android.R.color.system_error_900
        const val system_error_container_dark = android.R.color.system_error_container_dark
        const val system_error_container_light = android.R.color.system_error_container_light
        const val system_error_dark = android.R.color.system_error_dark
        const val system_error_light = android.R.color.system_error_light
        const val system_neutral1_0 = android.R.color.system_neutral1_0
        const val system_neutral1_10 = android.R.color.system_neutral1_10
        const val system_neutral1_100 = android.R.color.system_neutral1_100
        const val system_neutral1_1000 = android.R.color.system_neutral1_1000
        const val system_neutral1_200 = android.R.color.system_neutral1_200
        const val system_neutral1_300 = android.R.color.system_neutral1_300
        const val system_neutral1_400 = android.R.color.system_neutral1_400
        const val system_neutral1_50 = android.R.color.system_neutral1_50
        const val system_neutral1_500 = android.R.color.system_neutral1_500
        const val system_neutral1_600 = android.R.color.system_neutral1_600
        const val system_neutral1_700 = android.R.color.system_neutral1_700
        const val system_neutral1_800 = android.R.color.system_neutral1_800
        const val system_neutral1_900 = android.R.color.system_neutral1_900
        const val system_neutral2_0 = android.R.color.system_neutral2_0
        const val system_neutral2_10 = android.R.color.system_neutral2_10
        const val system_neutral2_100 = android.R.color.system_neutral2_100
        const val system_neutral2_1000 = android.R.color.system_neutral2_1000
        const val system_neutral2_200 = android.R.color.system_neutral2_200
        const val system_neutral2_300 = android.R.color.system_neutral2_300
        const val system_neutral2_400 = android.R.color.system_neutral2_400
        const val system_neutral2_50 = android.R.color.system_neutral2_50
        const val system_neutral2_500 = android.R.color.system_neutral2_500
        const val system_neutral2_600 = android.R.color.system_neutral2_600
        const val system_neutral2_700 = android.R.color.system_neutral2_700
        const val system_neutral2_800 = android.R.color.system_neutral2_800
        const val system_neutral2_900 = android.R.color.system_neutral2_900
        const val system_on_background_dark = android.R.color.system_on_background_dark
        const val system_on_background_light = android.R.color.system_on_background_light
        const val system_on_error_container_dark = android.R.color.system_on_error_container_dark
        const val system_on_error_container_light = android.R.color.system_on_error_container_light
        const val system_on_error_dark = android.R.color.system_on_error_dark
        const val system_on_error_light = android.R.color.system_on_error_light
        const val system_on_primary_container_dark = android.R.color.system_on_primary_container_dark
        const val system_on_primary_container_light = android.R.color.system_on_primary_container_light
        const val system_on_primary_dark = android.R.color.system_on_primary_dark
        const val system_on_primary_fixed = android.R.color.system_on_primary_fixed
        const val system_on_primary_fixed_variant = android.R.color.system_on_primary_fixed_variant
        const val system_on_primary_light = android.R.color.system_on_primary_light
        const val system_on_secondary_container_dark = android.R.color.system_on_secondary_container_dark
        const val system_on_secondary_container_light = android.R.color.system_on_secondary_container_light
        const val system_on_secondary_dark = android.R.color.system_on_secondary_dark
        const val system_on_secondary_fixed = android.R.color.system_on_secondary_fixed
        const val system_on_secondary_fixed_variant = android.R.color.system_on_secondary_fixed_variant
        const val system_on_secondary_light = android.R.color.system_on_secondary_light
        const val system_on_surface_dark = android.R.color.system_on_surface_dark
        const val system_on_surface_disabled = android.R.color.system_on_surface_disabled
        const val system_on_surface_light = android.R.color.system_on_surface_light
        const val system_on_surface_variant_dark = android.R.color.system_on_surface_variant_dark
        const val system_on_surface_variant_light = android.R.color.system_on_surface_variant_light
        const val system_on_tertiary_container_dark = android.R.color.system_on_tertiary_container_dark
        const val system_on_tertiary_container_light = android.R.color.system_on_tertiary_container_light
        const val system_on_tertiary_dark = android.R.color.system_on_tertiary_dark
        const val system_on_tertiary_fixed = android.R.color.system_on_tertiary_fixed
        const val system_on_tertiary_fixed_variant = android.R.color.system_on_tertiary_fixed_variant
        const val system_on_tertiary_light = android.R.color.system_on_tertiary_light
        const val system_outline_dark = android.R.color.system_outline_dark
        const val system_outline_disabled = android.R.color.system_outline_disabled
        const val system_outline_light = android.R.color.system_outline_light
        const val system_outline_variant_dark = android.R.color.system_outline_variant_dark
        const val system_outline_variant_light = android.R.color.system_outline_variant_light
        const val system_palette_key_color_neutral_dark = android.R.color.system_palette_key_color_neutral_dark
        const val system_palette_key_color_neutral_light = android.R.color.system_palette_key_color_neutral_light
        const val system_palette_key_color_neutral_variant_dark = android.R.color.system_palette_key_color_neutral_variant_dark
        const val system_palette_key_color_neutral_variant_light = android.R.color.system_palette_key_color_neutral_variant_light
        const val system_palette_key_color_primary_dark = android.R.color.system_palette_key_color_primary_dark
        const val system_palette_key_color_primary_light = android.R.color.system_palette_key_color_primary_light
        const val system_palette_key_color_secondary_dark = android.R.color.system_palette_key_color_secondary_dark
        const val system_palette_key_color_secondary_light = android.R.color.system_palette_key_color_secondary_light
        const val system_palette_key_color_tertiary_dark = android.R.color.system_palette_key_color_tertiary_dark
        const val system_palette_key_color_tertiary_light = android.R.color.system_palette_key_color_tertiary_light
        const val system_primary_container_dark = android.R.color.system_primary_container_dark
        const val system_primary_container_light = android.R.color.system_primary_container_light
        const val system_primary_dark = android.R.color.system_primary_dark
        const val system_primary_fixed = android.R.color.system_primary_fixed
        const val system_primary_fixed_dim = android.R.color.system_primary_fixed_dim
        const val system_primary_light = android.R.color.system_primary_light
        const val system_secondary_container_dark = android.R.color.system_secondary_container_dark
        const val system_secondary_container_light = android.R.color.system_secondary_container_light
        const val system_secondary_dark = android.R.color.system_secondary_dark
        const val system_secondary_fixed = android.R.color.system_secondary_fixed
        const val system_secondary_fixed_dim = android.R.color.system_secondary_fixed_dim
        const val system_secondary_light = android.R.color.system_secondary_light
        const val system_surface_bright_dark = android.R.color.system_surface_bright_dark
        const val system_surface_bright_light = android.R.color.system_surface_bright_light
        const val system_surface_container_dark = android.R.color.system_surface_container_dark
        const val system_surface_container_high_dark = android.R.color.system_surface_container_high_dark
        const val system_surface_container_high_light = android.R.color.system_surface_container_high_light
        const val system_surface_container_highest_dark = android.R.color.system_surface_container_highest_dark
        const val system_surface_container_highest_light = android.R.color.system_surface_container_highest_light
        const val system_surface_container_light = android.R.color.system_surface_container_light
        const val system_surface_container_low_dark = android.R.color.system_surface_container_low_dark
        const val system_surface_container_low_light = android.R.color.system_surface_container_low_light
        const val system_surface_container_lowest_dark = android.R.color.system_surface_container_lowest_dark
        const val system_surface_container_lowest_light = android.R.color.system_surface_container_lowest_light
        const val system_surface_dark = android.R.color.system_surface_dark
        const val system_surface_dim_dark = android.R.color.system_surface_dim_dark
        const val system_surface_dim_light = android.R.color.system_surface_dim_light
        const val system_surface_disabled = android.R.color.system_surface_disabled
        const val system_surface_light = android.R.color.system_surface_light
        const val system_surface_variant_dark = android.R.color.system_surface_variant_dark
        const val system_surface_variant_light = android.R.color.system_surface_variant_light
        const val system_tertiary_container_dark = android.R.color.system_tertiary_container_dark
        const val system_tertiary_container_light = android.R.color.system_tertiary_container_light
        const val system_tertiary_dark = android.R.color.system_tertiary_dark
        const val system_tertiary_fixed = android.R.color.system_tertiary_fixed
        const val system_tertiary_fixed_dim = android.R.color.system_tertiary_fixed_dim
        const val system_tertiary_light = android.R.color.system_tertiary_light
        const val system_text_hint_inverse_dark = android.R.color.system_text_hint_inverse_dark
        const val system_text_hint_inverse_light = android.R.color.system_text_hint_inverse_light
        const val system_text_primary_inverse_dark = android.R.color.system_text_primary_inverse_dark
        const val system_text_primary_inverse_disable_only_dark = android.R.color.system_text_primary_inverse_disable_only_dark
        const val system_text_primary_inverse_disable_only_light = android.R.color.system_text_primary_inverse_disable_only_light
        const val system_text_primary_inverse_light = android.R.color.system_text_primary_inverse_light
        const val system_text_secondary_and_tertiary_inverse_dark = android.R.color.system_text_secondary_and_tertiary_inverse_dark
        const val system_text_secondary_and_tertiary_inverse_disabled_dark = android.R.color.system_text_secondary_and_tertiary_inverse_disabled_dark
        const val system_text_secondary_and_tertiary_inverse_disabled_light = android.R.color.system_text_secondary_and_tertiary_inverse_disabled_light
        const val system_text_secondary_and_tertiary_inverse_light = android.R.color.system_text_secondary_and_tertiary_inverse_light
        const val tab_indicator_text = android.R.color.tab_indicator_text

        @Deprecated
        const val tertiary_text_dark = android.R.color.tertiary_text_dark

        @Deprecated
        const val tertiary_text_light = android.R.color.tertiary_text_light
        const val transparent = android.R.color.transparent
        const val white = android.R.color.white
        const val widget_edittext_dark = android.R.color.widget_edittext_dark
    }

    object dimen {
        const val app_icon_size = android.R.dimen.app_icon_size
        const val dialog_min_width_major = android.R.dimen.dialog_min_width_major
        const val dialog_min_width_minor = android.R.dimen.dialog_min_width_minor
        const val notification_large_icon_height = android.R.dimen.notification_large_icon_height
        const val notification_large_icon_width = android.R.dimen.notification_large_icon_width
        const val system_app_widget_background_radius = android.R.dimen.system_app_widget_background_radius
        const val system_app_widget_inner_radius = android.R.dimen.system_app_widget_inner_radius
        const val thumbnail_height = android.R.dimen.thumbnail_height
        const val thumbnail_width = android.R.dimen.thumbnail_width
    }

    object drawable {
        const val alert_dark_frame = android.R.drawable.alert_dark_frame
        const val alert_light_frame = android.R.drawable.alert_light_frame
        const val arrow_down_float = android.R.drawable.arrow_down_float
        const val arrow_up_float = android.R.drawable.arrow_up_float
        const val bottom_bar = android.R.drawable.bottom_bar
        const val btn_default = android.R.drawable.btn_default
        const val btn_default_small = android.R.drawable.btn_default_small
        const val btn_dialog = android.R.drawable.btn_dialog
        const val btn_dropdown = android.R.drawable.btn_dropdown
        const val btn_minus = android.R.drawable.btn_minus
        const val btn_plus = android.R.drawable.btn_plus
        const val btn_radio = android.R.drawable.btn_radio
        const val btn_star = android.R.drawable.btn_star
        const val btn_star_big_off = android.R.drawable.btn_star_big_off
        const val btn_star_big_on = android.R.drawable.btn_star_big_on
        const val button_onoff_indicator_off = android.R.drawable.button_onoff_indicator_off
        const val button_onoff_indicator_on = android.R.drawable.button_onoff_indicator_on
        const val checkbox_off_background = android.R.drawable.checkbox_off_background
        const val checkbox_on_background = android.R.drawable.checkbox_on_background
        const val dark_header = android.R.drawable.dark_header
        const val dialog_frame = android.R.drawable.dialog_frame
        const val dialog_holo_dark_frame = android.R.drawable.dialog_holo_dark_frame
        const val dialog_holo_light_frame = android.R.drawable.dialog_holo_light_frame
        const val divider_horizontal_bright = android.R.drawable.divider_horizontal_bright
        const val divider_horizontal_dark = android.R.drawable.divider_horizontal_dark
        const val divider_horizontal_dim_dark = android.R.drawable.divider_horizontal_dim_dark
        const val divider_horizontal_textfield = android.R.drawable.divider_horizontal_textfield
        const val edit_text = android.R.drawable.edit_text
        const val editbox_background = android.R.drawable.editbox_background
        const val editbox_background_normal = android.R.drawable.editbox_background_normal
        const val editbox_dropdown_dark_frame = android.R.drawable.editbox_dropdown_dark_frame
        const val editbox_dropdown_light_frame = android.R.drawable.editbox_dropdown_light_frame
        const val gallery_thumb = android.R.drawable.gallery_thumb
        const val ic_btn_speak_now = android.R.drawable.ic_btn_speak_now
        const val ic_delete = android.R.drawable.ic_delete
        const val ic_dialog_alert = android.R.drawable.ic_dialog_alert
        const val ic_dialog_dialer = android.R.drawable.ic_dialog_dialer
        const val ic_dialog_email = android.R.drawable.ic_dialog_email
        const val ic_dialog_info = android.R.drawable.ic_dialog_info
        const val ic_dialog_map = android.R.drawable.ic_dialog_map
        const val ic_input_add = android.R.drawable.ic_input_add
        const val ic_input_delete = android.R.drawable.ic_input_delete
        const val ic_input_get = android.R.drawable.ic_input_get
        const val ic_lock_idle_alarm = android.R.drawable.ic_lock_idle_alarm
        const val ic_lock_idle_charging = android.R.drawable.ic_lock_idle_charging
        const val ic_lock_idle_lock = android.R.drawable.ic_lock_idle_lock
        const val ic_lock_idle_low_battery = android.R.drawable.ic_lock_idle_low_battery
        const val ic_lock_lock = android.R.drawable.ic_lock_lock
        const val ic_lock_power_off = android.R.drawable.ic_lock_power_off
        const val ic_lock_silent_mode = android.R.drawable.ic_lock_silent_mode
        const val ic_lock_silent_mode_off = android.R.drawable.ic_lock_silent_mode_off
        const val ic_media_ff = android.R.drawable.ic_media_ff
        const val ic_media_next = android.R.drawable.ic_media_next
        const val ic_media_pause = android.R.drawable.ic_media_pause
        const val ic_media_play = android.R.drawable.ic_media_play
        const val ic_media_previous = android.R.drawable.ic_media_previous
        const val ic_media_rew = android.R.drawable.ic_media_rew
        const val ic_menu_add = android.R.drawable.ic_menu_add
        const val ic_menu_agenda = android.R.drawable.ic_menu_agenda
        const val ic_menu_always_landscape_portrait = android.R.drawable.ic_menu_always_landscape_portrait
        const val ic_menu_call = android.R.drawable.ic_menu_call
        const val ic_menu_camera = android.R.drawable.ic_menu_camera
        const val ic_menu_close_clear_cancel = android.R.drawable.ic_menu_close_clear_cancel
        const val ic_menu_compass = android.R.drawable.ic_menu_compass
        const val ic_menu_crop = android.R.drawable.ic_menu_crop
        const val ic_menu_day = android.R.drawable.ic_menu_day
        const val ic_menu_delete = android.R.drawable.ic_menu_delete
        const val ic_menu_directions = android.R.drawable.ic_menu_directions
        const val ic_menu_edit = android.R.drawable.ic_menu_edit
        const val ic_menu_gallery = android.R.drawable.ic_menu_gallery
        const val ic_menu_help = android.R.drawable.ic_menu_help
        const val ic_menu_info_details = android.R.drawable.ic_menu_info_details
        const val ic_menu_manage = android.R.drawable.ic_menu_manage
        const val ic_menu_mapmode = android.R.drawable.ic_menu_mapmode
        const val ic_menu_month = android.R.drawable.ic_menu_month
        const val ic_menu_more = android.R.drawable.ic_menu_more
        const val ic_menu_my_calendar = android.R.drawable.ic_menu_my_calendar
        const val ic_menu_mylocation = android.R.drawable.ic_menu_mylocation
        const val ic_menu_myplaces = android.R.drawable.ic_menu_myplaces
        const val ic_menu_preferences = android.R.drawable.ic_menu_preferences
        const val ic_menu_recent_history = android.R.drawable.ic_menu_recent_history
        const val ic_menu_report_image = android.R.drawable.ic_menu_report_image
        const val ic_menu_revert = android.R.drawable.ic_menu_revert
        const val ic_menu_rotate = android.R.drawable.ic_menu_rotate
        const val ic_menu_save = android.R.drawable.ic_menu_save
        const val ic_menu_search = android.R.drawable.ic_menu_search
        const val ic_menu_send = android.R.drawable.ic_menu_send
        const val ic_menu_set_as = android.R.drawable.ic_menu_set_as
        const val ic_menu_share = android.R.drawable.ic_menu_share
        const val ic_menu_slideshow = android.R.drawable.ic_menu_slideshow
        const val ic_menu_sort_alphabetically = android.R.drawable.ic_menu_sort_alphabetically
        const val ic_menu_sort_by_size = android.R.drawable.ic_menu_sort_by_size
        const val ic_menu_today = android.R.drawable.ic_menu_today
        const val ic_menu_upload = android.R.drawable.ic_menu_upload
        const val ic_menu_upload_you_tube = android.R.drawable.ic_menu_upload_you_tube
        const val ic_menu_view = android.R.drawable.ic_menu_view
        const val ic_menu_week = android.R.drawable.ic_menu_week
        const val ic_menu_zoom = android.R.drawable.ic_menu_zoom
        const val ic_notification_clear_all = android.R.drawable.ic_notification_clear_all
        const val ic_notification_overlay = android.R.drawable.ic_notification_overlay
        const val ic_partial_secure = android.R.drawable.ic_partial_secure
        const val ic_popup_disk_full = android.R.drawable.ic_popup_disk_full
        const val ic_popup_reminder = android.R.drawable.ic_popup_reminder
        const val ic_popup_sync = android.R.drawable.ic_popup_sync
        const val ic_search_category_default = android.R.drawable.ic_search_category_default
        const val ic_secure = android.R.drawable.ic_secure
        const val list_selector_background = android.R.drawable.list_selector_background
        const val menu_frame = android.R.drawable.menu_frame
        const val menu_full_frame = android.R.drawable.menu_full_frame
        const val menuitem_background = android.R.drawable.menuitem_background
        const val picture_frame = android.R.drawable.picture_frame
        const val presence_audio_away = android.R.drawable.presence_audio_away
        const val presence_audio_busy = android.R.drawable.presence_audio_busy
        const val presence_audio_online = android.R.drawable.presence_audio_online
        const val presence_away = android.R.drawable.presence_away
        const val presence_busy = android.R.drawable.presence_busy
        const val presence_invisible = android.R.drawable.presence_invisible
        const val presence_offline = android.R.drawable.presence_offline
        const val presence_online = android.R.drawable.presence_online
        const val presence_video_away = android.R.drawable.presence_video_away
        const val presence_video_busy = android.R.drawable.presence_video_busy
        const val presence_video_online = android.R.drawable.presence_video_online
        const val progress_horizontal = android.R.drawable.progress_horizontal
        const val progress_indeterminate_horizontal = android.R.drawable.progress_indeterminate_horizontal
        const val radiobutton_off_background = android.R.drawable.radiobutton_off_background
        const val radiobutton_on_background = android.R.drawable.radiobutton_on_background
        const val screen_background_dark = android.R.drawable.screen_background_dark
        const val screen_background_dark_transparent = android.R.drawable.screen_background_dark_transparent
        const val screen_background_light = android.R.drawable.screen_background_light
        const val screen_background_light_transparent = android.R.drawable.screen_background_light_transparent
        const val spinner_background = android.R.drawable.spinner_background
        const val spinner_dropdown_background = android.R.drawable.spinner_dropdown_background
        const val star_big_off = android.R.drawable.star_big_off
        const val star_big_on = android.R.drawable.star_big_on
        const val star_off = android.R.drawable.star_off
        const val star_on = android.R.drawable.star_on
        const val stat_notify_call_mute = android.R.drawable.stat_notify_call_mute
        const val stat_notify_chat = android.R.drawable.stat_notify_chat
        const val stat_notify_error = android.R.drawable.stat_notify_error
        const val stat_notify_missed_call = android.R.drawable.stat_notify_missed_call
        const val stat_notify_more = android.R.drawable.stat_notify_more
        const val stat_notify_sdcard = android.R.drawable.stat_notify_sdcard
        const val stat_notify_sdcard_prepare = android.R.drawable.stat_notify_sdcard_prepare
        const val stat_notify_sdcard_usb = android.R.drawable.stat_notify_sdcard_usb
        const val stat_notify_sync = android.R.drawable.stat_notify_sync
        const val stat_notify_sync_noanim = android.R.drawable.stat_notify_sync_noanim
        const val stat_notify_voicemail = android.R.drawable.stat_notify_voicemail
        const val stat_sys_data_bluetooth = android.R.drawable.stat_sys_data_bluetooth
        const val stat_sys_download = android.R.drawable.stat_sys_download
        const val stat_sys_download_done = android.R.drawable.stat_sys_download_done
        const val stat_sys_headset = android.R.drawable.stat_sys_headset

        @Deprecated
        const val stat_sys_phone_call = android.R.drawable.stat_sys_phone_call

        @Deprecated
        const val stat_sys_phone_call_forward = android.R.drawable.stat_sys_phone_call_forward

        @Deprecated
        const val stat_sys_phone_call_on_hold = android.R.drawable.stat_sys_phone_call_on_hold
        const val stat_sys_speakerphone = android.R.drawable.stat_sys_speakerphone
        const val stat_sys_upload = android.R.drawable.stat_sys_upload
        const val stat_sys_upload_done = android.R.drawable.stat_sys_upload_done

        @Deprecated
        const val stat_sys_vp_phone_call = android.R.drawable.stat_sys_vp_phone_call

        @Deprecated
        const val stat_sys_vp_phone_call_on_hold = android.R.drawable.stat_sys_vp_phone_call_on_hold
        const val stat_sys_warning = android.R.drawable.stat_sys_warning
        const val status_bar_item_app_background = android.R.drawable.status_bar_item_app_background
        const val status_bar_item_background = android.R.drawable.status_bar_item_background
        const val sym_action_call = android.R.drawable.sym_action_call
        const val sym_action_chat = android.R.drawable.sym_action_chat
        const val sym_action_email = android.R.drawable.sym_action_email
        const val sym_call_incoming = android.R.drawable.sym_call_incoming
        const val sym_call_missed = android.R.drawable.sym_call_missed
        const val sym_call_outgoing = android.R.drawable.sym_call_outgoing
        const val sym_contact_card = android.R.drawable.sym_contact_card
        const val sym_def_app_icon = android.R.drawable.sym_def_app_icon
        const val title_bar = android.R.drawable.title_bar
        const val title_bar_tall = android.R.drawable.title_bar_tall
        const val toast_frame = android.R.drawable.toast_frame
        const val zoom_plate = android.R.drawable.zoom_plate
    }

    object fraction {
    }

    object id {
        const val accessibilityActionContextClick = android.R.id.accessibilityActionContextClick
        const val accessibilityActionDragCancel = android.R.id.accessibilityActionDragCancel
        const val accessibilityActionDragDrop = android.R.id.accessibilityActionDragDrop
        const val accessibilityActionDragStart = android.R.id.accessibilityActionDragStart
        const val accessibilityActionHideTooltip = android.R.id.accessibilityActionHideTooltip
        const val accessibilityActionImeEnter = android.R.id.accessibilityActionImeEnter
        const val accessibilityActionMoveWindow = android.R.id.accessibilityActionMoveWindow
        const val accessibilityActionPageDown = android.R.id.accessibilityActionPageDown
        const val accessibilityActionPageLeft = android.R.id.accessibilityActionPageLeft
        const val accessibilityActionPageRight = android.R.id.accessibilityActionPageRight
        const val accessibilityActionPageUp = android.R.id.accessibilityActionPageUp
        const val accessibilityActionPressAndHold = android.R.id.accessibilityActionPressAndHold
        const val accessibilityActionScrollDown = android.R.id.accessibilityActionScrollDown
        const val accessibilityActionScrollInDirection = android.R.id.accessibilityActionScrollInDirection
        const val accessibilityActionScrollLeft = android.R.id.accessibilityActionScrollLeft
        const val accessibilityActionScrollRight = android.R.id.accessibilityActionScrollRight
        const val accessibilityActionScrollToPosition = android.R.id.accessibilityActionScrollToPosition
        const val accessibilityActionScrollUp = android.R.id.accessibilityActionScrollUp
        const val accessibilityActionSetProgress = android.R.id.accessibilityActionSetProgress
        const val accessibilityActionShowOnScreen = android.R.id.accessibilityActionShowOnScreen
        const val accessibilityActionShowTextSuggestions = android.R.id.accessibilityActionShowTextSuggestions
        const val accessibilityActionShowTooltip = android.R.id.accessibilityActionShowTooltip
        const val accessibilitySystemActionBack = android.R.id.accessibilitySystemActionBack
        const val accessibilitySystemActionHome = android.R.id.accessibilitySystemActionHome
        const val accessibilitySystemActionLockScreen = android.R.id.accessibilitySystemActionLockScreen
        const val accessibilitySystemActionNotifications = android.R.id.accessibilitySystemActionNotifications
        const val accessibilitySystemActionPowerDialog = android.R.id.accessibilitySystemActionPowerDialog
        const val accessibilitySystemActionQuickSettings = android.R.id.accessibilitySystemActionQuickSettings
        const val accessibilitySystemActionRecents = android.R.id.accessibilitySystemActionRecents
        const val accessibilitySystemActionTakeScreenshot = android.R.id.accessibilitySystemActionTakeScreenshot
        const val accessibilitySystemActionToggleSplitScreen = android.R.id.accessibilitySystemActionToggleSplitScreen
        const val addToDictionary = android.R.id.addToDictionary
        const val autofill = android.R.id.autofill
        const val background = android.R.id.background
        const val bold = android.R.id.bold
        const val button1 = android.R.id.button1
        const val button2 = android.R.id.button2
        const val button3 = android.R.id.button3
        const val candidatesArea = android.R.id.candidatesArea
        const val checkbox = android.R.id.checkbox
        const val closeButton = android.R.id.closeButton
        const val content = android.R.id.content
        const val copy = android.R.id.copy
        const val copyUrl = android.R.id.copyUrl
        const val custom = android.R.id.custom
        const val cut = android.R.id.cut
        const val edit = android.R.id.edit
        const val empty = android.R.id.empty
        const val extractArea = android.R.id.extractArea
        const val hint = android.R.id.hint
        const val home = android.R.id.home
        const val icon = android.R.id.icon
        const val icon1 = android.R.id.icon1
        const val icon2 = android.R.id.icon2
        const val icon_frame = android.R.id.icon_frame
        const val input = android.R.id.input
        const val inputArea = android.R.id.inputArea
        const val inputExtractAccessories = android.R.id.inputExtractAccessories
        const val inputExtractAction = android.R.id.inputExtractAction
        const val inputExtractEditText = android.R.id.inputExtractEditText
        const val italic = android.R.id.italic

        @Deprecated
        const val list = android.R.id.list
        const val list_container = android.R.id.list_container
        const val mask = android.R.id.mask
        const val message = android.R.id.message
        const val navigationBarBackground = android.R.id.navigationBarBackground
        const val paste = android.R.id.paste
        const val pasteAsPlainText = android.R.id.pasteAsPlainText
        const val primary = android.R.id.primary
        const val progress = android.R.id.progress
        const val redo = android.R.id.redo
        const val replaceText = android.R.id.replaceText
        const val secondaryProgress = android.R.id.secondaryProgress
        const val selectAll = android.R.id.selectAll
        const val selectTextMode = android.R.id.selectTextMode
        const val selectedIcon = android.R.id.selectedIcon
        const val shareText = android.R.id.shareText
        const val startSelectingText = android.R.id.startSelectingText
        const val statusBarBackground = android.R.id.statusBarBackground
        const val stopSelectingText = android.R.id.stopSelectingText
        const val summary = android.R.id.summary
        const val switchInputMethod = android.R.id.switchInputMethod
        const val switch_widget = android.R.id.switch_widget
        const val tabcontent = android.R.id.tabcontent
        const val tabhost = android.R.id.tabhost
        const val tabs = android.R.id.tabs
        const val text1 = android.R.id.text1
        const val text2 = android.R.id.text2
        const val textAssist = android.R.id.textAssist
        const val title = android.R.id.title
        const val toggle = android.R.id.toggle
        const val underline = android.R.id.underline
        const val undo = android.R.id.undo
        const val widget_frame = android.R.id.widget_frame
    }

    object integer {
        const val config_longAnimTime = android.R.integer.config_longAnimTime
        const val config_mediumAnimTime = android.R.integer.config_mediumAnimTime
        const val config_shortAnimTime = android.R.integer.config_shortAnimTime
        const val status_bar_notification_info_maxnum = android.R.integer.status_bar_notification_info_maxnum
    }

    object interpolator {
        const val accelerate_cubic = android.R.interpolator.accelerate_cubic
        const val accelerate_decelerate = android.R.interpolator.accelerate_decelerate
        const val accelerate_quad = android.R.interpolator.accelerate_quad
        const val accelerate_quint = android.R.interpolator.accelerate_quint
        const val anticipate = android.R.interpolator.anticipate
        const val anticipate_overshoot = android.R.interpolator.anticipate_overshoot
        const val bounce = android.R.interpolator.bounce
        const val cycle = android.R.interpolator.cycle
        const val decelerate_cubic = android.R.interpolator.decelerate_cubic
        const val decelerate_quad = android.R.interpolator.decelerate_quad
        const val decelerate_quint = android.R.interpolator.decelerate_quint
        const val fast_out_extra_slow_in = android.R.interpolator.fast_out_extra_slow_in
        const val fast_out_linear_in = android.R.interpolator.fast_out_linear_in
        const val fast_out_slow_in = android.R.interpolator.fast_out_slow_in
        const val linear = android.R.interpolator.linear
        const val linear_out_slow_in = android.R.interpolator.linear_out_slow_in
        const val overshoot = android.R.interpolator.overshoot
    }

    object layout {
        const val activity_list_item = android.R.layout.activity_list_item
        const val browser_link_context_header = android.R.layout.browser_link_context_header
        const val expandable_list_content = android.R.layout.expandable_list_content
        const val list_content = android.R.layout.list_content
        const val preference_category = android.R.layout.preference_category
        const val select_dialog_item = android.R.layout.select_dialog_item
        const val select_dialog_multichoice = android.R.layout.select_dialog_multichoice
        const val select_dialog_singlechoice = android.R.layout.select_dialog_singlechoice
        const val simple_dropdown_item_1line = android.R.layout.simple_dropdown_item_1line
        const val simple_expandable_list_item_1 = android.R.layout.simple_expandable_list_item_1
        const val simple_expandable_list_item_2 = android.R.layout.simple_expandable_list_item_2
        const val simple_gallery_item = android.R.layout.simple_gallery_item
        const val simple_list_item_1 = android.R.layout.simple_list_item_1
        const val simple_list_item_2 = android.R.layout.simple_list_item_2
        const val simple_list_item_activated_1 = android.R.layout.simple_list_item_activated_1
        const val simple_list_item_activated_2 = android.R.layout.simple_list_item_activated_2
        const val simple_list_item_checked = android.R.layout.simple_list_item_checked
        const val simple_list_item_multiple_choice = android.R.layout.simple_list_item_multiple_choice
        const val simple_list_item_single_choice = android.R.layout.simple_list_item_single_choice
        const val simple_selectable_list_item = android.R.layout.simple_selectable_list_item
        const val simple_spinner_dropdown_item = android.R.layout.simple_spinner_dropdown_item
        const val simple_spinner_item = android.R.layout.simple_spinner_item
        const val test_list_item = android.R.layout.test_list_item
        const val two_line_list_item = android.R.layout.two_line_list_item
    }

    object menu {
    }

    object mipmap {
        const val sym_def_app_icon = android.R.mipmap.sym_def_app_icon
    }

    object plurals {
    }

    object raw {
    }

    object string {
        const val VideoView_error_button = android.R.string.VideoView_error_button
        const val VideoView_error_text_invalid_progressive_playback = android.R.string.VideoView_error_text_invalid_progressive_playback
        const val VideoView_error_text_unknown = android.R.string.VideoView_error_text_unknown
        const val VideoView_error_title = android.R.string.VideoView_error_title
        const val autofill = android.R.string.autofill
        const val cancel = android.R.string.cancel
        const val copy = android.R.string.copy
        const val copyUrl = android.R.string.copyUrl
        const val cut = android.R.string.cut
        const val defaultMsisdnAlphaTag = android.R.string.defaultMsisdnAlphaTag
        const val defaultVoiceMailAlphaTag = android.R.string.defaultVoiceMailAlphaTag
        const val dialog_alert_title = android.R.string.dialog_alert_title
        const val emptyPhoneNumber = android.R.string.emptyPhoneNumber
        const val fingerprint_icon_content_description = android.R.string.fingerprint_icon_content_description
        const val httpErrorBadUrl = android.R.string.httpErrorBadUrl
        const val httpErrorUnsupportedScheme = android.R.string.httpErrorUnsupportedScheme

        @Deprecated
        const val no = android.R.string.no
        const val ok = android.R.string.ok
        const val paste = android.R.string.paste
        const val paste_as_plain_text = android.R.string.paste_as_plain_text
        const val search_go = android.R.string.search_go
        const val selectAll = android.R.string.selectAll
        const val selectTextMode = android.R.string.selectTextMode
        const val status_bar_notification_info_overflow = android.R.string.status_bar_notification_info_overflow
        const val unknownName = android.R.string.unknownName
        const val untitled = android.R.string.untitled

        @Deprecated
        const val yes = android.R.string.yes
    }

    object style {
        const val Animation = android.R.style.Animation
        const val Animation_Activity = android.R.style.Animation_Activity
        const val Animation_Dialog = android.R.style.Animation_Dialog
        const val Animation_InputMethod = android.R.style.Animation_InputMethod
        const val Animation_Toast = android.R.style.Animation_Toast
        const val Animation_Translucent = android.R.style.Animation_Translucent
        const val DeviceDefault_ButtonBar = android.R.style.DeviceDefault_ButtonBar
        const val DeviceDefault_ButtonBar_AlertDialog = android.R.style.DeviceDefault_ButtonBar_AlertDialog
        const val DeviceDefault_Light_ButtonBar = android.R.style.DeviceDefault_Light_ButtonBar
        const val DeviceDefault_Light_ButtonBar_AlertDialog = android.R.style.DeviceDefault_Light_ButtonBar_AlertDialog
        const val DeviceDefault_Light_SegmentedButton = android.R.style.DeviceDefault_Light_SegmentedButton
        const val DeviceDefault_SegmentedButton = android.R.style.DeviceDefault_SegmentedButton
        const val Holo_ButtonBar = android.R.style.Holo_ButtonBar
        const val Holo_ButtonBar_AlertDialog = android.R.style.Holo_ButtonBar_AlertDialog
        const val Holo_Light_ButtonBar = android.R.style.Holo_Light_ButtonBar
        const val Holo_Light_ButtonBar_AlertDialog = android.R.style.Holo_Light_ButtonBar_AlertDialog
        const val Holo_Light_SegmentedButton = android.R.style.Holo_Light_SegmentedButton
        const val Holo_SegmentedButton = android.R.style.Holo_SegmentedButton
        const val MediaButton = android.R.style.MediaButton
        const val MediaButton_Ffwd = android.R.style.MediaButton_Ffwd
        const val MediaButton_Next = android.R.style.MediaButton_Next
        const val MediaButton_Pause = android.R.style.MediaButton_Pause
        const val MediaButton_Play = android.R.style.MediaButton_Play
        const val MediaButton_Previous = android.R.style.MediaButton_Previous
        const val MediaButton_Rew = android.R.style.MediaButton_Rew
        const val TextAppearance = android.R.style.TextAppearance
        const val TextAppearance_DeviceDefault = android.R.style.TextAppearance_DeviceDefault
        const val TextAppearance_DeviceDefault_DialogWindowTitle = android.R.style.TextAppearance_DeviceDefault_DialogWindowTitle
        const val TextAppearance_DeviceDefault_Headline = android.R.style.TextAppearance_DeviceDefault_Headline
        const val TextAppearance_DeviceDefault_Inverse = android.R.style.TextAppearance_DeviceDefault_Inverse
        const val TextAppearance_DeviceDefault_Large = android.R.style.TextAppearance_DeviceDefault_Large
        const val TextAppearance_DeviceDefault_Large_Inverse = android.R.style.TextAppearance_DeviceDefault_Large_Inverse
        const val TextAppearance_DeviceDefault_Medium = android.R.style.TextAppearance_DeviceDefault_Medium
        const val TextAppearance_DeviceDefault_Medium_Inverse = android.R.style.TextAppearance_DeviceDefault_Medium_Inverse
        const val TextAppearance_DeviceDefault_SearchResult_Subtitle = android.R.style.TextAppearance_DeviceDefault_SearchResult_Subtitle
        const val TextAppearance_DeviceDefault_SearchResult_Title = android.R.style.TextAppearance_DeviceDefault_SearchResult_Title
        const val TextAppearance_DeviceDefault_Small = android.R.style.TextAppearance_DeviceDefault_Small
        const val TextAppearance_DeviceDefault_Small_Inverse = android.R.style.TextAppearance_DeviceDefault_Small_Inverse
        const val TextAppearance_DeviceDefault_Widget = android.R.style.TextAppearance_DeviceDefault_Widget
        const val TextAppearance_DeviceDefault_Widget_ActionBar_Menu = android.R.style.TextAppearance_DeviceDefault_Widget_ActionBar_Menu
        const val TextAppearance_DeviceDefault_Widget_ActionBar_Subtitle = android.R.style.TextAppearance_DeviceDefault_Widget_ActionBar_Subtitle

        @Deprecated
        const val TextAppearance_DeviceDefault_Widget_ActionBar_Subtitle_Inverse = android.R.style.TextAppearance_DeviceDefault_Widget_ActionBar_Subtitle_Inverse
        const val TextAppearance_DeviceDefault_Widget_ActionBar_Title = android.R.style.TextAppearance_DeviceDefault_Widget_ActionBar_Title

        @Deprecated
        const val TextAppearance_DeviceDefault_Widget_ActionBar_Title_Inverse = android.R.style.TextAppearance_DeviceDefault_Widget_ActionBar_Title_Inverse
        const val TextAppearance_DeviceDefault_Widget_ActionMode_Subtitle = android.R.style.TextAppearance_DeviceDefault_Widget_ActionMode_Subtitle

        @Deprecated
        const val TextAppearance_DeviceDefault_Widget_ActionMode_Subtitle_Inverse = android.R.style.TextAppearance_DeviceDefault_Widget_ActionMode_Subtitle_Inverse
        const val TextAppearance_DeviceDefault_Widget_ActionMode_Title = android.R.style.TextAppearance_DeviceDefault_Widget_ActionMode_Title

        @Deprecated
        const val TextAppearance_DeviceDefault_Widget_ActionMode_Title_Inverse = android.R.style.TextAppearance_DeviceDefault_Widget_ActionMode_Title_Inverse
        const val TextAppearance_DeviceDefault_Widget_Button = android.R.style.TextAppearance_DeviceDefault_Widget_Button
        const val TextAppearance_DeviceDefault_Widget_DropDownHint = android.R.style.TextAppearance_DeviceDefault_Widget_DropDownHint
        const val TextAppearance_DeviceDefault_Widget_DropDownItem = android.R.style.TextAppearance_DeviceDefault_Widget_DropDownItem
        const val TextAppearance_DeviceDefault_Widget_EditText = android.R.style.TextAppearance_DeviceDefault_Widget_EditText
        const val TextAppearance_DeviceDefault_Widget_IconMenu_Item = android.R.style.TextAppearance_DeviceDefault_Widget_IconMenu_Item
        const val TextAppearance_DeviceDefault_Widget_PopupMenu = android.R.style.TextAppearance_DeviceDefault_Widget_PopupMenu
        const val TextAppearance_DeviceDefault_Widget_PopupMenu_Large = android.R.style.TextAppearance_DeviceDefault_Widget_PopupMenu_Large
        const val TextAppearance_DeviceDefault_Widget_PopupMenu_Small = android.R.style.TextAppearance_DeviceDefault_Widget_PopupMenu_Small
        const val TextAppearance_DeviceDefault_Widget_TabWidget = android.R.style.TextAppearance_DeviceDefault_Widget_TabWidget
        const val TextAppearance_DeviceDefault_Widget_TextView = android.R.style.TextAppearance_DeviceDefault_Widget_TextView
        const val TextAppearance_DeviceDefault_Widget_TextView_PopupMenu = android.R.style.TextAppearance_DeviceDefault_Widget_TextView_PopupMenu
        const val TextAppearance_DeviceDefault_Widget_TextView_SpinnerItem = android.R.style.TextAppearance_DeviceDefault_Widget_TextView_SpinnerItem
        const val TextAppearance_DeviceDefault_WindowTitle = android.R.style.TextAppearance_DeviceDefault_WindowTitle
        const val TextAppearance_DialogWindowTitle = android.R.style.TextAppearance_DialogWindowTitle
        const val TextAppearance_Holo = android.R.style.TextAppearance_Holo
        const val TextAppearance_Holo_DialogWindowTitle = android.R.style.TextAppearance_Holo_DialogWindowTitle
        const val TextAppearance_Holo_Inverse = android.R.style.TextAppearance_Holo_Inverse
        const val TextAppearance_Holo_Large = android.R.style.TextAppearance_Holo_Large
        const val TextAppearance_Holo_Large_Inverse = android.R.style.TextAppearance_Holo_Large_Inverse
        const val TextAppearance_Holo_Medium = android.R.style.TextAppearance_Holo_Medium
        const val TextAppearance_Holo_Medium_Inverse = android.R.style.TextAppearance_Holo_Medium_Inverse
        const val TextAppearance_Holo_SearchResult_Subtitle = android.R.style.TextAppearance_Holo_SearchResult_Subtitle
        const val TextAppearance_Holo_SearchResult_Title = android.R.style.TextAppearance_Holo_SearchResult_Title
        const val TextAppearance_Holo_Small = android.R.style.TextAppearance_Holo_Small
        const val TextAppearance_Holo_Small_Inverse = android.R.style.TextAppearance_Holo_Small_Inverse
        const val TextAppearance_Holo_Widget = android.R.style.TextAppearance_Holo_Widget
        const val TextAppearance_Holo_Widget_ActionBar_Menu = android.R.style.TextAppearance_Holo_Widget_ActionBar_Menu
        const val TextAppearance_Holo_Widget_ActionBar_Subtitle = android.R.style.TextAppearance_Holo_Widget_ActionBar_Subtitle
        const val TextAppearance_Holo_Widget_ActionBar_Subtitle_Inverse = android.R.style.TextAppearance_Holo_Widget_ActionBar_Subtitle_Inverse
        const val TextAppearance_Holo_Widget_ActionBar_Title = android.R.style.TextAppearance_Holo_Widget_ActionBar_Title
        const val TextAppearance_Holo_Widget_ActionBar_Title_Inverse = android.R.style.TextAppearance_Holo_Widget_ActionBar_Title_Inverse
        const val TextAppearance_Holo_Widget_ActionMode_Subtitle = android.R.style.TextAppearance_Holo_Widget_ActionMode_Subtitle
        const val TextAppearance_Holo_Widget_ActionMode_Subtitle_Inverse = android.R.style.TextAppearance_Holo_Widget_ActionMode_Subtitle_Inverse
        const val TextAppearance_Holo_Widget_ActionMode_Title = android.R.style.TextAppearance_Holo_Widget_ActionMode_Title
        const val TextAppearance_Holo_Widget_ActionMode_Title_Inverse = android.R.style.TextAppearance_Holo_Widget_ActionMode_Title_Inverse
        const val TextAppearance_Holo_Widget_Button = android.R.style.TextAppearance_Holo_Widget_Button
        const val TextAppearance_Holo_Widget_DropDownHint = android.R.style.TextAppearance_Holo_Widget_DropDownHint
        const val TextAppearance_Holo_Widget_DropDownItem = android.R.style.TextAppearance_Holo_Widget_DropDownItem
        const val TextAppearance_Holo_Widget_EditText = android.R.style.TextAppearance_Holo_Widget_EditText
        const val TextAppearance_Holo_Widget_IconMenu_Item = android.R.style.TextAppearance_Holo_Widget_IconMenu_Item
        const val TextAppearance_Holo_Widget_PopupMenu = android.R.style.TextAppearance_Holo_Widget_PopupMenu
        const val TextAppearance_Holo_Widget_PopupMenu_Large = android.R.style.TextAppearance_Holo_Widget_PopupMenu_Large
        const val TextAppearance_Holo_Widget_PopupMenu_Small = android.R.style.TextAppearance_Holo_Widget_PopupMenu_Small
        const val TextAppearance_Holo_Widget_TabWidget = android.R.style.TextAppearance_Holo_Widget_TabWidget
        const val TextAppearance_Holo_Widget_TextView = android.R.style.TextAppearance_Holo_Widget_TextView
        const val TextAppearance_Holo_Widget_TextView_PopupMenu = android.R.style.TextAppearance_Holo_Widget_TextView_PopupMenu
        const val TextAppearance_Holo_Widget_TextView_SpinnerItem = android.R.style.TextAppearance_Holo_Widget_TextView_SpinnerItem
        const val TextAppearance_Holo_WindowTitle = android.R.style.TextAppearance_Holo_WindowTitle
        const val TextAppearance_Inverse = android.R.style.TextAppearance_Inverse
        const val TextAppearance_Large = android.R.style.TextAppearance_Large
        const val TextAppearance_Large_Inverse = android.R.style.TextAppearance_Large_Inverse
        const val TextAppearance_Material = android.R.style.TextAppearance_Material
        const val TextAppearance_Material_Body1 = android.R.style.TextAppearance_Material_Body1
        const val TextAppearance_Material_Body2 = android.R.style.TextAppearance_Material_Body2
        const val TextAppearance_Material_Button = android.R.style.TextAppearance_Material_Button
        const val TextAppearance_Material_Caption = android.R.style.TextAppearance_Material_Caption
        const val TextAppearance_Material_DialogWindowTitle = android.R.style.TextAppearance_Material_DialogWindowTitle
        const val TextAppearance_Material_Display1 = android.R.style.TextAppearance_Material_Display1
        const val TextAppearance_Material_Display2 = android.R.style.TextAppearance_Material_Display2
        const val TextAppearance_Material_Display3 = android.R.style.TextAppearance_Material_Display3
        const val TextAppearance_Material_Display4 = android.R.style.TextAppearance_Material_Display4
        const val TextAppearance_Material_Headline = android.R.style.TextAppearance_Material_Headline
        const val TextAppearance_Material_Inverse = android.R.style.TextAppearance_Material_Inverse
        const val TextAppearance_Material_Large = android.R.style.TextAppearance_Material_Large
        const val TextAppearance_Material_Large_Inverse = android.R.style.TextAppearance_Material_Large_Inverse
        const val TextAppearance_Material_Medium = android.R.style.TextAppearance_Material_Medium
        const val TextAppearance_Material_Medium_Inverse = android.R.style.TextAppearance_Material_Medium_Inverse
        const val TextAppearance_Material_Menu = android.R.style.TextAppearance_Material_Menu
        const val TextAppearance_Material_Notification = android.R.style.TextAppearance_Material_Notification
        const val TextAppearance_Material_Notification_Emphasis = android.R.style.TextAppearance_Material_Notification_Emphasis
        const val TextAppearance_Material_Notification_Info = android.R.style.TextAppearance_Material_Notification_Info
        const val TextAppearance_Material_Notification_Line2 = android.R.style.TextAppearance_Material_Notification_Line2
        const val TextAppearance_Material_Notification_Time = android.R.style.TextAppearance_Material_Notification_Time
        const val TextAppearance_Material_Notification_Title = android.R.style.TextAppearance_Material_Notification_Title
        const val TextAppearance_Material_SearchResult_Subtitle = android.R.style.TextAppearance_Material_SearchResult_Subtitle
        const val TextAppearance_Material_SearchResult_Title = android.R.style.TextAppearance_Material_SearchResult_Title
        const val TextAppearance_Material_Small = android.R.style.TextAppearance_Material_Small
        const val TextAppearance_Material_Small_Inverse = android.R.style.TextAppearance_Material_Small_Inverse
        const val TextAppearance_Material_Subhead = android.R.style.TextAppearance_Material_Subhead
        const val TextAppearance_Material_Title = android.R.style.TextAppearance_Material_Title
        const val TextAppearance_Material_Widget = android.R.style.TextAppearance_Material_Widget
        const val TextAppearance_Material_Widget_ActionBar_Menu = android.R.style.TextAppearance_Material_Widget_ActionBar_Menu
        const val TextAppearance_Material_Widget_ActionBar_Subtitle = android.R.style.TextAppearance_Material_Widget_ActionBar_Subtitle
        const val TextAppearance_Material_Widget_ActionBar_Subtitle_Inverse = android.R.style.TextAppearance_Material_Widget_ActionBar_Subtitle_Inverse
        const val TextAppearance_Material_Widget_ActionBar_Title = android.R.style.TextAppearance_Material_Widget_ActionBar_Title
        const val TextAppearance_Material_Widget_ActionBar_Title_Inverse = android.R.style.TextAppearance_Material_Widget_ActionBar_Title_Inverse
        const val TextAppearance_Material_Widget_ActionMode_Subtitle = android.R.style.TextAppearance_Material_Widget_ActionMode_Subtitle
        const val TextAppearance_Material_Widget_ActionMode_Subtitle_Inverse = android.R.style.TextAppearance_Material_Widget_ActionMode_Subtitle_Inverse
        const val TextAppearance_Material_Widget_ActionMode_Title = android.R.style.TextAppearance_Material_Widget_ActionMode_Title
        const val TextAppearance_Material_Widget_ActionMode_Title_Inverse = android.R.style.TextAppearance_Material_Widget_ActionMode_Title_Inverse
        const val TextAppearance_Material_Widget_Button = android.R.style.TextAppearance_Material_Widget_Button
        const val TextAppearance_Material_Widget_Button_Borderless_Colored = android.R.style.TextAppearance_Material_Widget_Button_Borderless_Colored
        const val TextAppearance_Material_Widget_Button_Colored = android.R.style.TextAppearance_Material_Widget_Button_Colored
        const val TextAppearance_Material_Widget_Button_Inverse = android.R.style.TextAppearance_Material_Widget_Button_Inverse
        const val TextAppearance_Material_Widget_DropDownHint = android.R.style.TextAppearance_Material_Widget_DropDownHint
        const val TextAppearance_Material_Widget_DropDownItem = android.R.style.TextAppearance_Material_Widget_DropDownItem
        const val TextAppearance_Material_Widget_EditText = android.R.style.TextAppearance_Material_Widget_EditText
        const val TextAppearance_Material_Widget_IconMenu_Item = android.R.style.TextAppearance_Material_Widget_IconMenu_Item
        const val TextAppearance_Material_Widget_PopupMenu = android.R.style.TextAppearance_Material_Widget_PopupMenu
        const val TextAppearance_Material_Widget_PopupMenu_Large = android.R.style.TextAppearance_Material_Widget_PopupMenu_Large
        const val TextAppearance_Material_Widget_PopupMenu_Small = android.R.style.TextAppearance_Material_Widget_PopupMenu_Small
        const val TextAppearance_Material_Widget_TabWidget = android.R.style.TextAppearance_Material_Widget_TabWidget
        const val TextAppearance_Material_Widget_TextView = android.R.style.TextAppearance_Material_Widget_TextView
        const val TextAppearance_Material_Widget_TextView_PopupMenu = android.R.style.TextAppearance_Material_Widget_TextView_PopupMenu
        const val TextAppearance_Material_Widget_TextView_SpinnerItem = android.R.style.TextAppearance_Material_Widget_TextView_SpinnerItem
        const val TextAppearance_Material_Widget_Toolbar_Subtitle = android.R.style.TextAppearance_Material_Widget_Toolbar_Subtitle
        const val TextAppearance_Material_Widget_Toolbar_Title = android.R.style.TextAppearance_Material_Widget_Toolbar_Title
        const val TextAppearance_Material_WindowTitle = android.R.style.TextAppearance_Material_WindowTitle
        const val TextAppearance_Medium = android.R.style.TextAppearance_Medium
        const val TextAppearance_Medium_Inverse = android.R.style.TextAppearance_Medium_Inverse
        const val TextAppearance_Small = android.R.style.TextAppearance_Small
        const val TextAppearance_Small_Inverse = android.R.style.TextAppearance_Small_Inverse
        const val TextAppearance_StatusBar_EventContent = android.R.style.TextAppearance_StatusBar_EventContent
        const val TextAppearance_StatusBar_EventContent_Title = android.R.style.TextAppearance_StatusBar_EventContent_Title
        const val TextAppearance_StatusBar_Icon = android.R.style.TextAppearance_StatusBar_Icon
        const val TextAppearance_StatusBar_Title = android.R.style.TextAppearance_StatusBar_Title
        const val TextAppearance_SuggestionHighlight = android.R.style.TextAppearance_SuggestionHighlight
        const val TextAppearance_Theme = android.R.style.TextAppearance_Theme
        const val TextAppearance_Theme_Dialog = android.R.style.TextAppearance_Theme_Dialog
        const val TextAppearance_Widget = android.R.style.TextAppearance_Widget
        const val TextAppearance_Widget_Button = android.R.style.TextAppearance_Widget_Button
        const val TextAppearance_Widget_DropDownHint = android.R.style.TextAppearance_Widget_DropDownHint
        const val TextAppearance_Widget_DropDownItem = android.R.style.TextAppearance_Widget_DropDownItem
        const val TextAppearance_Widget_EditText = android.R.style.TextAppearance_Widget_EditText
        const val TextAppearance_Widget_IconMenu_Item = android.R.style.TextAppearance_Widget_IconMenu_Item
        const val TextAppearance_Widget_PopupMenu_Large = android.R.style.TextAppearance_Widget_PopupMenu_Large
        const val TextAppearance_Widget_PopupMenu_Small = android.R.style.TextAppearance_Widget_PopupMenu_Small
        const val TextAppearance_Widget_TabWidget = android.R.style.TextAppearance_Widget_TabWidget
        const val TextAppearance_Widget_TextView = android.R.style.TextAppearance_Widget_TextView
        const val TextAppearance_Widget_TextView_PopupMenu = android.R.style.TextAppearance_Widget_TextView_PopupMenu
        const val TextAppearance_Widget_TextView_SpinnerItem = android.R.style.TextAppearance_Widget_TextView_SpinnerItem
        const val TextAppearance_WindowTitle = android.R.style.TextAppearance_WindowTitle
        const val Theme = android.R.style.Theme
        const val ThemeOverlay = android.R.style.ThemeOverlay
        const val ThemeOverlay_DeviceDefault_Accent_DayNight = android.R.style.ThemeOverlay_DeviceDefault_Accent_DayNight
        const val ThemeOverlay_Material = android.R.style.ThemeOverlay_Material
        const val ThemeOverlay_Material_ActionBar = android.R.style.ThemeOverlay_Material_ActionBar
        const val ThemeOverlay_Material_Dark = android.R.style.ThemeOverlay_Material_Dark
        const val ThemeOverlay_Material_Dark_ActionBar = android.R.style.ThemeOverlay_Material_Dark_ActionBar
        const val ThemeOverlay_Material_Dialog = android.R.style.ThemeOverlay_Material_Dialog
        const val ThemeOverlay_Material_Dialog_Alert = android.R.style.ThemeOverlay_Material_Dialog_Alert
        const val ThemeOverlay_Material_Light = android.R.style.ThemeOverlay_Material_Light
        const val Theme_Black = android.R.style.Theme_Black
        const val Theme_Black_NoTitleBar = android.R.style.Theme_Black_NoTitleBar
        const val Theme_Black_NoTitleBar_Fullscreen = android.R.style.Theme_Black_NoTitleBar_Fullscreen
        const val Theme_DeviceDefault = android.R.style.Theme_DeviceDefault
        const val Theme_DeviceDefault_DayNight = android.R.style.Theme_DeviceDefault_DayNight
        const val Theme_DeviceDefault_Dialog = android.R.style.Theme_DeviceDefault_Dialog
        const val Theme_DeviceDefault_DialogWhenLarge = android.R.style.Theme_DeviceDefault_DialogWhenLarge
        const val Theme_DeviceDefault_DialogWhenLarge_NoActionBar = android.R.style.Theme_DeviceDefault_DialogWhenLarge_NoActionBar
        const val Theme_DeviceDefault_Dialog_Alert = android.R.style.Theme_DeviceDefault_Dialog_Alert
        const val Theme_DeviceDefault_Dialog_MinWidth = android.R.style.Theme_DeviceDefault_Dialog_MinWidth
        const val Theme_DeviceDefault_Dialog_NoActionBar = android.R.style.Theme_DeviceDefault_Dialog_NoActionBar
        const val Theme_DeviceDefault_Dialog_NoActionBar_MinWidth = android.R.style.Theme_DeviceDefault_Dialog_NoActionBar_MinWidth
        const val Theme_DeviceDefault_InputMethod = android.R.style.Theme_DeviceDefault_InputMethod
        const val Theme_DeviceDefault_Light = android.R.style.Theme_DeviceDefault_Light
        const val Theme_DeviceDefault_Light_DarkActionBar = android.R.style.Theme_DeviceDefault_Light_DarkActionBar
        const val Theme_DeviceDefault_Light_Dialog = android.R.style.Theme_DeviceDefault_Light_Dialog
        const val Theme_DeviceDefault_Light_DialogWhenLarge = android.R.style.Theme_DeviceDefault_Light_DialogWhenLarge
        const val Theme_DeviceDefault_Light_DialogWhenLarge_NoActionBar = android.R.style.Theme_DeviceDefault_Light_DialogWhenLarge_NoActionBar
        const val Theme_DeviceDefault_Light_Dialog_Alert = android.R.style.Theme_DeviceDefault_Light_Dialog_Alert
        const val Theme_DeviceDefault_Light_Dialog_MinWidth = android.R.style.Theme_DeviceDefault_Light_Dialog_MinWidth
        const val Theme_DeviceDefault_Light_Dialog_NoActionBar = android.R.style.Theme_DeviceDefault_Light_Dialog_NoActionBar
        const val Theme_DeviceDefault_Light_Dialog_NoActionBar_MinWidth = android.R.style.Theme_DeviceDefault_Light_Dialog_NoActionBar_MinWidth
        const val Theme_DeviceDefault_Light_NoActionBar = android.R.style.Theme_DeviceDefault_Light_NoActionBar
        const val Theme_DeviceDefault_Light_NoActionBar_Fullscreen = android.R.style.Theme_DeviceDefault_Light_NoActionBar_Fullscreen
        const val Theme_DeviceDefault_Light_NoActionBar_Overscan = android.R.style.Theme_DeviceDefault_Light_NoActionBar_Overscan
        const val Theme_DeviceDefault_Light_NoActionBar_TranslucentDecor = android.R.style.Theme_DeviceDefault_Light_NoActionBar_TranslucentDecor
        const val Theme_DeviceDefault_Light_Panel = android.R.style.Theme_DeviceDefault_Light_Panel
        const val Theme_DeviceDefault_NoActionBar = android.R.style.Theme_DeviceDefault_NoActionBar
        const val Theme_DeviceDefault_NoActionBar_Fullscreen = android.R.style.Theme_DeviceDefault_NoActionBar_Fullscreen
        const val Theme_DeviceDefault_NoActionBar_Overscan = android.R.style.Theme_DeviceDefault_NoActionBar_Overscan
        const val Theme_DeviceDefault_NoActionBar_TranslucentDecor = android.R.style.Theme_DeviceDefault_NoActionBar_TranslucentDecor
        const val Theme_DeviceDefault_Panel = android.R.style.Theme_DeviceDefault_Panel
        const val Theme_DeviceDefault_Settings = android.R.style.Theme_DeviceDefault_Settings
        const val Theme_DeviceDefault_Wallpaper = android.R.style.Theme_DeviceDefault_Wallpaper
        const val Theme_DeviceDefault_Wallpaper_NoTitleBar = android.R.style.Theme_DeviceDefault_Wallpaper_NoTitleBar
        const val Theme_Dialog = android.R.style.Theme_Dialog

        @Deprecated
        const val Theme_Holo = android.R.style.Theme_Holo

        @Deprecated
        const val Theme_Holo_Dialog = android.R.style.Theme_Holo_Dialog

        @Deprecated
        const val Theme_Holo_DialogWhenLarge = android.R.style.Theme_Holo_DialogWhenLarge

        @Deprecated
        const val Theme_Holo_DialogWhenLarge_NoActionBar = android.R.style.Theme_Holo_DialogWhenLarge_NoActionBar

        @Deprecated
        const val Theme_Holo_Dialog_MinWidth = android.R.style.Theme_Holo_Dialog_MinWidth

        @Deprecated
        const val Theme_Holo_Dialog_NoActionBar = android.R.style.Theme_Holo_Dialog_NoActionBar

        @Deprecated
        const val Theme_Holo_Dialog_NoActionBar_MinWidth = android.R.style.Theme_Holo_Dialog_NoActionBar_MinWidth

        @Deprecated
        const val Theme_Holo_InputMethod = android.R.style.Theme_Holo_InputMethod

        @Deprecated
        const val Theme_Holo_Light = android.R.style.Theme_Holo_Light

        @Deprecated
        const val Theme_Holo_Light_DarkActionBar = android.R.style.Theme_Holo_Light_DarkActionBar

        @Deprecated
        const val Theme_Holo_Light_Dialog = android.R.style.Theme_Holo_Light_Dialog

        @Deprecated
        const val Theme_Holo_Light_DialogWhenLarge = android.R.style.Theme_Holo_Light_DialogWhenLarge

        @Deprecated
        const val Theme_Holo_Light_DialogWhenLarge_NoActionBar = android.R.style.Theme_Holo_Light_DialogWhenLarge_NoActionBar

        @Deprecated
        const val Theme_Holo_Light_Dialog_MinWidth = android.R.style.Theme_Holo_Light_Dialog_MinWidth

        @Deprecated
        const val Theme_Holo_Light_Dialog_NoActionBar = android.R.style.Theme_Holo_Light_Dialog_NoActionBar

        @Deprecated
        const val Theme_Holo_Light_Dialog_NoActionBar_MinWidth = android.R.style.Theme_Holo_Light_Dialog_NoActionBar_MinWidth

        @Deprecated
        const val Theme_Holo_Light_NoActionBar = android.R.style.Theme_Holo_Light_NoActionBar

        @Deprecated
        const val Theme_Holo_Light_NoActionBar_Fullscreen = android.R.style.Theme_Holo_Light_NoActionBar_Fullscreen

        @Deprecated
        const val Theme_Holo_Light_NoActionBar_Overscan = android.R.style.Theme_Holo_Light_NoActionBar_Overscan

        @Deprecated
        const val Theme_Holo_Light_NoActionBar_TranslucentDecor = android.R.style.Theme_Holo_Light_NoActionBar_TranslucentDecor

        @Deprecated
        const val Theme_Holo_Light_Panel = android.R.style.Theme_Holo_Light_Panel

        @Deprecated
        const val Theme_Holo_NoActionBar = android.R.style.Theme_Holo_NoActionBar

        @Deprecated
        const val Theme_Holo_NoActionBar_Fullscreen = android.R.style.Theme_Holo_NoActionBar_Fullscreen

        @Deprecated
        const val Theme_Holo_NoActionBar_Overscan = android.R.style.Theme_Holo_NoActionBar_Overscan

        @Deprecated
        const val Theme_Holo_NoActionBar_TranslucentDecor = android.R.style.Theme_Holo_NoActionBar_TranslucentDecor

        @Deprecated
        const val Theme_Holo_Panel = android.R.style.Theme_Holo_Panel

        @Deprecated
        const val Theme_Holo_Wallpaper = android.R.style.Theme_Holo_Wallpaper

        @Deprecated
        const val Theme_Holo_Wallpaper_NoTitleBar = android.R.style.Theme_Holo_Wallpaper_NoTitleBar
        const val Theme_InputMethod = android.R.style.Theme_InputMethod
        const val Theme_Light = android.R.style.Theme_Light
        const val Theme_Light_NoTitleBar = android.R.style.Theme_Light_NoTitleBar
        const val Theme_Light_NoTitleBar_Fullscreen = android.R.style.Theme_Light_NoTitleBar_Fullscreen
        const val Theme_Light_Panel = android.R.style.Theme_Light_Panel
        const val Theme_Light_WallpaperSettings = android.R.style.Theme_Light_WallpaperSettings
        const val Theme_Material = android.R.style.Theme_Material
        const val Theme_Material_Dialog = android.R.style.Theme_Material_Dialog
        const val Theme_Material_DialogWhenLarge = android.R.style.Theme_Material_DialogWhenLarge
        const val Theme_Material_DialogWhenLarge_NoActionBar = android.R.style.Theme_Material_DialogWhenLarge_NoActionBar
        const val Theme_Material_Dialog_Alert = android.R.style.Theme_Material_Dialog_Alert
        const val Theme_Material_Dialog_MinWidth = android.R.style.Theme_Material_Dialog_MinWidth
        const val Theme_Material_Dialog_NoActionBar = android.R.style.Theme_Material_Dialog_NoActionBar
        const val Theme_Material_Dialog_NoActionBar_MinWidth = android.R.style.Theme_Material_Dialog_NoActionBar_MinWidth
        const val Theme_Material_Dialog_Presentation = android.R.style.Theme_Material_Dialog_Presentation
        const val Theme_Material_InputMethod = android.R.style.Theme_Material_InputMethod
        const val Theme_Material_Light = android.R.style.Theme_Material_Light
        const val Theme_Material_Light_DarkActionBar = android.R.style.Theme_Material_Light_DarkActionBar
        const val Theme_Material_Light_Dialog = android.R.style.Theme_Material_Light_Dialog
        const val Theme_Material_Light_DialogWhenLarge = android.R.style.Theme_Material_Light_DialogWhenLarge
        const val Theme_Material_Light_DialogWhenLarge_DarkActionBar = android.R.style.Theme_Material_Light_DialogWhenLarge_DarkActionBar
        const val Theme_Material_Light_DialogWhenLarge_NoActionBar = android.R.style.Theme_Material_Light_DialogWhenLarge_NoActionBar
        const val Theme_Material_Light_Dialog_Alert = android.R.style.Theme_Material_Light_Dialog_Alert
        const val Theme_Material_Light_Dialog_MinWidth = android.R.style.Theme_Material_Light_Dialog_MinWidth
        const val Theme_Material_Light_Dialog_NoActionBar = android.R.style.Theme_Material_Light_Dialog_NoActionBar
        const val Theme_Material_Light_Dialog_NoActionBar_MinWidth = android.R.style.Theme_Material_Light_Dialog_NoActionBar_MinWidth
        const val Theme_Material_Light_Dialog_Presentation = android.R.style.Theme_Material_Light_Dialog_Presentation
        const val Theme_Material_Light_LightStatusBar = android.R.style.Theme_Material_Light_LightStatusBar
        const val Theme_Material_Light_NoActionBar = android.R.style.Theme_Material_Light_NoActionBar
        const val Theme_Material_Light_NoActionBar_Fullscreen = android.R.style.Theme_Material_Light_NoActionBar_Fullscreen

        @Deprecated
        const val Theme_Material_Light_NoActionBar_Overscan = android.R.style.Theme_Material_Light_NoActionBar_Overscan
        const val Theme_Material_Light_NoActionBar_TranslucentDecor = android.R.style.Theme_Material_Light_NoActionBar_TranslucentDecor
        const val Theme_Material_Light_Panel = android.R.style.Theme_Material_Light_Panel
        const val Theme_Material_Light_Voice = android.R.style.Theme_Material_Light_Voice
        const val Theme_Material_NoActionBar = android.R.style.Theme_Material_NoActionBar
        const val Theme_Material_NoActionBar_Fullscreen = android.R.style.Theme_Material_NoActionBar_Fullscreen

        @Deprecated
        const val Theme_Material_NoActionBar_Overscan = android.R.style.Theme_Material_NoActionBar_Overscan
        const val Theme_Material_NoActionBar_TranslucentDecor = android.R.style.Theme_Material_NoActionBar_TranslucentDecor
        const val Theme_Material_Panel = android.R.style.Theme_Material_Panel
        const val Theme_Material_Settings = android.R.style.Theme_Material_Settings
        const val Theme_Material_Voice = android.R.style.Theme_Material_Voice
        const val Theme_Material_Wallpaper = android.R.style.Theme_Material_Wallpaper
        const val Theme_Material_Wallpaper_NoTitleBar = android.R.style.Theme_Material_Wallpaper_NoTitleBar
        const val Theme_NoDisplay = android.R.style.Theme_NoDisplay
        const val Theme_NoTitleBar = android.R.style.Theme_NoTitleBar
        const val Theme_NoTitleBar_Fullscreen = android.R.style.Theme_NoTitleBar_Fullscreen
        const val Theme_NoTitleBar_OverlayActionModes = android.R.style.Theme_NoTitleBar_OverlayActionModes
        const val Theme_Panel = android.R.style.Theme_Panel
        const val Theme_Translucent = android.R.style.Theme_Translucent
        const val Theme_Translucent_NoTitleBar = android.R.style.Theme_Translucent_NoTitleBar
        const val Theme_Translucent_NoTitleBar_Fullscreen = android.R.style.Theme_Translucent_NoTitleBar_Fullscreen
        const val Theme_Wallpaper = android.R.style.Theme_Wallpaper
        const val Theme_WallpaperSettings = android.R.style.Theme_WallpaperSettings
        const val Theme_Wallpaper_NoTitleBar = android.R.style.Theme_Wallpaper_NoTitleBar
        const val Theme_Wallpaper_NoTitleBar_Fullscreen = android.R.style.Theme_Wallpaper_NoTitleBar_Fullscreen
        const val Theme_WithActionBar = android.R.style.Theme_WithActionBar
        const val Widget = android.R.style.Widget
        const val Widget_AbsListView = android.R.style.Widget_AbsListView
        const val Widget_ActionBar = android.R.style.Widget_ActionBar
        const val Widget_ActionBar_TabBar = android.R.style.Widget_ActionBar_TabBar
        const val Widget_ActionBar_TabText = android.R.style.Widget_ActionBar_TabText
        const val Widget_ActionBar_TabView = android.R.style.Widget_ActionBar_TabView
        const val Widget_ActionButton = android.R.style.Widget_ActionButton
        const val Widget_ActionButton_CloseMode = android.R.style.Widget_ActionButton_CloseMode
        const val Widget_ActionButton_Overflow = android.R.style.Widget_ActionButton_Overflow
        const val Widget_AutoCompleteTextView = android.R.style.Widget_AutoCompleteTextView
        const val Widget_Button = android.R.style.Widget_Button
        const val Widget_Button_Inset = android.R.style.Widget_Button_Inset
        const val Widget_Button_Small = android.R.style.Widget_Button_Small
        const val Widget_Button_Toggle = android.R.style.Widget_Button_Toggle
        const val Widget_CalendarView = android.R.style.Widget_CalendarView
        const val Widget_CompoundButton = android.R.style.Widget_CompoundButton
        const val Widget_CompoundButton_CheckBox = android.R.style.Widget_CompoundButton_CheckBox
        const val Widget_CompoundButton_RadioButton = android.R.style.Widget_CompoundButton_RadioButton
        const val Widget_CompoundButton_Star = android.R.style.Widget_CompoundButton_Star
        const val Widget_DatePicker = android.R.style.Widget_DatePicker
        const val Widget_DeviceDefault = android.R.style.Widget_DeviceDefault
        const val Widget_DeviceDefault_ActionBar = android.R.style.Widget_DeviceDefault_ActionBar
        const val Widget_DeviceDefault_ActionBar_Solid = android.R.style.Widget_DeviceDefault_ActionBar_Solid
        const val Widget_DeviceDefault_ActionBar_TabBar = android.R.style.Widget_DeviceDefault_ActionBar_TabBar
        const val Widget_DeviceDefault_ActionBar_TabText = android.R.style.Widget_DeviceDefault_ActionBar_TabText
        const val Widget_DeviceDefault_ActionBar_TabView = android.R.style.Widget_DeviceDefault_ActionBar_TabView
        const val Widget_DeviceDefault_ActionButton = android.R.style.Widget_DeviceDefault_ActionButton
        const val Widget_DeviceDefault_ActionButton_CloseMode = android.R.style.Widget_DeviceDefault_ActionButton_CloseMode
        const val Widget_DeviceDefault_ActionButton_Overflow = android.R.style.Widget_DeviceDefault_ActionButton_Overflow
        const val Widget_DeviceDefault_ActionButton_TextButton = android.R.style.Widget_DeviceDefault_ActionButton_TextButton
        const val Widget_DeviceDefault_ActionMode = android.R.style.Widget_DeviceDefault_ActionMode
        const val Widget_DeviceDefault_AutoCompleteTextView = android.R.style.Widget_DeviceDefault_AutoCompleteTextView
        const val Widget_DeviceDefault_Button = android.R.style.Widget_DeviceDefault_Button
        const val Widget_DeviceDefault_Button_Borderless = android.R.style.Widget_DeviceDefault_Button_Borderless
        const val Widget_DeviceDefault_Button_Borderless_Colored = android.R.style.Widget_DeviceDefault_Button_Borderless_Colored
        const val Widget_DeviceDefault_Button_Borderless_Small = android.R.style.Widget_DeviceDefault_Button_Borderless_Small
        const val Widget_DeviceDefault_Button_Colored = android.R.style.Widget_DeviceDefault_Button_Colored
        const val Widget_DeviceDefault_Button_Inset = android.R.style.Widget_DeviceDefault_Button_Inset
        const val Widget_DeviceDefault_Button_Small = android.R.style.Widget_DeviceDefault_Button_Small
        const val Widget_DeviceDefault_Button_Toggle = android.R.style.Widget_DeviceDefault_Button_Toggle
        const val Widget_DeviceDefault_CalendarView = android.R.style.Widget_DeviceDefault_CalendarView
        const val Widget_DeviceDefault_CheckedTextView = android.R.style.Widget_DeviceDefault_CheckedTextView
        const val Widget_DeviceDefault_CompoundButton_CheckBox = android.R.style.Widget_DeviceDefault_CompoundButton_CheckBox
        const val Widget_DeviceDefault_CompoundButton_RadioButton = android.R.style.Widget_DeviceDefault_CompoundButton_RadioButton
        const val Widget_DeviceDefault_CompoundButton_Star = android.R.style.Widget_DeviceDefault_CompoundButton_Star
        const val Widget_DeviceDefault_DatePicker = android.R.style.Widget_DeviceDefault_DatePicker
        const val Widget_DeviceDefault_DropDownItem = android.R.style.Widget_DeviceDefault_DropDownItem
        const val Widget_DeviceDefault_DropDownItem_Spinner = android.R.style.Widget_DeviceDefault_DropDownItem_Spinner
        const val Widget_DeviceDefault_EditText = android.R.style.Widget_DeviceDefault_EditText
        const val Widget_DeviceDefault_ExpandableListView = android.R.style.Widget_DeviceDefault_ExpandableListView
        const val Widget_DeviceDefault_FastScroll = android.R.style.Widget_DeviceDefault_FastScroll
        const val Widget_DeviceDefault_GridView = android.R.style.Widget_DeviceDefault_GridView
        const val Widget_DeviceDefault_HorizontalScrollView = android.R.style.Widget_DeviceDefault_HorizontalScrollView
        const val Widget_DeviceDefault_ImageButton = android.R.style.Widget_DeviceDefault_ImageButton
        const val Widget_DeviceDefault_Light = android.R.style.Widget_DeviceDefault_Light
        const val Widget_DeviceDefault_Light_ActionBar = android.R.style.Widget_DeviceDefault_Light_ActionBar
        const val Widget_DeviceDefault_Light_ActionBar_Solid = android.R.style.Widget_DeviceDefault_Light_ActionBar_Solid

        @Deprecated
        const val Widget_DeviceDefault_Light_ActionBar_Solid_Inverse = android.R.style.Widget_DeviceDefault_Light_ActionBar_Solid_Inverse
        const val Widget_DeviceDefault_Light_ActionBar_TabBar = android.R.style.Widget_DeviceDefault_Light_ActionBar_TabBar

        @Deprecated
        const val Widget_DeviceDefault_Light_ActionBar_TabBar_Inverse = android.R.style.Widget_DeviceDefault_Light_ActionBar_TabBar_Inverse
        const val Widget_DeviceDefault_Light_ActionBar_TabText = android.R.style.Widget_DeviceDefault_Light_ActionBar_TabText

        @Deprecated
        const val Widget_DeviceDefault_Light_ActionBar_TabText_Inverse = android.R.style.Widget_DeviceDefault_Light_ActionBar_TabText_Inverse
        const val Widget_DeviceDefault_Light_ActionBar_TabView = android.R.style.Widget_DeviceDefault_Light_ActionBar_TabView

        @Deprecated
        const val Widget_DeviceDefault_Light_ActionBar_TabView_Inverse = android.R.style.Widget_DeviceDefault_Light_ActionBar_TabView_Inverse
        const val Widget_DeviceDefault_Light_ActionButton = android.R.style.Widget_DeviceDefault_Light_ActionButton
        const val Widget_DeviceDefault_Light_ActionButton_CloseMode = android.R.style.Widget_DeviceDefault_Light_ActionButton_CloseMode
        const val Widget_DeviceDefault_Light_ActionButton_Overflow = android.R.style.Widget_DeviceDefault_Light_ActionButton_Overflow
        const val Widget_DeviceDefault_Light_ActionMode = android.R.style.Widget_DeviceDefault_Light_ActionMode

        @Deprecated
        const val Widget_DeviceDefault_Light_ActionMode_Inverse = android.R.style.Widget_DeviceDefault_Light_ActionMode_Inverse
        const val Widget_DeviceDefault_Light_AutoCompleteTextView = android.R.style.Widget_DeviceDefault_Light_AutoCompleteTextView
        const val Widget_DeviceDefault_Light_Button = android.R.style.Widget_DeviceDefault_Light_Button
        const val Widget_DeviceDefault_Light_Button_Borderless_Small = android.R.style.Widget_DeviceDefault_Light_Button_Borderless_Small
        const val Widget_DeviceDefault_Light_Button_Inset = android.R.style.Widget_DeviceDefault_Light_Button_Inset
        const val Widget_DeviceDefault_Light_Button_Small = android.R.style.Widget_DeviceDefault_Light_Button_Small
        const val Widget_DeviceDefault_Light_Button_Toggle = android.R.style.Widget_DeviceDefault_Light_Button_Toggle
        const val Widget_DeviceDefault_Light_CalendarView = android.R.style.Widget_DeviceDefault_Light_CalendarView
        const val Widget_DeviceDefault_Light_CheckedTextView = android.R.style.Widget_DeviceDefault_Light_CheckedTextView
        const val Widget_DeviceDefault_Light_CompoundButton_CheckBox = android.R.style.Widget_DeviceDefault_Light_CompoundButton_CheckBox
        const val Widget_DeviceDefault_Light_CompoundButton_RadioButton = android.R.style.Widget_DeviceDefault_Light_CompoundButton_RadioButton
        const val Widget_DeviceDefault_Light_CompoundButton_Star = android.R.style.Widget_DeviceDefault_Light_CompoundButton_Star
        const val Widget_DeviceDefault_Light_DropDownItem = android.R.style.Widget_DeviceDefault_Light_DropDownItem
        const val Widget_DeviceDefault_Light_DropDownItem_Spinner = android.R.style.Widget_DeviceDefault_Light_DropDownItem_Spinner
        const val Widget_DeviceDefault_Light_EditText = android.R.style.Widget_DeviceDefault_Light_EditText
        const val Widget_DeviceDefault_Light_ExpandableListView = android.R.style.Widget_DeviceDefault_Light_ExpandableListView
        const val Widget_DeviceDefault_Light_FastScroll = android.R.style.Widget_DeviceDefault_Light_FastScroll
        const val Widget_DeviceDefault_Light_GridView = android.R.style.Widget_DeviceDefault_Light_GridView
        const val Widget_DeviceDefault_Light_HorizontalScrollView = android.R.style.Widget_DeviceDefault_Light_HorizontalScrollView
        const val Widget_DeviceDefault_Light_ImageButton = android.R.style.Widget_DeviceDefault_Light_ImageButton
        const val Widget_DeviceDefault_Light_ListPopupWindow = android.R.style.Widget_DeviceDefault_Light_ListPopupWindow
        const val Widget_DeviceDefault_Light_ListView = android.R.style.Widget_DeviceDefault_Light_ListView
        const val Widget_DeviceDefault_Light_ListView_DropDown = android.R.style.Widget_DeviceDefault_Light_ListView_DropDown
        const val Widget_DeviceDefault_Light_MediaRouteButton = android.R.style.Widget_DeviceDefault_Light_MediaRouteButton
        const val Widget_DeviceDefault_Light_PopupMenu = android.R.style.Widget_DeviceDefault_Light_PopupMenu
        const val Widget_DeviceDefault_Light_PopupWindow = android.R.style.Widget_DeviceDefault_Light_PopupWindow
        const val Widget_DeviceDefault_Light_ProgressBar = android.R.style.Widget_DeviceDefault_Light_ProgressBar
        const val Widget_DeviceDefault_Light_ProgressBar_Horizontal = android.R.style.Widget_DeviceDefault_Light_ProgressBar_Horizontal
        const val Widget_DeviceDefault_Light_ProgressBar_Inverse = android.R.style.Widget_DeviceDefault_Light_ProgressBar_Inverse
        const val Widget_DeviceDefault_Light_ProgressBar_Large = android.R.style.Widget_DeviceDefault_Light_ProgressBar_Large
        const val Widget_DeviceDefault_Light_ProgressBar_Large_Inverse = android.R.style.Widget_DeviceDefault_Light_ProgressBar_Large_Inverse
        const val Widget_DeviceDefault_Light_ProgressBar_Small = android.R.style.Widget_DeviceDefault_Light_ProgressBar_Small
        const val Widget_DeviceDefault_Light_ProgressBar_Small_Inverse = android.R.style.Widget_DeviceDefault_Light_ProgressBar_Small_Inverse
        const val Widget_DeviceDefault_Light_ProgressBar_Small_Title = android.R.style.Widget_DeviceDefault_Light_ProgressBar_Small_Title
        const val Widget_DeviceDefault_Light_RatingBar = android.R.style.Widget_DeviceDefault_Light_RatingBar
        const val Widget_DeviceDefault_Light_RatingBar_Indicator = android.R.style.Widget_DeviceDefault_Light_RatingBar_Indicator
        const val Widget_DeviceDefault_Light_RatingBar_Small = android.R.style.Widget_DeviceDefault_Light_RatingBar_Small
        const val Widget_DeviceDefault_Light_ScrollView = android.R.style.Widget_DeviceDefault_Light_ScrollView
        const val Widget_DeviceDefault_Light_SeekBar = android.R.style.Widget_DeviceDefault_Light_SeekBar
        const val Widget_DeviceDefault_Light_Spinner = android.R.style.Widget_DeviceDefault_Light_Spinner
        const val Widget_DeviceDefault_Light_StackView = android.R.style.Widget_DeviceDefault_Light_StackView
        const val Widget_DeviceDefault_Light_Tab = android.R.style.Widget_DeviceDefault_Light_Tab
        const val Widget_DeviceDefault_Light_TabWidget = android.R.style.Widget_DeviceDefault_Light_TabWidget
        const val Widget_DeviceDefault_Light_TextView = android.R.style.Widget_DeviceDefault_Light_TextView
        const val Widget_DeviceDefault_Light_TextView_SpinnerItem = android.R.style.Widget_DeviceDefault_Light_TextView_SpinnerItem
        const val Widget_DeviceDefault_Light_WebTextView = android.R.style.Widget_DeviceDefault_Light_WebTextView
        const val Widget_DeviceDefault_Light_WebView = android.R.style.Widget_DeviceDefault_Light_WebView
        const val Widget_DeviceDefault_ListPopupWindow = android.R.style.Widget_DeviceDefault_ListPopupWindow
        const val Widget_DeviceDefault_ListView = android.R.style.Widget_DeviceDefault_ListView
        const val Widget_DeviceDefault_ListView_DropDown = android.R.style.Widget_DeviceDefault_ListView_DropDown
        const val Widget_DeviceDefault_MediaRouteButton = android.R.style.Widget_DeviceDefault_MediaRouteButton
        const val Widget_DeviceDefault_PopupMenu = android.R.style.Widget_DeviceDefault_PopupMenu
        const val Widget_DeviceDefault_PopupWindow = android.R.style.Widget_DeviceDefault_PopupWindow
        const val Widget_DeviceDefault_ProgressBar = android.R.style.Widget_DeviceDefault_ProgressBar
        const val Widget_DeviceDefault_ProgressBar_Horizontal = android.R.style.Widget_DeviceDefault_ProgressBar_Horizontal
        const val Widget_DeviceDefault_ProgressBar_Large = android.R.style.Widget_DeviceDefault_ProgressBar_Large
        const val Widget_DeviceDefault_ProgressBar_Small = android.R.style.Widget_DeviceDefault_ProgressBar_Small
        const val Widget_DeviceDefault_ProgressBar_Small_Title = android.R.style.Widget_DeviceDefault_ProgressBar_Small_Title
        const val Widget_DeviceDefault_RatingBar = android.R.style.Widget_DeviceDefault_RatingBar
        const val Widget_DeviceDefault_RatingBar_Indicator = android.R.style.Widget_DeviceDefault_RatingBar_Indicator
        const val Widget_DeviceDefault_RatingBar_Small = android.R.style.Widget_DeviceDefault_RatingBar_Small
        const val Widget_DeviceDefault_ScrollView = android.R.style.Widget_DeviceDefault_ScrollView
        const val Widget_DeviceDefault_SeekBar = android.R.style.Widget_DeviceDefault_SeekBar
        const val Widget_DeviceDefault_Spinner = android.R.style.Widget_DeviceDefault_Spinner
        const val Widget_DeviceDefault_StackView = android.R.style.Widget_DeviceDefault_StackView
        const val Widget_DeviceDefault_Tab = android.R.style.Widget_DeviceDefault_Tab
        const val Widget_DeviceDefault_TabWidget = android.R.style.Widget_DeviceDefault_TabWidget
        const val Widget_DeviceDefault_TextView = android.R.style.Widget_DeviceDefault_TextView
        const val Widget_DeviceDefault_TextView_SpinnerItem = android.R.style.Widget_DeviceDefault_TextView_SpinnerItem
        const val Widget_DeviceDefault_WebTextView = android.R.style.Widget_DeviceDefault_WebTextView
        const val Widget_DeviceDefault_WebView = android.R.style.Widget_DeviceDefault_WebView
        const val Widget_DropDownItem = android.R.style.Widget_DropDownItem
        const val Widget_DropDownItem_Spinner = android.R.style.Widget_DropDownItem_Spinner
        const val Widget_EditText = android.R.style.Widget_EditText
        const val Widget_ExpandableListView = android.R.style.Widget_ExpandableListView
        const val Widget_FastScroll = android.R.style.Widget_FastScroll
        const val Widget_FragmentBreadCrumbs = android.R.style.Widget_FragmentBreadCrumbs
        const val Widget_Gallery = android.R.style.Widget_Gallery
        const val Widget_GridView = android.R.style.Widget_GridView
        const val Widget_Holo = android.R.style.Widget_Holo
        const val Widget_Holo_ActionBar = android.R.style.Widget_Holo_ActionBar
        const val Widget_Holo_ActionBar_Solid = android.R.style.Widget_Holo_ActionBar_Solid
        const val Widget_Holo_ActionBar_TabBar = android.R.style.Widget_Holo_ActionBar_TabBar
        const val Widget_Holo_ActionBar_TabText = android.R.style.Widget_Holo_ActionBar_TabText
        const val Widget_Holo_ActionBar_TabView = android.R.style.Widget_Holo_ActionBar_TabView
        const val Widget_Holo_ActionButton = android.R.style.Widget_Holo_ActionButton
        const val Widget_Holo_ActionButton_CloseMode = android.R.style.Widget_Holo_ActionButton_CloseMode
        const val Widget_Holo_ActionButton_Overflow = android.R.style.Widget_Holo_ActionButton_Overflow
        const val Widget_Holo_ActionButton_TextButton = android.R.style.Widget_Holo_ActionButton_TextButton
        const val Widget_Holo_ActionMode = android.R.style.Widget_Holo_ActionMode
        const val Widget_Holo_AutoCompleteTextView = android.R.style.Widget_Holo_AutoCompleteTextView
        const val Widget_Holo_Button = android.R.style.Widget_Holo_Button
        const val Widget_Holo_Button_Borderless = android.R.style.Widget_Holo_Button_Borderless
        const val Widget_Holo_Button_Borderless_Small = android.R.style.Widget_Holo_Button_Borderless_Small
        const val Widget_Holo_Button_Inset = android.R.style.Widget_Holo_Button_Inset
        const val Widget_Holo_Button_Small = android.R.style.Widget_Holo_Button_Small
        const val Widget_Holo_Button_Toggle = android.R.style.Widget_Holo_Button_Toggle
        const val Widget_Holo_CalendarView = android.R.style.Widget_Holo_CalendarView
        const val Widget_Holo_CheckedTextView = android.R.style.Widget_Holo_CheckedTextView
        const val Widget_Holo_CompoundButton_CheckBox = android.R.style.Widget_Holo_CompoundButton_CheckBox
        const val Widget_Holo_CompoundButton_RadioButton = android.R.style.Widget_Holo_CompoundButton_RadioButton
        const val Widget_Holo_CompoundButton_Star = android.R.style.Widget_Holo_CompoundButton_Star
        const val Widget_Holo_DatePicker = android.R.style.Widget_Holo_DatePicker
        const val Widget_Holo_DropDownItem = android.R.style.Widget_Holo_DropDownItem
        const val Widget_Holo_DropDownItem_Spinner = android.R.style.Widget_Holo_DropDownItem_Spinner
        const val Widget_Holo_EditText = android.R.style.Widget_Holo_EditText
        const val Widget_Holo_ExpandableListView = android.R.style.Widget_Holo_ExpandableListView
        const val Widget_Holo_GridView = android.R.style.Widget_Holo_GridView
        const val Widget_Holo_HorizontalScrollView = android.R.style.Widget_Holo_HorizontalScrollView
        const val Widget_Holo_ImageButton = android.R.style.Widget_Holo_ImageButton
        const val Widget_Holo_Light = android.R.style.Widget_Holo_Light
        const val Widget_Holo_Light_ActionBar = android.R.style.Widget_Holo_Light_ActionBar
        const val Widget_Holo_Light_ActionBar_Solid = android.R.style.Widget_Holo_Light_ActionBar_Solid
        const val Widget_Holo_Light_ActionBar_Solid_Inverse = android.R.style.Widget_Holo_Light_ActionBar_Solid_Inverse
        const val Widget_Holo_Light_ActionBar_TabBar = android.R.style.Widget_Holo_Light_ActionBar_TabBar
        const val Widget_Holo_Light_ActionBar_TabBar_Inverse = android.R.style.Widget_Holo_Light_ActionBar_TabBar_Inverse
        const val Widget_Holo_Light_ActionBar_TabText = android.R.style.Widget_Holo_Light_ActionBar_TabText
        const val Widget_Holo_Light_ActionBar_TabText_Inverse = android.R.style.Widget_Holo_Light_ActionBar_TabText_Inverse
        const val Widget_Holo_Light_ActionBar_TabView = android.R.style.Widget_Holo_Light_ActionBar_TabView
        const val Widget_Holo_Light_ActionBar_TabView_Inverse = android.R.style.Widget_Holo_Light_ActionBar_TabView_Inverse
        const val Widget_Holo_Light_ActionButton = android.R.style.Widget_Holo_Light_ActionButton
        const val Widget_Holo_Light_ActionButton_CloseMode = android.R.style.Widget_Holo_Light_ActionButton_CloseMode
        const val Widget_Holo_Light_ActionButton_Overflow = android.R.style.Widget_Holo_Light_ActionButton_Overflow
        const val Widget_Holo_Light_ActionMode = android.R.style.Widget_Holo_Light_ActionMode
        const val Widget_Holo_Light_ActionMode_Inverse = android.R.style.Widget_Holo_Light_ActionMode_Inverse
        const val Widget_Holo_Light_AutoCompleteTextView = android.R.style.Widget_Holo_Light_AutoCompleteTextView
        const val Widget_Holo_Light_Button = android.R.style.Widget_Holo_Light_Button
        const val Widget_Holo_Light_Button_Borderless_Small = android.R.style.Widget_Holo_Light_Button_Borderless_Small
        const val Widget_Holo_Light_Button_Inset = android.R.style.Widget_Holo_Light_Button_Inset
        const val Widget_Holo_Light_Button_Small = android.R.style.Widget_Holo_Light_Button_Small
        const val Widget_Holo_Light_Button_Toggle = android.R.style.Widget_Holo_Light_Button_Toggle
        const val Widget_Holo_Light_CalendarView = android.R.style.Widget_Holo_Light_CalendarView
        const val Widget_Holo_Light_CheckedTextView = android.R.style.Widget_Holo_Light_CheckedTextView
        const val Widget_Holo_Light_CompoundButton_CheckBox = android.R.style.Widget_Holo_Light_CompoundButton_CheckBox
        const val Widget_Holo_Light_CompoundButton_RadioButton = android.R.style.Widget_Holo_Light_CompoundButton_RadioButton
        const val Widget_Holo_Light_CompoundButton_Star = android.R.style.Widget_Holo_Light_CompoundButton_Star
        const val Widget_Holo_Light_DropDownItem = android.R.style.Widget_Holo_Light_DropDownItem
        const val Widget_Holo_Light_DropDownItem_Spinner = android.R.style.Widget_Holo_Light_DropDownItem_Spinner
        const val Widget_Holo_Light_EditText = android.R.style.Widget_Holo_Light_EditText
        const val Widget_Holo_Light_ExpandableListView = android.R.style.Widget_Holo_Light_ExpandableListView
        const val Widget_Holo_Light_GridView = android.R.style.Widget_Holo_Light_GridView
        const val Widget_Holo_Light_HorizontalScrollView = android.R.style.Widget_Holo_Light_HorizontalScrollView
        const val Widget_Holo_Light_ImageButton = android.R.style.Widget_Holo_Light_ImageButton
        const val Widget_Holo_Light_ListPopupWindow = android.R.style.Widget_Holo_Light_ListPopupWindow
        const val Widget_Holo_Light_ListView = android.R.style.Widget_Holo_Light_ListView
        const val Widget_Holo_Light_ListView_DropDown = android.R.style.Widget_Holo_Light_ListView_DropDown
        const val Widget_Holo_Light_MediaRouteButton = android.R.style.Widget_Holo_Light_MediaRouteButton
        const val Widget_Holo_Light_PopupMenu = android.R.style.Widget_Holo_Light_PopupMenu
        const val Widget_Holo_Light_PopupWindow = android.R.style.Widget_Holo_Light_PopupWindow
        const val Widget_Holo_Light_ProgressBar = android.R.style.Widget_Holo_Light_ProgressBar
        const val Widget_Holo_Light_ProgressBar_Horizontal = android.R.style.Widget_Holo_Light_ProgressBar_Horizontal
        const val Widget_Holo_Light_ProgressBar_Inverse = android.R.style.Widget_Holo_Light_ProgressBar_Inverse
        const val Widget_Holo_Light_ProgressBar_Large = android.R.style.Widget_Holo_Light_ProgressBar_Large
        const val Widget_Holo_Light_ProgressBar_Large_Inverse = android.R.style.Widget_Holo_Light_ProgressBar_Large_Inverse
        const val Widget_Holo_Light_ProgressBar_Small = android.R.style.Widget_Holo_Light_ProgressBar_Small
        const val Widget_Holo_Light_ProgressBar_Small_Inverse = android.R.style.Widget_Holo_Light_ProgressBar_Small_Inverse
        const val Widget_Holo_Light_ProgressBar_Small_Title = android.R.style.Widget_Holo_Light_ProgressBar_Small_Title
        const val Widget_Holo_Light_RatingBar = android.R.style.Widget_Holo_Light_RatingBar
        const val Widget_Holo_Light_RatingBar_Indicator = android.R.style.Widget_Holo_Light_RatingBar_Indicator
        const val Widget_Holo_Light_RatingBar_Small = android.R.style.Widget_Holo_Light_RatingBar_Small
        const val Widget_Holo_Light_ScrollView = android.R.style.Widget_Holo_Light_ScrollView
        const val Widget_Holo_Light_SeekBar = android.R.style.Widget_Holo_Light_SeekBar
        const val Widget_Holo_Light_Spinner = android.R.style.Widget_Holo_Light_Spinner
        const val Widget_Holo_Light_Tab = android.R.style.Widget_Holo_Light_Tab
        const val Widget_Holo_Light_TabWidget = android.R.style.Widget_Holo_Light_TabWidget
        const val Widget_Holo_Light_TextView = android.R.style.Widget_Holo_Light_TextView
        const val Widget_Holo_Light_TextView_SpinnerItem = android.R.style.Widget_Holo_Light_TextView_SpinnerItem
        const val Widget_Holo_Light_WebTextView = android.R.style.Widget_Holo_Light_WebTextView
        const val Widget_Holo_Light_WebView = android.R.style.Widget_Holo_Light_WebView
        const val Widget_Holo_ListPopupWindow = android.R.style.Widget_Holo_ListPopupWindow
        const val Widget_Holo_ListView = android.R.style.Widget_Holo_ListView
        const val Widget_Holo_ListView_DropDown = android.R.style.Widget_Holo_ListView_DropDown
        const val Widget_Holo_MediaRouteButton = android.R.style.Widget_Holo_MediaRouteButton
        const val Widget_Holo_PopupMenu = android.R.style.Widget_Holo_PopupMenu
        const val Widget_Holo_PopupWindow = android.R.style.Widget_Holo_PopupWindow
        const val Widget_Holo_ProgressBar = android.R.style.Widget_Holo_ProgressBar
        const val Widget_Holo_ProgressBar_Horizontal = android.R.style.Widget_Holo_ProgressBar_Horizontal
        const val Widget_Holo_ProgressBar_Large = android.R.style.Widget_Holo_ProgressBar_Large
        const val Widget_Holo_ProgressBar_Small = android.R.style.Widget_Holo_ProgressBar_Small
        const val Widget_Holo_ProgressBar_Small_Title = android.R.style.Widget_Holo_ProgressBar_Small_Title
        const val Widget_Holo_RatingBar = android.R.style.Widget_Holo_RatingBar
        const val Widget_Holo_RatingBar_Indicator = android.R.style.Widget_Holo_RatingBar_Indicator
        const val Widget_Holo_RatingBar_Small = android.R.style.Widget_Holo_RatingBar_Small
        const val Widget_Holo_ScrollView = android.R.style.Widget_Holo_ScrollView
        const val Widget_Holo_SeekBar = android.R.style.Widget_Holo_SeekBar
        const val Widget_Holo_Spinner = android.R.style.Widget_Holo_Spinner
        const val Widget_Holo_Tab = android.R.style.Widget_Holo_Tab
        const val Widget_Holo_TabWidget = android.R.style.Widget_Holo_TabWidget
        const val Widget_Holo_TextView = android.R.style.Widget_Holo_TextView
        const val Widget_Holo_TextView_SpinnerItem = android.R.style.Widget_Holo_TextView_SpinnerItem
        const val Widget_Holo_WebTextView = android.R.style.Widget_Holo_WebTextView
        const val Widget_Holo_WebView = android.R.style.Widget_Holo_WebView
        const val Widget_ImageButton = android.R.style.Widget_ImageButton
        const val Widget_ImageWell = android.R.style.Widget_ImageWell

        @Deprecated
        const val Widget_KeyboardView = android.R.style.Widget_KeyboardView
        const val Widget_ListPopupWindow = android.R.style.Widget_ListPopupWindow
        const val Widget_ListView = android.R.style.Widget_ListView
        const val Widget_ListView_DropDown = android.R.style.Widget_ListView_DropDown
        const val Widget_ListView_Menu = android.R.style.Widget_ListView_Menu
        const val Widget_ListView_White = android.R.style.Widget_ListView_White
        const val Widget_Material = android.R.style.Widget_Material
        const val Widget_Material_ActionBar = android.R.style.Widget_Material_ActionBar
        const val Widget_Material_ActionBar_Solid = android.R.style.Widget_Material_ActionBar_Solid
        const val Widget_Material_ActionBar_TabBar = android.R.style.Widget_Material_ActionBar_TabBar
        const val Widget_Material_ActionBar_TabText = android.R.style.Widget_Material_ActionBar_TabText
        const val Widget_Material_ActionBar_TabView = android.R.style.Widget_Material_ActionBar_TabView
        const val Widget_Material_ActionButton = android.R.style.Widget_Material_ActionButton
        const val Widget_Material_ActionButton_CloseMode = android.R.style.Widget_Material_ActionButton_CloseMode
        const val Widget_Material_ActionButton_Overflow = android.R.style.Widget_Material_ActionButton_Overflow
        const val Widget_Material_ActionMode = android.R.style.Widget_Material_ActionMode
        const val Widget_Material_AutoCompleteTextView = android.R.style.Widget_Material_AutoCompleteTextView
        const val Widget_Material_Button = android.R.style.Widget_Material_Button
        const val Widget_Material_ButtonBar = android.R.style.Widget_Material_ButtonBar
        const val Widget_Material_ButtonBar_AlertDialog = android.R.style.Widget_Material_ButtonBar_AlertDialog
        const val Widget_Material_Button_Borderless = android.R.style.Widget_Material_Button_Borderless
        const val Widget_Material_Button_Borderless_Colored = android.R.style.Widget_Material_Button_Borderless_Colored
        const val Widget_Material_Button_Borderless_Small = android.R.style.Widget_Material_Button_Borderless_Small
        const val Widget_Material_Button_Colored = android.R.style.Widget_Material_Button_Colored
        const val Widget_Material_Button_Inset = android.R.style.Widget_Material_Button_Inset
        const val Widget_Material_Button_Small = android.R.style.Widget_Material_Button_Small
        const val Widget_Material_Button_Toggle = android.R.style.Widget_Material_Button_Toggle
        const val Widget_Material_CalendarView = android.R.style.Widget_Material_CalendarView
        const val Widget_Material_CheckedTextView = android.R.style.Widget_Material_CheckedTextView
        const val Widget_Material_CompoundButton_CheckBox = android.R.style.Widget_Material_CompoundButton_CheckBox
        const val Widget_Material_CompoundButton_RadioButton = android.R.style.Widget_Material_CompoundButton_RadioButton
        const val Widget_Material_CompoundButton_Star = android.R.style.Widget_Material_CompoundButton_Star
        const val Widget_Material_CompoundButton_Switch = android.R.style.Widget_Material_CompoundButton_Switch
        const val Widget_Material_DatePicker = android.R.style.Widget_Material_DatePicker
        const val Widget_Material_DropDownItem = android.R.style.Widget_Material_DropDownItem
        const val Widget_Material_DropDownItem_Spinner = android.R.style.Widget_Material_DropDownItem_Spinner
        const val Widget_Material_EditText = android.R.style.Widget_Material_EditText
        const val Widget_Material_ExpandableListView = android.R.style.Widget_Material_ExpandableListView
        const val Widget_Material_FastScroll = android.R.style.Widget_Material_FastScroll
        const val Widget_Material_GridView = android.R.style.Widget_Material_GridView
        const val Widget_Material_HorizontalScrollView = android.R.style.Widget_Material_HorizontalScrollView
        const val Widget_Material_ImageButton = android.R.style.Widget_Material_ImageButton
        const val Widget_Material_Light = android.R.style.Widget_Material_Light
        const val Widget_Material_Light_ActionBar = android.R.style.Widget_Material_Light_ActionBar
        const val Widget_Material_Light_ActionBar_Solid = android.R.style.Widget_Material_Light_ActionBar_Solid
        const val Widget_Material_Light_ActionBar_TabBar = android.R.style.Widget_Material_Light_ActionBar_TabBar
        const val Widget_Material_Light_ActionBar_TabText = android.R.style.Widget_Material_Light_ActionBar_TabText
        const val Widget_Material_Light_ActionBar_TabView = android.R.style.Widget_Material_Light_ActionBar_TabView
        const val Widget_Material_Light_ActionButton = android.R.style.Widget_Material_Light_ActionButton
        const val Widget_Material_Light_ActionButton_CloseMode = android.R.style.Widget_Material_Light_ActionButton_CloseMode
        const val Widget_Material_Light_ActionButton_Overflow = android.R.style.Widget_Material_Light_ActionButton_Overflow
        const val Widget_Material_Light_ActionMode = android.R.style.Widget_Material_Light_ActionMode
        const val Widget_Material_Light_AutoCompleteTextView = android.R.style.Widget_Material_Light_AutoCompleteTextView
        const val Widget_Material_Light_Button = android.R.style.Widget_Material_Light_Button
        const val Widget_Material_Light_ButtonBar = android.R.style.Widget_Material_Light_ButtonBar
        const val Widget_Material_Light_ButtonBar_AlertDialog = android.R.style.Widget_Material_Light_ButtonBar_AlertDialog
        const val Widget_Material_Light_Button_Borderless = android.R.style.Widget_Material_Light_Button_Borderless
        const val Widget_Material_Light_Button_Borderless_Colored = android.R.style.Widget_Material_Light_Button_Borderless_Colored
        const val Widget_Material_Light_Button_Borderless_Small = android.R.style.Widget_Material_Light_Button_Borderless_Small
        const val Widget_Material_Light_Button_Inset = android.R.style.Widget_Material_Light_Button_Inset
        const val Widget_Material_Light_Button_Small = android.R.style.Widget_Material_Light_Button_Small
        const val Widget_Material_Light_Button_Toggle = android.R.style.Widget_Material_Light_Button_Toggle
        const val Widget_Material_Light_CalendarView = android.R.style.Widget_Material_Light_CalendarView
        const val Widget_Material_Light_CheckedTextView = android.R.style.Widget_Material_Light_CheckedTextView
        const val Widget_Material_Light_CompoundButton_CheckBox = android.R.style.Widget_Material_Light_CompoundButton_CheckBox
        const val Widget_Material_Light_CompoundButton_RadioButton = android.R.style.Widget_Material_Light_CompoundButton_RadioButton
        const val Widget_Material_Light_CompoundButton_Star = android.R.style.Widget_Material_Light_CompoundButton_Star
        const val Widget_Material_Light_CompoundButton_Switch = android.R.style.Widget_Material_Light_CompoundButton_Switch
        const val Widget_Material_Light_DatePicker = android.R.style.Widget_Material_Light_DatePicker
        const val Widget_Material_Light_DropDownItem = android.R.style.Widget_Material_Light_DropDownItem
        const val Widget_Material_Light_DropDownItem_Spinner = android.R.style.Widget_Material_Light_DropDownItem_Spinner
        const val Widget_Material_Light_EditText = android.R.style.Widget_Material_Light_EditText
        const val Widget_Material_Light_ExpandableListView = android.R.style.Widget_Material_Light_ExpandableListView
        const val Widget_Material_Light_FastScroll = android.R.style.Widget_Material_Light_FastScroll
        const val Widget_Material_Light_GridView = android.R.style.Widget_Material_Light_GridView
        const val Widget_Material_Light_HorizontalScrollView = android.R.style.Widget_Material_Light_HorizontalScrollView
        const val Widget_Material_Light_ImageButton = android.R.style.Widget_Material_Light_ImageButton
        const val Widget_Material_Light_ListPopupWindow = android.R.style.Widget_Material_Light_ListPopupWindow
        const val Widget_Material_Light_ListView = android.R.style.Widget_Material_Light_ListView
        const val Widget_Material_Light_ListView_DropDown = android.R.style.Widget_Material_Light_ListView_DropDown
        const val Widget_Material_Light_MediaRouteButton = android.R.style.Widget_Material_Light_MediaRouteButton
        const val Widget_Material_Light_NumberPicker = android.R.style.Widget_Material_Light_NumberPicker
        const val Widget_Material_Light_PopupMenu = android.R.style.Widget_Material_Light_PopupMenu
        const val Widget_Material_Light_PopupMenu_Overflow = android.R.style.Widget_Material_Light_PopupMenu_Overflow
        const val Widget_Material_Light_PopupWindow = android.R.style.Widget_Material_Light_PopupWindow
        const val Widget_Material_Light_ProgressBar = android.R.style.Widget_Material_Light_ProgressBar
        const val Widget_Material_Light_ProgressBar_Horizontal = android.R.style.Widget_Material_Light_ProgressBar_Horizontal
        const val Widget_Material_Light_ProgressBar_Inverse = android.R.style.Widget_Material_Light_ProgressBar_Inverse
        const val Widget_Material_Light_ProgressBar_Large = android.R.style.Widget_Material_Light_ProgressBar_Large
        const val Widget_Material_Light_ProgressBar_Large_Inverse = android.R.style.Widget_Material_Light_ProgressBar_Large_Inverse
        const val Widget_Material_Light_ProgressBar_Small = android.R.style.Widget_Material_Light_ProgressBar_Small
        const val Widget_Material_Light_ProgressBar_Small_Inverse = android.R.style.Widget_Material_Light_ProgressBar_Small_Inverse
        const val Widget_Material_Light_ProgressBar_Small_Title = android.R.style.Widget_Material_Light_ProgressBar_Small_Title
        const val Widget_Material_Light_RatingBar = android.R.style.Widget_Material_Light_RatingBar
        const val Widget_Material_Light_RatingBar_Indicator = android.R.style.Widget_Material_Light_RatingBar_Indicator
        const val Widget_Material_Light_RatingBar_Small = android.R.style.Widget_Material_Light_RatingBar_Small
        const val Widget_Material_Light_ScrollView = android.R.style.Widget_Material_Light_ScrollView
        const val Widget_Material_Light_SearchView = android.R.style.Widget_Material_Light_SearchView
        const val Widget_Material_Light_SeekBar = android.R.style.Widget_Material_Light_SeekBar
        const val Widget_Material_Light_SegmentedButton = android.R.style.Widget_Material_Light_SegmentedButton
        const val Widget_Material_Light_Spinner = android.R.style.Widget_Material_Light_Spinner
        const val Widget_Material_Light_Spinner_Underlined = android.R.style.Widget_Material_Light_Spinner_Underlined
        const val Widget_Material_Light_StackView = android.R.style.Widget_Material_Light_StackView
        const val Widget_Material_Light_Tab = android.R.style.Widget_Material_Light_Tab
        const val Widget_Material_Light_TabWidget = android.R.style.Widget_Material_Light_TabWidget
        const val Widget_Material_Light_TextView = android.R.style.Widget_Material_Light_TextView
        const val Widget_Material_Light_TextView_SpinnerItem = android.R.style.Widget_Material_Light_TextView_SpinnerItem
        const val Widget_Material_Light_TimePicker = android.R.style.Widget_Material_Light_TimePicker
        const val Widget_Material_Light_WebTextView = android.R.style.Widget_Material_Light_WebTextView
        const val Widget_Material_Light_WebView = android.R.style.Widget_Material_Light_WebView
        const val Widget_Material_ListPopupWindow = android.R.style.Widget_Material_ListPopupWindow
        const val Widget_Material_ListView = android.R.style.Widget_Material_ListView
        const val Widget_Material_ListView_DropDown = android.R.style.Widget_Material_ListView_DropDown
        const val Widget_Material_MediaRouteButton = android.R.style.Widget_Material_MediaRouteButton
        const val Widget_Material_NumberPicker = android.R.style.Widget_Material_NumberPicker
        const val Widget_Material_PopupMenu = android.R.style.Widget_Material_PopupMenu
        const val Widget_Material_PopupMenu_Overflow = android.R.style.Widget_Material_PopupMenu_Overflow
        const val Widget_Material_PopupWindow = android.R.style.Widget_Material_PopupWindow
        const val Widget_Material_ProgressBar = android.R.style.Widget_Material_ProgressBar
        const val Widget_Material_ProgressBar_Horizontal = android.R.style.Widget_Material_ProgressBar_Horizontal
        const val Widget_Material_ProgressBar_Large = android.R.style.Widget_Material_ProgressBar_Large
        const val Widget_Material_ProgressBar_Small = android.R.style.Widget_Material_ProgressBar_Small
        const val Widget_Material_ProgressBar_Small_Title = android.R.style.Widget_Material_ProgressBar_Small_Title
        const val Widget_Material_RatingBar = android.R.style.Widget_Material_RatingBar
        const val Widget_Material_RatingBar_Indicator = android.R.style.Widget_Material_RatingBar_Indicator
        const val Widget_Material_RatingBar_Small = android.R.style.Widget_Material_RatingBar_Small
        const val Widget_Material_ScrollView = android.R.style.Widget_Material_ScrollView
        const val Widget_Material_SearchView = android.R.style.Widget_Material_SearchView
        const val Widget_Material_SeekBar = android.R.style.Widget_Material_SeekBar
        const val Widget_Material_SeekBar_Discrete = android.R.style.Widget_Material_SeekBar_Discrete
        const val Widget_Material_SegmentedButton = android.R.style.Widget_Material_SegmentedButton
        const val Widget_Material_Spinner = android.R.style.Widget_Material_Spinner
        const val Widget_Material_Spinner_Underlined = android.R.style.Widget_Material_Spinner_Underlined
        const val Widget_Material_StackView = android.R.style.Widget_Material_StackView
        const val Widget_Material_Tab = android.R.style.Widget_Material_Tab
        const val Widget_Material_TabWidget = android.R.style.Widget_Material_TabWidget
        const val Widget_Material_TextView = android.R.style.Widget_Material_TextView
        const val Widget_Material_TextView_SpinnerItem = android.R.style.Widget_Material_TextView_SpinnerItem
        const val Widget_Material_TimePicker = android.R.style.Widget_Material_TimePicker
        const val Widget_Material_Toolbar = android.R.style.Widget_Material_Toolbar
        const val Widget_Material_Toolbar_Button_Navigation = android.R.style.Widget_Material_Toolbar_Button_Navigation
        const val Widget_Material_WebTextView = android.R.style.Widget_Material_WebTextView
        const val Widget_Material_WebView = android.R.style.Widget_Material_WebView
        const val Widget_PopupMenu = android.R.style.Widget_PopupMenu
        const val Widget_PopupWindow = android.R.style.Widget_PopupWindow
        const val Widget_ProgressBar = android.R.style.Widget_ProgressBar
        const val Widget_ProgressBar_Horizontal = android.R.style.Widget_ProgressBar_Horizontal
        const val Widget_ProgressBar_Inverse = android.R.style.Widget_ProgressBar_Inverse
        const val Widget_ProgressBar_Large = android.R.style.Widget_ProgressBar_Large
        const val Widget_ProgressBar_Large_Inverse = android.R.style.Widget_ProgressBar_Large_Inverse
        const val Widget_ProgressBar_Small = android.R.style.Widget_ProgressBar_Small
        const val Widget_ProgressBar_Small_Inverse = android.R.style.Widget_ProgressBar_Small_Inverse
        const val Widget_RatingBar = android.R.style.Widget_RatingBar
        const val Widget_ScrollView = android.R.style.Widget_ScrollView
        const val Widget_SeekBar = android.R.style.Widget_SeekBar
        const val Widget_Spinner = android.R.style.Widget_Spinner
        const val Widget_Spinner_DropDown = android.R.style.Widget_Spinner_DropDown
        const val Widget_StackView = android.R.style.Widget_StackView
        const val Widget_TabWidget = android.R.style.Widget_TabWidget
        const val Widget_TextView = android.R.style.Widget_TextView
        const val Widget_TextView_PopupMenu = android.R.style.Widget_TextView_PopupMenu
        const val Widget_TextView_SpinnerItem = android.R.style.Widget_TextView_SpinnerItem
        const val Widget_Toolbar = android.R.style.Widget_Toolbar
        const val Widget_Toolbar_Button_Navigation = android.R.style.Widget_Toolbar_Button_Navigation
        const val Widget_WebView = android.R.style.Widget_WebView
    }

    object transition {
        const val explode = android.R.transition.explode
        const val fade = android.R.transition.fade
        const val move = android.R.transition.move
        const val no_transition = android.R.transition.no_transition
        const val slide_bottom = android.R.transition.slide_bottom
        const val slide_left = android.R.transition.slide_left
        const val slide_right = android.R.transition.slide_right
        const val slide_top = android.R.transition.slide_top
    }

    object xml {
    }
}