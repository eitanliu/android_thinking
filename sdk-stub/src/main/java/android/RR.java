package android;

import java.lang.reflect.Field;

public final class RR {
    public RR() {
        throw new RuntimeException("Stub!");
    }

    public int getR(String type, String name) {
        try {
            Class<?> clazz = Class.forName("android.R$" + type);
            Field f = clazz.getField(name);
            return f.getInt(null);
        } catch (Throwable ignored) {
        }
        return 0;
    }

    public static final class anim {
        public static final int accelerate_decelerate_interpolator = android.R.anim.accelerate_decelerate_interpolator;
        public static final int accelerate_interpolator = android.R.anim.accelerate_interpolator;
        public static final int anticipate_interpolator = android.R.anim.anticipate_interpolator;
        public static final int anticipate_overshoot_interpolator = android.R.anim.anticipate_overshoot_interpolator;
        public static final int bounce_interpolator = android.R.anim.bounce_interpolator;
        public static final int cycle_interpolator = android.R.anim.cycle_interpolator;
        public static final int decelerate_interpolator = android.R.anim.decelerate_interpolator;
        public static final int fade_in = android.R.anim.fade_in;
        public static final int fade_out = android.R.anim.fade_out;
        public static final int linear_interpolator = android.R.anim.linear_interpolator;
        public static final int overshoot_interpolator = android.R.anim.overshoot_interpolator;
        public static final int slide_in_left = android.R.anim.slide_in_left;
        public static final int slide_out_right = android.R.anim.slide_out_right;

        public anim() {
            throw new RuntimeException("Stub!");
        }
    }

    public static final class animator {
        public static final int fade_in = android.R.animator.fade_in;
        public static final int fade_out = android.R.animator.fade_out;

        public animator() {
            throw new RuntimeException("Stub!");
        }
    }

    public static final class array {
        public static final int emailAddressTypes = android.R.array.emailAddressTypes;
        public static final int imProtocols = android.R.array.imProtocols;
        public static final int organizationTypes = android.R.array.organizationTypes;
        public static final int phoneTypes = android.R.array.phoneTypes;
        public static final int postalAddressTypes = android.R.array.postalAddressTypes;

        public array() {
            throw new RuntimeException("Stub!");
        }
    }

    public static final class attr {
        public static final int absListViewStyle = android.R.attr.absListViewStyle;
        public static final int accessibilityDataSensitive = android.R.attr.accessibilityDataSensitive;
        public static final int accessibilityEventTypes = android.R.attr.accessibilityEventTypes;
        public static final int accessibilityFeedbackType = android.R.attr.accessibilityFeedbackType;
        public static final int accessibilityFlags = android.R.attr.accessibilityFlags;
        public static final int accessibilityHeading = android.R.attr.accessibilityHeading;
        public static final int accessibilityLiveRegion = android.R.attr.accessibilityLiveRegion;
        public static final int accessibilityPaneTitle = android.R.attr.accessibilityPaneTitle;
        public static final int accessibilityTraversalAfter = android.R.attr.accessibilityTraversalAfter;
        public static final int accessibilityTraversalBefore = android.R.attr.accessibilityTraversalBefore;
        public static final int accountPreferences = android.R.attr.accountPreferences;
        public static final int accountType = android.R.attr.accountType;
        public static final int action = android.R.attr.action;
        public static final int actionBarDivider = android.R.attr.actionBarDivider;
        public static final int actionBarItemBackground = android.R.attr.actionBarItemBackground;
        public static final int actionBarPopupTheme = android.R.attr.actionBarPopupTheme;
        public static final int actionBarSize = android.R.attr.actionBarSize;
        public static final int actionBarSplitStyle = android.R.attr.actionBarSplitStyle;
        public static final int actionBarStyle = android.R.attr.actionBarStyle;
        public static final int actionBarTabBarStyle = android.R.attr.actionBarTabBarStyle;
        public static final int actionBarTabStyle = android.R.attr.actionBarTabStyle;
        public static final int actionBarTabTextStyle = android.R.attr.actionBarTabTextStyle;
        public static final int actionBarTheme = android.R.attr.actionBarTheme;
        public static final int actionBarWidgetTheme = android.R.attr.actionBarWidgetTheme;
        public static final int actionButtonStyle = android.R.attr.actionButtonStyle;
        public static final int actionDropDownStyle = android.R.attr.actionDropDownStyle;
        public static final int actionLayout = android.R.attr.actionLayout;
        public static final int actionMenuTextAppearance = android.R.attr.actionMenuTextAppearance;
        public static final int actionMenuTextColor = android.R.attr.actionMenuTextColor;
        public static final int actionModeBackground = android.R.attr.actionModeBackground;
        public static final int actionModeCloseButtonStyle = android.R.attr.actionModeCloseButtonStyle;
        public static final int actionModeCloseDrawable = android.R.attr.actionModeCloseDrawable;
        public static final int actionModeCopyDrawable = android.R.attr.actionModeCopyDrawable;
        public static final int actionModeCutDrawable = android.R.attr.actionModeCutDrawable;
        public static final int actionModeFindDrawable = android.R.attr.actionModeFindDrawable;
        public static final int actionModePasteDrawable = android.R.attr.actionModePasteDrawable;
        public static final int actionModeSelectAllDrawable = android.R.attr.actionModeSelectAllDrawable;
        public static final int actionModeShareDrawable = android.R.attr.actionModeShareDrawable;
        public static final int actionModeSplitBackground = android.R.attr.actionModeSplitBackground;
        public static final int actionModeStyle = android.R.attr.actionModeStyle;
        public static final int actionModeWebSearchDrawable = android.R.attr.actionModeWebSearchDrawable;
        public static final int actionOverflowButtonStyle = android.R.attr.actionOverflowButtonStyle;
        public static final int actionOverflowMenuStyle = android.R.attr.actionOverflowMenuStyle;
        public static final int actionProviderClass = android.R.attr.actionProviderClass;
        public static final int actionViewClass = android.R.attr.actionViewClass;
        public static final int activatedBackgroundIndicator = android.R.attr.activatedBackgroundIndicator;
        public static final int activityCloseEnterAnimation = android.R.attr.activityCloseEnterAnimation;
        public static final int activityCloseExitAnimation = android.R.attr.activityCloseExitAnimation;
        public static final int activityOpenEnterAnimation = android.R.attr.activityOpenEnterAnimation;
        public static final int activityOpenExitAnimation = android.R.attr.activityOpenExitAnimation;
        public static final int addPrintersActivity = android.R.attr.addPrintersActivity;
        public static final int addStatesFromChildren = android.R.attr.addStatesFromChildren;
        public static final int adjustViewBounds = android.R.attr.adjustViewBounds;
        public static final int advancedPrintOptionsActivity = android.R.attr.advancedPrintOptionsActivity;
        public static final int alertDialogIcon = android.R.attr.alertDialogIcon;
        public static final int alertDialogStyle = android.R.attr.alertDialogStyle;
        public static final int alertDialogTheme = android.R.attr.alertDialogTheme;
        public static final int alignmentMode = android.R.attr.alignmentMode;
        public static final int allContactsName = android.R.attr.allContactsName;
        public static final int allow = android.R.attr.allow;
        public static final int allowAudioPlaybackCapture = android.R.attr.allowAudioPlaybackCapture;
        public static final int allowBackup = android.R.attr.allowBackup;
        public static final int allowClearUserData = android.R.attr.allowClearUserData;
        public static final int allowClickWhenDisabled = android.R.attr.allowClickWhenDisabled;
        public static final int allowCrossUidActivitySwitchFromBelow = android.R.attr.allowCrossUidActivitySwitchFromBelow;
        public static final int allowEmbedded = android.R.attr.allowEmbedded;
        public static final int allowGameAngleDriver = android.R.attr.allowGameAngleDriver;
        public static final int allowGameDownscaling = android.R.attr.allowGameDownscaling;
        public static final int allowGameFpsOverride = android.R.attr.allowGameFpsOverride;
        public static final int allowNativeHeapPointerTagging = android.R.attr.allowNativeHeapPointerTagging;
        public static final int allowParallelSyncs = android.R.attr.allowParallelSyncs;
        public static final int allowSharedIsolatedProcess = android.R.attr.allowSharedIsolatedProcess;
        public static final int allowSingleTap = android.R.attr.allowSingleTap;
        public static final int allowTaskReparenting = android.R.attr.allowTaskReparenting;
        public static final int allowUndo = android.R.attr.allowUndo;
        public static final int allowUntrustedActivityEmbedding = android.R.attr.allowUntrustedActivityEmbedding;
        public static final int allowUpdateOwnership = android.R.attr.allowUpdateOwnership;
        public static final int alpha = android.R.attr.alpha;
        public static final int alphabeticModifiers = android.R.attr.alphabeticModifiers;
        public static final int alphabeticShortcut = android.R.attr.alphabeticShortcut;
        public static final int alwaysDrawnWithCache = android.R.attr.alwaysDrawnWithCache;
        public static final int alwaysRetainTaskState = android.R.attr.alwaysRetainTaskState;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int amPmBackgroundColor = android.R.attr.amPmBackgroundColor;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int amPmTextColor = android.R.attr.amPmTextColor;
        public static final int ambientShadowAlpha = android.R.attr.ambientShadowAlpha;
        public static final int angle = android.R.attr.angle;
        public static final int animateFirstView = android.R.attr.animateFirstView;
        public static final int animateLayoutChanges = android.R.attr.animateLayoutChanges;
        public static final int animateOnClick = android.R.attr.animateOnClick;
        public static final int animatedImageDrawable = android.R.attr.animatedImageDrawable;
        public static final int animation = android.R.attr.animation;
        public static final int animationCache = android.R.attr.animationCache;
        public static final int animationDuration = android.R.attr.animationDuration;
        public static final int animationOrder = android.R.attr.animationOrder;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int animationResolution = android.R.attr.animationResolution;
        public static final int antialias = android.R.attr.antialias;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int anyDensity = android.R.attr.anyDensity;
        public static final int apduServiceBanner = android.R.attr.apduServiceBanner;
        public static final int apiKey = android.R.attr.apiKey;
        public static final int appCategory = android.R.attr.appCategory;
        public static final int appComponentFactory = android.R.attr.appComponentFactory;
        public static final int attributionTags = android.R.attr.attributionTags;
        public static final int attributionsAreUserVisible = android.R.attr.attributionsAreUserVisible;
        public static final int author = android.R.attr.author;
        public static final int authorities = android.R.attr.authorities;
        public static final int autoAdvanceViewId = android.R.attr.autoAdvanceViewId;
        public static final int autoCompleteTextViewStyle = android.R.attr.autoCompleteTextViewStyle;
        public static final int autoHandwritingEnabled = android.R.attr.autoHandwritingEnabled;
        public static final int autoLink = android.R.attr.autoLink;
        public static final int autoMirrored = android.R.attr.autoMirrored;
        public static final int autoRemoveFromRecents = android.R.attr.autoRemoveFromRecents;
        public static final int autoRevokePermissions = android.R.attr.autoRevokePermissions;
        public static final int autoSizeMaxTextSize = android.R.attr.autoSizeMaxTextSize;
        public static final int autoSizeMinTextSize = android.R.attr.autoSizeMinTextSize;
        public static final int autoSizePresetSizes = android.R.attr.autoSizePresetSizes;
        public static final int autoSizeStepGranularity = android.R.attr.autoSizeStepGranularity;
        public static final int autoSizeTextType = android.R.attr.autoSizeTextType;
        public static final int autoStart = android.R.attr.autoStart;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int autoText = android.R.attr.autoText;
        public static final int autoTransact = android.R.attr.autoTransact;
        public static final int autoUrlDetect = android.R.attr.autoUrlDetect;
        public static final int autoVerify = android.R.attr.autoVerify;
        public static final int autofillHints = android.R.attr.autofillHints;
        public static final int autofilledHighlight = android.R.attr.autofilledHighlight;
        public static final int backdropColor = android.R.attr.backdropColor;
        public static final int background = android.R.attr.background;
        public static final int backgroundDimAmount = android.R.attr.backgroundDimAmount;
        public static final int backgroundDimEnabled = android.R.attr.backgroundDimEnabled;
        public static final int backgroundSplit = android.R.attr.backgroundSplit;
        public static final int backgroundStacked = android.R.attr.backgroundStacked;
        public static final int backgroundTint = android.R.attr.backgroundTint;
        public static final int backgroundTintMode = android.R.attr.backgroundTintMode;
        public static final int backupAgent = android.R.attr.backupAgent;
        public static final int backupInForeground = android.R.attr.backupInForeground;
        public static final int banner = android.R.attr.banner;
        public static final int baseline = android.R.attr.baseline;
        public static final int baselineAlignBottom = android.R.attr.baselineAlignBottom;
        public static final int baselineAligned = android.R.attr.baselineAligned;
        public static final int baselineAlignedChildIndex = android.R.attr.baselineAlignedChildIndex;
        public static final int bitmap = android.R.attr.bitmap;
        public static final int borderlessButtonStyle = android.R.attr.borderlessButtonStyle;
        public static final int bottom = android.R.attr.bottom;
        public static final int bottomBright = android.R.attr.bottomBright;
        public static final int bottomDark = android.R.attr.bottomDark;
        public static final int bottomLeftRadius = android.R.attr.bottomLeftRadius;
        public static final int bottomMedium = android.R.attr.bottomMedium;
        public static final int bottomOffset = android.R.attr.bottomOffset;
        public static final int bottomRightRadius = android.R.attr.bottomRightRadius;
        public static final int breadCrumbShortTitle = android.R.attr.breadCrumbShortTitle;
        public static final int breadCrumbTitle = android.R.attr.breadCrumbTitle;
        public static final int breakStrategy = android.R.attr.breakStrategy;
        public static final int bufferType = android.R.attr.bufferType;
        public static final int button = android.R.attr.button;
        public static final int buttonBarButtonStyle = android.R.attr.buttonBarButtonStyle;
        public static final int buttonBarNegativeButtonStyle = android.R.attr.buttonBarNegativeButtonStyle;
        public static final int buttonBarNeutralButtonStyle = android.R.attr.buttonBarNeutralButtonStyle;
        public static final int buttonBarPositiveButtonStyle = android.R.attr.buttonBarPositiveButtonStyle;
        public static final int buttonBarStyle = android.R.attr.buttonBarStyle;
        public static final int buttonCornerRadius = android.R.attr.buttonCornerRadius;
        public static final int buttonGravity = android.R.attr.buttonGravity;
        public static final int buttonStyle = android.R.attr.buttonStyle;
        public static final int buttonStyleInset = android.R.attr.buttonStyleInset;
        public static final int buttonStyleSmall = android.R.attr.buttonStyleSmall;
        public static final int buttonStyleToggle = android.R.attr.buttonStyleToggle;
        public static final int buttonTint = android.R.attr.buttonTint;
        public static final int buttonTintMode = android.R.attr.buttonTintMode;
        public static final int cacheColorHint = android.R.attr.cacheColorHint;
        public static final int calendarTextColor = android.R.attr.calendarTextColor;
        public static final int calendarViewShown = android.R.attr.calendarViewShown;
        public static final int calendarViewStyle = android.R.attr.calendarViewStyle;
        public static final int canControlMagnification = android.R.attr.canControlMagnification;
        public static final int canDisplayOnRemoteDevices = android.R.attr.canDisplayOnRemoteDevices;
        public static final int canPauseRecording = android.R.attr.canPauseRecording;
        public static final int canPerformGestures = android.R.attr.canPerformGestures;
        public static final int canRecord = android.R.attr.canRecord;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int canRequestEnhancedWebAccessibility = android.R.attr.canRequestEnhancedWebAccessibility;
        public static final int canRequestFilterKeyEvents = android.R.attr.canRequestFilterKeyEvents;
        public static final int canRequestFingerprintGestures = android.R.attr.canRequestFingerprintGestures;
        public static final int canRequestTouchExplorationMode = android.R.attr.canRequestTouchExplorationMode;
        public static final int canRetrieveWindowContent = android.R.attr.canRetrieveWindowContent;
        public static final int canTakeScreenshot = android.R.attr.canTakeScreenshot;
        public static final int candidatesTextStyleSpans = android.R.attr.candidatesTextStyleSpans;
        public static final int cantSaveState = android.R.attr.cantSaveState;
        public static final int capability = android.R.attr.capability;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int capitalize = android.R.attr.capitalize;
        public static final int category = android.R.attr.category;
        public static final int centerBright = android.R.attr.centerBright;
        public static final int centerColor = android.R.attr.centerColor;
        public static final int centerDark = android.R.attr.centerDark;
        public static final int centerMedium = android.R.attr.centerMedium;
        public static final int centerX = android.R.attr.centerX;
        public static final int centerY = android.R.attr.centerY;
        public static final int certDigest = android.R.attr.certDigest;
        public static final int checkBoxPreferenceStyle = android.R.attr.checkBoxPreferenceStyle;
        public static final int checkMark = android.R.attr.checkMark;
        public static final int checkMarkTint = android.R.attr.checkMarkTint;
        public static final int checkMarkTintMode = android.R.attr.checkMarkTintMode;
        public static final int checkable = android.R.attr.checkable;
        public static final int checkableBehavior = android.R.attr.checkableBehavior;
        public static final int checkboxStyle = android.R.attr.checkboxStyle;
        public static final int checked = android.R.attr.checked;
        public static final int checkedButton = android.R.attr.checkedButton;
        public static final int checkedTextViewStyle = android.R.attr.checkedTextViewStyle;
        public static final int childDivider = android.R.attr.childDivider;
        public static final int childIndicator = android.R.attr.childIndicator;
        public static final int childIndicatorEnd = android.R.attr.childIndicatorEnd;
        public static final int childIndicatorLeft = android.R.attr.childIndicatorLeft;
        public static final int childIndicatorRight = android.R.attr.childIndicatorRight;
        public static final int childIndicatorStart = android.R.attr.childIndicatorStart;
        public static final int choiceMode = android.R.attr.choiceMode;
        public static final int classLoader = android.R.attr.classLoader;
        public static final int clearTaskOnLaunch = android.R.attr.clearTaskOnLaunch;
        public static final int clickable = android.R.attr.clickable;
        public static final int clipChildren = android.R.attr.clipChildren;
        public static final int clipOrientation = android.R.attr.clipOrientation;
        public static final int clipToOutline = android.R.attr.clipToOutline;
        public static final int clipToPadding = android.R.attr.clipToPadding;
        public static final int closeIcon = android.R.attr.closeIcon;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int codes = android.R.attr.codes;
        public static final int collapseColumns = android.R.attr.collapseColumns;
        public static final int collapseContentDescription = android.R.attr.collapseContentDescription;
        public static final int collapseIcon = android.R.attr.collapseIcon;
        public static final int color = android.R.attr.color;
        public static final int colorAccent = android.R.attr.colorAccent;
        public static final int colorActivatedHighlight = android.R.attr.colorActivatedHighlight;
        public static final int colorBackground = android.R.attr.colorBackground;
        public static final int colorBackgroundCacheHint = android.R.attr.colorBackgroundCacheHint;
        public static final int colorBackgroundFloating = android.R.attr.colorBackgroundFloating;
        public static final int colorButtonNormal = android.R.attr.colorButtonNormal;
        public static final int colorControlActivated = android.R.attr.colorControlActivated;
        public static final int colorControlHighlight = android.R.attr.colorControlHighlight;
        public static final int colorControlNormal = android.R.attr.colorControlNormal;
        public static final int colorEdgeEffect = android.R.attr.colorEdgeEffect;
        public static final int colorError = android.R.attr.colorError;
        public static final int colorFocusedHighlight = android.R.attr.colorFocusedHighlight;
        public static final int colorForeground = android.R.attr.colorForeground;
        public static final int colorForegroundInverse = android.R.attr.colorForegroundInverse;
        public static final int colorLongPressedHighlight = android.R.attr.colorLongPressedHighlight;
        public static final int colorMode = android.R.attr.colorMode;
        public static final int colorMultiSelectHighlight = android.R.attr.colorMultiSelectHighlight;
        public static final int colorPressedHighlight = android.R.attr.colorPressedHighlight;
        public static final int colorPrimary = android.R.attr.colorPrimary;
        public static final int colorPrimaryDark = android.R.attr.colorPrimaryDark;
        public static final int colorSecondary = android.R.attr.colorSecondary;
        public static final int columnCount = android.R.attr.columnCount;
        public static final int columnDelay = android.R.attr.columnDelay;
        public static final int columnOrderPreserved = android.R.attr.columnOrderPreserved;
        public static final int columnWidth = android.R.attr.columnWidth;
        public static final int commitIcon = android.R.attr.commitIcon;
        public static final int compatibleWidthLimitDp = android.R.attr.compatibleWidthLimitDp;
        public static final int completionHint = android.R.attr.completionHint;
        public static final int completionHintView = android.R.attr.completionHintView;
        public static final int completionThreshold = android.R.attr.completionThreshold;
        public static final int configChanges = android.R.attr.configChanges;
        public static final int configure = android.R.attr.configure;
        public static final int constantSize = android.R.attr.constantSize;
        public static final int content = android.R.attr.content;
        public static final int contentAgeHint = android.R.attr.contentAgeHint;
        public static final int contentAuthority = android.R.attr.contentAuthority;
        public static final int contentDescription = android.R.attr.contentDescription;
        public static final int contentInsetEnd = android.R.attr.contentInsetEnd;
        public static final int contentInsetEndWithActions = android.R.attr.contentInsetEndWithActions;
        public static final int contentInsetLeft = android.R.attr.contentInsetLeft;
        public static final int contentInsetRight = android.R.attr.contentInsetRight;
        public static final int contentInsetStart = android.R.attr.contentInsetStart;
        public static final int contentInsetStartWithNavigation = android.R.attr.contentInsetStartWithNavigation;
        public static final int contentSensitivity = android.R.attr.contentSensitivity;
        public static final int contextClickable = android.R.attr.contextClickable;
        public static final int contextDescription = android.R.attr.contextDescription;
        public static final int contextPopupMenuStyle = android.R.attr.contextPopupMenuStyle;
        public static final int contextUri = android.R.attr.contextUri;
        public static final int controlX1 = android.R.attr.controlX1;
        public static final int controlX2 = android.R.attr.controlX2;
        public static final int controlY1 = android.R.attr.controlY1;
        public static final int controlY2 = android.R.attr.controlY2;
        public static final int countDown = android.R.attr.countDown;
        public static final int country = android.R.attr.country;
        public static final int cropToPadding = android.R.attr.cropToPadding;
        public static final int crossProfile = android.R.attr.crossProfile;
        public static final int cursorVisible = android.R.attr.cursorVisible;
        public static final int customNavigationLayout = android.R.attr.customNavigationLayout;
        public static final int customTokens = android.R.attr.customTokens;
        public static final int cycles = android.R.attr.cycles;
        public static final int dashGap = android.R.attr.dashGap;
        public static final int dashWidth = android.R.attr.dashWidth;
        public static final int data = android.R.attr.data;
        public static final int dataExtractionRules = android.R.attr.dataExtractionRules;
        public static final int datePickerDialogTheme = android.R.attr.datePickerDialogTheme;
        public static final int datePickerMode = android.R.attr.datePickerMode;
        public static final int datePickerStyle = android.R.attr.datePickerStyle;
        public static final int dateTextAppearance = android.R.attr.dateTextAppearance;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int dayOfWeekBackground = android.R.attr.dayOfWeekBackground;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int dayOfWeekTextAppearance = android.R.attr.dayOfWeekTextAppearance;
        public static final int debuggable = android.R.attr.debuggable;
        public static final int defaultFocusHighlightEnabled = android.R.attr.defaultFocusHighlightEnabled;
        public static final int defaultHeight = android.R.attr.defaultHeight;
        public static final int defaultLocale = android.R.attr.defaultLocale;
        public static final int defaultToDeviceProtectedStorage = android.R.attr.defaultToDeviceProtectedStorage;
        public static final int defaultValue = android.R.attr.defaultValue;
        public static final int defaultWidth = android.R.attr.defaultWidth;
        public static final int delay = android.R.attr.delay;
        public static final int dependency = android.R.attr.dependency;
        public static final int descendantFocusability = android.R.attr.descendantFocusability;
        public static final int description = android.R.attr.description;
        public static final int detachWallpaper = android.R.attr.detachWallpaper;
        public static final int detailColumn = android.R.attr.detailColumn;
        public static final int detailSocialSummary = android.R.attr.detailSocialSummary;
        public static final int detailsElementBackground = android.R.attr.detailsElementBackground;
        public static final int dial = android.R.attr.dial;
        public static final int dialTint = android.R.attr.dialTint;
        public static final int dialTintMode = android.R.attr.dialTintMode;
        public static final int dialogCornerRadius = android.R.attr.dialogCornerRadius;
        public static final int dialogIcon = android.R.attr.dialogIcon;
        public static final int dialogLayout = android.R.attr.dialogLayout;
        public static final int dialogMessage = android.R.attr.dialogMessage;
        public static final int dialogPreferenceStyle = android.R.attr.dialogPreferenceStyle;
        public static final int dialogPreferredPadding = android.R.attr.dialogPreferredPadding;
        public static final int dialogTheme = android.R.attr.dialogTheme;
        public static final int dialogTitle = android.R.attr.dialogTitle;
        public static final int digits = android.R.attr.digits;
        public static final int directBootAware = android.R.attr.directBootAware;
        public static final int direction = android.R.attr.direction;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int directionDescriptions = android.R.attr.directionDescriptions;
        public static final int directionPriority = android.R.attr.directionPriority;
        public static final int disableDependentsState = android.R.attr.disableDependentsState;
        public static final int disabledAlpha = android.R.attr.disabledAlpha;
        public static final int displayOptions = android.R.attr.displayOptions;
        public static final int dither = android.R.attr.dither;
        public static final int divider = android.R.attr.divider;
        public static final int dividerHeight = android.R.attr.dividerHeight;
        public static final int dividerHorizontal = android.R.attr.dividerHorizontal;
        public static final int dividerPadding = android.R.attr.dividerPadding;
        public static final int dividerVertical = android.R.attr.dividerVertical;
        public static final int documentLaunchMode = android.R.attr.documentLaunchMode;
        public static final int drawSelectorOnTop = android.R.attr.drawSelectorOnTop;
        public static final int drawable = android.R.attr.drawable;
        public static final int drawableBottom = android.R.attr.drawableBottom;
        public static final int drawableEnd = android.R.attr.drawableEnd;
        public static final int drawableLeft = android.R.attr.drawableLeft;
        public static final int drawablePadding = android.R.attr.drawablePadding;
        public static final int drawableRight = android.R.attr.drawableRight;
        public static final int drawableStart = android.R.attr.drawableStart;
        public static final int drawableTint = android.R.attr.drawableTint;
        public static final int drawableTintMode = android.R.attr.drawableTintMode;
        public static final int drawableTop = android.R.attr.drawableTop;
        public static final int drawingCacheQuality = android.R.attr.drawingCacheQuality;
        public static final int dropDownAnchor = android.R.attr.dropDownAnchor;
        public static final int dropDownHeight = android.R.attr.dropDownHeight;
        public static final int dropDownHintAppearance = android.R.attr.dropDownHintAppearance;
        public static final int dropDownHorizontalOffset = android.R.attr.dropDownHorizontalOffset;
        public static final int dropDownItemStyle = android.R.attr.dropDownItemStyle;
        public static final int dropDownListViewStyle = android.R.attr.dropDownListViewStyle;
        public static final int dropDownSelector = android.R.attr.dropDownSelector;
        public static final int dropDownSpinnerStyle = android.R.attr.dropDownSpinnerStyle;
        public static final int dropDownVerticalOffset = android.R.attr.dropDownVerticalOffset;
        public static final int dropDownWidth = android.R.attr.dropDownWidth;
        public static final int duplicateParentState = android.R.attr.duplicateParentState;
        public static final int duration = android.R.attr.duration;
        public static final int editTextBackground = android.R.attr.editTextBackground;
        public static final int editTextColor = android.R.attr.editTextColor;
        public static final int editTextPreferenceStyle = android.R.attr.editTextPreferenceStyle;
        public static final int editTextStyle = android.R.attr.editTextStyle;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int editable = android.R.attr.editable;
        public static final int editorExtras = android.R.attr.editorExtras;
        public static final int effectColor = android.R.attr.effectColor;
        public static final int elegantTextHeight = android.R.attr.elegantTextHeight;
        public static final int elevation = android.R.attr.elevation;
        public static final int ellipsize = android.R.attr.ellipsize;
        public static final int ems = android.R.attr.ems;
        public static final int enableOnBackInvokedCallback = android.R.attr.enableOnBackInvokedCallback;
        public static final int enableTextStylingShortcuts = android.R.attr.enableTextStylingShortcuts;
        public static final int enableVrMode = android.R.attr.enableVrMode;
        public static final int enabled = android.R.attr.enabled;
        public static final int end = android.R.attr.end;
        public static final int endColor = android.R.attr.endColor;
        public static final int endX = android.R.attr.endX;
        public static final int endY = android.R.attr.endY;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int endYear = android.R.attr.endYear;
        public static final int enforceNavigationBarContrast = android.R.attr.enforceNavigationBarContrast;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int enforceStatusBarContrast = android.R.attr.enforceStatusBarContrast;
        public static final int enterFadeDuration = android.R.attr.enterFadeDuration;
        public static final int entries = android.R.attr.entries;
        public static final int entryValues = android.R.attr.entryValues;
        public static final int eventsInterceptionEnabled = android.R.attr.eventsInterceptionEnabled;
        public static final int excludeClass = android.R.attr.excludeClass;
        public static final int excludeFromRecents = android.R.attr.excludeFromRecents;
        public static final int excludeId = android.R.attr.excludeId;
        public static final int excludeName = android.R.attr.excludeName;
        public static final int exitFadeDuration = android.R.attr.exitFadeDuration;
        public static final int expandableListPreferredChildIndicatorLeft = android.R.attr.expandableListPreferredChildIndicatorLeft;
        public static final int expandableListPreferredChildIndicatorRight = android.R.attr.expandableListPreferredChildIndicatorRight;
        public static final int expandableListPreferredChildPaddingLeft = android.R.attr.expandableListPreferredChildPaddingLeft;
        public static final int expandableListPreferredItemIndicatorLeft = android.R.attr.expandableListPreferredItemIndicatorLeft;
        public static final int expandableListPreferredItemIndicatorRight = android.R.attr.expandableListPreferredItemIndicatorRight;
        public static final int expandableListPreferredItemPaddingLeft = android.R.attr.expandableListPreferredItemPaddingLeft;
        public static final int expandableListViewStyle = android.R.attr.expandableListViewStyle;
        public static final int expandableListViewWhiteStyle = android.R.attr.expandableListViewWhiteStyle;
        public static final int exported = android.R.attr.exported;
        public static final int externalService = android.R.attr.externalService;
        public static final int extraTension = android.R.attr.extraTension;
        public static final int extractNativeLibs = android.R.attr.extractNativeLibs;
        public static final int factor = android.R.attr.factor;
        public static final int fadeDuration = android.R.attr.fadeDuration;
        public static final int fadeEnabled = android.R.attr.fadeEnabled;
        public static final int fadeOffset = android.R.attr.fadeOffset;
        public static final int fadeScrollbars = android.R.attr.fadeScrollbars;
        public static final int fadingEdge = android.R.attr.fadingEdge;
        public static final int fadingEdgeLength = android.R.attr.fadingEdgeLength;
        public static final int fadingMode = android.R.attr.fadingMode;
        public static final int fallbackLineSpacing = android.R.attr.fallbackLineSpacing;
        public static final int fastScrollAlwaysVisible = android.R.attr.fastScrollAlwaysVisible;
        public static final int fastScrollEnabled = android.R.attr.fastScrollEnabled;
        public static final int fastScrollOverlayPosition = android.R.attr.fastScrollOverlayPosition;
        public static final int fastScrollPreviewBackgroundLeft = android.R.attr.fastScrollPreviewBackgroundLeft;
        public static final int fastScrollPreviewBackgroundRight = android.R.attr.fastScrollPreviewBackgroundRight;
        public static final int fastScrollStyle = android.R.attr.fastScrollStyle;
        public static final int fastScrollTextColor = android.R.attr.fastScrollTextColor;
        public static final int fastScrollThumbDrawable = android.R.attr.fastScrollThumbDrawable;
        public static final int fastScrollTrackDrawable = android.R.attr.fastScrollTrackDrawable;
        public static final int fillAfter = android.R.attr.fillAfter;
        public static final int fillAlpha = android.R.attr.fillAlpha;
        public static final int fillBefore = android.R.attr.fillBefore;
        public static final int fillColor = android.R.attr.fillColor;
        public static final int fillEnabled = android.R.attr.fillEnabled;
        public static final int fillType = android.R.attr.fillType;
        public static final int fillViewport = android.R.attr.fillViewport;
        public static final int filter = android.R.attr.filter;
        public static final int filterTouchesWhenObscured = android.R.attr.filterTouchesWhenObscured;
        public static final int fingerprintAuthDrawable = android.R.attr.fingerprintAuthDrawable;
        public static final int finishOnCloseSystemDialogs = android.R.attr.finishOnCloseSystemDialogs;
        public static final int finishOnTaskLaunch = android.R.attr.finishOnTaskLaunch;
        public static final int firstBaselineToTopHeight = android.R.attr.firstBaselineToTopHeight;
        public static final int firstDayOfWeek = android.R.attr.firstDayOfWeek;
        public static final int fitsSystemWindows = android.R.attr.fitsSystemWindows;
        public static final int flipInterval = android.R.attr.flipInterval;
        public static final int focusable = android.R.attr.focusable;
        public static final int focusableInTouchMode = android.R.attr.focusableInTouchMode;
        public static final int focusedByDefault = android.R.attr.focusedByDefault;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int focusedMonthDateColor = android.R.attr.focusedMonthDateColor;
        public static final int focusedSearchResultHighlightColor = android.R.attr.focusedSearchResultHighlightColor;
        public static final int font = android.R.attr.font;
        public static final int fontFamily = android.R.attr.fontFamily;
        public static final int fontFeatureSettings = android.R.attr.fontFeatureSettings;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int fontProviderAuthority = android.R.attr.fontProviderAuthority;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int fontProviderCerts = android.R.attr.fontProviderCerts;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int fontProviderPackage = android.R.attr.fontProviderPackage;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int fontProviderQuery = android.R.attr.fontProviderQuery;
        public static final int fontProviderSystemFontFamily = android.R.attr.fontProviderSystemFontFamily;
        public static final int fontStyle = android.R.attr.fontStyle;
        public static final int fontVariationSettings = android.R.attr.fontVariationSettings;
        public static final int fontWeight = android.R.attr.fontWeight;
        public static final int footerDividersEnabled = android.R.attr.footerDividersEnabled;
        public static final int forceDarkAllowed = android.R.attr.forceDarkAllowed;
        public static final int forceHasOverlappingRendering = android.R.attr.forceHasOverlappingRendering;
        public static final int forceQueryable = android.R.attr.forceQueryable;
        public static final int forceUriPermissions = android.R.attr.forceUriPermissions;
        public static final int foreground = android.R.attr.foreground;
        public static final int foregroundGravity = android.R.attr.foregroundGravity;
        public static final int foregroundServiceType = android.R.attr.foregroundServiceType;
        public static final int foregroundTint = android.R.attr.foregroundTint;
        public static final int foregroundTintMode = android.R.attr.foregroundTintMode;
        public static final int format = android.R.attr.format;
        public static final int format12Hour = android.R.attr.format12Hour;
        public static final int format24Hour = android.R.attr.format24Hour;
        public static final int fraction = android.R.attr.fraction;
        public static final int fragment = android.R.attr.fragment;
        public static final int fragmentAdvancedPattern = android.R.attr.fragmentAdvancedPattern;
        public static final int fragmentAllowEnterTransitionOverlap = android.R.attr.fragmentAllowEnterTransitionOverlap;
        public static final int fragmentAllowReturnTransitionOverlap = android.R.attr.fragmentAllowReturnTransitionOverlap;
        public static final int fragmentCloseEnterAnimation = android.R.attr.fragmentCloseEnterAnimation;
        public static final int fragmentCloseExitAnimation = android.R.attr.fragmentCloseExitAnimation;
        public static final int fragmentEnterTransition = android.R.attr.fragmentEnterTransition;
        public static final int fragmentExitTransition = android.R.attr.fragmentExitTransition;
        public static final int fragmentFadeEnterAnimation = android.R.attr.fragmentFadeEnterAnimation;
        public static final int fragmentFadeExitAnimation = android.R.attr.fragmentFadeExitAnimation;
        public static final int fragmentOpenEnterAnimation = android.R.attr.fragmentOpenEnterAnimation;
        public static final int fragmentOpenExitAnimation = android.R.attr.fragmentOpenExitAnimation;
        public static final int fragmentPattern = android.R.attr.fragmentPattern;
        public static final int fragmentPrefix = android.R.attr.fragmentPrefix;
        public static final int fragmentReenterTransition = android.R.attr.fragmentReenterTransition;
        public static final int fragmentReturnTransition = android.R.attr.fragmentReturnTransition;
        public static final int fragmentSharedElementEnterTransition = android.R.attr.fragmentSharedElementEnterTransition;
        public static final int fragmentSharedElementReturnTransition = android.R.attr.fragmentSharedElementReturnTransition;
        public static final int fragmentSuffix = android.R.attr.fragmentSuffix;
        public static final int freezesText = android.R.attr.freezesText;
        public static final int fromAlpha = android.R.attr.fromAlpha;
        public static final int fromDegrees = android.R.attr.fromDegrees;
        public static final int fromExtendBottom = android.R.attr.fromExtendBottom;
        public static final int fromExtendLeft = android.R.attr.fromExtendLeft;
        public static final int fromExtendRight = android.R.attr.fromExtendRight;
        public static final int fromExtendTop = android.R.attr.fromExtendTop;
        public static final int fromId = android.R.attr.fromId;
        public static final int fromScene = android.R.attr.fromScene;
        public static final int fromXDelta = android.R.attr.fromXDelta;
        public static final int fromXScale = android.R.attr.fromXScale;
        public static final int fromYDelta = android.R.attr.fromYDelta;
        public static final int fromYScale = android.R.attr.fromYScale;
        public static final int fullBackupContent = android.R.attr.fullBackupContent;
        public static final int fullBackupOnly = android.R.attr.fullBackupOnly;
        public static final int fullBright = android.R.attr.fullBright;
        public static final int fullDark = android.R.attr.fullDark;
        public static final int functionalTest = android.R.attr.functionalTest;
        public static final int galleryItemBackground = android.R.attr.galleryItemBackground;
        public static final int galleryStyle = android.R.attr.galleryStyle;
        public static final int gestureColor = android.R.attr.gestureColor;
        public static final int gestureStrokeAngleThreshold = android.R.attr.gestureStrokeAngleThreshold;
        public static final int gestureStrokeLengthThreshold = android.R.attr.gestureStrokeLengthThreshold;
        public static final int gestureStrokeSquarenessThreshold = android.R.attr.gestureStrokeSquarenessThreshold;
        public static final int gestureStrokeType = android.R.attr.gestureStrokeType;
        public static final int gestureStrokeWidth = android.R.attr.gestureStrokeWidth;
        public static final int glEsVersion = android.R.attr.glEsVersion;
        public static final int goIcon = android.R.attr.goIcon;
        public static final int gradientRadius = android.R.attr.gradientRadius;
        public static final int grantUriPermissions = android.R.attr.grantUriPermissions;
        public static final int gravity = android.R.attr.gravity;
        public static final int gridViewStyle = android.R.attr.gridViewStyle;
        public static final int groupIndicator = android.R.attr.groupIndicator;
        public static final int gwpAsanMode = android.R.attr.gwpAsanMode;
        public static final int hand_hour = android.R.attr.hand_hour;
        public static final int hand_hourTint = android.R.attr.hand_hourTint;
        public static final int hand_hourTintMode = android.R.attr.hand_hourTintMode;
        public static final int hand_minute = android.R.attr.hand_minute;
        public static final int hand_minuteTint = android.R.attr.hand_minuteTint;
        public static final int hand_minuteTintMode = android.R.attr.hand_minuteTintMode;
        public static final int hand_second = android.R.attr.hand_second;
        public static final int hand_secondTint = android.R.attr.hand_secondTint;
        public static final int hand_secondTintMode = android.R.attr.hand_secondTintMode;
        public static final int handle = android.R.attr.handle;
        public static final int handleProfiling = android.R.attr.handleProfiling;
        public static final int handwritingBoundsOffsetBottom = android.R.attr.handwritingBoundsOffsetBottom;
        public static final int handwritingBoundsOffsetLeft = android.R.attr.handwritingBoundsOffsetLeft;
        public static final int handwritingBoundsOffsetRight = android.R.attr.handwritingBoundsOffsetRight;
        public static final int handwritingBoundsOffsetTop = android.R.attr.handwritingBoundsOffsetTop;
        public static final int hapticFeedbackEnabled = android.R.attr.hapticFeedbackEnabled;
        public static final int hardwareAccelerated = android.R.attr.hardwareAccelerated;
        public static final int hasCode = android.R.attr.hasCode;
        public static final int hasFragileUserData = android.R.attr.hasFragileUserData;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int headerAmPmTextAppearance = android.R.attr.headerAmPmTextAppearance;
        public static final int headerBackground = android.R.attr.headerBackground;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int headerDayOfMonthTextAppearance = android.R.attr.headerDayOfMonthTextAppearance;
        public static final int headerDividersEnabled = android.R.attr.headerDividersEnabled;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int headerMonthTextAppearance = android.R.attr.headerMonthTextAppearance;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int headerTimeTextAppearance = android.R.attr.headerTimeTextAppearance;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int headerYearTextAppearance = android.R.attr.headerYearTextAppearance;
        public static final int height = android.R.attr.height;
        public static final int hideOnContentScroll = android.R.attr.hideOnContentScroll;
        public static final int hint = android.R.attr.hint;
        public static final int homeAsUpIndicator = android.R.attr.homeAsUpIndicator;
        public static final int homeLayout = android.R.attr.homeLayout;
        public static final int horizontalDivider = android.R.attr.horizontalDivider;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int horizontalGap = android.R.attr.horizontalGap;
        public static final int horizontalScrollViewStyle = android.R.attr.horizontalScrollViewStyle;
        public static final int horizontalSpacing = android.R.attr.horizontalSpacing;
        public static final int host = android.R.attr.host;
        public static final int hotSpotX = android.R.attr.hotSpotX;
        public static final int hotSpotY = android.R.attr.hotSpotY;
        public static final int htmlDescription = android.R.attr.htmlDescription;
        public static final int hyphenationFrequency = android.R.attr.hyphenationFrequency;
        public static final int icon = android.R.attr.icon;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int iconPreview = android.R.attr.iconPreview;
        public static final int iconSpaceReserved = android.R.attr.iconSpaceReserved;
        public static final int iconTint = android.R.attr.iconTint;
        public static final int iconTintMode = android.R.attr.iconTintMode;
        public static final int iconifiedByDefault = android.R.attr.iconifiedByDefault;
        public static final int id = android.R.attr.id;
        public static final int identifier = android.R.attr.identifier;
        public static final int ignoreGravity = android.R.attr.ignoreGravity;
        public static final int imageButtonStyle = android.R.attr.imageButtonStyle;
        public static final int imageWellStyle = android.R.attr.imageWellStyle;
        public static final int imeActionId = android.R.attr.imeActionId;
        public static final int imeActionLabel = android.R.attr.imeActionLabel;
        public static final int imeExtractEnterAnimation = android.R.attr.imeExtractEnterAnimation;
        public static final int imeExtractExitAnimation = android.R.attr.imeExtractExitAnimation;
        public static final int imeFullscreenBackground = android.R.attr.imeFullscreenBackground;
        public static final int imeOptions = android.R.attr.imeOptions;
        public static final int imeSubtypeExtraValue = android.R.attr.imeSubtypeExtraValue;
        public static final int imeSubtypeLocale = android.R.attr.imeSubtypeLocale;
        public static final int imeSubtypeMode = android.R.attr.imeSubtypeMode;
        public static final int immersive = android.R.attr.immersive;
        public static final int importantForAccessibility = android.R.attr.importantForAccessibility;
        public static final int importantForAutofill = android.R.attr.importantForAutofill;
        public static final int importantForContentCapture = android.R.attr.importantForContentCapture;
        public static final int inAnimation = android.R.attr.inAnimation;
        public static final int includeFontPadding = android.R.attr.includeFontPadding;
        public static final int includeInGlobalSearch = android.R.attr.includeInGlobalSearch;
        public static final int indeterminate = android.R.attr.indeterminate;
        public static final int indeterminateBehavior = android.R.attr.indeterminateBehavior;
        public static final int indeterminateDrawable = android.R.attr.indeterminateDrawable;
        public static final int indeterminateDuration = android.R.attr.indeterminateDuration;
        public static final int indeterminateOnly = android.R.attr.indeterminateOnly;
        public static final int indeterminateProgressStyle = android.R.attr.indeterminateProgressStyle;
        public static final int indeterminateTint = android.R.attr.indeterminateTint;
        public static final int indeterminateTintMode = android.R.attr.indeterminateTintMode;
        public static final int indicatorEnd = android.R.attr.indicatorEnd;
        public static final int indicatorLeft = android.R.attr.indicatorLeft;
        public static final int indicatorRight = android.R.attr.indicatorRight;
        public static final int indicatorStart = android.R.attr.indicatorStart;
        public static final int inflatedId = android.R.attr.inflatedId;
        public static final int inheritShowWhenLocked = android.R.attr.inheritShowWhenLocked;
        public static final int initOrder = android.R.attr.initOrder;
        public static final int initialKeyguardLayout = android.R.attr.initialKeyguardLayout;
        public static final int initialLayout = android.R.attr.initialLayout;
        public static final int innerRadius = android.R.attr.innerRadius;
        public static final int innerRadiusRatio = android.R.attr.innerRadiusRatio;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int inputMethod = android.R.attr.inputMethod;
        public static final int inputType = android.R.attr.inputType;
        public static final int inset = android.R.attr.inset;
        public static final int insetBottom = android.R.attr.insetBottom;
        public static final int insetLeft = android.R.attr.insetLeft;
        public static final int insetRight = android.R.attr.insetRight;
        public static final int insetTop = android.R.attr.insetTop;
        public static final int installLocation = android.R.attr.installLocation;
        public static final int interactiveUiTimeout = android.R.attr.interactiveUiTimeout;
        public static final int interpolator = android.R.attr.interpolator;
        public static final int intro = android.R.attr.intro;
        public static final int isAccessibilityTool = android.R.attr.isAccessibilityTool;
        public static final int isAlwaysSyncable = android.R.attr.isAlwaysSyncable;
        public static final int isAsciiCapable = android.R.attr.isAsciiCapable;
        public static final int isAuxiliary = android.R.attr.isAuxiliary;
        public static final int isCredential = android.R.attr.isCredential;
        public static final int isDefault = android.R.attr.isDefault;
        public static final int isFeatureSplit = android.R.attr.isFeatureSplit;
        public static final int isGame = android.R.attr.isGame;
        public static final int isIndicator = android.R.attr.isIndicator;
        public static final int isLightTheme = android.R.attr.isLightTheme;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int isModifier = android.R.attr.isModifier;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int isRepeatable = android.R.attr.isRepeatable;
        public static final int isScrollContainer = android.R.attr.isScrollContainer;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int isSplitRequired = android.R.attr.isSplitRequired;
        public static final int isStatic = android.R.attr.isStatic;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int isSticky = android.R.attr.isSticky;
        public static final int isolatedProcess = android.R.attr.isolatedProcess;
        public static final int isolatedSplits = android.R.attr.isolatedSplits;
        public static final int itemBackground = android.R.attr.itemBackground;
        public static final int itemIconDisabledAlpha = android.R.attr.itemIconDisabledAlpha;
        public static final int itemPadding = android.R.attr.itemPadding;
        public static final int itemTextAppearance = android.R.attr.itemTextAppearance;
        public static final int justificationMode = android.R.attr.justificationMode;
        public static final int keepScreenOn = android.R.attr.keepScreenOn;
        public static final int key = android.R.attr.key;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int keyBackground = android.R.attr.keyBackground;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int keyEdgeFlags = android.R.attr.keyEdgeFlags;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int keyHeight = android.R.attr.keyHeight;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int keyIcon = android.R.attr.keyIcon;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int keyLabel = android.R.attr.keyLabel;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int keyOutputText = android.R.attr.keyOutputText;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int keyPreviewHeight = android.R.attr.keyPreviewHeight;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int keyPreviewLayout = android.R.attr.keyPreviewLayout;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int keyPreviewOffset = android.R.attr.keyPreviewOffset;
        public static final int keySet = android.R.attr.keySet;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int keyTextColor = android.R.attr.keyTextColor;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int keyTextSize = android.R.attr.keyTextSize;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int keyWidth = android.R.attr.keyWidth;
        public static final int keyboardLayout = android.R.attr.keyboardLayout;
        public static final int keyboardLayoutType = android.R.attr.keyboardLayoutType;
        public static final int keyboardLocale = android.R.attr.keyboardLocale;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int keyboardMode = android.R.attr.keyboardMode;
        public static final int keyboardNavigationCluster = android.R.attr.keyboardNavigationCluster;
        public static final int keycode = android.R.attr.keycode;
        public static final int killAfterRestore = android.R.attr.killAfterRestore;
        public static final int knownActivityEmbeddingCerts = android.R.attr.knownActivityEmbeddingCerts;
        public static final int knownCerts = android.R.attr.knownCerts;
        public static final int lStar = android.R.attr.lStar;
        public static final int label = android.R.attr.label;
        public static final int labelFor = android.R.attr.labelFor;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int labelTextSize = android.R.attr.labelTextSize;
        public static final int languageTag = android.R.attr.languageTag;
        public static final int largeHeap = android.R.attr.largeHeap;
        public static final int largeScreens = android.R.attr.largeScreens;
        public static final int largestWidthLimitDp = android.R.attr.largestWidthLimitDp;
        public static final int lastBaselineToBottomHeight = android.R.attr.lastBaselineToBottomHeight;
        public static final int launchMode = android.R.attr.launchMode;
        public static final int launchTaskBehindSourceAnimation = android.R.attr.launchTaskBehindSourceAnimation;
        public static final int launchTaskBehindTargetAnimation = android.R.attr.launchTaskBehindTargetAnimation;
        public static final int layerType = android.R.attr.layerType;
        public static final int layout = android.R.attr.layout;
        public static final int layoutAnimation = android.R.attr.layoutAnimation;
        public static final int layoutDirection = android.R.attr.layoutDirection;
        public static final int layoutMode = android.R.attr.layoutMode;
        public static final int layout_above = android.R.attr.layout_above;
        public static final int layout_alignBaseline = android.R.attr.layout_alignBaseline;
        public static final int layout_alignBottom = android.R.attr.layout_alignBottom;
        public static final int layout_alignEnd = android.R.attr.layout_alignEnd;
        public static final int layout_alignLeft = android.R.attr.layout_alignLeft;
        public static final int layout_alignParentBottom = android.R.attr.layout_alignParentBottom;
        public static final int layout_alignParentEnd = android.R.attr.layout_alignParentEnd;
        public static final int layout_alignParentLeft = android.R.attr.layout_alignParentLeft;
        public static final int layout_alignParentRight = android.R.attr.layout_alignParentRight;
        public static final int layout_alignParentStart = android.R.attr.layout_alignParentStart;
        public static final int layout_alignParentTop = android.R.attr.layout_alignParentTop;
        public static final int layout_alignRight = android.R.attr.layout_alignRight;
        public static final int layout_alignStart = android.R.attr.layout_alignStart;
        public static final int layout_alignTop = android.R.attr.layout_alignTop;
        public static final int layout_alignWithParentIfMissing = android.R.attr.layout_alignWithParentIfMissing;
        public static final int layout_below = android.R.attr.layout_below;
        public static final int layout_centerHorizontal = android.R.attr.layout_centerHorizontal;
        public static final int layout_centerInParent = android.R.attr.layout_centerInParent;
        public static final int layout_centerVertical = android.R.attr.layout_centerVertical;
        public static final int layout_column = android.R.attr.layout_column;
        public static final int layout_columnSpan = android.R.attr.layout_columnSpan;
        public static final int layout_columnWeight = android.R.attr.layout_columnWeight;
        public static final int layout_gravity = android.R.attr.layout_gravity;
        public static final int layout_height = android.R.attr.layout_height;
        public static final int layout_margin = android.R.attr.layout_margin;
        public static final int layout_marginBottom = android.R.attr.layout_marginBottom;
        public static final int layout_marginEnd = android.R.attr.layout_marginEnd;
        public static final int layout_marginHorizontal = android.R.attr.layout_marginHorizontal;
        public static final int layout_marginLeft = android.R.attr.layout_marginLeft;
        public static final int layout_marginRight = android.R.attr.layout_marginRight;
        public static final int layout_marginStart = android.R.attr.layout_marginStart;
        public static final int layout_marginTop = android.R.attr.layout_marginTop;
        public static final int layout_marginVertical = android.R.attr.layout_marginVertical;
        public static final int layout_row = android.R.attr.layout_row;
        public static final int layout_rowSpan = android.R.attr.layout_rowSpan;
        public static final int layout_rowWeight = android.R.attr.layout_rowWeight;
        public static final int layout_scale = android.R.attr.layout_scale;
        public static final int layout_span = android.R.attr.layout_span;
        public static final int layout_toEndOf = android.R.attr.layout_toEndOf;
        public static final int layout_toLeftOf = android.R.attr.layout_toLeftOf;
        public static final int layout_toRightOf = android.R.attr.layout_toRightOf;
        public static final int layout_toStartOf = android.R.attr.layout_toStartOf;
        public static final int layout_weight = android.R.attr.layout_weight;
        public static final int layout_width = android.R.attr.layout_width;
        public static final int layout_x = android.R.attr.layout_x;
        public static final int layout_y = android.R.attr.layout_y;
        public static final int left = android.R.attr.left;
        public static final int letterSpacing = android.R.attr.letterSpacing;
        public static final int level = android.R.attr.level;
        public static final int lineBreakStyle = android.R.attr.lineBreakStyle;
        public static final int lineBreakWordStyle = android.R.attr.lineBreakWordStyle;
        public static final int lineHeight = android.R.attr.lineHeight;
        public static final int lineSpacingExtra = android.R.attr.lineSpacingExtra;
        public static final int lineSpacingMultiplier = android.R.attr.lineSpacingMultiplier;
        public static final int lines = android.R.attr.lines;
        public static final int linksClickable = android.R.attr.linksClickable;
        public static final int listChoiceBackgroundIndicator = android.R.attr.listChoiceBackgroundIndicator;
        public static final int listChoiceIndicatorMultiple = android.R.attr.listChoiceIndicatorMultiple;
        public static final int listChoiceIndicatorSingle = android.R.attr.listChoiceIndicatorSingle;
        public static final int listDivider = android.R.attr.listDivider;
        public static final int listDividerAlertDialog = android.R.attr.listDividerAlertDialog;
        public static final int listMenuViewStyle = android.R.attr.listMenuViewStyle;
        public static final int listPopupWindowStyle = android.R.attr.listPopupWindowStyle;
        public static final int listPreferredItemHeight = android.R.attr.listPreferredItemHeight;
        public static final int listPreferredItemHeightLarge = android.R.attr.listPreferredItemHeightLarge;
        public static final int listPreferredItemHeightSmall = android.R.attr.listPreferredItemHeightSmall;
        public static final int listPreferredItemPaddingEnd = android.R.attr.listPreferredItemPaddingEnd;
        public static final int listPreferredItemPaddingLeft = android.R.attr.listPreferredItemPaddingLeft;
        public static final int listPreferredItemPaddingRight = android.R.attr.listPreferredItemPaddingRight;
        public static final int listPreferredItemPaddingStart = android.R.attr.listPreferredItemPaddingStart;
        public static final int listSelector = android.R.attr.listSelector;
        public static final int listSeparatorTextViewStyle = android.R.attr.listSeparatorTextViewStyle;
        public static final int listViewStyle = android.R.attr.listViewStyle;
        public static final int listViewWhiteStyle = android.R.attr.listViewWhiteStyle;
        public static final int localeConfig = android.R.attr.localeConfig;
        public static final int lockTaskMode = android.R.attr.lockTaskMode;
        public static final int logo = android.R.attr.logo;
        public static final int logoDescription = android.R.attr.logoDescription;
        public static final int longClickable = android.R.attr.longClickable;
        public static final int loopViews = android.R.attr.loopViews;
        public static final int manageSpaceActivity = android.R.attr.manageSpaceActivity;
        public static final int mapViewStyle = android.R.attr.mapViewStyle;
        public static final int marqueeRepeatLimit = android.R.attr.marqueeRepeatLimit;
        public static final int matchOrder = android.R.attr.matchOrder;
        public static final int max = android.R.attr.max;
        public static final int maxAspectRatio = android.R.attr.maxAspectRatio;
        public static final int maxButtonHeight = android.R.attr.maxButtonHeight;
        public static final int maxDate = android.R.attr.maxDate;
        public static final int maxEms = android.R.attr.maxEms;
        public static final int maxHeight = android.R.attr.maxHeight;
        public static final int maxItemsPerRow = android.R.attr.maxItemsPerRow;
        public static final int maxLength = android.R.attr.maxLength;
        public static final int maxLevel = android.R.attr.maxLevel;
        public static final int maxLines = android.R.attr.maxLines;
        public static final int maxLongVersionCode = android.R.attr.maxLongVersionCode;
        public static final int maxRecents = android.R.attr.maxRecents;
        public static final int maxResizeHeight = android.R.attr.maxResizeHeight;
        public static final int maxResizeWidth = android.R.attr.maxResizeWidth;
        public static final int maxRows = android.R.attr.maxRows;
        public static final int maxSdkVersion = android.R.attr.maxSdkVersion;
        public static final int maxWidth = android.R.attr.maxWidth;
        public static final int maximumAngle = android.R.attr.maximumAngle;
        public static final int measureAllChildren = android.R.attr.measureAllChildren;
        public static final int measureWithLargestChild = android.R.attr.measureWithLargestChild;
        public static final int mediaRouteButtonStyle = android.R.attr.mediaRouteButtonStyle;
        public static final int mediaRouteTypes = android.R.attr.mediaRouteTypes;
        public static final int memtagMode = android.R.attr.memtagMode;
        public static final int menuCategory = android.R.attr.menuCategory;
        public static final int mimeGroup = android.R.attr.mimeGroup;
        public static final int mimeType = android.R.attr.mimeType;
        public static final int min = android.R.attr.min;
        public static final int minAspectRatio = android.R.attr.minAspectRatio;
        public static final int minDate = android.R.attr.minDate;
        public static final int minEms = android.R.attr.minEms;
        public static final int minHeight = android.R.attr.minHeight;
        public static final int minLevel = android.R.attr.minLevel;
        public static final int minLines = android.R.attr.minLines;
        public static final int minResizeHeight = android.R.attr.minResizeHeight;
        public static final int minResizeWidth = android.R.attr.minResizeWidth;
        public static final int minSdkVersion = android.R.attr.minSdkVersion;
        public static final int minWidth = android.R.attr.minWidth;
        public static final int minimumHorizontalAngle = android.R.attr.minimumHorizontalAngle;
        public static final int minimumVerticalAngle = android.R.attr.minimumVerticalAngle;
        public static final int mipMap = android.R.attr.mipMap;
        public static final int mirrorForRtl = android.R.attr.mirrorForRtl;
        public static final int mode = android.R.attr.mode;
        public static final int moreIcon = android.R.attr.moreIcon;
        public static final int multiArch = android.R.attr.multiArch;
        public static final int multiprocess = android.R.attr.multiprocess;
        public static final int name = android.R.attr.name;
        public static final int nativeHeapZeroInitialized = android.R.attr.nativeHeapZeroInitialized;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int navigationBarColor = android.R.attr.navigationBarColor;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int navigationBarDividerColor = android.R.attr.navigationBarDividerColor;
        public static final int navigationContentDescription = android.R.attr.navigationContentDescription;
        public static final int navigationIcon = android.R.attr.navigationIcon;
        public static final int navigationMode = android.R.attr.navigationMode;
        public static final int negativeButtonText = android.R.attr.negativeButtonText;
        public static final int nestedScrollingEnabled = android.R.attr.nestedScrollingEnabled;
        public static final int networkSecurityConfig = android.R.attr.networkSecurityConfig;
        public static final int nextClusterForward = android.R.attr.nextClusterForward;
        public static final int nextFocusDown = android.R.attr.nextFocusDown;
        public static final int nextFocusForward = android.R.attr.nextFocusForward;
        public static final int nextFocusLeft = android.R.attr.nextFocusLeft;
        public static final int nextFocusRight = android.R.attr.nextFocusRight;
        public static final int nextFocusUp = android.R.attr.nextFocusUp;
        public static final int noHistory = android.R.attr.noHistory;
        public static final int nonInteractiveUiTimeout = android.R.attr.nonInteractiveUiTimeout;
        public static final int normalScreens = android.R.attr.normalScreens;
        public static final int notificationTimeout = android.R.attr.notificationTimeout;
        public static final int numColumns = android.R.attr.numColumns;
        public static final int numStars = android.R.attr.numStars;
        public static final int numberPickerStyle = android.R.attr.numberPickerStyle;
        public static final int numbersBackgroundColor = android.R.attr.numbersBackgroundColor;
        public static final int numbersInnerTextColor = android.R.attr.numbersInnerTextColor;
        public static final int numbersSelectorColor = android.R.attr.numbersSelectorColor;
        public static final int numbersTextColor = android.R.attr.numbersTextColor;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int numeric = android.R.attr.numeric;
        public static final int numericModifiers = android.R.attr.numericModifiers;
        public static final int numericShortcut = android.R.attr.numericShortcut;
        public static final int offset = android.R.attr.offset;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int onClick = android.R.attr.onClick;
        public static final int oneshot = android.R.attr.oneshot;
        public static final int opacity = android.R.attr.opacity;
        public static final int opticalInsetBottom = android.R.attr.opticalInsetBottom;
        public static final int opticalInsetLeft = android.R.attr.opticalInsetLeft;
        public static final int opticalInsetRight = android.R.attr.opticalInsetRight;
        public static final int opticalInsetTop = android.R.attr.opticalInsetTop;
        public static final int order = android.R.attr.order;
        public static final int orderInCategory = android.R.attr.orderInCategory;
        public static final int ordering = android.R.attr.ordering;
        public static final int orderingFromXml = android.R.attr.orderingFromXml;
        public static final int orientation = android.R.attr.orientation;
        public static final int outAnimation = android.R.attr.outAnimation;
        public static final int outlineAmbientShadowColor = android.R.attr.outlineAmbientShadowColor;
        public static final int outlineProvider = android.R.attr.outlineProvider;
        public static final int outlineSpotShadowColor = android.R.attr.outlineSpotShadowColor;
        public static final int overScrollFooter = android.R.attr.overScrollFooter;
        public static final int overScrollHeader = android.R.attr.overScrollHeader;
        public static final int overScrollMode = android.R.attr.overScrollMode;
        public static final int overlapAnchor = android.R.attr.overlapAnchor;
        public static final int overridesImplicitlyEnabledSubtype = android.R.attr.overridesImplicitlyEnabledSubtype;
        public static final int packageNames = android.R.attr.packageNames;
        public static final int packageType = android.R.attr.packageType;
        public static final int padding = android.R.attr.padding;
        public static final int paddingBottom = android.R.attr.paddingBottom;
        public static final int paddingEnd = android.R.attr.paddingEnd;
        public static final int paddingHorizontal = android.R.attr.paddingHorizontal;
        public static final int paddingLeft = android.R.attr.paddingLeft;
        public static final int paddingMode = android.R.attr.paddingMode;
        public static final int paddingRight = android.R.attr.paddingRight;
        public static final int paddingStart = android.R.attr.paddingStart;
        public static final int paddingTop = android.R.attr.paddingTop;
        public static final int paddingVertical = android.R.attr.paddingVertical;
        public static final int panelBackground = android.R.attr.panelBackground;
        public static final int panelColorBackground = android.R.attr.panelColorBackground;
        public static final int panelColorForeground = android.R.attr.panelColorForeground;
        public static final int panelFullBackground = android.R.attr.panelFullBackground;
        public static final int panelTextAppearance = android.R.attr.panelTextAppearance;
        public static final int parentActivityName = android.R.attr.parentActivityName;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int password = android.R.attr.password;
        public static final int passwordsActivity = android.R.attr.passwordsActivity;
        public static final int path = android.R.attr.path;
        public static final int pathAdvancedPattern = android.R.attr.pathAdvancedPattern;
        public static final int pathData = android.R.attr.pathData;
        public static final int pathPattern = android.R.attr.pathPattern;
        public static final int pathPrefix = android.R.attr.pathPrefix;
        public static final int pathSuffix = android.R.attr.pathSuffix;
        public static final int patternPathData = android.R.attr.patternPathData;
        public static final int permission = android.R.attr.permission;
        public static final int permissionFlags = android.R.attr.permissionFlags;
        public static final int permissionGroup = android.R.attr.permissionGroup;
        public static final int permissionGroupFlags = android.R.attr.permissionGroupFlags;
        public static final int persistableMode = android.R.attr.persistableMode;
        public static final int persistent = android.R.attr.persistent;
        public static final int persistentDrawingCache = android.R.attr.persistentDrawingCache;
        public static final int persistentWhenFeatureAvailable = android.R.attr.persistentWhenFeatureAvailable;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int phoneNumber = android.R.attr.phoneNumber;
        public static final int physicalKeyboardHintLanguageTag = android.R.attr.physicalKeyboardHintLanguageTag;
        public static final int physicalKeyboardHintLayoutType = android.R.attr.physicalKeyboardHintLayoutType;
        public static final int pivotX = android.R.attr.pivotX;
        public static final int pivotY = android.R.attr.pivotY;
        public static final int pointerIcon = android.R.attr.pointerIcon;
        public static final int popupAnimationStyle = android.R.attr.popupAnimationStyle;
        public static final int popupBackground = android.R.attr.popupBackground;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int popupCharacters = android.R.attr.popupCharacters;
        public static final int popupElevation = android.R.attr.popupElevation;
        public static final int popupEnterTransition = android.R.attr.popupEnterTransition;
        public static final int popupExitTransition = android.R.attr.popupExitTransition;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int popupKeyboard = android.R.attr.popupKeyboard;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int popupLayout = android.R.attr.popupLayout;
        public static final int popupMenuStyle = android.R.attr.popupMenuStyle;
        public static final int popupTheme = android.R.attr.popupTheme;
        public static final int popupWindowStyle = android.R.attr.popupWindowStyle;
        public static final int port = android.R.attr.port;
        public static final int positiveButtonText = android.R.attr.positiveButtonText;
        public static final int preferKeepClear = android.R.attr.preferKeepClear;
        public static final int preferMinimalPostProcessing = android.R.attr.preferMinimalPostProcessing;
        public static final int preferenceCategoryStyle = android.R.attr.preferenceCategoryStyle;
        public static final int preferenceFragmentStyle = android.R.attr.preferenceFragmentStyle;
        public static final int preferenceInformationStyle = android.R.attr.preferenceInformationStyle;
        public static final int preferenceLayoutChild = android.R.attr.preferenceLayoutChild;
        public static final int preferenceScreenStyle = android.R.attr.preferenceScreenStyle;
        public static final int preferenceStyle = android.R.attr.preferenceStyle;
        public static final int presentationTheme = android.R.attr.presentationTheme;
        public static final int preserveLegacyExternalStorage = android.R.attr.preserveLegacyExternalStorage;
        public static final int previewImage = android.R.attr.previewImage;
        public static final int previewLayout = android.R.attr.previewLayout;
        public static final int primaryContentAlpha = android.R.attr.primaryContentAlpha;
        public static final int priority = android.R.attr.priority;
        public static final int privateImeOptions = android.R.attr.privateImeOptions;
        public static final int process = android.R.attr.process;
        public static final int progress = android.R.attr.progress;
        public static final int progressBackgroundTint = android.R.attr.progressBackgroundTint;
        public static final int progressBackgroundTintMode = android.R.attr.progressBackgroundTintMode;
        public static final int progressBarPadding = android.R.attr.progressBarPadding;
        public static final int progressBarStyle = android.R.attr.progressBarStyle;
        public static final int progressBarStyleHorizontal = android.R.attr.progressBarStyleHorizontal;
        public static final int progressBarStyleInverse = android.R.attr.progressBarStyleInverse;
        public static final int progressBarStyleLarge = android.R.attr.progressBarStyleLarge;
        public static final int progressBarStyleLargeInverse = android.R.attr.progressBarStyleLargeInverse;
        public static final int progressBarStyleSmall = android.R.attr.progressBarStyleSmall;
        public static final int progressBarStyleSmallInverse = android.R.attr.progressBarStyleSmallInverse;
        public static final int progressBarStyleSmallTitle = android.R.attr.progressBarStyleSmallTitle;
        public static final int progressDrawable = android.R.attr.progressDrawable;
        public static final int progressTint = android.R.attr.progressTint;
        public static final int progressTintMode = android.R.attr.progressTintMode;
        public static final int prompt = android.R.attr.prompt;
        public static final int propertyName = android.R.attr.propertyName;
        public static final int propertyXName = android.R.attr.propertyXName;
        public static final int propertyYName = android.R.attr.propertyYName;
        public static final int protectionLevel = android.R.attr.protectionLevel;
        public static final int publicKey = android.R.attr.publicKey;
        public static final int query = android.R.attr.query;
        public static final int queryActionMsg = android.R.attr.queryActionMsg;
        public static final int queryAdvancedPattern = android.R.attr.queryAdvancedPattern;
        public static final int queryAfterZeroResults = android.R.attr.queryAfterZeroResults;
        public static final int queryBackground = android.R.attr.queryBackground;
        public static final int queryHint = android.R.attr.queryHint;
        public static final int queryPattern = android.R.attr.queryPattern;
        public static final int queryPrefix = android.R.attr.queryPrefix;
        public static final int querySuffix = android.R.attr.querySuffix;
        public static final int quickContactBadgeStyleSmallWindowLarge = android.R.attr.quickContactBadgeStyleSmallWindowLarge;
        public static final int quickContactBadgeStyleSmallWindowMedium = android.R.attr.quickContactBadgeStyleSmallWindowMedium;
        public static final int quickContactBadgeStyleSmallWindowSmall = android.R.attr.quickContactBadgeStyleSmallWindowSmall;
        public static final int quickContactBadgeStyleWindowLarge = android.R.attr.quickContactBadgeStyleWindowLarge;
        public static final int quickContactBadgeStyleWindowMedium = android.R.attr.quickContactBadgeStyleWindowMedium;
        public static final int quickContactBadgeStyleWindowSmall = android.R.attr.quickContactBadgeStyleWindowSmall;
        public static final int radioButtonStyle = android.R.attr.radioButtonStyle;
        public static final int radius = android.R.attr.radius;
        public static final int rating = android.R.attr.rating;
        public static final int ratingBarStyle = android.R.attr.ratingBarStyle;
        public static final int ratingBarStyleIndicator = android.R.attr.ratingBarStyleIndicator;
        public static final int ratingBarStyleSmall = android.R.attr.ratingBarStyleSmall;
        public static final int readPermission = android.R.attr.readPermission;
        public static final int recognitionService = android.R.attr.recognitionService;
        public static final int recreateOnConfigChanges = android.R.attr.recreateOnConfigChanges;
        public static final int recycleEnabled = android.R.attr.recycleEnabled;
        public static final int relinquishTaskIdentity = android.R.attr.relinquishTaskIdentity;
        public static final int reparent = android.R.attr.reparent;
        public static final int reparentWithOverlay = android.R.attr.reparentWithOverlay;
        public static final int repeatCount = android.R.attr.repeatCount;
        public static final int repeatMode = android.R.attr.repeatMode;
        public static final int reqFiveWayNav = android.R.attr.reqFiveWayNav;
        public static final int reqHardKeyboard = android.R.attr.reqHardKeyboard;
        public static final int reqKeyboardType = android.R.attr.reqKeyboardType;
        public static final int reqNavigation = android.R.attr.reqNavigation;
        public static final int reqTouchScreen = android.R.attr.reqTouchScreen;
        public static final int requestLegacyExternalStorage = android.R.attr.requestLegacyExternalStorage;
        public static final int requestRawExternalStorageAccess = android.R.attr.requestRawExternalStorageAccess;
        public static final int requireContentUriPermissionFromCaller = android.R.attr.requireContentUriPermissionFromCaller;
        public static final int requireDeviceScreenOn = android.R.attr.requireDeviceScreenOn;
        public static final int requireDeviceUnlock = android.R.attr.requireDeviceUnlock;
        public static final int required = android.R.attr.required;
        public static final int requiredAccountType = android.R.attr.requiredAccountType;
        public static final int requiredDisplayCategory = android.R.attr.requiredDisplayCategory;
        public static final int requiredFeature = android.R.attr.requiredFeature;
        public static final int requiredForAllUsers = android.R.attr.requiredForAllUsers;
        public static final int requiredNotFeature = android.R.attr.requiredNotFeature;
        public static final int requiredSplitTypes = android.R.attr.requiredSplitTypes;
        public static final int requiresFadingEdge = android.R.attr.requiresFadingEdge;
        public static final int requiresSmallestWidthDp = android.R.attr.requiresSmallestWidthDp;
        public static final int resetEnabledSettingsOnAppDataCleared = android.R.attr.resetEnabledSettingsOnAppDataCleared;
        public static final int resizeClip = android.R.attr.resizeClip;
        public static final int resizeMode = android.R.attr.resizeMode;
        public static final int resizeable = android.R.attr.resizeable;
        public static final int resizeableActivity = android.R.attr.resizeableActivity;
        public static final int resource = android.R.attr.resource;
        public static final int resourcesMap = android.R.attr.resourcesMap;
        public static final int restoreAnyVersion = android.R.attr.restoreAnyVersion;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int restoreNeedsApplication = android.R.attr.restoreNeedsApplication;
        public static final int restrictedAccountType = android.R.attr.restrictedAccountType;
        public static final int restrictionType = android.R.attr.restrictionType;
        public static final int resumeWhilePausing = android.R.attr.resumeWhilePausing;
        public static final int reversible = android.R.attr.reversible;
        public static final int revisionCode = android.R.attr.revisionCode;
        public static final int right = android.R.attr.right;
        public static final int ringtonePreferenceStyle = android.R.attr.ringtonePreferenceStyle;
        public static final int ringtoneType = android.R.attr.ringtoneType;
        public static final int rollbackDataPolicy = android.R.attr.rollbackDataPolicy;
        public static final int rotation = android.R.attr.rotation;
        public static final int rotationAnimation = android.R.attr.rotationAnimation;
        public static final int rotationX = android.R.attr.rotationX;
        public static final int rotationY = android.R.attr.rotationY;
        public static final int roundIcon = android.R.attr.roundIcon;
        public static final int rowCount = android.R.attr.rowCount;
        public static final int rowDelay = android.R.attr.rowDelay;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int rowEdgeFlags = android.R.attr.rowEdgeFlags;
        public static final int rowHeight = android.R.attr.rowHeight;
        public static final int rowOrderPreserved = android.R.attr.rowOrderPreserved;
        public static final int saveEnabled = android.R.attr.saveEnabled;
        public static final int scaleGravity = android.R.attr.scaleGravity;
        public static final int scaleHeight = android.R.attr.scaleHeight;
        public static final int scaleType = android.R.attr.scaleType;
        public static final int scaleWidth = android.R.attr.scaleWidth;
        public static final int scaleX = android.R.attr.scaleX;
        public static final int scaleY = android.R.attr.scaleY;
        public static final int scheme = android.R.attr.scheme;
        public static final int screenDensity = android.R.attr.screenDensity;
        public static final int screenOrientation = android.R.attr.screenOrientation;
        public static final int screenReaderFocusable = android.R.attr.screenReaderFocusable;
        public static final int screenSize = android.R.attr.screenSize;
        public static final int scrollHorizontally = android.R.attr.scrollHorizontally;
        public static final int scrollIndicators = android.R.attr.scrollIndicators;
        public static final int scrollViewStyle = android.R.attr.scrollViewStyle;
        public static final int scrollX = android.R.attr.scrollX;
        public static final int scrollY = android.R.attr.scrollY;
        public static final int scrollbarAlwaysDrawHorizontalTrack = android.R.attr.scrollbarAlwaysDrawHorizontalTrack;
        public static final int scrollbarAlwaysDrawVerticalTrack = android.R.attr.scrollbarAlwaysDrawVerticalTrack;
        public static final int scrollbarDefaultDelayBeforeFade = android.R.attr.scrollbarDefaultDelayBeforeFade;
        public static final int scrollbarFadeDuration = android.R.attr.scrollbarFadeDuration;
        public static final int scrollbarSize = android.R.attr.scrollbarSize;
        public static final int scrollbarStyle = android.R.attr.scrollbarStyle;
        public static final int scrollbarThumbHorizontal = android.R.attr.scrollbarThumbHorizontal;
        public static final int scrollbarThumbVertical = android.R.attr.scrollbarThumbVertical;
        public static final int scrollbarTrackHorizontal = android.R.attr.scrollbarTrackHorizontal;
        public static final int scrollbarTrackVertical = android.R.attr.scrollbarTrackVertical;
        public static final int scrollbars = android.R.attr.scrollbars;
        public static final int scrollingCache = android.R.attr.scrollingCache;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int searchButtonText = android.R.attr.searchButtonText;
        public static final int searchHintIcon = android.R.attr.searchHintIcon;
        public static final int searchIcon = android.R.attr.searchIcon;
        public static final int searchMode = android.R.attr.searchMode;
        public static final int searchResultHighlightColor = android.R.attr.searchResultHighlightColor;
        public static final int searchSettingsDescription = android.R.attr.searchSettingsDescription;
        public static final int searchSuggestAuthority = android.R.attr.searchSuggestAuthority;
        public static final int searchSuggestIntentAction = android.R.attr.searchSuggestIntentAction;
        public static final int searchSuggestIntentData = android.R.attr.searchSuggestIntentData;
        public static final int searchSuggestPath = android.R.attr.searchSuggestPath;
        public static final int searchSuggestSelection = android.R.attr.searchSuggestSelection;
        public static final int searchSuggestThreshold = android.R.attr.searchSuggestThreshold;
        public static final int searchViewStyle = android.R.attr.searchViewStyle;
        public static final int secondaryContentAlpha = android.R.attr.secondaryContentAlpha;
        public static final int secondaryProgress = android.R.attr.secondaryProgress;
        public static final int secondaryProgressTint = android.R.attr.secondaryProgressTint;
        public static final int secondaryProgressTintMode = android.R.attr.secondaryProgressTintMode;
        public static final int secureElementName = android.R.attr.secureElementName;
        public static final int seekBarStyle = android.R.attr.seekBarStyle;
        public static final int segmentedButtonStyle = android.R.attr.segmentedButtonStyle;
        public static final int selectAllOnFocus = android.R.attr.selectAllOnFocus;
        public static final int selectable = android.R.attr.selectable;
        public static final int selectableAsDefault = android.R.attr.selectableAsDefault;
        public static final int selectableItemBackground = android.R.attr.selectableItemBackground;
        public static final int selectableItemBackgroundBorderless = android.R.attr.selectableItemBackgroundBorderless;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int selectedDateVerticalBar = android.R.attr.selectedDateVerticalBar;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int selectedWeekBackgroundColor = android.R.attr.selectedWeekBackgroundColor;
        public static final int selectionDividerHeight = android.R.attr.selectionDividerHeight;
        public static final int sessionService = android.R.attr.sessionService;
        public static final int settingsActivity = android.R.attr.settingsActivity;
        public static final int settingsSliceUri = android.R.attr.settingsSliceUri;
        public static final int settingsSubtitle = android.R.attr.settingsSubtitle;
        public static final int setupActivity = android.R.attr.setupActivity;
        public static final int shadowColor = android.R.attr.shadowColor;
        public static final int shadowDx = android.R.attr.shadowDx;
        public static final int shadowDy = android.R.attr.shadowDy;
        public static final int shadowRadius = android.R.attr.shadowRadius;
        public static final int shape = android.R.attr.shape;
        public static final int shareInterpolator = android.R.attr.shareInterpolator;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int sharedUserId = android.R.attr.sharedUserId;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int sharedUserLabel = android.R.attr.sharedUserLabel;
        public static final int sharedUserMaxSdkVersion = android.R.attr.sharedUserMaxSdkVersion;
        public static final int shell = android.R.attr.shell;
        public static final int shiftDrawingOffsetForStartOverhang = android.R.attr.shiftDrawingOffsetForStartOverhang;
        public static final int shortcutDisabledMessage = android.R.attr.shortcutDisabledMessage;
        public static final int shortcutId = android.R.attr.shortcutId;
        public static final int shortcutLongLabel = android.R.attr.shortcutLongLabel;
        public static final int shortcutShortLabel = android.R.attr.shortcutShortLabel;
        public static final int shouldDefaultToObserveMode = android.R.attr.shouldDefaultToObserveMode;
        public static final int shouldDisableView = android.R.attr.shouldDisableView;
        public static final int shouldUseDefaultUnfoldTransition = android.R.attr.shouldUseDefaultUnfoldTransition;
        public static final int showAsAction = android.R.attr.showAsAction;
        public static final int showBackdrop = android.R.attr.showBackdrop;
        public static final int showClockAndComplications = android.R.attr.showClockAndComplications;
        public static final int showDefault = android.R.attr.showDefault;
        public static final int showDividers = android.R.attr.showDividers;
        public static final int showForAllUsers = android.R.attr.showForAllUsers;
        public static final int showInInputMethodPicker = android.R.attr.showInInputMethodPicker;
        public static final int showMetadataInPreview = android.R.attr.showMetadataInPreview;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int showOnLockScreen = android.R.attr.showOnLockScreen;
        public static final int showSilent = android.R.attr.showSilent;
        public static final int showText = android.R.attr.showText;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int showWeekNumber = android.R.attr.showWeekNumber;
        public static final int showWhenLocked = android.R.attr.showWhenLocked;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int shownWeekCount = android.R.attr.shownWeekCount;
        public static final int shrinkColumns = android.R.attr.shrinkColumns;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int singleLine = android.R.attr.singleLine;
        public static final int singleLineTitle = android.R.attr.singleLineTitle;
        public static final int singleUser = android.R.attr.singleUser;
        public static final int slideEdge = android.R.attr.slideEdge;
        public static final int smallIcon = android.R.attr.smallIcon;
        public static final int smallScreens = android.R.attr.smallScreens;
        public static final int smoothScrollbar = android.R.attr.smoothScrollbar;
        public static final int soundEffectsEnabled = android.R.attr.soundEffectsEnabled;
        public static final int spacing = android.R.attr.spacing;
        public static final int spinnerDropDownItemStyle = android.R.attr.spinnerDropDownItemStyle;
        public static final int spinnerItemStyle = android.R.attr.spinnerItemStyle;
        public static final int spinnerMode = android.R.attr.spinnerMode;
        public static final int spinnerStyle = android.R.attr.spinnerStyle;
        public static final int spinnersShown = android.R.attr.spinnersShown;
        public static final int splashScreenTheme = android.R.attr.splashScreenTheme;
        public static final int splitMotionEvents = android.R.attr.splitMotionEvents;
        public static final int splitName = android.R.attr.splitName;
        public static final int splitTrack = android.R.attr.splitTrack;
        public static final int splitTypes = android.R.attr.splitTypes;
        public static final int spotShadowAlpha = android.R.attr.spotShadowAlpha;
        public static final int src = android.R.attr.src;
        public static final int ssp = android.R.attr.ssp;
        public static final int sspAdvancedPattern = android.R.attr.sspAdvancedPattern;
        public static final int sspPattern = android.R.attr.sspPattern;
        public static final int sspPrefix = android.R.attr.sspPrefix;
        public static final int sspSuffix = android.R.attr.sspSuffix;
        public static final int stackFromBottom = android.R.attr.stackFromBottom;
        public static final int stackViewStyle = android.R.attr.stackViewStyle;
        public static final int starStyle = android.R.attr.starStyle;
        public static final int start = android.R.attr.start;
        public static final int startColor = android.R.attr.startColor;
        public static final int startDelay = android.R.attr.startDelay;
        public static final int startOffset = android.R.attr.startOffset;
        public static final int startX = android.R.attr.startX;
        public static final int startY = android.R.attr.startY;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int startYear = android.R.attr.startYear;
        public static final int stateListAnimator = android.R.attr.stateListAnimator;
        public static final int stateNotNeeded = android.R.attr.stateNotNeeded;
        public static final int state_above_anchor = android.R.attr.state_above_anchor;
        public static final int state_accelerated = android.R.attr.state_accelerated;
        public static final int state_activated = android.R.attr.state_activated;
        public static final int state_active = android.R.attr.state_active;
        public static final int state_checkable = android.R.attr.state_checkable;
        public static final int state_checked = android.R.attr.state_checked;
        public static final int state_drag_can_accept = android.R.attr.state_drag_can_accept;
        public static final int state_drag_hovered = android.R.attr.state_drag_hovered;
        public static final int state_empty = android.R.attr.state_empty;
        public static final int state_enabled = android.R.attr.state_enabled;
        public static final int state_expanded = android.R.attr.state_expanded;
        public static final int state_first = android.R.attr.state_first;
        public static final int state_focused = android.R.attr.state_focused;
        public static final int state_hovered = android.R.attr.state_hovered;
        public static final int state_last = android.R.attr.state_last;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int state_long_pressable = android.R.attr.state_long_pressable;
        public static final int state_middle = android.R.attr.state_middle;
        public static final int state_multiline = android.R.attr.state_multiline;
        public static final int state_pressed = android.R.attr.state_pressed;
        public static final int state_selected = android.R.attr.state_selected;
        public static final int state_single = android.R.attr.state_single;
        public static final int state_window_focused = android.R.attr.state_window_focused;
        public static final int staticWallpaperPreview = android.R.attr.staticWallpaperPreview;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int statusBarColor = android.R.attr.statusBarColor;
        public static final int stepSize = android.R.attr.stepSize;
        public static final int stopWithTask = android.R.attr.stopWithTask;
        public static final int streamType = android.R.attr.streamType;
        public static final int stretchColumns = android.R.attr.stretchColumns;
        public static final int stretchMode = android.R.attr.stretchMode;
        public static final int strokeAlpha = android.R.attr.strokeAlpha;
        public static final int strokeColor = android.R.attr.strokeColor;
        public static final int strokeLineCap = android.R.attr.strokeLineCap;
        public static final int strokeLineJoin = android.R.attr.strokeLineJoin;
        public static final int strokeMiterLimit = android.R.attr.strokeMiterLimit;
        public static final int strokeWidth = android.R.attr.strokeWidth;
        public static final int stylusHandwritingSettingsActivity = android.R.attr.stylusHandwritingSettingsActivity;
        public static final int subMenuArrow = android.R.attr.subMenuArrow;
        public static final int submitBackground = android.R.attr.submitBackground;
        public static final int subtitle = android.R.attr.subtitle;
        public static final int subtitleTextAppearance = android.R.attr.subtitleTextAppearance;
        public static final int subtitleTextColor = android.R.attr.subtitleTextColor;
        public static final int subtitleTextStyle = android.R.attr.subtitleTextStyle;
        public static final int subtypeExtraValue = android.R.attr.subtypeExtraValue;
        public static final int subtypeId = android.R.attr.subtypeId;
        public static final int subtypeLocale = android.R.attr.subtypeLocale;
        public static final int suggestActionMsg = android.R.attr.suggestActionMsg;
        public static final int suggestActionMsgColumn = android.R.attr.suggestActionMsgColumn;
        public static final int suggestionRowLayout = android.R.attr.suggestionRowLayout;
        public static final int summary = android.R.attr.summary;
        public static final int summaryColumn = android.R.attr.summaryColumn;
        public static final int summaryOff = android.R.attr.summaryOff;
        public static final int summaryOn = android.R.attr.summaryOn;
        public static final int supportedTypes = android.R.attr.supportedTypes;
        public static final int supportsAssist = android.R.attr.supportsAssist;
        public static final int supportsBatteryGameMode = android.R.attr.supportsBatteryGameMode;
        public static final int supportsConnectionlessStylusHandwriting = android.R.attr.supportsConnectionlessStylusHandwriting;
        public static final int supportsInlineSuggestions = android.R.attr.supportsInlineSuggestions;
        public static final int supportsInlineSuggestionsWithTouchExploration = android.R.attr.supportsInlineSuggestionsWithTouchExploration;
        public static final int supportsLaunchVoiceAssistFromKeyguard = android.R.attr.supportsLaunchVoiceAssistFromKeyguard;
        public static final int supportsLocalInteraction = android.R.attr.supportsLocalInteraction;
        public static final int supportsMultipleDisplays = android.R.attr.supportsMultipleDisplays;
        public static final int supportsPerformanceGameMode = android.R.attr.supportsPerformanceGameMode;
        public static final int supportsPictureInPicture = android.R.attr.supportsPictureInPicture;
        public static final int supportsRtl = android.R.attr.supportsRtl;
        public static final int supportsStylusHandwriting = android.R.attr.supportsStylusHandwriting;
        public static final int supportsSwitchingToNextInputMethod = android.R.attr.supportsSwitchingToNextInputMethod;
        public static final int supportsUploading = android.R.attr.supportsUploading;
        public static final int suppressesSpellChecker = android.R.attr.suppressesSpellChecker;
        public static final int switchMinWidth = android.R.attr.switchMinWidth;
        public static final int switchPadding = android.R.attr.switchPadding;
        public static final int switchPreferenceStyle = android.R.attr.switchPreferenceStyle;
        public static final int switchStyle = android.R.attr.switchStyle;
        public static final int switchTextAppearance = android.R.attr.switchTextAppearance;
        public static final int switchTextOff = android.R.attr.switchTextOff;
        public static final int switchTextOn = android.R.attr.switchTextOn;
        public static final int syncable = android.R.attr.syncable;
        public static final int systemUserOnly = android.R.attr.systemUserOnly;
        public static final int tabStripEnabled = android.R.attr.tabStripEnabled;
        public static final int tabStripLeft = android.R.attr.tabStripLeft;
        public static final int tabStripRight = android.R.attr.tabStripRight;
        public static final int tabWidgetStyle = android.R.attr.tabWidgetStyle;
        public static final int tag = android.R.attr.tag;
        public static final int targetActivity = android.R.attr.targetActivity;
        public static final int targetCellHeight = android.R.attr.targetCellHeight;
        public static final int targetCellWidth = android.R.attr.targetCellWidth;
        public static final int targetClass = android.R.attr.targetClass;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int targetDescriptions = android.R.attr.targetDescriptions;
        public static final int targetId = android.R.attr.targetId;
        public static final int targetName = android.R.attr.targetName;
        public static final int targetPackage = android.R.attr.targetPackage;
        public static final int targetProcesses = android.R.attr.targetProcesses;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int targetSandboxVersion = android.R.attr.targetSandboxVersion;
        public static final int targetSdkVersion = android.R.attr.targetSdkVersion;
        public static final int taskAffinity = android.R.attr.taskAffinity;
        public static final int taskCloseEnterAnimation = android.R.attr.taskCloseEnterAnimation;
        public static final int taskCloseExitAnimation = android.R.attr.taskCloseExitAnimation;
        public static final int taskOpenEnterAnimation = android.R.attr.taskOpenEnterAnimation;
        public static final int taskOpenExitAnimation = android.R.attr.taskOpenExitAnimation;
        public static final int taskToBackEnterAnimation = android.R.attr.taskToBackEnterAnimation;
        public static final int taskToBackExitAnimation = android.R.attr.taskToBackExitAnimation;
        public static final int taskToFrontEnterAnimation = android.R.attr.taskToFrontEnterAnimation;
        public static final int taskToFrontExitAnimation = android.R.attr.taskToFrontExitAnimation;
        public static final int tension = android.R.attr.tension;
        public static final int testOnly = android.R.attr.testOnly;
        public static final int text = android.R.attr.text;
        public static final int textAlignment = android.R.attr.textAlignment;
        public static final int textAllCaps = android.R.attr.textAllCaps;
        public static final int textAppearance = android.R.attr.textAppearance;
        public static final int textAppearanceButton = android.R.attr.textAppearanceButton;
        public static final int textAppearanceInverse = android.R.attr.textAppearanceInverse;
        public static final int textAppearanceLarge = android.R.attr.textAppearanceLarge;
        public static final int textAppearanceLargeInverse = android.R.attr.textAppearanceLargeInverse;
        public static final int textAppearanceLargePopupMenu = android.R.attr.textAppearanceLargePopupMenu;
        public static final int textAppearanceListItem = android.R.attr.textAppearanceListItem;
        public static final int textAppearanceListItemSecondary = android.R.attr.textAppearanceListItemSecondary;
        public static final int textAppearanceListItemSmall = android.R.attr.textAppearanceListItemSmall;
        public static final int textAppearanceMedium = android.R.attr.textAppearanceMedium;
        public static final int textAppearanceMediumInverse = android.R.attr.textAppearanceMediumInverse;
        public static final int textAppearancePopupMenuHeader = android.R.attr.textAppearancePopupMenuHeader;
        public static final int textAppearanceSearchResultSubtitle = android.R.attr.textAppearanceSearchResultSubtitle;
        public static final int textAppearanceSearchResultTitle = android.R.attr.textAppearanceSearchResultTitle;
        public static final int textAppearanceSmall = android.R.attr.textAppearanceSmall;
        public static final int textAppearanceSmallInverse = android.R.attr.textAppearanceSmallInverse;
        public static final int textAppearanceSmallPopupMenu = android.R.attr.textAppearanceSmallPopupMenu;
        public static final int textCheckMark = android.R.attr.textCheckMark;
        public static final int textCheckMarkInverse = android.R.attr.textCheckMarkInverse;
        public static final int textColor = android.R.attr.textColor;
        public static final int textColorAlertDialogListItem = android.R.attr.textColorAlertDialogListItem;
        public static final int textColorHighlight = android.R.attr.textColorHighlight;
        public static final int textColorHighlightInverse = android.R.attr.textColorHighlightInverse;
        public static final int textColorHint = android.R.attr.textColorHint;
        public static final int textColorHintInverse = android.R.attr.textColorHintInverse;
        public static final int textColorLink = android.R.attr.textColorLink;
        public static final int textColorLinkInverse = android.R.attr.textColorLinkInverse;
        public static final int textColorPrimary = android.R.attr.textColorPrimary;
        public static final int textColorPrimaryDisableOnly = android.R.attr.textColorPrimaryDisableOnly;
        public static final int textColorPrimaryInverse = android.R.attr.textColorPrimaryInverse;
        public static final int textColorPrimaryInverseDisableOnly = android.R.attr.textColorPrimaryInverseDisableOnly;
        public static final int textColorPrimaryInverseNoDisable = android.R.attr.textColorPrimaryInverseNoDisable;
        public static final int textColorPrimaryNoDisable = android.R.attr.textColorPrimaryNoDisable;
        public static final int textColorSecondary = android.R.attr.textColorSecondary;
        public static final int textColorSecondaryInverse = android.R.attr.textColorSecondaryInverse;
        public static final int textColorSecondaryInverseNoDisable = android.R.attr.textColorSecondaryInverseNoDisable;
        public static final int textColorSecondaryNoDisable = android.R.attr.textColorSecondaryNoDisable;
        public static final int textColorTertiary = android.R.attr.textColorTertiary;
        public static final int textColorTertiaryInverse = android.R.attr.textColorTertiaryInverse;
        public static final int textCursorDrawable = android.R.attr.textCursorDrawable;
        public static final int textDirection = android.R.attr.textDirection;
        public static final int textEditNoPasteWindowLayout = android.R.attr.textEditNoPasteWindowLayout;
        public static final int textEditPasteWindowLayout = android.R.attr.textEditPasteWindowLayout;
        public static final int textEditSideNoPasteWindowLayout = android.R.attr.textEditSideNoPasteWindowLayout;
        public static final int textEditSidePasteWindowLayout = android.R.attr.textEditSidePasteWindowLayout;
        public static final int textEditSuggestionItemLayout = android.R.attr.textEditSuggestionItemLayout;
        public static final int textFilterEnabled = android.R.attr.textFilterEnabled;
        public static final int textFontWeight = android.R.attr.textFontWeight;
        public static final int textIsSelectable = android.R.attr.textIsSelectable;
        public static final int textLocale = android.R.attr.textLocale;
        public static final int textOff = android.R.attr.textOff;
        public static final int textOn = android.R.attr.textOn;
        public static final int textScaleX = android.R.attr.textScaleX;
        public static final int textSelectHandle = android.R.attr.textSelectHandle;
        public static final int textSelectHandleLeft = android.R.attr.textSelectHandleLeft;
        public static final int textSelectHandleRight = android.R.attr.textSelectHandleRight;
        public static final int textSelectHandleWindowStyle = android.R.attr.textSelectHandleWindowStyle;
        public static final int textSize = android.R.attr.textSize;
        public static final int textStyle = android.R.attr.textStyle;
        public static final int textSuggestionsWindowStyle = android.R.attr.textSuggestionsWindowStyle;
        public static final int textViewStyle = android.R.attr.textViewStyle;
        public static final int theme = android.R.attr.theme;
        public static final int thickness = android.R.attr.thickness;
        public static final int thicknessRatio = android.R.attr.thicknessRatio;
        public static final int thumb = android.R.attr.thumb;
        public static final int thumbOffset = android.R.attr.thumbOffset;
        public static final int thumbPosition = android.R.attr.thumbPosition;
        public static final int thumbTextPadding = android.R.attr.thumbTextPadding;
        public static final int thumbTint = android.R.attr.thumbTint;
        public static final int thumbTintMode = android.R.attr.thumbTintMode;
        public static final int thumbnail = android.R.attr.thumbnail;
        public static final int tickMark = android.R.attr.tickMark;
        public static final int tickMarkTint = android.R.attr.tickMarkTint;
        public static final int tickMarkTintMode = android.R.attr.tickMarkTintMode;
        public static final int tileMode = android.R.attr.tileMode;
        public static final int tileModeX = android.R.attr.tileModeX;
        public static final int tileModeY = android.R.attr.tileModeY;
        public static final int tileService = android.R.attr.tileService;
        public static final int timePickerDialogTheme = android.R.attr.timePickerDialogTheme;
        public static final int timePickerMode = android.R.attr.timePickerMode;
        public static final int timePickerStyle = android.R.attr.timePickerStyle;
        public static final int timeZone = android.R.attr.timeZone;
        public static final int tint = android.R.attr.tint;
        public static final int tintMode = android.R.attr.tintMode;
        public static final int title = android.R.attr.title;
        public static final int titleCondensed = android.R.attr.titleCondensed;
        public static final int titleMargin = android.R.attr.titleMargin;
        public static final int titleMarginBottom = android.R.attr.titleMarginBottom;
        public static final int titleMarginEnd = android.R.attr.titleMarginEnd;
        public static final int titleMarginStart = android.R.attr.titleMarginStart;
        public static final int titleMarginTop = android.R.attr.titleMarginTop;
        public static final int titleTextAppearance = android.R.attr.titleTextAppearance;
        public static final int titleTextColor = android.R.attr.titleTextColor;
        public static final int titleTextStyle = android.R.attr.titleTextStyle;
        public static final int toAlpha = android.R.attr.toAlpha;
        public static final int toDegrees = android.R.attr.toDegrees;
        public static final int toExtendBottom = android.R.attr.toExtendBottom;
        public static final int toExtendLeft = android.R.attr.toExtendLeft;
        public static final int toExtendRight = android.R.attr.toExtendRight;
        public static final int toExtendTop = android.R.attr.toExtendTop;
        public static final int toId = android.R.attr.toId;
        public static final int toScene = android.R.attr.toScene;
        public static final int toXDelta = android.R.attr.toXDelta;
        public static final int toXScale = android.R.attr.toXScale;
        public static final int toYDelta = android.R.attr.toYDelta;
        public static final int toYScale = android.R.attr.toYScale;
        public static final int toolbarStyle = android.R.attr.toolbarStyle;
        public static final int tooltipText = android.R.attr.tooltipText;
        public static final int top = android.R.attr.top;
        public static final int topBright = android.R.attr.topBright;
        public static final int topDark = android.R.attr.topDark;
        public static final int topLeftRadius = android.R.attr.topLeftRadius;
        public static final int topOffset = android.R.attr.topOffset;
        public static final int topRightRadius = android.R.attr.topRightRadius;
        public static final int touchscreenBlocksFocus = android.R.attr.touchscreenBlocksFocus;
        public static final int track = android.R.attr.track;
        public static final int trackTint = android.R.attr.trackTint;
        public static final int trackTintMode = android.R.attr.trackTintMode;
        public static final int transcriptMode = android.R.attr.transcriptMode;
        public static final int transformPivotX = android.R.attr.transformPivotX;
        public static final int transformPivotY = android.R.attr.transformPivotY;
        public static final int transition = android.R.attr.transition;
        public static final int transitionGroup = android.R.attr.transitionGroup;
        public static final int transitionName = android.R.attr.transitionName;
        public static final int transitionOrdering = android.R.attr.transitionOrdering;
        public static final int transitionVisibilityMode = android.R.attr.transitionVisibilityMode;
        public static final int translateX = android.R.attr.translateX;
        public static final int translateY = android.R.attr.translateY;
        public static final int translationX = android.R.attr.translationX;
        public static final int translationY = android.R.attr.translationY;
        public static final int translationZ = android.R.attr.translationZ;
        public static final int trimPathEnd = android.R.attr.trimPathEnd;
        public static final int trimPathOffset = android.R.attr.trimPathOffset;
        public static final int trimPathStart = android.R.attr.trimPathStart;
        public static final int ttcIndex = android.R.attr.ttcIndex;
        public static final int tunerCount = android.R.attr.tunerCount;
        public static final int turnScreenOn = android.R.attr.turnScreenOn;
        public static final int type = android.R.attr.type;
        public static final int typeface = android.R.attr.typeface;
        public static final int uiOptions = android.R.attr.uiOptions;
        public static final int uncertainGestureColor = android.R.attr.uncertainGestureColor;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int unfocusedMonthDateColor = android.R.attr.unfocusedMonthDateColor;
        public static final int unselectedAlpha = android.R.attr.unselectedAlpha;
        public static final int updatePeriodMillis = android.R.attr.updatePeriodMillis;
        public static final int use32bitAbi = android.R.attr.use32bitAbi;
        public static final int useAppZygote = android.R.attr.useAppZygote;
        public static final int useBoundsForWidth = android.R.attr.useBoundsForWidth;
        public static final int useDefaultMargins = android.R.attr.useDefaultMargins;
        public static final int useEmbeddedDex = android.R.attr.useEmbeddedDex;
        public static final int useIntrinsicSizeAsMinimum = android.R.attr.useIntrinsicSizeAsMinimum;
        public static final int useLevel = android.R.attr.useLevel;
        public static final int useLocalePreferredLineHeightForMinimum = android.R.attr.useLocalePreferredLineHeightForMinimum;
        public static final int userVisible = android.R.attr.userVisible;
        public static final int usesCleartextTraffic = android.R.attr.usesCleartextTraffic;
        public static final int usesPermissionFlags = android.R.attr.usesPermissionFlags;
        public static final int value = android.R.attr.value;
        public static final int valueFrom = android.R.attr.valueFrom;
        public static final int valueTo = android.R.attr.valueTo;
        public static final int valueType = android.R.attr.valueType;
        public static final int variablePadding = android.R.attr.variablePadding;
        public static final int vendor = android.R.attr.vendor;
        public static final int version = android.R.attr.version;
        public static final int versionCode = android.R.attr.versionCode;
        public static final int versionCodeMajor = android.R.attr.versionCodeMajor;
        public static final int versionMajor = android.R.attr.versionMajor;
        public static final int versionName = android.R.attr.versionName;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int verticalCorrection = android.R.attr.verticalCorrection;
        public static final int verticalDivider = android.R.attr.verticalDivider;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int verticalGap = android.R.attr.verticalGap;
        public static final int verticalScrollbarPosition = android.R.attr.verticalScrollbarPosition;
        public static final int verticalSpacing = android.R.attr.verticalSpacing;
        public static final int viewportHeight = android.R.attr.viewportHeight;
        public static final int viewportWidth = android.R.attr.viewportWidth;
        public static final int visibility = android.R.attr.visibility;
        public static final int visible = android.R.attr.visible;
        public static final int visibleToInstantApps = android.R.attr.visibleToInstantApps;
        public static final int vmSafeMode = android.R.attr.vmSafeMode;
        public static final int voiceIcon = android.R.attr.voiceIcon;
        public static final int voiceLanguage = android.R.attr.voiceLanguage;
        public static final int voiceLanguageModel = android.R.attr.voiceLanguageModel;
        public static final int voiceMaxResults = android.R.attr.voiceMaxResults;
        public static final int voicePromptText = android.R.attr.voicePromptText;
        public static final int voiceSearchMode = android.R.attr.voiceSearchMode;
        public static final int wallpaperCloseEnterAnimation = android.R.attr.wallpaperCloseEnterAnimation;
        public static final int wallpaperCloseExitAnimation = android.R.attr.wallpaperCloseExitAnimation;
        public static final int wallpaperIntraCloseEnterAnimation = android.R.attr.wallpaperIntraCloseEnterAnimation;
        public static final int wallpaperIntraCloseExitAnimation = android.R.attr.wallpaperIntraCloseExitAnimation;
        public static final int wallpaperIntraOpenEnterAnimation = android.R.attr.wallpaperIntraOpenEnterAnimation;
        public static final int wallpaperIntraOpenExitAnimation = android.R.attr.wallpaperIntraOpenExitAnimation;
        public static final int wallpaperOpenEnterAnimation = android.R.attr.wallpaperOpenEnterAnimation;
        public static final int wallpaperOpenExitAnimation = android.R.attr.wallpaperOpenExitAnimation;
        public static final int webTextViewStyle = android.R.attr.webTextViewStyle;
        public static final int webViewStyle = android.R.attr.webViewStyle;
        public static final int weekDayTextAppearance = android.R.attr.weekDayTextAppearance;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int weekNumberColor = android.R.attr.weekNumberColor;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int weekSeparatorLineColor = android.R.attr.weekSeparatorLineColor;
        public static final int weightSum = android.R.attr.weightSum;
        public static final int widgetCategory = android.R.attr.widgetCategory;
        public static final int widgetFeatures = android.R.attr.widgetFeatures;
        public static final int widgetLayout = android.R.attr.widgetLayout;
        public static final int width = android.R.attr.width;
        public static final int windowActionBar = android.R.attr.windowActionBar;
        public static final int windowActionBarOverlay = android.R.attr.windowActionBarOverlay;
        public static final int windowActionModeOverlay = android.R.attr.windowActionModeOverlay;
        public static final int windowActivityTransitions = android.R.attr.windowActivityTransitions;
        public static final int windowAllowEnterTransitionOverlap = android.R.attr.windowAllowEnterTransitionOverlap;
        public static final int windowAllowReturnTransitionOverlap = android.R.attr.windowAllowReturnTransitionOverlap;
        public static final int windowAnimationStyle = android.R.attr.windowAnimationStyle;
        public static final int windowBackground = android.R.attr.windowBackground;
        public static final int windowBackgroundBlurRadius = android.R.attr.windowBackgroundBlurRadius;
        public static final int windowBackgroundFallback = android.R.attr.windowBackgroundFallback;
        public static final int windowBlurBehindEnabled = android.R.attr.windowBlurBehindEnabled;
        public static final int windowBlurBehindRadius = android.R.attr.windowBlurBehindRadius;
        public static final int windowClipToOutline = android.R.attr.windowClipToOutline;
        public static final int windowCloseOnTouchOutside = android.R.attr.windowCloseOnTouchOutside;
        public static final int windowContentOverlay = android.R.attr.windowContentOverlay;
        public static final int windowContentTransitionManager = android.R.attr.windowContentTransitionManager;
        public static final int windowContentTransitions = android.R.attr.windowContentTransitions;
        public static final int windowDisablePreview = android.R.attr.windowDisablePreview;
        public static final int windowDrawsSystemBarBackgrounds = android.R.attr.windowDrawsSystemBarBackgrounds;
        public static final int windowElevation = android.R.attr.windowElevation;
        public static final int windowEnableSplitTouch = android.R.attr.windowEnableSplitTouch;
        public static final int windowEnterAnimation = android.R.attr.windowEnterAnimation;
        public static final int windowEnterTransition = android.R.attr.windowEnterTransition;
        public static final int windowExitAnimation = android.R.attr.windowExitAnimation;
        public static final int windowExitTransition = android.R.attr.windowExitTransition;
        public static final int windowFrame = android.R.attr.windowFrame;
        public static final int windowFullscreen = android.R.attr.windowFullscreen;
        public static final int windowHideAnimation = android.R.attr.windowHideAnimation;
        public static final int windowIsFloating = android.R.attr.windowIsFloating;
        public static final int windowIsFrameRatePowerSavingsBalanced = android.R.attr.windowIsFrameRatePowerSavingsBalanced;
        public static final int windowIsTranslucent = android.R.attr.windowIsTranslucent;
        public static final int windowLayoutAffinity = android.R.attr.windowLayoutAffinity;
        public static final int windowLayoutInDisplayCutoutMode = android.R.attr.windowLayoutInDisplayCutoutMode;
        public static final int windowLightNavigationBar = android.R.attr.windowLightNavigationBar;
        public static final int windowLightStatusBar = android.R.attr.windowLightStatusBar;
        public static final int windowMinWidthMajor = android.R.attr.windowMinWidthMajor;
        public static final int windowMinWidthMinor = android.R.attr.windowMinWidthMinor;
        public static final int windowNoDisplay = android.R.attr.windowNoDisplay;
        public static final int windowNoMoveAnimation = android.R.attr.windowNoMoveAnimation;
        public static final int windowNoTitle = android.R.attr.windowNoTitle;
        public static final int windowOptOutEdgeToEdgeEnforcement = android.R.attr.windowOptOutEdgeToEdgeEnforcement;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int windowOverscan = android.R.attr.windowOverscan;
        public static final int windowReenterTransition = android.R.attr.windowReenterTransition;
        public static final int windowReturnTransition = android.R.attr.windowReturnTransition;
        public static final int windowSharedElementEnterTransition = android.R.attr.windowSharedElementEnterTransition;
        public static final int windowSharedElementExitTransition = android.R.attr.windowSharedElementExitTransition;
        public static final int windowSharedElementReenterTransition = android.R.attr.windowSharedElementReenterTransition;
        public static final int windowSharedElementReturnTransition = android.R.attr.windowSharedElementReturnTransition;
        public static final int windowSharedElementsUseOverlay = android.R.attr.windowSharedElementsUseOverlay;
        public static final int windowShowAnimation = android.R.attr.windowShowAnimation;
        public static final int windowShowWallpaper = android.R.attr.windowShowWallpaper;
        public static final int windowSoftInputMode = android.R.attr.windowSoftInputMode;
        public static final int windowSplashScreenAnimatedIcon = android.R.attr.windowSplashScreenAnimatedIcon;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int windowSplashScreenAnimationDuration = android.R.attr.windowSplashScreenAnimationDuration;
        public static final int windowSplashScreenBackground = android.R.attr.windowSplashScreenBackground;
        public static final int windowSplashScreenBehavior = android.R.attr.windowSplashScreenBehavior;
        public static final int windowSplashScreenBrandingImage = android.R.attr.windowSplashScreenBrandingImage;
        public static final int windowSplashScreenIconBackgroundColor = android.R.attr.windowSplashScreenIconBackgroundColor;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int windowSplashscreenContent = android.R.attr.windowSplashscreenContent;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int windowSwipeToDismiss = android.R.attr.windowSwipeToDismiss;
        public static final int windowTitleBackgroundStyle = android.R.attr.windowTitleBackgroundStyle;
        public static final int windowTitleSize = android.R.attr.windowTitleSize;
        public static final int windowTitleStyle = android.R.attr.windowTitleStyle;
        public static final int windowTransitionBackgroundFadeDuration = android.R.attr.windowTransitionBackgroundFadeDuration;
        public static final int windowTranslucentNavigation = android.R.attr.windowTranslucentNavigation;
        public static final int windowTranslucentStatus = android.R.attr.windowTranslucentStatus;
        public static final int writePermission = android.R.attr.writePermission;
        public static final int x = android.R.attr.x;
        public static final int xlargeScreens = android.R.attr.xlargeScreens;
        public static final int y = android.R.attr.y;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int yearListItemTextAppearance = android.R.attr.yearListItemTextAppearance;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int yearListSelectorColor = android.R.attr.yearListSelectorColor;
        public static final int yesNoPreferenceStyle = android.R.attr.yesNoPreferenceStyle;
        public static final int zAdjustment = android.R.attr.zAdjustment;
        public static final int zygotePreloadName = android.R.attr.zygotePreloadName;

        public attr() {
            throw new RuntimeException("Stub!");
        }
    }

    public static final class bool {
        public bool() {
            throw new RuntimeException("Stub!");
        }
    }

    public static final class color {
        public static final int background_dark = android.R.color.background_dark;
        public static final int background_light = android.R.color.background_light;
        public static final int black = android.R.color.black;
        public static final int darker_gray = android.R.color.darker_gray;
        public static final int holo_blue_bright = android.R.color.holo_blue_bright;
        public static final int holo_blue_dark = android.R.color.holo_blue_dark;
        public static final int holo_blue_light = android.R.color.holo_blue_light;
        public static final int holo_green_dark = android.R.color.holo_green_dark;
        public static final int holo_green_light = android.R.color.holo_green_light;
        public static final int holo_orange_dark = android.R.color.holo_orange_dark;
        public static final int holo_orange_light = android.R.color.holo_orange_light;
        public static final int holo_purple = android.R.color.holo_purple;
        public static final int holo_red_dark = android.R.color.holo_red_dark;
        public static final int holo_red_light = android.R.color.holo_red_light;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int primary_text_dark = android.R.color.primary_text_dark;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int primary_text_dark_nodisable = android.R.color.primary_text_dark_nodisable;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int primary_text_light = android.R.color.primary_text_light;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int primary_text_light_nodisable = android.R.color.primary_text_light_nodisable;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int secondary_text_dark = android.R.color.secondary_text_dark;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int secondary_text_dark_nodisable = android.R.color.secondary_text_dark_nodisable;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int secondary_text_light = android.R.color.secondary_text_light;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int secondary_text_light_nodisable = android.R.color.secondary_text_light_nodisable;
        public static final int system_accent1_0 = android.R.color.system_accent1_0;
        public static final int system_accent1_10 = android.R.color.system_accent1_10;
        public static final int system_accent1_100 = android.R.color.system_accent1_100;
        public static final int system_accent1_1000 = android.R.color.system_accent1_1000;
        public static final int system_accent1_200 = android.R.color.system_accent1_200;
        public static final int system_accent1_300 = android.R.color.system_accent1_300;
        public static final int system_accent1_400 = android.R.color.system_accent1_400;
        public static final int system_accent1_50 = android.R.color.system_accent1_50;
        public static final int system_accent1_500 = android.R.color.system_accent1_500;
        public static final int system_accent1_600 = android.R.color.system_accent1_600;
        public static final int system_accent1_700 = android.R.color.system_accent1_700;
        public static final int system_accent1_800 = android.R.color.system_accent1_800;
        public static final int system_accent1_900 = android.R.color.system_accent1_900;
        public static final int system_accent2_0 = android.R.color.system_accent2_0;
        public static final int system_accent2_10 = android.R.color.system_accent2_10;
        public static final int system_accent2_100 = android.R.color.system_accent2_100;
        public static final int system_accent2_1000 = android.R.color.system_accent2_1000;
        public static final int system_accent2_200 = android.R.color.system_accent2_200;
        public static final int system_accent2_300 = android.R.color.system_accent2_300;
        public static final int system_accent2_400 = android.R.color.system_accent2_400;
        public static final int system_accent2_50 = android.R.color.system_accent2_50;
        public static final int system_accent2_500 = android.R.color.system_accent2_500;
        public static final int system_accent2_600 = android.R.color.system_accent2_600;
        public static final int system_accent2_700 = android.R.color.system_accent2_700;
        public static final int system_accent2_800 = android.R.color.system_accent2_800;
        public static final int system_accent2_900 = android.R.color.system_accent2_900;
        public static final int system_accent3_0 = android.R.color.system_accent3_0;
        public static final int system_accent3_10 = android.R.color.system_accent3_10;
        public static final int system_accent3_100 = android.R.color.system_accent3_100;
        public static final int system_accent3_1000 = android.R.color.system_accent3_1000;
        public static final int system_accent3_200 = android.R.color.system_accent3_200;
        public static final int system_accent3_300 = android.R.color.system_accent3_300;
        public static final int system_accent3_400 = android.R.color.system_accent3_400;
        public static final int system_accent3_50 = android.R.color.system_accent3_50;
        public static final int system_accent3_500 = android.R.color.system_accent3_500;
        public static final int system_accent3_600 = android.R.color.system_accent3_600;
        public static final int system_accent3_700 = android.R.color.system_accent3_700;
        public static final int system_accent3_800 = android.R.color.system_accent3_800;
        public static final int system_accent3_900 = android.R.color.system_accent3_900;
        public static final int system_background_dark = android.R.color.system_background_dark;
        public static final int system_background_light = android.R.color.system_background_light;
        public static final int system_control_activated_dark = android.R.color.system_control_activated_dark;
        public static final int system_control_activated_light = android.R.color.system_control_activated_light;
        public static final int system_control_highlight_dark = android.R.color.system_control_highlight_dark;
        public static final int system_control_highlight_light = android.R.color.system_control_highlight_light;
        public static final int system_control_normal_dark = android.R.color.system_control_normal_dark;
        public static final int system_control_normal_light = android.R.color.system_control_normal_light;
        public static final int system_error_0 = android.R.color.system_error_0;
        public static final int system_error_10 = android.R.color.system_error_10;
        public static final int system_error_100 = android.R.color.system_error_100;
        public static final int system_error_1000 = android.R.color.system_error_1000;
        public static final int system_error_200 = android.R.color.system_error_200;
        public static final int system_error_300 = android.R.color.system_error_300;
        public static final int system_error_400 = android.R.color.system_error_400;
        public static final int system_error_50 = android.R.color.system_error_50;
        public static final int system_error_500 = android.R.color.system_error_500;
        public static final int system_error_600 = android.R.color.system_error_600;
        public static final int system_error_700 = android.R.color.system_error_700;
        public static final int system_error_800 = android.R.color.system_error_800;
        public static final int system_error_900 = android.R.color.system_error_900;
        public static final int system_error_container_dark = android.R.color.system_error_container_dark;
        public static final int system_error_container_light = android.R.color.system_error_container_light;
        public static final int system_error_dark = android.R.color.system_error_dark;
        public static final int system_error_light = android.R.color.system_error_light;
        public static final int system_neutral1_0 = android.R.color.system_neutral1_0;
        public static final int system_neutral1_10 = android.R.color.system_neutral1_10;
        public static final int system_neutral1_100 = android.R.color.system_neutral1_100;
        public static final int system_neutral1_1000 = android.R.color.system_neutral1_1000;
        public static final int system_neutral1_200 = android.R.color.system_neutral1_200;
        public static final int system_neutral1_300 = android.R.color.system_neutral1_300;
        public static final int system_neutral1_400 = android.R.color.system_neutral1_400;
        public static final int system_neutral1_50 = android.R.color.system_neutral1_50;
        public static final int system_neutral1_500 = android.R.color.system_neutral1_500;
        public static final int system_neutral1_600 = android.R.color.system_neutral1_600;
        public static final int system_neutral1_700 = android.R.color.system_neutral1_700;
        public static final int system_neutral1_800 = android.R.color.system_neutral1_800;
        public static final int system_neutral1_900 = android.R.color.system_neutral1_900;
        public static final int system_neutral2_0 = android.R.color.system_neutral2_0;
        public static final int system_neutral2_10 = android.R.color.system_neutral2_10;
        public static final int system_neutral2_100 = android.R.color.system_neutral2_100;
        public static final int system_neutral2_1000 = android.R.color.system_neutral2_1000;
        public static final int system_neutral2_200 = android.R.color.system_neutral2_200;
        public static final int system_neutral2_300 = android.R.color.system_neutral2_300;
        public static final int system_neutral2_400 = android.R.color.system_neutral2_400;
        public static final int system_neutral2_50 = android.R.color.system_neutral2_50;
        public static final int system_neutral2_500 = android.R.color.system_neutral2_500;
        public static final int system_neutral2_600 = android.R.color.system_neutral2_600;
        public static final int system_neutral2_700 = android.R.color.system_neutral2_700;
        public static final int system_neutral2_800 = android.R.color.system_neutral2_800;
        public static final int system_neutral2_900 = android.R.color.system_neutral2_900;
        public static final int system_on_background_dark = android.R.color.system_on_background_dark;
        public static final int system_on_background_light = android.R.color.system_on_background_light;
        public static final int system_on_error_container_dark = android.R.color.system_on_error_container_dark;
        public static final int system_on_error_container_light = android.R.color.system_on_error_container_light;
        public static final int system_on_error_dark = android.R.color.system_on_error_dark;
        public static final int system_on_error_light = android.R.color.system_on_error_light;
        public static final int system_on_primary_container_dark = android.R.color.system_on_primary_container_dark;
        public static final int system_on_primary_container_light = android.R.color.system_on_primary_container_light;
        public static final int system_on_primary_dark = android.R.color.system_on_primary_dark;
        public static final int system_on_primary_fixed = android.R.color.system_on_primary_fixed;
        public static final int system_on_primary_fixed_variant = android.R.color.system_on_primary_fixed_variant;
        public static final int system_on_primary_light = android.R.color.system_on_primary_light;
        public static final int system_on_secondary_container_dark = android.R.color.system_on_secondary_container_dark;
        public static final int system_on_secondary_container_light = android.R.color.system_on_secondary_container_light;
        public static final int system_on_secondary_dark = android.R.color.system_on_secondary_dark;
        public static final int system_on_secondary_fixed = android.R.color.system_on_secondary_fixed;
        public static final int system_on_secondary_fixed_variant = android.R.color.system_on_secondary_fixed_variant;
        public static final int system_on_secondary_light = android.R.color.system_on_secondary_light;
        public static final int system_on_surface_dark = android.R.color.system_on_surface_dark;
        public static final int system_on_surface_disabled = android.R.color.system_on_surface_disabled;
        public static final int system_on_surface_light = android.R.color.system_on_surface_light;
        public static final int system_on_surface_variant_dark = android.R.color.system_on_surface_variant_dark;
        public static final int system_on_surface_variant_light = android.R.color.system_on_surface_variant_light;
        public static final int system_on_tertiary_container_dark = android.R.color.system_on_tertiary_container_dark;
        public static final int system_on_tertiary_container_light = android.R.color.system_on_tertiary_container_light;
        public static final int system_on_tertiary_dark = android.R.color.system_on_tertiary_dark;
        public static final int system_on_tertiary_fixed = android.R.color.system_on_tertiary_fixed;
        public static final int system_on_tertiary_fixed_variant = android.R.color.system_on_tertiary_fixed_variant;
        public static final int system_on_tertiary_light = android.R.color.system_on_tertiary_light;
        public static final int system_outline_dark = android.R.color.system_outline_dark;
        public static final int system_outline_disabled = android.R.color.system_outline_disabled;
        public static final int system_outline_light = android.R.color.system_outline_light;
        public static final int system_outline_variant_dark = android.R.color.system_outline_variant_dark;
        public static final int system_outline_variant_light = android.R.color.system_outline_variant_light;
        public static final int system_palette_key_color_neutral_dark = android.R.color.system_palette_key_color_neutral_dark;
        public static final int system_palette_key_color_neutral_light = android.R.color.system_palette_key_color_neutral_light;
        public static final int system_palette_key_color_neutral_variant_dark = android.R.color.system_palette_key_color_neutral_variant_dark;
        public static final int system_palette_key_color_neutral_variant_light = android.R.color.system_palette_key_color_neutral_variant_light;
        public static final int system_palette_key_color_primary_dark = android.R.color.system_palette_key_color_primary_dark;
        public static final int system_palette_key_color_primary_light = android.R.color.system_palette_key_color_primary_light;
        public static final int system_palette_key_color_secondary_dark = android.R.color.system_palette_key_color_secondary_dark;
        public static final int system_palette_key_color_secondary_light = android.R.color.system_palette_key_color_secondary_light;
        public static final int system_palette_key_color_tertiary_dark = android.R.color.system_palette_key_color_tertiary_dark;
        public static final int system_palette_key_color_tertiary_light = android.R.color.system_palette_key_color_tertiary_light;
        public static final int system_primary_container_dark = android.R.color.system_primary_container_dark;
        public static final int system_primary_container_light = android.R.color.system_primary_container_light;
        public static final int system_primary_dark = android.R.color.system_primary_dark;
        public static final int system_primary_fixed = android.R.color.system_primary_fixed;
        public static final int system_primary_fixed_dim = android.R.color.system_primary_fixed_dim;
        public static final int system_primary_light = android.R.color.system_primary_light;
        public static final int system_secondary_container_dark = android.R.color.system_secondary_container_dark;
        public static final int system_secondary_container_light = android.R.color.system_secondary_container_light;
        public static final int system_secondary_dark = android.R.color.system_secondary_dark;
        public static final int system_secondary_fixed = android.R.color.system_secondary_fixed;
        public static final int system_secondary_fixed_dim = android.R.color.system_secondary_fixed_dim;
        public static final int system_secondary_light = android.R.color.system_secondary_light;
        public static final int system_surface_bright_dark = android.R.color.system_surface_bright_dark;
        public static final int system_surface_bright_light = android.R.color.system_surface_bright_light;
        public static final int system_surface_container_dark = android.R.color.system_surface_container_dark;
        public static final int system_surface_container_high_dark = android.R.color.system_surface_container_high_dark;
        public static final int system_surface_container_high_light = android.R.color.system_surface_container_high_light;
        public static final int system_surface_container_highest_dark = android.R.color.system_surface_container_highest_dark;
        public static final int system_surface_container_highest_light = android.R.color.system_surface_container_highest_light;
        public static final int system_surface_container_light = android.R.color.system_surface_container_light;
        public static final int system_surface_container_low_dark = android.R.color.system_surface_container_low_dark;
        public static final int system_surface_container_low_light = android.R.color.system_surface_container_low_light;
        public static final int system_surface_container_lowest_dark = android.R.color.system_surface_container_lowest_dark;
        public static final int system_surface_container_lowest_light = android.R.color.system_surface_container_lowest_light;
        public static final int system_surface_dark = android.R.color.system_surface_dark;
        public static final int system_surface_dim_dark = android.R.color.system_surface_dim_dark;
        public static final int system_surface_dim_light = android.R.color.system_surface_dim_light;
        public static final int system_surface_disabled = android.R.color.system_surface_disabled;
        public static final int system_surface_light = android.R.color.system_surface_light;
        public static final int system_surface_variant_dark = android.R.color.system_surface_variant_dark;
        public static final int system_surface_variant_light = android.R.color.system_surface_variant_light;
        public static final int system_tertiary_container_dark = android.R.color.system_tertiary_container_dark;
        public static final int system_tertiary_container_light = android.R.color.system_tertiary_container_light;
        public static final int system_tertiary_dark = android.R.color.system_tertiary_dark;
        public static final int system_tertiary_fixed = android.R.color.system_tertiary_fixed;
        public static final int system_tertiary_fixed_dim = android.R.color.system_tertiary_fixed_dim;
        public static final int system_tertiary_light = android.R.color.system_tertiary_light;
        public static final int system_text_hint_inverse_dark = android.R.color.system_text_hint_inverse_dark;
        public static final int system_text_hint_inverse_light = android.R.color.system_text_hint_inverse_light;
        public static final int system_text_primary_inverse_dark = android.R.color.system_text_primary_inverse_dark;
        public static final int system_text_primary_inverse_disable_only_dark = android.R.color.system_text_primary_inverse_disable_only_dark;
        public static final int system_text_primary_inverse_disable_only_light = android.R.color.system_text_primary_inverse_disable_only_light;
        public static final int system_text_primary_inverse_light = android.R.color.system_text_primary_inverse_light;
        public static final int system_text_secondary_and_tertiary_inverse_dark = android.R.color.system_text_secondary_and_tertiary_inverse_dark;
        public static final int system_text_secondary_and_tertiary_inverse_disabled_dark = android.R.color.system_text_secondary_and_tertiary_inverse_disabled_dark;
        public static final int system_text_secondary_and_tertiary_inverse_disabled_light = android.R.color.system_text_secondary_and_tertiary_inverse_disabled_light;
        public static final int system_text_secondary_and_tertiary_inverse_light = android.R.color.system_text_secondary_and_tertiary_inverse_light;
        public static final int tab_indicator_text = android.R.color.tab_indicator_text;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int tertiary_text_dark = android.R.color.tertiary_text_dark;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int tertiary_text_light = android.R.color.tertiary_text_light;
        public static final int transparent = android.R.color.transparent;
        public static final int white = android.R.color.white;
        public static final int widget_edittext_dark = android.R.color.widget_edittext_dark;

        public color() {
            throw new RuntimeException("Stub!");
        }
    }

    public static final class dimen {
        public static final int app_icon_size = android.R.dimen.app_icon_size;
        public static final int dialog_min_width_major = android.R.dimen.dialog_min_width_major;
        public static final int dialog_min_width_minor = android.R.dimen.dialog_min_width_minor;
        public static final int notification_large_icon_height = android.R.dimen.notification_large_icon_height;
        public static final int notification_large_icon_width = android.R.dimen.notification_large_icon_width;
        public static final int system_app_widget_background_radius = android.R.dimen.system_app_widget_background_radius;
        public static final int system_app_widget_inner_radius = android.R.dimen.system_app_widget_inner_radius;
        public static final int thumbnail_height = android.R.dimen.thumbnail_height;
        public static final int thumbnail_width = android.R.dimen.thumbnail_width;

        public dimen() {
            throw new RuntimeException("Stub!");
        }
    }

    public static final class drawable {
        public static final int alert_dark_frame = android.R.drawable.alert_dark_frame;
        public static final int alert_light_frame = android.R.drawable.alert_light_frame;
        public static final int arrow_down_float = android.R.drawable.arrow_down_float;
        public static final int arrow_up_float = android.R.drawable.arrow_up_float;
        public static final int bottom_bar = android.R.drawable.bottom_bar;
        public static final int btn_default = android.R.drawable.btn_default;
        public static final int btn_default_small = android.R.drawable.btn_default_small;
        public static final int btn_dialog = android.R.drawable.btn_dialog;
        public static final int btn_dropdown = android.R.drawable.btn_dropdown;
        public static final int btn_minus = android.R.drawable.btn_minus;
        public static final int btn_plus = android.R.drawable.btn_plus;
        public static final int btn_radio = android.R.drawable.btn_radio;
        public static final int btn_star = android.R.drawable.btn_star;
        public static final int btn_star_big_off = android.R.drawable.btn_star_big_off;
        public static final int btn_star_big_on = android.R.drawable.btn_star_big_on;
        public static final int button_onoff_indicator_off = android.R.drawable.button_onoff_indicator_off;
        public static final int button_onoff_indicator_on = android.R.drawable.button_onoff_indicator_on;
        public static final int checkbox_off_background = android.R.drawable.checkbox_off_background;
        public static final int checkbox_on_background = android.R.drawable.checkbox_on_background;
        public static final int dark_header = android.R.drawable.dark_header;
        public static final int dialog_frame = android.R.drawable.dialog_frame;
        public static final int dialog_holo_dark_frame = android.R.drawable.dialog_holo_dark_frame;
        public static final int dialog_holo_light_frame = android.R.drawable.dialog_holo_light_frame;
        public static final int divider_horizontal_bright = android.R.drawable.divider_horizontal_bright;
        public static final int divider_horizontal_dark = android.R.drawable.divider_horizontal_dark;
        public static final int divider_horizontal_dim_dark = android.R.drawable.divider_horizontal_dim_dark;
        public static final int divider_horizontal_textfield = android.R.drawable.divider_horizontal_textfield;
        public static final int edit_text = android.R.drawable.edit_text;
        public static final int editbox_background = android.R.drawable.editbox_background;
        public static final int editbox_background_normal = android.R.drawable.editbox_background_normal;
        public static final int editbox_dropdown_dark_frame = android.R.drawable.editbox_dropdown_dark_frame;
        public static final int editbox_dropdown_light_frame = android.R.drawable.editbox_dropdown_light_frame;
        public static final int gallery_thumb = android.R.drawable.gallery_thumb;
        public static final int ic_btn_speak_now = android.R.drawable.ic_btn_speak_now;
        public static final int ic_delete = android.R.drawable.ic_delete;
        public static final int ic_dialog_alert = android.R.drawable.ic_dialog_alert;
        public static final int ic_dialog_dialer = android.R.drawable.ic_dialog_dialer;
        public static final int ic_dialog_email = android.R.drawable.ic_dialog_email;
        public static final int ic_dialog_info = android.R.drawable.ic_dialog_info;
        public static final int ic_dialog_map = android.R.drawable.ic_dialog_map;
        public static final int ic_input_add = android.R.drawable.ic_input_add;
        public static final int ic_input_delete = android.R.drawable.ic_input_delete;
        public static final int ic_input_get = android.R.drawable.ic_input_get;
        public static final int ic_lock_idle_alarm = android.R.drawable.ic_lock_idle_alarm;
        public static final int ic_lock_idle_charging = android.R.drawable.ic_lock_idle_charging;
        public static final int ic_lock_idle_lock = android.R.drawable.ic_lock_idle_lock;
        public static final int ic_lock_idle_low_battery = android.R.drawable.ic_lock_idle_low_battery;
        public static final int ic_lock_lock = android.R.drawable.ic_lock_lock;
        public static final int ic_lock_power_off = android.R.drawable.ic_lock_power_off;
        public static final int ic_lock_silent_mode = android.R.drawable.ic_lock_silent_mode;
        public static final int ic_lock_silent_mode_off = android.R.drawable.ic_lock_silent_mode_off;
        public static final int ic_media_ff = android.R.drawable.ic_media_ff;
        public static final int ic_media_next = android.R.drawable.ic_media_next;
        public static final int ic_media_pause = android.R.drawable.ic_media_pause;
        public static final int ic_media_play = android.R.drawable.ic_media_play;
        public static final int ic_media_previous = android.R.drawable.ic_media_previous;
        public static final int ic_media_rew = android.R.drawable.ic_media_rew;
        public static final int ic_menu_add = android.R.drawable.ic_menu_add;
        public static final int ic_menu_agenda = android.R.drawable.ic_menu_agenda;
        public static final int ic_menu_always_landscape_portrait = android.R.drawable.ic_menu_always_landscape_portrait;
        public static final int ic_menu_call = android.R.drawable.ic_menu_call;
        public static final int ic_menu_camera = android.R.drawable.ic_menu_camera;
        public static final int ic_menu_close_clear_cancel = android.R.drawable.ic_menu_close_clear_cancel;
        public static final int ic_menu_compass = android.R.drawable.ic_menu_compass;
        public static final int ic_menu_crop = android.R.drawable.ic_menu_crop;
        public static final int ic_menu_day = android.R.drawable.ic_menu_day;
        public static final int ic_menu_delete = android.R.drawable.ic_menu_delete;
        public static final int ic_menu_directions = android.R.drawable.ic_menu_directions;
        public static final int ic_menu_edit = android.R.drawable.ic_menu_edit;
        public static final int ic_menu_gallery = android.R.drawable.ic_menu_gallery;
        public static final int ic_menu_help = android.R.drawable.ic_menu_help;
        public static final int ic_menu_info_details = android.R.drawable.ic_menu_info_details;
        public static final int ic_menu_manage = android.R.drawable.ic_menu_manage;
        public static final int ic_menu_mapmode = android.R.drawable.ic_menu_mapmode;
        public static final int ic_menu_month = android.R.drawable.ic_menu_month;
        public static final int ic_menu_more = android.R.drawable.ic_menu_more;
        public static final int ic_menu_my_calendar = android.R.drawable.ic_menu_my_calendar;
        public static final int ic_menu_mylocation = android.R.drawable.ic_menu_mylocation;
        public static final int ic_menu_myplaces = android.R.drawable.ic_menu_myplaces;
        public static final int ic_menu_preferences = android.R.drawable.ic_menu_preferences;
        public static final int ic_menu_recent_history = android.R.drawable.ic_menu_recent_history;
        public static final int ic_menu_report_image = android.R.drawable.ic_menu_report_image;
        public static final int ic_menu_revert = android.R.drawable.ic_menu_revert;
        public static final int ic_menu_rotate = android.R.drawable.ic_menu_rotate;
        public static final int ic_menu_save = android.R.drawable.ic_menu_save;
        public static final int ic_menu_search = android.R.drawable.ic_menu_search;
        public static final int ic_menu_send = android.R.drawable.ic_menu_send;
        public static final int ic_menu_set_as = android.R.drawable.ic_menu_set_as;
        public static final int ic_menu_share = android.R.drawable.ic_menu_share;
        public static final int ic_menu_slideshow = android.R.drawable.ic_menu_slideshow;
        public static final int ic_menu_sort_alphabetically = android.R.drawable.ic_menu_sort_alphabetically;
        public static final int ic_menu_sort_by_size = android.R.drawable.ic_menu_sort_by_size;
        public static final int ic_menu_today = android.R.drawable.ic_menu_today;
        public static final int ic_menu_upload = android.R.drawable.ic_menu_upload;
        public static final int ic_menu_upload_you_tube = android.R.drawable.ic_menu_upload_you_tube;
        public static final int ic_menu_view = android.R.drawable.ic_menu_view;
        public static final int ic_menu_week = android.R.drawable.ic_menu_week;
        public static final int ic_menu_zoom = android.R.drawable.ic_menu_zoom;
        public static final int ic_notification_clear_all = android.R.drawable.ic_notification_clear_all;
        public static final int ic_notification_overlay = android.R.drawable.ic_notification_overlay;
        public static final int ic_partial_secure = android.R.drawable.ic_partial_secure;
        public static final int ic_popup_disk_full = android.R.drawable.ic_popup_disk_full;
        public static final int ic_popup_reminder = android.R.drawable.ic_popup_reminder;
        public static final int ic_popup_sync = android.R.drawable.ic_popup_sync;
        public static final int ic_search_category_default = android.R.drawable.ic_search_category_default;
        public static final int ic_secure = android.R.drawable.ic_secure;
        public static final int list_selector_background = android.R.drawable.list_selector_background;
        public static final int menu_frame = android.R.drawable.menu_frame;
        public static final int menu_full_frame = android.R.drawable.menu_full_frame;
        public static final int menuitem_background = android.R.drawable.menuitem_background;
        public static final int picture_frame = android.R.drawable.picture_frame;
        public static final int presence_audio_away = android.R.drawable.presence_audio_away;
        public static final int presence_audio_busy = android.R.drawable.presence_audio_busy;
        public static final int presence_audio_online = android.R.drawable.presence_audio_online;
        public static final int presence_away = android.R.drawable.presence_away;
        public static final int presence_busy = android.R.drawable.presence_busy;
        public static final int presence_invisible = android.R.drawable.presence_invisible;
        public static final int presence_offline = android.R.drawable.presence_offline;
        public static final int presence_online = android.R.drawable.presence_online;
        public static final int presence_video_away = android.R.drawable.presence_video_away;
        public static final int presence_video_busy = android.R.drawable.presence_video_busy;
        public static final int presence_video_online = android.R.drawable.presence_video_online;
        public static final int progress_horizontal = android.R.drawable.progress_horizontal;
        public static final int progress_indeterminate_horizontal = android.R.drawable.progress_indeterminate_horizontal;
        public static final int radiobutton_off_background = android.R.drawable.radiobutton_off_background;
        public static final int radiobutton_on_background = android.R.drawable.radiobutton_on_background;
        public static final int screen_background_dark = android.R.drawable.screen_background_dark;
        public static final int screen_background_dark_transparent = android.R.drawable.screen_background_dark_transparent;
        public static final int screen_background_light = android.R.drawable.screen_background_light;
        public static final int screen_background_light_transparent = android.R.drawable.screen_background_light_transparent;
        public static final int spinner_background = android.R.drawable.spinner_background;
        public static final int spinner_dropdown_background = android.R.drawable.spinner_dropdown_background;
        public static final int star_big_off = android.R.drawable.star_big_off;
        public static final int star_big_on = android.R.drawable.star_big_on;
        public static final int star_off = android.R.drawable.star_off;
        public static final int star_on = android.R.drawable.star_on;
        public static final int stat_notify_call_mute = android.R.drawable.stat_notify_call_mute;
        public static final int stat_notify_chat = android.R.drawable.stat_notify_chat;
        public static final int stat_notify_error = android.R.drawable.stat_notify_error;
        public static final int stat_notify_missed_call = android.R.drawable.stat_notify_missed_call;
        public static final int stat_notify_more = android.R.drawable.stat_notify_more;
        public static final int stat_notify_sdcard = android.R.drawable.stat_notify_sdcard;
        public static final int stat_notify_sdcard_prepare = android.R.drawable.stat_notify_sdcard_prepare;
        public static final int stat_notify_sdcard_usb = android.R.drawable.stat_notify_sdcard_usb;
        public static final int stat_notify_sync = android.R.drawable.stat_notify_sync;
        public static final int stat_notify_sync_noanim = android.R.drawable.stat_notify_sync_noanim;
        public static final int stat_notify_voicemail = android.R.drawable.stat_notify_voicemail;
        public static final int stat_sys_data_bluetooth = android.R.drawable.stat_sys_data_bluetooth;
        public static final int stat_sys_download = android.R.drawable.stat_sys_download;
        public static final int stat_sys_download_done = android.R.drawable.stat_sys_download_done;
        public static final int stat_sys_headset = android.R.drawable.stat_sys_headset;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int stat_sys_phone_call = android.R.drawable.stat_sys_phone_call;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int stat_sys_phone_call_forward = android.R.drawable.stat_sys_phone_call_forward;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int stat_sys_phone_call_on_hold = android.R.drawable.stat_sys_phone_call_on_hold;
        public static final int stat_sys_speakerphone = android.R.drawable.stat_sys_speakerphone;
        public static final int stat_sys_upload = android.R.drawable.stat_sys_upload;
        public static final int stat_sys_upload_done = android.R.drawable.stat_sys_upload_done;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int stat_sys_vp_phone_call = android.R.drawable.stat_sys_vp_phone_call;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int stat_sys_vp_phone_call_on_hold = android.R.drawable.stat_sys_vp_phone_call_on_hold;
        public static final int stat_sys_warning = android.R.drawable.stat_sys_warning;
        public static final int status_bar_item_app_background = android.R.drawable.status_bar_item_app_background;
        public static final int status_bar_item_background = android.R.drawable.status_bar_item_background;
        public static final int sym_action_call = android.R.drawable.sym_action_call;
        public static final int sym_action_chat = android.R.drawable.sym_action_chat;
        public static final int sym_action_email = android.R.drawable.sym_action_email;
        public static final int sym_call_incoming = android.R.drawable.sym_call_incoming;
        public static final int sym_call_missed = android.R.drawable.sym_call_missed;
        public static final int sym_call_outgoing = android.R.drawable.sym_call_outgoing;
        public static final int sym_contact_card = android.R.drawable.sym_contact_card;
        public static final int sym_def_app_icon = android.R.drawable.sym_def_app_icon;
        public static final int title_bar = android.R.drawable.title_bar;
        public static final int title_bar_tall = android.R.drawable.title_bar_tall;
        public static final int toast_frame = android.R.drawable.toast_frame;
        public static final int zoom_plate = android.R.drawable.zoom_plate;

        public drawable() {
            throw new RuntimeException("Stub!");
        }
    }

    public static final class fraction {
        public fraction() {
            throw new RuntimeException("Stub!");
        }
    }

    public static final class id {
        public static final int accessibilityActionContextClick = android.R.id.accessibilityActionContextClick;
        public static final int accessibilityActionDragCancel = android.R.id.accessibilityActionDragCancel;
        public static final int accessibilityActionDragDrop = android.R.id.accessibilityActionDragDrop;
        public static final int accessibilityActionDragStart = android.R.id.accessibilityActionDragStart;
        public static final int accessibilityActionHideTooltip = android.R.id.accessibilityActionHideTooltip;
        public static final int accessibilityActionImeEnter = android.R.id.accessibilityActionImeEnter;
        public static final int accessibilityActionMoveWindow = android.R.id.accessibilityActionMoveWindow;
        public static final int accessibilityActionPageDown = android.R.id.accessibilityActionPageDown;
        public static final int accessibilityActionPageLeft = android.R.id.accessibilityActionPageLeft;
        public static final int accessibilityActionPageRight = android.R.id.accessibilityActionPageRight;
        public static final int accessibilityActionPageUp = android.R.id.accessibilityActionPageUp;
        public static final int accessibilityActionPressAndHold = android.R.id.accessibilityActionPressAndHold;
        public static final int accessibilityActionScrollDown = android.R.id.accessibilityActionScrollDown;
        public static final int accessibilityActionScrollInDirection = android.R.id.accessibilityActionScrollInDirection;
        public static final int accessibilityActionScrollLeft = android.R.id.accessibilityActionScrollLeft;
        public static final int accessibilityActionScrollRight = android.R.id.accessibilityActionScrollRight;
        public static final int accessibilityActionScrollToPosition = android.R.id.accessibilityActionScrollToPosition;
        public static final int accessibilityActionScrollUp = android.R.id.accessibilityActionScrollUp;
        public static final int accessibilityActionSetProgress = android.R.id.accessibilityActionSetProgress;
        public static final int accessibilityActionShowOnScreen = android.R.id.accessibilityActionShowOnScreen;
        public static final int accessibilityActionShowTextSuggestions = android.R.id.accessibilityActionShowTextSuggestions;
        public static final int accessibilityActionShowTooltip = android.R.id.accessibilityActionShowTooltip;
        public static final int accessibilitySystemActionBack = android.R.id.accessibilitySystemActionBack;
        public static final int accessibilitySystemActionHome = android.R.id.accessibilitySystemActionHome;
        public static final int accessibilitySystemActionLockScreen = android.R.id.accessibilitySystemActionLockScreen;
        public static final int accessibilitySystemActionNotifications = android.R.id.accessibilitySystemActionNotifications;
        public static final int accessibilitySystemActionPowerDialog = android.R.id.accessibilitySystemActionPowerDialog;
        public static final int accessibilitySystemActionQuickSettings = android.R.id.accessibilitySystemActionQuickSettings;
        public static final int accessibilitySystemActionRecents = android.R.id.accessibilitySystemActionRecents;
        public static final int accessibilitySystemActionTakeScreenshot = android.R.id.accessibilitySystemActionTakeScreenshot;
        public static final int accessibilitySystemActionToggleSplitScreen = android.R.id.accessibilitySystemActionToggleSplitScreen;
        public static final int addToDictionary = android.R.id.addToDictionary;
        public static final int autofill = android.R.id.autofill;
        public static final int background = android.R.id.background;
        public static final int bold = android.R.id.bold;
        public static final int button1 = android.R.id.button1;
        public static final int button2 = android.R.id.button2;
        public static final int button3 = android.R.id.button3;
        public static final int candidatesArea = android.R.id.candidatesArea;
        public static final int checkbox = android.R.id.checkbox;
        public static final int closeButton = android.R.id.closeButton;
        public static final int content = android.R.id.content;
        public static final int copy = android.R.id.copy;
        public static final int copyUrl = android.R.id.copyUrl;
        public static final int custom = android.R.id.custom;
        public static final int cut = android.R.id.cut;
        public static final int edit = android.R.id.edit;
        public static final int empty = android.R.id.empty;
        public static final int extractArea = android.R.id.extractArea;
        public static final int hint = android.R.id.hint;
        public static final int home = android.R.id.home;
        public static final int icon = android.R.id.icon;
        public static final int icon1 = android.R.id.icon1;
        public static final int icon2 = android.R.id.icon2;
        public static final int icon_frame = android.R.id.icon_frame;
        public static final int input = android.R.id.input;
        public static final int inputArea = android.R.id.inputArea;
        public static final int inputExtractAccessories = android.R.id.inputExtractAccessories;
        public static final int inputExtractAction = android.R.id.inputExtractAction;
        public static final int inputExtractEditText = android.R.id.inputExtractEditText;
        public static final int italic = android.R.id.italic;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int list = android.R.id.list;
        public static final int list_container = android.R.id.list_container;
        public static final int mask = android.R.id.mask;
        public static final int message = android.R.id.message;
        public static final int navigationBarBackground = android.R.id.navigationBarBackground;
        public static final int paste = android.R.id.paste;
        public static final int pasteAsPlainText = android.R.id.pasteAsPlainText;
        public static final int primary = android.R.id.primary;
        public static final int progress = android.R.id.progress;
        public static final int redo = android.R.id.redo;
        public static final int replaceText = android.R.id.replaceText;
        public static final int secondaryProgress = android.R.id.secondaryProgress;
        public static final int selectAll = android.R.id.selectAll;
        public static final int selectTextMode = android.R.id.selectTextMode;
        public static final int selectedIcon = android.R.id.selectedIcon;
        public static final int shareText = android.R.id.shareText;
        public static final int startSelectingText = android.R.id.startSelectingText;
        public static final int statusBarBackground = android.R.id.statusBarBackground;
        public static final int stopSelectingText = android.R.id.stopSelectingText;
        public static final int summary = android.R.id.summary;
        public static final int switchInputMethod = android.R.id.switchInputMethod;
        public static final int switch_widget = android.R.id.switch_widget;
        public static final int tabcontent = android.R.id.tabcontent;
        public static final int tabhost = android.R.id.tabhost;
        public static final int tabs = android.R.id.tabs;
        public static final int text1 = android.R.id.text1;
        public static final int text2 = android.R.id.text2;
        public static final int textAssist = android.R.id.textAssist;
        public static final int title = android.R.id.title;
        public static final int toggle = android.R.id.toggle;
        public static final int underline = android.R.id.underline;
        public static final int undo = android.R.id.undo;
        public static final int widget_frame = android.R.id.widget_frame;

        public id() {
            throw new RuntimeException("Stub!");
        }
    }

    public static final class integer {
        public static final int config_longAnimTime = android.R.integer.config_longAnimTime;
        public static final int config_mediumAnimTime = android.R.integer.config_mediumAnimTime;
        public static final int config_shortAnimTime = android.R.integer.config_shortAnimTime;
        public static final int status_bar_notification_info_maxnum = android.R.integer.status_bar_notification_info_maxnum;

        public integer() {
            throw new RuntimeException("Stub!");
        }
    }

    public static final class interpolator {
        public static final int accelerate_cubic = android.R.interpolator.accelerate_cubic;
        public static final int accelerate_decelerate = android.R.interpolator.accelerate_decelerate;
        public static final int accelerate_quad = android.R.interpolator.accelerate_quad;
        public static final int accelerate_quint = android.R.interpolator.accelerate_quint;
        public static final int anticipate = android.R.interpolator.anticipate;
        public static final int anticipate_overshoot = android.R.interpolator.anticipate_overshoot;
        public static final int bounce = android.R.interpolator.bounce;
        public static final int cycle = android.R.interpolator.cycle;
        public static final int decelerate_cubic = android.R.interpolator.decelerate_cubic;
        public static final int decelerate_quad = android.R.interpolator.decelerate_quad;
        public static final int decelerate_quint = android.R.interpolator.decelerate_quint;
        public static final int fast_out_extra_slow_in = android.R.interpolator.fast_out_extra_slow_in;
        public static final int fast_out_linear_in = android.R.interpolator.fast_out_linear_in;
        public static final int fast_out_slow_in = android.R.interpolator.fast_out_slow_in;
        public static final int linear = android.R.interpolator.linear;
        public static final int linear_out_slow_in = android.R.interpolator.linear_out_slow_in;
        public static final int overshoot = android.R.interpolator.overshoot;

        public interpolator() {
            throw new RuntimeException("Stub!");
        }
    }

    public static final class layout {
        public static final int activity_list_item = android.R.layout.activity_list_item;
        public static final int browser_link_context_header = android.R.layout.browser_link_context_header;
        public static final int expandable_list_content = android.R.layout.expandable_list_content;
        public static final int list_content = android.R.layout.list_content;
        public static final int preference_category = android.R.layout.preference_category;
        public static final int select_dialog_item = android.R.layout.select_dialog_item;
        public static final int select_dialog_multichoice = android.R.layout.select_dialog_multichoice;
        public static final int select_dialog_singlechoice = android.R.layout.select_dialog_singlechoice;
        public static final int simple_dropdown_item_1line = android.R.layout.simple_dropdown_item_1line;
        public static final int simple_expandable_list_item_1 = android.R.layout.simple_expandable_list_item_1;
        public static final int simple_expandable_list_item_2 = android.R.layout.simple_expandable_list_item_2;
        public static final int simple_gallery_item = android.R.layout.simple_gallery_item;
        public static final int simple_list_item_1 = android.R.layout.simple_list_item_1;
        public static final int simple_list_item_2 = android.R.layout.simple_list_item_2;
        public static final int simple_list_item_activated_1 = android.R.layout.simple_list_item_activated_1;
        public static final int simple_list_item_activated_2 = android.R.layout.simple_list_item_activated_2;
        public static final int simple_list_item_checked = android.R.layout.simple_list_item_checked;
        public static final int simple_list_item_multiple_choice = android.R.layout.simple_list_item_multiple_choice;
        public static final int simple_list_item_single_choice = android.R.layout.simple_list_item_single_choice;
        public static final int simple_selectable_list_item = android.R.layout.simple_selectable_list_item;
        public static final int simple_spinner_dropdown_item = android.R.layout.simple_spinner_dropdown_item;
        public static final int simple_spinner_item = android.R.layout.simple_spinner_item;
        public static final int test_list_item = android.R.layout.test_list_item;
        public static final int two_line_list_item = android.R.layout.two_line_list_item;

        public layout() {
            throw new RuntimeException("Stub!");
        }
    }

    public static final class menu {
        public menu() {
            throw new RuntimeException("Stub!");
        }
    }

    public static final class mipmap {
        public static final int sym_def_app_icon = android.R.mipmap.sym_def_app_icon;

        public mipmap() {
            throw new RuntimeException("Stub!");
        }
    }

    public static final class plurals {
        public plurals() {
            throw new RuntimeException("Stub!");
        }
    }

    public static final class raw {
        public raw() {
            throw new RuntimeException("Stub!");
        }
    }

    public static final class string {
        public static final int VideoView_error_button = android.R.string.VideoView_error_button;
        public static final int VideoView_error_text_invalid_progressive_playback = android.R.string.VideoView_error_text_invalid_progressive_playback;
        public static final int VideoView_error_text_unknown = android.R.string.VideoView_error_text_unknown;
        public static final int VideoView_error_title = android.R.string.VideoView_error_title;
        public static final int autofill = android.R.string.autofill;
        public static final int cancel = android.R.string.cancel;
        public static final int copy = android.R.string.copy;
        public static final int copyUrl = android.R.string.copyUrl;
        public static final int cut = android.R.string.cut;
        public static final int defaultMsisdnAlphaTag = android.R.string.defaultMsisdnAlphaTag;
        public static final int defaultVoiceMailAlphaTag = android.R.string.defaultVoiceMailAlphaTag;
        public static final int dialog_alert_title = android.R.string.dialog_alert_title;
        public static final int emptyPhoneNumber = android.R.string.emptyPhoneNumber;
        public static final int fingerprint_icon_content_description = android.R.string.fingerprint_icon_content_description;
        public static final int httpErrorBadUrl = android.R.string.httpErrorBadUrl;
        public static final int httpErrorUnsupportedScheme = android.R.string.httpErrorUnsupportedScheme;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int no = android.R.string.no;
        public static final int ok = android.R.string.ok;
        public static final int paste = android.R.string.paste;
        public static final int paste_as_plain_text = android.R.string.paste_as_plain_text;
        public static final int search_go = android.R.string.search_go;
        public static final int selectAll = android.R.string.selectAll;
        public static final int selectTextMode = android.R.string.selectTextMode;
        public static final int status_bar_notification_info_overflow = android.R.string.status_bar_notification_info_overflow;
        public static final int unknownName = android.R.string.unknownName;
        public static final int untitled = android.R.string.untitled;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int yes = android.R.string.yes;

        public string() {
            throw new RuntimeException("Stub!");
        }
    }

    public static final class style {
        public static final int Animation = android.R.style.Animation;
        public static final int Animation_Activity = android.R.style.Animation_Activity;
        public static final int Animation_Dialog = android.R.style.Animation_Dialog;
        public static final int Animation_InputMethod = android.R.style.Animation_InputMethod;
        public static final int Animation_Toast = android.R.style.Animation_Toast;
        public static final int Animation_Translucent = android.R.style.Animation_Translucent;
        public static final int DeviceDefault_ButtonBar = android.R.style.DeviceDefault_ButtonBar;
        public static final int DeviceDefault_ButtonBar_AlertDialog = android.R.style.DeviceDefault_ButtonBar_AlertDialog;
        public static final int DeviceDefault_Light_ButtonBar = android.R.style.DeviceDefault_Light_ButtonBar;
        public static final int DeviceDefault_Light_ButtonBar_AlertDialog = android.R.style.DeviceDefault_Light_ButtonBar_AlertDialog;
        public static final int DeviceDefault_Light_SegmentedButton = android.R.style.DeviceDefault_Light_SegmentedButton;
        public static final int DeviceDefault_SegmentedButton = android.R.style.DeviceDefault_SegmentedButton;
        public static final int Holo_ButtonBar = android.R.style.Holo_ButtonBar;
        public static final int Holo_ButtonBar_AlertDialog = android.R.style.Holo_ButtonBar_AlertDialog;
        public static final int Holo_Light_ButtonBar = android.R.style.Holo_Light_ButtonBar;
        public static final int Holo_Light_ButtonBar_AlertDialog = android.R.style.Holo_Light_ButtonBar_AlertDialog;
        public static final int Holo_Light_SegmentedButton = android.R.style.Holo_Light_SegmentedButton;
        public static final int Holo_SegmentedButton = android.R.style.Holo_SegmentedButton;
        public static final int MediaButton = android.R.style.MediaButton;
        public static final int MediaButton_Ffwd = android.R.style.MediaButton_Ffwd;
        public static final int MediaButton_Next = android.R.style.MediaButton_Next;
        public static final int MediaButton_Pause = android.R.style.MediaButton_Pause;
        public static final int MediaButton_Play = android.R.style.MediaButton_Play;
        public static final int MediaButton_Previous = android.R.style.MediaButton_Previous;
        public static final int MediaButton_Rew = android.R.style.MediaButton_Rew;
        public static final int TextAppearance = android.R.style.TextAppearance;
        public static final int TextAppearance_DeviceDefault = android.R.style.TextAppearance_DeviceDefault;
        public static final int TextAppearance_DeviceDefault_DialogWindowTitle = android.R.style.TextAppearance_DeviceDefault_DialogWindowTitle;
        public static final int TextAppearance_DeviceDefault_Headline = android.R.style.TextAppearance_DeviceDefault_Headline;
        public static final int TextAppearance_DeviceDefault_Inverse = android.R.style.TextAppearance_DeviceDefault_Inverse;
        public static final int TextAppearance_DeviceDefault_Large = android.R.style.TextAppearance_DeviceDefault_Large;
        public static final int TextAppearance_DeviceDefault_Large_Inverse = android.R.style.TextAppearance_DeviceDefault_Large_Inverse;
        public static final int TextAppearance_DeviceDefault_Medium = android.R.style.TextAppearance_DeviceDefault_Medium;
        public static final int TextAppearance_DeviceDefault_Medium_Inverse = android.R.style.TextAppearance_DeviceDefault_Medium_Inverse;
        public static final int TextAppearance_DeviceDefault_SearchResult_Subtitle = android.R.style.TextAppearance_DeviceDefault_SearchResult_Subtitle;
        public static final int TextAppearance_DeviceDefault_SearchResult_Title = android.R.style.TextAppearance_DeviceDefault_SearchResult_Title;
        public static final int TextAppearance_DeviceDefault_Small = android.R.style.TextAppearance_DeviceDefault_Small;
        public static final int TextAppearance_DeviceDefault_Small_Inverse = android.R.style.TextAppearance_DeviceDefault_Small_Inverse;
        public static final int TextAppearance_DeviceDefault_Widget = android.R.style.TextAppearance_DeviceDefault_Widget;
        public static final int TextAppearance_DeviceDefault_Widget_ActionBar_Menu = android.R.style.TextAppearance_DeviceDefault_Widget_ActionBar_Menu;
        public static final int TextAppearance_DeviceDefault_Widget_ActionBar_Subtitle = android.R.style.TextAppearance_DeviceDefault_Widget_ActionBar_Subtitle;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int TextAppearance_DeviceDefault_Widget_ActionBar_Subtitle_Inverse = android.R.style.TextAppearance_DeviceDefault_Widget_ActionBar_Subtitle_Inverse;
        public static final int TextAppearance_DeviceDefault_Widget_ActionBar_Title = android.R.style.TextAppearance_DeviceDefault_Widget_ActionBar_Title;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int TextAppearance_DeviceDefault_Widget_ActionBar_Title_Inverse = android.R.style.TextAppearance_DeviceDefault_Widget_ActionBar_Title_Inverse;
        public static final int TextAppearance_DeviceDefault_Widget_ActionMode_Subtitle = android.R.style.TextAppearance_DeviceDefault_Widget_ActionMode_Subtitle;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int TextAppearance_DeviceDefault_Widget_ActionMode_Subtitle_Inverse = android.R.style.TextAppearance_DeviceDefault_Widget_ActionMode_Subtitle_Inverse;
        public static final int TextAppearance_DeviceDefault_Widget_ActionMode_Title = android.R.style.TextAppearance_DeviceDefault_Widget_ActionMode_Title;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int TextAppearance_DeviceDefault_Widget_ActionMode_Title_Inverse = android.R.style.TextAppearance_DeviceDefault_Widget_ActionMode_Title_Inverse;
        public static final int TextAppearance_DeviceDefault_Widget_Button = android.R.style.TextAppearance_DeviceDefault_Widget_Button;
        public static final int TextAppearance_DeviceDefault_Widget_DropDownHint = android.R.style.TextAppearance_DeviceDefault_Widget_DropDownHint;
        public static final int TextAppearance_DeviceDefault_Widget_DropDownItem = android.R.style.TextAppearance_DeviceDefault_Widget_DropDownItem;
        public static final int TextAppearance_DeviceDefault_Widget_EditText = android.R.style.TextAppearance_DeviceDefault_Widget_EditText;
        public static final int TextAppearance_DeviceDefault_Widget_IconMenu_Item = android.R.style.TextAppearance_DeviceDefault_Widget_IconMenu_Item;
        public static final int TextAppearance_DeviceDefault_Widget_PopupMenu = android.R.style.TextAppearance_DeviceDefault_Widget_PopupMenu;
        public static final int TextAppearance_DeviceDefault_Widget_PopupMenu_Large = android.R.style.TextAppearance_DeviceDefault_Widget_PopupMenu_Large;
        public static final int TextAppearance_DeviceDefault_Widget_PopupMenu_Small = android.R.style.TextAppearance_DeviceDefault_Widget_PopupMenu_Small;
        public static final int TextAppearance_DeviceDefault_Widget_TabWidget = android.R.style.TextAppearance_DeviceDefault_Widget_TabWidget;
        public static final int TextAppearance_DeviceDefault_Widget_TextView = android.R.style.TextAppearance_DeviceDefault_Widget_TextView;
        public static final int TextAppearance_DeviceDefault_Widget_TextView_PopupMenu = android.R.style.TextAppearance_DeviceDefault_Widget_TextView_PopupMenu;
        public static final int TextAppearance_DeviceDefault_Widget_TextView_SpinnerItem = android.R.style.TextAppearance_DeviceDefault_Widget_TextView_SpinnerItem;
        public static final int TextAppearance_DeviceDefault_WindowTitle = android.R.style.TextAppearance_DeviceDefault_WindowTitle;
        public static final int TextAppearance_DialogWindowTitle = android.R.style.TextAppearance_DialogWindowTitle;
        public static final int TextAppearance_Holo = android.R.style.TextAppearance_Holo;
        public static final int TextAppearance_Holo_DialogWindowTitle = android.R.style.TextAppearance_Holo_DialogWindowTitle;
        public static final int TextAppearance_Holo_Inverse = android.R.style.TextAppearance_Holo_Inverse;
        public static final int TextAppearance_Holo_Large = android.R.style.TextAppearance_Holo_Large;
        public static final int TextAppearance_Holo_Large_Inverse = android.R.style.TextAppearance_Holo_Large_Inverse;
        public static final int TextAppearance_Holo_Medium = android.R.style.TextAppearance_Holo_Medium;
        public static final int TextAppearance_Holo_Medium_Inverse = android.R.style.TextAppearance_Holo_Medium_Inverse;
        public static final int TextAppearance_Holo_SearchResult_Subtitle = android.R.style.TextAppearance_Holo_SearchResult_Subtitle;
        public static final int TextAppearance_Holo_SearchResult_Title = android.R.style.TextAppearance_Holo_SearchResult_Title;
        public static final int TextAppearance_Holo_Small = android.R.style.TextAppearance_Holo_Small;
        public static final int TextAppearance_Holo_Small_Inverse = android.R.style.TextAppearance_Holo_Small_Inverse;
        public static final int TextAppearance_Holo_Widget = android.R.style.TextAppearance_Holo_Widget;
        public static final int TextAppearance_Holo_Widget_ActionBar_Menu = android.R.style.TextAppearance_Holo_Widget_ActionBar_Menu;
        public static final int TextAppearance_Holo_Widget_ActionBar_Subtitle = android.R.style.TextAppearance_Holo_Widget_ActionBar_Subtitle;
        public static final int TextAppearance_Holo_Widget_ActionBar_Subtitle_Inverse = android.R.style.TextAppearance_Holo_Widget_ActionBar_Subtitle_Inverse;
        public static final int TextAppearance_Holo_Widget_ActionBar_Title = android.R.style.TextAppearance_Holo_Widget_ActionBar_Title;
        public static final int TextAppearance_Holo_Widget_ActionBar_Title_Inverse = android.R.style.TextAppearance_Holo_Widget_ActionBar_Title_Inverse;
        public static final int TextAppearance_Holo_Widget_ActionMode_Subtitle = android.R.style.TextAppearance_Holo_Widget_ActionMode_Subtitle;
        public static final int TextAppearance_Holo_Widget_ActionMode_Subtitle_Inverse = android.R.style.TextAppearance_Holo_Widget_ActionMode_Subtitle_Inverse;
        public static final int TextAppearance_Holo_Widget_ActionMode_Title = android.R.style.TextAppearance_Holo_Widget_ActionMode_Title;
        public static final int TextAppearance_Holo_Widget_ActionMode_Title_Inverse = android.R.style.TextAppearance_Holo_Widget_ActionMode_Title_Inverse;
        public static final int TextAppearance_Holo_Widget_Button = android.R.style.TextAppearance_Holo_Widget_Button;
        public static final int TextAppearance_Holo_Widget_DropDownHint = android.R.style.TextAppearance_Holo_Widget_DropDownHint;
        public static final int TextAppearance_Holo_Widget_DropDownItem = android.R.style.TextAppearance_Holo_Widget_DropDownItem;
        public static final int TextAppearance_Holo_Widget_EditText = android.R.style.TextAppearance_Holo_Widget_EditText;
        public static final int TextAppearance_Holo_Widget_IconMenu_Item = android.R.style.TextAppearance_Holo_Widget_IconMenu_Item;
        public static final int TextAppearance_Holo_Widget_PopupMenu = android.R.style.TextAppearance_Holo_Widget_PopupMenu;
        public static final int TextAppearance_Holo_Widget_PopupMenu_Large = android.R.style.TextAppearance_Holo_Widget_PopupMenu_Large;
        public static final int TextAppearance_Holo_Widget_PopupMenu_Small = android.R.style.TextAppearance_Holo_Widget_PopupMenu_Small;
        public static final int TextAppearance_Holo_Widget_TabWidget = android.R.style.TextAppearance_Holo_Widget_TabWidget;
        public static final int TextAppearance_Holo_Widget_TextView = android.R.style.TextAppearance_Holo_Widget_TextView;
        public static final int TextAppearance_Holo_Widget_TextView_PopupMenu = android.R.style.TextAppearance_Holo_Widget_TextView_PopupMenu;
        public static final int TextAppearance_Holo_Widget_TextView_SpinnerItem = android.R.style.TextAppearance_Holo_Widget_TextView_SpinnerItem;
        public static final int TextAppearance_Holo_WindowTitle = android.R.style.TextAppearance_Holo_WindowTitle;
        public static final int TextAppearance_Inverse = android.R.style.TextAppearance_Inverse;
        public static final int TextAppearance_Large = android.R.style.TextAppearance_Large;
        public static final int TextAppearance_Large_Inverse = android.R.style.TextAppearance_Large_Inverse;
        public static final int TextAppearance_Material = android.R.style.TextAppearance_Material;
        public static final int TextAppearance_Material_Body1 = android.R.style.TextAppearance_Material_Body1;
        public static final int TextAppearance_Material_Body2 = android.R.style.TextAppearance_Material_Body2;
        public static final int TextAppearance_Material_Button = android.R.style.TextAppearance_Material_Button;
        public static final int TextAppearance_Material_Caption = android.R.style.TextAppearance_Material_Caption;
        public static final int TextAppearance_Material_DialogWindowTitle = android.R.style.TextAppearance_Material_DialogWindowTitle;
        public static final int TextAppearance_Material_Display1 = android.R.style.TextAppearance_Material_Display1;
        public static final int TextAppearance_Material_Display2 = android.R.style.TextAppearance_Material_Display2;
        public static final int TextAppearance_Material_Display3 = android.R.style.TextAppearance_Material_Display3;
        public static final int TextAppearance_Material_Display4 = android.R.style.TextAppearance_Material_Display4;
        public static final int TextAppearance_Material_Headline = android.R.style.TextAppearance_Material_Headline;
        public static final int TextAppearance_Material_Inverse = android.R.style.TextAppearance_Material_Inverse;
        public static final int TextAppearance_Material_Large = android.R.style.TextAppearance_Material_Large;
        public static final int TextAppearance_Material_Large_Inverse = android.R.style.TextAppearance_Material_Large_Inverse;
        public static final int TextAppearance_Material_Medium = android.R.style.TextAppearance_Material_Medium;
        public static final int TextAppearance_Material_Medium_Inverse = android.R.style.TextAppearance_Material_Medium_Inverse;
        public static final int TextAppearance_Material_Menu = android.R.style.TextAppearance_Material_Menu;
        public static final int TextAppearance_Material_Notification = android.R.style.TextAppearance_Material_Notification;
        public static final int TextAppearance_Material_Notification_Emphasis = android.R.style.TextAppearance_Material_Notification_Emphasis;
        public static final int TextAppearance_Material_Notification_Info = android.R.style.TextAppearance_Material_Notification_Info;
        public static final int TextAppearance_Material_Notification_Line2 = android.R.style.TextAppearance_Material_Notification_Line2;
        public static final int TextAppearance_Material_Notification_Time = android.R.style.TextAppearance_Material_Notification_Time;
        public static final int TextAppearance_Material_Notification_Title = android.R.style.TextAppearance_Material_Notification_Title;
        public static final int TextAppearance_Material_SearchResult_Subtitle = android.R.style.TextAppearance_Material_SearchResult_Subtitle;
        public static final int TextAppearance_Material_SearchResult_Title = android.R.style.TextAppearance_Material_SearchResult_Title;
        public static final int TextAppearance_Material_Small = android.R.style.TextAppearance_Material_Small;
        public static final int TextAppearance_Material_Small_Inverse = android.R.style.TextAppearance_Material_Small_Inverse;
        public static final int TextAppearance_Material_Subhead = android.R.style.TextAppearance_Material_Subhead;
        public static final int TextAppearance_Material_Title = android.R.style.TextAppearance_Material_Title;
        public static final int TextAppearance_Material_Widget = android.R.style.TextAppearance_Material_Widget;
        public static final int TextAppearance_Material_Widget_ActionBar_Menu = android.R.style.TextAppearance_Material_Widget_ActionBar_Menu;
        public static final int TextAppearance_Material_Widget_ActionBar_Subtitle = android.R.style.TextAppearance_Material_Widget_ActionBar_Subtitle;
        public static final int TextAppearance_Material_Widget_ActionBar_Subtitle_Inverse = android.R.style.TextAppearance_Material_Widget_ActionBar_Subtitle_Inverse;
        public static final int TextAppearance_Material_Widget_ActionBar_Title = android.R.style.TextAppearance_Material_Widget_ActionBar_Title;
        public static final int TextAppearance_Material_Widget_ActionBar_Title_Inverse = android.R.style.TextAppearance_Material_Widget_ActionBar_Title_Inverse;
        public static final int TextAppearance_Material_Widget_ActionMode_Subtitle = android.R.style.TextAppearance_Material_Widget_ActionMode_Subtitle;
        public static final int TextAppearance_Material_Widget_ActionMode_Subtitle_Inverse = android.R.style.TextAppearance_Material_Widget_ActionMode_Subtitle_Inverse;
        public static final int TextAppearance_Material_Widget_ActionMode_Title = android.R.style.TextAppearance_Material_Widget_ActionMode_Title;
        public static final int TextAppearance_Material_Widget_ActionMode_Title_Inverse = android.R.style.TextAppearance_Material_Widget_ActionMode_Title_Inverse;
        public static final int TextAppearance_Material_Widget_Button = android.R.style.TextAppearance_Material_Widget_Button;
        public static final int TextAppearance_Material_Widget_Button_Borderless_Colored = android.R.style.TextAppearance_Material_Widget_Button_Borderless_Colored;
        public static final int TextAppearance_Material_Widget_Button_Colored = android.R.style.TextAppearance_Material_Widget_Button_Colored;
        public static final int TextAppearance_Material_Widget_Button_Inverse = android.R.style.TextAppearance_Material_Widget_Button_Inverse;
        public static final int TextAppearance_Material_Widget_DropDownHint = android.R.style.TextAppearance_Material_Widget_DropDownHint;
        public static final int TextAppearance_Material_Widget_DropDownItem = android.R.style.TextAppearance_Material_Widget_DropDownItem;
        public static final int TextAppearance_Material_Widget_EditText = android.R.style.TextAppearance_Material_Widget_EditText;
        public static final int TextAppearance_Material_Widget_IconMenu_Item = android.R.style.TextAppearance_Material_Widget_IconMenu_Item;
        public static final int TextAppearance_Material_Widget_PopupMenu = android.R.style.TextAppearance_Material_Widget_PopupMenu;
        public static final int TextAppearance_Material_Widget_PopupMenu_Large = android.R.style.TextAppearance_Material_Widget_PopupMenu_Large;
        public static final int TextAppearance_Material_Widget_PopupMenu_Small = android.R.style.TextAppearance_Material_Widget_PopupMenu_Small;
        public static final int TextAppearance_Material_Widget_TabWidget = android.R.style.TextAppearance_Material_Widget_TabWidget;
        public static final int TextAppearance_Material_Widget_TextView = android.R.style.TextAppearance_Material_Widget_TextView;
        public static final int TextAppearance_Material_Widget_TextView_PopupMenu = android.R.style.TextAppearance_Material_Widget_TextView_PopupMenu;
        public static final int TextAppearance_Material_Widget_TextView_SpinnerItem = android.R.style.TextAppearance_Material_Widget_TextView_SpinnerItem;
        public static final int TextAppearance_Material_Widget_Toolbar_Subtitle = android.R.style.TextAppearance_Material_Widget_Toolbar_Subtitle;
        public static final int TextAppearance_Material_Widget_Toolbar_Title = android.R.style.TextAppearance_Material_Widget_Toolbar_Title;
        public static final int TextAppearance_Material_WindowTitle = android.R.style.TextAppearance_Material_WindowTitle;
        public static final int TextAppearance_Medium = android.R.style.TextAppearance_Medium;
        public static final int TextAppearance_Medium_Inverse = android.R.style.TextAppearance_Medium_Inverse;
        public static final int TextAppearance_Small = android.R.style.TextAppearance_Small;
        public static final int TextAppearance_Small_Inverse = android.R.style.TextAppearance_Small_Inverse;
        public static final int TextAppearance_StatusBar_EventContent = android.R.style.TextAppearance_StatusBar_EventContent;
        public static final int TextAppearance_StatusBar_EventContent_Title = android.R.style.TextAppearance_StatusBar_EventContent_Title;
        public static final int TextAppearance_StatusBar_Icon = android.R.style.TextAppearance_StatusBar_Icon;
        public static final int TextAppearance_StatusBar_Title = android.R.style.TextAppearance_StatusBar_Title;
        public static final int TextAppearance_SuggestionHighlight = android.R.style.TextAppearance_SuggestionHighlight;
        public static final int TextAppearance_Theme = android.R.style.TextAppearance_Theme;
        public static final int TextAppearance_Theme_Dialog = android.R.style.TextAppearance_Theme_Dialog;
        public static final int TextAppearance_Widget = android.R.style.TextAppearance_Widget;
        public static final int TextAppearance_Widget_Button = android.R.style.TextAppearance_Widget_Button;
        public static final int TextAppearance_Widget_DropDownHint = android.R.style.TextAppearance_Widget_DropDownHint;
        public static final int TextAppearance_Widget_DropDownItem = android.R.style.TextAppearance_Widget_DropDownItem;
        public static final int TextAppearance_Widget_EditText = android.R.style.TextAppearance_Widget_EditText;
        public static final int TextAppearance_Widget_IconMenu_Item = android.R.style.TextAppearance_Widget_IconMenu_Item;
        public static final int TextAppearance_Widget_PopupMenu_Large = android.R.style.TextAppearance_Widget_PopupMenu_Large;
        public static final int TextAppearance_Widget_PopupMenu_Small = android.R.style.TextAppearance_Widget_PopupMenu_Small;
        public static final int TextAppearance_Widget_TabWidget = android.R.style.TextAppearance_Widget_TabWidget;
        public static final int TextAppearance_Widget_TextView = android.R.style.TextAppearance_Widget_TextView;
        public static final int TextAppearance_Widget_TextView_PopupMenu = android.R.style.TextAppearance_Widget_TextView_PopupMenu;
        public static final int TextAppearance_Widget_TextView_SpinnerItem = android.R.style.TextAppearance_Widget_TextView_SpinnerItem;
        public static final int TextAppearance_WindowTitle = android.R.style.TextAppearance_WindowTitle;
        public static final int Theme = android.R.style.Theme;
        public static final int ThemeOverlay = android.R.style.ThemeOverlay;
        public static final int ThemeOverlay_DeviceDefault_Accent_DayNight = android.R.style.ThemeOverlay_DeviceDefault_Accent_DayNight;
        public static final int ThemeOverlay_Material = android.R.style.ThemeOverlay_Material;
        public static final int ThemeOverlay_Material_ActionBar = android.R.style.ThemeOverlay_Material_ActionBar;
        public static final int ThemeOverlay_Material_Dark = android.R.style.ThemeOverlay_Material_Dark;
        public static final int ThemeOverlay_Material_Dark_ActionBar = android.R.style.ThemeOverlay_Material_Dark_ActionBar;
        public static final int ThemeOverlay_Material_Dialog = android.R.style.ThemeOverlay_Material_Dialog;
        public static final int ThemeOverlay_Material_Dialog_Alert = android.R.style.ThemeOverlay_Material_Dialog_Alert;
        public static final int ThemeOverlay_Material_Light = android.R.style.ThemeOverlay_Material_Light;
        public static final int Theme_Black = android.R.style.Theme_Black;
        public static final int Theme_Black_NoTitleBar = android.R.style.Theme_Black_NoTitleBar;
        public static final int Theme_Black_NoTitleBar_Fullscreen = android.R.style.Theme_Black_NoTitleBar_Fullscreen;
        public static final int Theme_DeviceDefault = android.R.style.Theme_DeviceDefault;
        public static final int Theme_DeviceDefault_DayNight = android.R.style.Theme_DeviceDefault_DayNight;
        public static final int Theme_DeviceDefault_Dialog = android.R.style.Theme_DeviceDefault_Dialog;
        public static final int Theme_DeviceDefault_DialogWhenLarge = android.R.style.Theme_DeviceDefault_DialogWhenLarge;
        public static final int Theme_DeviceDefault_DialogWhenLarge_NoActionBar = android.R.style.Theme_DeviceDefault_DialogWhenLarge_NoActionBar;
        public static final int Theme_DeviceDefault_Dialog_Alert = android.R.style.Theme_DeviceDefault_Dialog_Alert;
        public static final int Theme_DeviceDefault_Dialog_MinWidth = android.R.style.Theme_DeviceDefault_Dialog_MinWidth;
        public static final int Theme_DeviceDefault_Dialog_NoActionBar = android.R.style.Theme_DeviceDefault_Dialog_NoActionBar;
        public static final int Theme_DeviceDefault_Dialog_NoActionBar_MinWidth = android.R.style.Theme_DeviceDefault_Dialog_NoActionBar_MinWidth;
        public static final int Theme_DeviceDefault_InputMethod = android.R.style.Theme_DeviceDefault_InputMethod;
        public static final int Theme_DeviceDefault_Light = android.R.style.Theme_DeviceDefault_Light;
        public static final int Theme_DeviceDefault_Light_DarkActionBar = android.R.style.Theme_DeviceDefault_Light_DarkActionBar;
        public static final int Theme_DeviceDefault_Light_Dialog = android.R.style.Theme_DeviceDefault_Light_Dialog;
        public static final int Theme_DeviceDefault_Light_DialogWhenLarge = android.R.style.Theme_DeviceDefault_Light_DialogWhenLarge;
        public static final int Theme_DeviceDefault_Light_DialogWhenLarge_NoActionBar = android.R.style.Theme_DeviceDefault_Light_DialogWhenLarge_NoActionBar;
        public static final int Theme_DeviceDefault_Light_Dialog_Alert = android.R.style.Theme_DeviceDefault_Light_Dialog_Alert;
        public static final int Theme_DeviceDefault_Light_Dialog_MinWidth = android.R.style.Theme_DeviceDefault_Light_Dialog_MinWidth;
        public static final int Theme_DeviceDefault_Light_Dialog_NoActionBar = android.R.style.Theme_DeviceDefault_Light_Dialog_NoActionBar;
        public static final int Theme_DeviceDefault_Light_Dialog_NoActionBar_MinWidth = android.R.style.Theme_DeviceDefault_Light_Dialog_NoActionBar_MinWidth;
        public static final int Theme_DeviceDefault_Light_NoActionBar = android.R.style.Theme_DeviceDefault_Light_NoActionBar;
        public static final int Theme_DeviceDefault_Light_NoActionBar_Fullscreen = android.R.style.Theme_DeviceDefault_Light_NoActionBar_Fullscreen;
        public static final int Theme_DeviceDefault_Light_NoActionBar_Overscan = android.R.style.Theme_DeviceDefault_Light_NoActionBar_Overscan;
        public static final int Theme_DeviceDefault_Light_NoActionBar_TranslucentDecor = android.R.style.Theme_DeviceDefault_Light_NoActionBar_TranslucentDecor;
        public static final int Theme_DeviceDefault_Light_Panel = android.R.style.Theme_DeviceDefault_Light_Panel;
        public static final int Theme_DeviceDefault_NoActionBar = android.R.style.Theme_DeviceDefault_NoActionBar;
        public static final int Theme_DeviceDefault_NoActionBar_Fullscreen = android.R.style.Theme_DeviceDefault_NoActionBar_Fullscreen;
        public static final int Theme_DeviceDefault_NoActionBar_Overscan = android.R.style.Theme_DeviceDefault_NoActionBar_Overscan;
        public static final int Theme_DeviceDefault_NoActionBar_TranslucentDecor = android.R.style.Theme_DeviceDefault_NoActionBar_TranslucentDecor;
        public static final int Theme_DeviceDefault_Panel = android.R.style.Theme_DeviceDefault_Panel;
        public static final int Theme_DeviceDefault_Settings = android.R.style.Theme_DeviceDefault_Settings;
        public static final int Theme_DeviceDefault_Wallpaper = android.R.style.Theme_DeviceDefault_Wallpaper;
        public static final int Theme_DeviceDefault_Wallpaper_NoTitleBar = android.R.style.Theme_DeviceDefault_Wallpaper_NoTitleBar;
        public static final int Theme_Dialog = android.R.style.Theme_Dialog;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Holo = android.R.style.Theme_Holo;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Holo_Dialog = android.R.style.Theme_Holo_Dialog;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Holo_DialogWhenLarge = android.R.style.Theme_Holo_DialogWhenLarge;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Holo_DialogWhenLarge_NoActionBar = android.R.style.Theme_Holo_DialogWhenLarge_NoActionBar;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Holo_Dialog_MinWidth = android.R.style.Theme_Holo_Dialog_MinWidth;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Holo_Dialog_NoActionBar = android.R.style.Theme_Holo_Dialog_NoActionBar;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Holo_Dialog_NoActionBar_MinWidth = android.R.style.Theme_Holo_Dialog_NoActionBar_MinWidth;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Holo_InputMethod = android.R.style.Theme_Holo_InputMethod;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Holo_Light = android.R.style.Theme_Holo_Light;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Holo_Light_DarkActionBar = android.R.style.Theme_Holo_Light_DarkActionBar;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Holo_Light_Dialog = android.R.style.Theme_Holo_Light_Dialog;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Holo_Light_DialogWhenLarge = android.R.style.Theme_Holo_Light_DialogWhenLarge;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Holo_Light_DialogWhenLarge_NoActionBar = android.R.style.Theme_Holo_Light_DialogWhenLarge_NoActionBar;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Holo_Light_Dialog_MinWidth = android.R.style.Theme_Holo_Light_Dialog_MinWidth;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Holo_Light_Dialog_NoActionBar = android.R.style.Theme_Holo_Light_Dialog_NoActionBar;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Holo_Light_Dialog_NoActionBar_MinWidth = android.R.style.Theme_Holo_Light_Dialog_NoActionBar_MinWidth;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Holo_Light_NoActionBar = android.R.style.Theme_Holo_Light_NoActionBar;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Holo_Light_NoActionBar_Fullscreen = android.R.style.Theme_Holo_Light_NoActionBar_Fullscreen;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Holo_Light_NoActionBar_Overscan = android.R.style.Theme_Holo_Light_NoActionBar_Overscan;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Holo_Light_NoActionBar_TranslucentDecor = android.R.style.Theme_Holo_Light_NoActionBar_TranslucentDecor;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Holo_Light_Panel = android.R.style.Theme_Holo_Light_Panel;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Holo_NoActionBar = android.R.style.Theme_Holo_NoActionBar;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Holo_NoActionBar_Fullscreen = android.R.style.Theme_Holo_NoActionBar_Fullscreen;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Holo_NoActionBar_Overscan = android.R.style.Theme_Holo_NoActionBar_Overscan;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Holo_NoActionBar_TranslucentDecor = android.R.style.Theme_Holo_NoActionBar_TranslucentDecor;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Holo_Panel = android.R.style.Theme_Holo_Panel;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Holo_Wallpaper = android.R.style.Theme_Holo_Wallpaper;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Holo_Wallpaper_NoTitleBar = android.R.style.Theme_Holo_Wallpaper_NoTitleBar;
        public static final int Theme_InputMethod = android.R.style.Theme_InputMethod;
        public static final int Theme_Light = android.R.style.Theme_Light;
        public static final int Theme_Light_NoTitleBar = android.R.style.Theme_Light_NoTitleBar;
        public static final int Theme_Light_NoTitleBar_Fullscreen = android.R.style.Theme_Light_NoTitleBar_Fullscreen;
        public static final int Theme_Light_Panel = android.R.style.Theme_Light_Panel;
        public static final int Theme_Light_WallpaperSettings = android.R.style.Theme_Light_WallpaperSettings;
        public static final int Theme_Material = android.R.style.Theme_Material;
        public static final int Theme_Material_Dialog = android.R.style.Theme_Material_Dialog;
        public static final int Theme_Material_DialogWhenLarge = android.R.style.Theme_Material_DialogWhenLarge;
        public static final int Theme_Material_DialogWhenLarge_NoActionBar = android.R.style.Theme_Material_DialogWhenLarge_NoActionBar;
        public static final int Theme_Material_Dialog_Alert = android.R.style.Theme_Material_Dialog_Alert;
        public static final int Theme_Material_Dialog_MinWidth = android.R.style.Theme_Material_Dialog_MinWidth;
        public static final int Theme_Material_Dialog_NoActionBar = android.R.style.Theme_Material_Dialog_NoActionBar;
        public static final int Theme_Material_Dialog_NoActionBar_MinWidth = android.R.style.Theme_Material_Dialog_NoActionBar_MinWidth;
        public static final int Theme_Material_Dialog_Presentation = android.R.style.Theme_Material_Dialog_Presentation;
        public static final int Theme_Material_InputMethod = android.R.style.Theme_Material_InputMethod;
        public static final int Theme_Material_Light = android.R.style.Theme_Material_Light;
        public static final int Theme_Material_Light_DarkActionBar = android.R.style.Theme_Material_Light_DarkActionBar;
        public static final int Theme_Material_Light_Dialog = android.R.style.Theme_Material_Light_Dialog;
        public static final int Theme_Material_Light_DialogWhenLarge = android.R.style.Theme_Material_Light_DialogWhenLarge;
        public static final int Theme_Material_Light_DialogWhenLarge_DarkActionBar = android.R.style.Theme_Material_Light_DialogWhenLarge_DarkActionBar;
        public static final int Theme_Material_Light_DialogWhenLarge_NoActionBar = android.R.style.Theme_Material_Light_DialogWhenLarge_NoActionBar;
        public static final int Theme_Material_Light_Dialog_Alert = android.R.style.Theme_Material_Light_Dialog_Alert;
        public static final int Theme_Material_Light_Dialog_MinWidth = android.R.style.Theme_Material_Light_Dialog_MinWidth;
        public static final int Theme_Material_Light_Dialog_NoActionBar = android.R.style.Theme_Material_Light_Dialog_NoActionBar;
        public static final int Theme_Material_Light_Dialog_NoActionBar_MinWidth = android.R.style.Theme_Material_Light_Dialog_NoActionBar_MinWidth;
        public static final int Theme_Material_Light_Dialog_Presentation = android.R.style.Theme_Material_Light_Dialog_Presentation;
        public static final int Theme_Material_Light_LightStatusBar = android.R.style.Theme_Material_Light_LightStatusBar;
        public static final int Theme_Material_Light_NoActionBar = android.R.style.Theme_Material_Light_NoActionBar;
        public static final int Theme_Material_Light_NoActionBar_Fullscreen = android.R.style.Theme_Material_Light_NoActionBar_Fullscreen;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Material_Light_NoActionBar_Overscan = android.R.style.Theme_Material_Light_NoActionBar_Overscan;
        public static final int Theme_Material_Light_NoActionBar_TranslucentDecor = android.R.style.Theme_Material_Light_NoActionBar_TranslucentDecor;
        public static final int Theme_Material_Light_Panel = android.R.style.Theme_Material_Light_Panel;
        public static final int Theme_Material_Light_Voice = android.R.style.Theme_Material_Light_Voice;
        public static final int Theme_Material_NoActionBar = android.R.style.Theme_Material_NoActionBar;
        public static final int Theme_Material_NoActionBar_Fullscreen = android.R.style.Theme_Material_NoActionBar_Fullscreen;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Theme_Material_NoActionBar_Overscan = android.R.style.Theme_Material_NoActionBar_Overscan;
        public static final int Theme_Material_NoActionBar_TranslucentDecor = android.R.style.Theme_Material_NoActionBar_TranslucentDecor;
        public static final int Theme_Material_Panel = android.R.style.Theme_Material_Panel;
        public static final int Theme_Material_Settings = android.R.style.Theme_Material_Settings;
        public static final int Theme_Material_Voice = android.R.style.Theme_Material_Voice;
        public static final int Theme_Material_Wallpaper = android.R.style.Theme_Material_Wallpaper;
        public static final int Theme_Material_Wallpaper_NoTitleBar = android.R.style.Theme_Material_Wallpaper_NoTitleBar;
        public static final int Theme_NoDisplay = android.R.style.Theme_NoDisplay;
        public static final int Theme_NoTitleBar = android.R.style.Theme_NoTitleBar;
        public static final int Theme_NoTitleBar_Fullscreen = android.R.style.Theme_NoTitleBar_Fullscreen;
        public static final int Theme_NoTitleBar_OverlayActionModes = android.R.style.Theme_NoTitleBar_OverlayActionModes;
        public static final int Theme_Panel = android.R.style.Theme_Panel;
        public static final int Theme_Translucent = android.R.style.Theme_Translucent;
        public static final int Theme_Translucent_NoTitleBar = android.R.style.Theme_Translucent_NoTitleBar;
        public static final int Theme_Translucent_NoTitleBar_Fullscreen = android.R.style.Theme_Translucent_NoTitleBar_Fullscreen;
        public static final int Theme_Wallpaper = android.R.style.Theme_Wallpaper;
        public static final int Theme_WallpaperSettings = android.R.style.Theme_WallpaperSettings;
        public static final int Theme_Wallpaper_NoTitleBar = android.R.style.Theme_Wallpaper_NoTitleBar;
        public static final int Theme_Wallpaper_NoTitleBar_Fullscreen = android.R.style.Theme_Wallpaper_NoTitleBar_Fullscreen;
        public static final int Theme_WithActionBar = android.R.style.Theme_WithActionBar;
        public static final int Widget = android.R.style.Widget;
        public static final int Widget_AbsListView = android.R.style.Widget_AbsListView;
        public static final int Widget_ActionBar = android.R.style.Widget_ActionBar;
        public static final int Widget_ActionBar_TabBar = android.R.style.Widget_ActionBar_TabBar;
        public static final int Widget_ActionBar_TabText = android.R.style.Widget_ActionBar_TabText;
        public static final int Widget_ActionBar_TabView = android.R.style.Widget_ActionBar_TabView;
        public static final int Widget_ActionButton = android.R.style.Widget_ActionButton;
        public static final int Widget_ActionButton_CloseMode = android.R.style.Widget_ActionButton_CloseMode;
        public static final int Widget_ActionButton_Overflow = android.R.style.Widget_ActionButton_Overflow;
        public static final int Widget_AutoCompleteTextView = android.R.style.Widget_AutoCompleteTextView;
        public static final int Widget_Button = android.R.style.Widget_Button;
        public static final int Widget_Button_Inset = android.R.style.Widget_Button_Inset;
        public static final int Widget_Button_Small = android.R.style.Widget_Button_Small;
        public static final int Widget_Button_Toggle = android.R.style.Widget_Button_Toggle;
        public static final int Widget_CalendarView = android.R.style.Widget_CalendarView;
        public static final int Widget_CompoundButton = android.R.style.Widget_CompoundButton;
        public static final int Widget_CompoundButton_CheckBox = android.R.style.Widget_CompoundButton_CheckBox;
        public static final int Widget_CompoundButton_RadioButton = android.R.style.Widget_CompoundButton_RadioButton;
        public static final int Widget_CompoundButton_Star = android.R.style.Widget_CompoundButton_Star;
        public static final int Widget_DatePicker = android.R.style.Widget_DatePicker;
        public static final int Widget_DeviceDefault = android.R.style.Widget_DeviceDefault;
        public static final int Widget_DeviceDefault_ActionBar = android.R.style.Widget_DeviceDefault_ActionBar;
        public static final int Widget_DeviceDefault_ActionBar_Solid = android.R.style.Widget_DeviceDefault_ActionBar_Solid;
        public static final int Widget_DeviceDefault_ActionBar_TabBar = android.R.style.Widget_DeviceDefault_ActionBar_TabBar;
        public static final int Widget_DeviceDefault_ActionBar_TabText = android.R.style.Widget_DeviceDefault_ActionBar_TabText;
        public static final int Widget_DeviceDefault_ActionBar_TabView = android.R.style.Widget_DeviceDefault_ActionBar_TabView;
        public static final int Widget_DeviceDefault_ActionButton = android.R.style.Widget_DeviceDefault_ActionButton;
        public static final int Widget_DeviceDefault_ActionButton_CloseMode = android.R.style.Widget_DeviceDefault_ActionButton_CloseMode;
        public static final int Widget_DeviceDefault_ActionButton_Overflow = android.R.style.Widget_DeviceDefault_ActionButton_Overflow;
        public static final int Widget_DeviceDefault_ActionButton_TextButton = android.R.style.Widget_DeviceDefault_ActionButton_TextButton;
        public static final int Widget_DeviceDefault_ActionMode = android.R.style.Widget_DeviceDefault_ActionMode;
        public static final int Widget_DeviceDefault_AutoCompleteTextView = android.R.style.Widget_DeviceDefault_AutoCompleteTextView;
        public static final int Widget_DeviceDefault_Button = android.R.style.Widget_DeviceDefault_Button;
        public static final int Widget_DeviceDefault_Button_Borderless = android.R.style.Widget_DeviceDefault_Button_Borderless;
        public static final int Widget_DeviceDefault_Button_Borderless_Colored = android.R.style.Widget_DeviceDefault_Button_Borderless_Colored;
        public static final int Widget_DeviceDefault_Button_Borderless_Small = android.R.style.Widget_DeviceDefault_Button_Borderless_Small;
        public static final int Widget_DeviceDefault_Button_Colored = android.R.style.Widget_DeviceDefault_Button_Colored;
        public static final int Widget_DeviceDefault_Button_Inset = android.R.style.Widget_DeviceDefault_Button_Inset;
        public static final int Widget_DeviceDefault_Button_Small = android.R.style.Widget_DeviceDefault_Button_Small;
        public static final int Widget_DeviceDefault_Button_Toggle = android.R.style.Widget_DeviceDefault_Button_Toggle;
        public static final int Widget_DeviceDefault_CalendarView = android.R.style.Widget_DeviceDefault_CalendarView;
        public static final int Widget_DeviceDefault_CheckedTextView = android.R.style.Widget_DeviceDefault_CheckedTextView;
        public static final int Widget_DeviceDefault_CompoundButton_CheckBox = android.R.style.Widget_DeviceDefault_CompoundButton_CheckBox;
        public static final int Widget_DeviceDefault_CompoundButton_RadioButton = android.R.style.Widget_DeviceDefault_CompoundButton_RadioButton;
        public static final int Widget_DeviceDefault_CompoundButton_Star = android.R.style.Widget_DeviceDefault_CompoundButton_Star;
        public static final int Widget_DeviceDefault_DatePicker = android.R.style.Widget_DeviceDefault_DatePicker;
        public static final int Widget_DeviceDefault_DropDownItem = android.R.style.Widget_DeviceDefault_DropDownItem;
        public static final int Widget_DeviceDefault_DropDownItem_Spinner = android.R.style.Widget_DeviceDefault_DropDownItem_Spinner;
        public static final int Widget_DeviceDefault_EditText = android.R.style.Widget_DeviceDefault_EditText;
        public static final int Widget_DeviceDefault_ExpandableListView = android.R.style.Widget_DeviceDefault_ExpandableListView;
        public static final int Widget_DeviceDefault_FastScroll = android.R.style.Widget_DeviceDefault_FastScroll;
        public static final int Widget_DeviceDefault_GridView = android.R.style.Widget_DeviceDefault_GridView;
        public static final int Widget_DeviceDefault_HorizontalScrollView = android.R.style.Widget_DeviceDefault_HorizontalScrollView;
        public static final int Widget_DeviceDefault_ImageButton = android.R.style.Widget_DeviceDefault_ImageButton;
        public static final int Widget_DeviceDefault_Light = android.R.style.Widget_DeviceDefault_Light;
        public static final int Widget_DeviceDefault_Light_ActionBar = android.R.style.Widget_DeviceDefault_Light_ActionBar;
        public static final int Widget_DeviceDefault_Light_ActionBar_Solid = android.R.style.Widget_DeviceDefault_Light_ActionBar_Solid;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Widget_DeviceDefault_Light_ActionBar_Solid_Inverse = android.R.style.Widget_DeviceDefault_Light_ActionBar_Solid_Inverse;
        public static final int Widget_DeviceDefault_Light_ActionBar_TabBar = android.R.style.Widget_DeviceDefault_Light_ActionBar_TabBar;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Widget_DeviceDefault_Light_ActionBar_TabBar_Inverse = android.R.style.Widget_DeviceDefault_Light_ActionBar_TabBar_Inverse;
        public static final int Widget_DeviceDefault_Light_ActionBar_TabText = android.R.style.Widget_DeviceDefault_Light_ActionBar_TabText;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Widget_DeviceDefault_Light_ActionBar_TabText_Inverse = android.R.style.Widget_DeviceDefault_Light_ActionBar_TabText_Inverse;
        public static final int Widget_DeviceDefault_Light_ActionBar_TabView = android.R.style.Widget_DeviceDefault_Light_ActionBar_TabView;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Widget_DeviceDefault_Light_ActionBar_TabView_Inverse = android.R.style.Widget_DeviceDefault_Light_ActionBar_TabView_Inverse;
        public static final int Widget_DeviceDefault_Light_ActionButton = android.R.style.Widget_DeviceDefault_Light_ActionButton;
        public static final int Widget_DeviceDefault_Light_ActionButton_CloseMode = android.R.style.Widget_DeviceDefault_Light_ActionButton_CloseMode;
        public static final int Widget_DeviceDefault_Light_ActionButton_Overflow = android.R.style.Widget_DeviceDefault_Light_ActionButton_Overflow;
        public static final int Widget_DeviceDefault_Light_ActionMode = android.R.style.Widget_DeviceDefault_Light_ActionMode;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Widget_DeviceDefault_Light_ActionMode_Inverse = android.R.style.Widget_DeviceDefault_Light_ActionMode_Inverse;
        public static final int Widget_DeviceDefault_Light_AutoCompleteTextView = android.R.style.Widget_DeviceDefault_Light_AutoCompleteTextView;
        public static final int Widget_DeviceDefault_Light_Button = android.R.style.Widget_DeviceDefault_Light_Button;
        public static final int Widget_DeviceDefault_Light_Button_Borderless_Small = android.R.style.Widget_DeviceDefault_Light_Button_Borderless_Small;
        public static final int Widget_DeviceDefault_Light_Button_Inset = android.R.style.Widget_DeviceDefault_Light_Button_Inset;
        public static final int Widget_DeviceDefault_Light_Button_Small = android.R.style.Widget_DeviceDefault_Light_Button_Small;
        public static final int Widget_DeviceDefault_Light_Button_Toggle = android.R.style.Widget_DeviceDefault_Light_Button_Toggle;
        public static final int Widget_DeviceDefault_Light_CalendarView = android.R.style.Widget_DeviceDefault_Light_CalendarView;
        public static final int Widget_DeviceDefault_Light_CheckedTextView = android.R.style.Widget_DeviceDefault_Light_CheckedTextView;
        public static final int Widget_DeviceDefault_Light_CompoundButton_CheckBox = android.R.style.Widget_DeviceDefault_Light_CompoundButton_CheckBox;
        public static final int Widget_DeviceDefault_Light_CompoundButton_RadioButton = android.R.style.Widget_DeviceDefault_Light_CompoundButton_RadioButton;
        public static final int Widget_DeviceDefault_Light_CompoundButton_Star = android.R.style.Widget_DeviceDefault_Light_CompoundButton_Star;
        public static final int Widget_DeviceDefault_Light_DropDownItem = android.R.style.Widget_DeviceDefault_Light_DropDownItem;
        public static final int Widget_DeviceDefault_Light_DropDownItem_Spinner = android.R.style.Widget_DeviceDefault_Light_DropDownItem_Spinner;
        public static final int Widget_DeviceDefault_Light_EditText = android.R.style.Widget_DeviceDefault_Light_EditText;
        public static final int Widget_DeviceDefault_Light_ExpandableListView = android.R.style.Widget_DeviceDefault_Light_ExpandableListView;
        public static final int Widget_DeviceDefault_Light_FastScroll = android.R.style.Widget_DeviceDefault_Light_FastScroll;
        public static final int Widget_DeviceDefault_Light_GridView = android.R.style.Widget_DeviceDefault_Light_GridView;
        public static final int Widget_DeviceDefault_Light_HorizontalScrollView = android.R.style.Widget_DeviceDefault_Light_HorizontalScrollView;
        public static final int Widget_DeviceDefault_Light_ImageButton = android.R.style.Widget_DeviceDefault_Light_ImageButton;
        public static final int Widget_DeviceDefault_Light_ListPopupWindow = android.R.style.Widget_DeviceDefault_Light_ListPopupWindow;
        public static final int Widget_DeviceDefault_Light_ListView = android.R.style.Widget_DeviceDefault_Light_ListView;
        public static final int Widget_DeviceDefault_Light_ListView_DropDown = android.R.style.Widget_DeviceDefault_Light_ListView_DropDown;
        public static final int Widget_DeviceDefault_Light_MediaRouteButton = android.R.style.Widget_DeviceDefault_Light_MediaRouteButton;
        public static final int Widget_DeviceDefault_Light_PopupMenu = android.R.style.Widget_DeviceDefault_Light_PopupMenu;
        public static final int Widget_DeviceDefault_Light_PopupWindow = android.R.style.Widget_DeviceDefault_Light_PopupWindow;
        public static final int Widget_DeviceDefault_Light_ProgressBar = android.R.style.Widget_DeviceDefault_Light_ProgressBar;
        public static final int Widget_DeviceDefault_Light_ProgressBar_Horizontal = android.R.style.Widget_DeviceDefault_Light_ProgressBar_Horizontal;
        public static final int Widget_DeviceDefault_Light_ProgressBar_Inverse = android.R.style.Widget_DeviceDefault_Light_ProgressBar_Inverse;
        public static final int Widget_DeviceDefault_Light_ProgressBar_Large = android.R.style.Widget_DeviceDefault_Light_ProgressBar_Large;
        public static final int Widget_DeviceDefault_Light_ProgressBar_Large_Inverse = android.R.style.Widget_DeviceDefault_Light_ProgressBar_Large_Inverse;
        public static final int Widget_DeviceDefault_Light_ProgressBar_Small = android.R.style.Widget_DeviceDefault_Light_ProgressBar_Small;
        public static final int Widget_DeviceDefault_Light_ProgressBar_Small_Inverse = android.R.style.Widget_DeviceDefault_Light_ProgressBar_Small_Inverse;
        public static final int Widget_DeviceDefault_Light_ProgressBar_Small_Title = android.R.style.Widget_DeviceDefault_Light_ProgressBar_Small_Title;
        public static final int Widget_DeviceDefault_Light_RatingBar = android.R.style.Widget_DeviceDefault_Light_RatingBar;
        public static final int Widget_DeviceDefault_Light_RatingBar_Indicator = android.R.style.Widget_DeviceDefault_Light_RatingBar_Indicator;
        public static final int Widget_DeviceDefault_Light_RatingBar_Small = android.R.style.Widget_DeviceDefault_Light_RatingBar_Small;
        public static final int Widget_DeviceDefault_Light_ScrollView = android.R.style.Widget_DeviceDefault_Light_ScrollView;
        public static final int Widget_DeviceDefault_Light_SeekBar = android.R.style.Widget_DeviceDefault_Light_SeekBar;
        public static final int Widget_DeviceDefault_Light_Spinner = android.R.style.Widget_DeviceDefault_Light_Spinner;
        public static final int Widget_DeviceDefault_Light_StackView = android.R.style.Widget_DeviceDefault_Light_StackView;
        public static final int Widget_DeviceDefault_Light_Tab = android.R.style.Widget_DeviceDefault_Light_Tab;
        public static final int Widget_DeviceDefault_Light_TabWidget = android.R.style.Widget_DeviceDefault_Light_TabWidget;
        public static final int Widget_DeviceDefault_Light_TextView = android.R.style.Widget_DeviceDefault_Light_TextView;
        public static final int Widget_DeviceDefault_Light_TextView_SpinnerItem = android.R.style.Widget_DeviceDefault_Light_TextView_SpinnerItem;
        public static final int Widget_DeviceDefault_Light_WebTextView = android.R.style.Widget_DeviceDefault_Light_WebTextView;
        public static final int Widget_DeviceDefault_Light_WebView = android.R.style.Widget_DeviceDefault_Light_WebView;
        public static final int Widget_DeviceDefault_ListPopupWindow = android.R.style.Widget_DeviceDefault_ListPopupWindow;
        public static final int Widget_DeviceDefault_ListView = android.R.style.Widget_DeviceDefault_ListView;
        public static final int Widget_DeviceDefault_ListView_DropDown = android.R.style.Widget_DeviceDefault_ListView_DropDown;
        public static final int Widget_DeviceDefault_MediaRouteButton = android.R.style.Widget_DeviceDefault_MediaRouteButton;
        public static final int Widget_DeviceDefault_PopupMenu = android.R.style.Widget_DeviceDefault_PopupMenu;
        public static final int Widget_DeviceDefault_PopupWindow = android.R.style.Widget_DeviceDefault_PopupWindow;
        public static final int Widget_DeviceDefault_ProgressBar = android.R.style.Widget_DeviceDefault_ProgressBar;
        public static final int Widget_DeviceDefault_ProgressBar_Horizontal = android.R.style.Widget_DeviceDefault_ProgressBar_Horizontal;
        public static final int Widget_DeviceDefault_ProgressBar_Large = android.R.style.Widget_DeviceDefault_ProgressBar_Large;
        public static final int Widget_DeviceDefault_ProgressBar_Small = android.R.style.Widget_DeviceDefault_ProgressBar_Small;
        public static final int Widget_DeviceDefault_ProgressBar_Small_Title = android.R.style.Widget_DeviceDefault_ProgressBar_Small_Title;
        public static final int Widget_DeviceDefault_RatingBar = android.R.style.Widget_DeviceDefault_RatingBar;
        public static final int Widget_DeviceDefault_RatingBar_Indicator = android.R.style.Widget_DeviceDefault_RatingBar_Indicator;
        public static final int Widget_DeviceDefault_RatingBar_Small = android.R.style.Widget_DeviceDefault_RatingBar_Small;
        public static final int Widget_DeviceDefault_ScrollView = android.R.style.Widget_DeviceDefault_ScrollView;
        public static final int Widget_DeviceDefault_SeekBar = android.R.style.Widget_DeviceDefault_SeekBar;
        public static final int Widget_DeviceDefault_Spinner = android.R.style.Widget_DeviceDefault_Spinner;
        public static final int Widget_DeviceDefault_StackView = android.R.style.Widget_DeviceDefault_StackView;
        public static final int Widget_DeviceDefault_Tab = android.R.style.Widget_DeviceDefault_Tab;
        public static final int Widget_DeviceDefault_TabWidget = android.R.style.Widget_DeviceDefault_TabWidget;
        public static final int Widget_DeviceDefault_TextView = android.R.style.Widget_DeviceDefault_TextView;
        public static final int Widget_DeviceDefault_TextView_SpinnerItem = android.R.style.Widget_DeviceDefault_TextView_SpinnerItem;
        public static final int Widget_DeviceDefault_WebTextView = android.R.style.Widget_DeviceDefault_WebTextView;
        public static final int Widget_DeviceDefault_WebView = android.R.style.Widget_DeviceDefault_WebView;
        public static final int Widget_DropDownItem = android.R.style.Widget_DropDownItem;
        public static final int Widget_DropDownItem_Spinner = android.R.style.Widget_DropDownItem_Spinner;
        public static final int Widget_EditText = android.R.style.Widget_EditText;
        public static final int Widget_ExpandableListView = android.R.style.Widget_ExpandableListView;
        public static final int Widget_FastScroll = android.R.style.Widget_FastScroll;
        public static final int Widget_FragmentBreadCrumbs = android.R.style.Widget_FragmentBreadCrumbs;
        public static final int Widget_Gallery = android.R.style.Widget_Gallery;
        public static final int Widget_GridView = android.R.style.Widget_GridView;
        public static final int Widget_Holo = android.R.style.Widget_Holo;
        public static final int Widget_Holo_ActionBar = android.R.style.Widget_Holo_ActionBar;
        public static final int Widget_Holo_ActionBar_Solid = android.R.style.Widget_Holo_ActionBar_Solid;
        public static final int Widget_Holo_ActionBar_TabBar = android.R.style.Widget_Holo_ActionBar_TabBar;
        public static final int Widget_Holo_ActionBar_TabText = android.R.style.Widget_Holo_ActionBar_TabText;
        public static final int Widget_Holo_ActionBar_TabView = android.R.style.Widget_Holo_ActionBar_TabView;
        public static final int Widget_Holo_ActionButton = android.R.style.Widget_Holo_ActionButton;
        public static final int Widget_Holo_ActionButton_CloseMode = android.R.style.Widget_Holo_ActionButton_CloseMode;
        public static final int Widget_Holo_ActionButton_Overflow = android.R.style.Widget_Holo_ActionButton_Overflow;
        public static final int Widget_Holo_ActionButton_TextButton = android.R.style.Widget_Holo_ActionButton_TextButton;
        public static final int Widget_Holo_ActionMode = android.R.style.Widget_Holo_ActionMode;
        public static final int Widget_Holo_AutoCompleteTextView = android.R.style.Widget_Holo_AutoCompleteTextView;
        public static final int Widget_Holo_Button = android.R.style.Widget_Holo_Button;
        public static final int Widget_Holo_Button_Borderless = android.R.style.Widget_Holo_Button_Borderless;
        public static final int Widget_Holo_Button_Borderless_Small = android.R.style.Widget_Holo_Button_Borderless_Small;
        public static final int Widget_Holo_Button_Inset = android.R.style.Widget_Holo_Button_Inset;
        public static final int Widget_Holo_Button_Small = android.R.style.Widget_Holo_Button_Small;
        public static final int Widget_Holo_Button_Toggle = android.R.style.Widget_Holo_Button_Toggle;
        public static final int Widget_Holo_CalendarView = android.R.style.Widget_Holo_CalendarView;
        public static final int Widget_Holo_CheckedTextView = android.R.style.Widget_Holo_CheckedTextView;
        public static final int Widget_Holo_CompoundButton_CheckBox = android.R.style.Widget_Holo_CompoundButton_CheckBox;
        public static final int Widget_Holo_CompoundButton_RadioButton = android.R.style.Widget_Holo_CompoundButton_RadioButton;
        public static final int Widget_Holo_CompoundButton_Star = android.R.style.Widget_Holo_CompoundButton_Star;
        public static final int Widget_Holo_DatePicker = android.R.style.Widget_Holo_DatePicker;
        public static final int Widget_Holo_DropDownItem = android.R.style.Widget_Holo_DropDownItem;
        public static final int Widget_Holo_DropDownItem_Spinner = android.R.style.Widget_Holo_DropDownItem_Spinner;
        public static final int Widget_Holo_EditText = android.R.style.Widget_Holo_EditText;
        public static final int Widget_Holo_ExpandableListView = android.R.style.Widget_Holo_ExpandableListView;
        public static final int Widget_Holo_GridView = android.R.style.Widget_Holo_GridView;
        public static final int Widget_Holo_HorizontalScrollView = android.R.style.Widget_Holo_HorizontalScrollView;
        public static final int Widget_Holo_ImageButton = android.R.style.Widget_Holo_ImageButton;
        public static final int Widget_Holo_Light = android.R.style.Widget_Holo_Light;
        public static final int Widget_Holo_Light_ActionBar = android.R.style.Widget_Holo_Light_ActionBar;
        public static final int Widget_Holo_Light_ActionBar_Solid = android.R.style.Widget_Holo_Light_ActionBar_Solid;
        public static final int Widget_Holo_Light_ActionBar_Solid_Inverse = android.R.style.Widget_Holo_Light_ActionBar_Solid_Inverse;
        public static final int Widget_Holo_Light_ActionBar_TabBar = android.R.style.Widget_Holo_Light_ActionBar_TabBar;
        public static final int Widget_Holo_Light_ActionBar_TabBar_Inverse = android.R.style.Widget_Holo_Light_ActionBar_TabBar_Inverse;
        public static final int Widget_Holo_Light_ActionBar_TabText = android.R.style.Widget_Holo_Light_ActionBar_TabText;
        public static final int Widget_Holo_Light_ActionBar_TabText_Inverse = android.R.style.Widget_Holo_Light_ActionBar_TabText_Inverse;
        public static final int Widget_Holo_Light_ActionBar_TabView = android.R.style.Widget_Holo_Light_ActionBar_TabView;
        public static final int Widget_Holo_Light_ActionBar_TabView_Inverse = android.R.style.Widget_Holo_Light_ActionBar_TabView_Inverse;
        public static final int Widget_Holo_Light_ActionButton = android.R.style.Widget_Holo_Light_ActionButton;
        public static final int Widget_Holo_Light_ActionButton_CloseMode = android.R.style.Widget_Holo_Light_ActionButton_CloseMode;
        public static final int Widget_Holo_Light_ActionButton_Overflow = android.R.style.Widget_Holo_Light_ActionButton_Overflow;
        public static final int Widget_Holo_Light_ActionMode = android.R.style.Widget_Holo_Light_ActionMode;
        public static final int Widget_Holo_Light_ActionMode_Inverse = android.R.style.Widget_Holo_Light_ActionMode_Inverse;
        public static final int Widget_Holo_Light_AutoCompleteTextView = android.R.style.Widget_Holo_Light_AutoCompleteTextView;
        public static final int Widget_Holo_Light_Button = android.R.style.Widget_Holo_Light_Button;
        public static final int Widget_Holo_Light_Button_Borderless_Small = android.R.style.Widget_Holo_Light_Button_Borderless_Small;
        public static final int Widget_Holo_Light_Button_Inset = android.R.style.Widget_Holo_Light_Button_Inset;
        public static final int Widget_Holo_Light_Button_Small = android.R.style.Widget_Holo_Light_Button_Small;
        public static final int Widget_Holo_Light_Button_Toggle = android.R.style.Widget_Holo_Light_Button_Toggle;
        public static final int Widget_Holo_Light_CalendarView = android.R.style.Widget_Holo_Light_CalendarView;
        public static final int Widget_Holo_Light_CheckedTextView = android.R.style.Widget_Holo_Light_CheckedTextView;
        public static final int Widget_Holo_Light_CompoundButton_CheckBox = android.R.style.Widget_Holo_Light_CompoundButton_CheckBox;
        public static final int Widget_Holo_Light_CompoundButton_RadioButton = android.R.style.Widget_Holo_Light_CompoundButton_RadioButton;
        public static final int Widget_Holo_Light_CompoundButton_Star = android.R.style.Widget_Holo_Light_CompoundButton_Star;
        public static final int Widget_Holo_Light_DropDownItem = android.R.style.Widget_Holo_Light_DropDownItem;
        public static final int Widget_Holo_Light_DropDownItem_Spinner = android.R.style.Widget_Holo_Light_DropDownItem_Spinner;
        public static final int Widget_Holo_Light_EditText = android.R.style.Widget_Holo_Light_EditText;
        public static final int Widget_Holo_Light_ExpandableListView = android.R.style.Widget_Holo_Light_ExpandableListView;
        public static final int Widget_Holo_Light_GridView = android.R.style.Widget_Holo_Light_GridView;
        public static final int Widget_Holo_Light_HorizontalScrollView = android.R.style.Widget_Holo_Light_HorizontalScrollView;
        public static final int Widget_Holo_Light_ImageButton = android.R.style.Widget_Holo_Light_ImageButton;
        public static final int Widget_Holo_Light_ListPopupWindow = android.R.style.Widget_Holo_Light_ListPopupWindow;
        public static final int Widget_Holo_Light_ListView = android.R.style.Widget_Holo_Light_ListView;
        public static final int Widget_Holo_Light_ListView_DropDown = android.R.style.Widget_Holo_Light_ListView_DropDown;
        public static final int Widget_Holo_Light_MediaRouteButton = android.R.style.Widget_Holo_Light_MediaRouteButton;
        public static final int Widget_Holo_Light_PopupMenu = android.R.style.Widget_Holo_Light_PopupMenu;
        public static final int Widget_Holo_Light_PopupWindow = android.R.style.Widget_Holo_Light_PopupWindow;
        public static final int Widget_Holo_Light_ProgressBar = android.R.style.Widget_Holo_Light_ProgressBar;
        public static final int Widget_Holo_Light_ProgressBar_Horizontal = android.R.style.Widget_Holo_Light_ProgressBar_Horizontal;
        public static final int Widget_Holo_Light_ProgressBar_Inverse = android.R.style.Widget_Holo_Light_ProgressBar_Inverse;
        public static final int Widget_Holo_Light_ProgressBar_Large = android.R.style.Widget_Holo_Light_ProgressBar_Large;
        public static final int Widget_Holo_Light_ProgressBar_Large_Inverse = android.R.style.Widget_Holo_Light_ProgressBar_Large_Inverse;
        public static final int Widget_Holo_Light_ProgressBar_Small = android.R.style.Widget_Holo_Light_ProgressBar_Small;
        public static final int Widget_Holo_Light_ProgressBar_Small_Inverse = android.R.style.Widget_Holo_Light_ProgressBar_Small_Inverse;
        public static final int Widget_Holo_Light_ProgressBar_Small_Title = android.R.style.Widget_Holo_Light_ProgressBar_Small_Title;
        public static final int Widget_Holo_Light_RatingBar = android.R.style.Widget_Holo_Light_RatingBar;
        public static final int Widget_Holo_Light_RatingBar_Indicator = android.R.style.Widget_Holo_Light_RatingBar_Indicator;
        public static final int Widget_Holo_Light_RatingBar_Small = android.R.style.Widget_Holo_Light_RatingBar_Small;
        public static final int Widget_Holo_Light_ScrollView = android.R.style.Widget_Holo_Light_ScrollView;
        public static final int Widget_Holo_Light_SeekBar = android.R.style.Widget_Holo_Light_SeekBar;
        public static final int Widget_Holo_Light_Spinner = android.R.style.Widget_Holo_Light_Spinner;
        public static final int Widget_Holo_Light_Tab = android.R.style.Widget_Holo_Light_Tab;
        public static final int Widget_Holo_Light_TabWidget = android.R.style.Widget_Holo_Light_TabWidget;
        public static final int Widget_Holo_Light_TextView = android.R.style.Widget_Holo_Light_TextView;
        public static final int Widget_Holo_Light_TextView_SpinnerItem = android.R.style.Widget_Holo_Light_TextView_SpinnerItem;
        public static final int Widget_Holo_Light_WebTextView = android.R.style.Widget_Holo_Light_WebTextView;
        public static final int Widget_Holo_Light_WebView = android.R.style.Widget_Holo_Light_WebView;
        public static final int Widget_Holo_ListPopupWindow = android.R.style.Widget_Holo_ListPopupWindow;
        public static final int Widget_Holo_ListView = android.R.style.Widget_Holo_ListView;
        public static final int Widget_Holo_ListView_DropDown = android.R.style.Widget_Holo_ListView_DropDown;
        public static final int Widget_Holo_MediaRouteButton = android.R.style.Widget_Holo_MediaRouteButton;
        public static final int Widget_Holo_PopupMenu = android.R.style.Widget_Holo_PopupMenu;
        public static final int Widget_Holo_PopupWindow = android.R.style.Widget_Holo_PopupWindow;
        public static final int Widget_Holo_ProgressBar = android.R.style.Widget_Holo_ProgressBar;
        public static final int Widget_Holo_ProgressBar_Horizontal = android.R.style.Widget_Holo_ProgressBar_Horizontal;
        public static final int Widget_Holo_ProgressBar_Large = android.R.style.Widget_Holo_ProgressBar_Large;
        public static final int Widget_Holo_ProgressBar_Small = android.R.style.Widget_Holo_ProgressBar_Small;
        public static final int Widget_Holo_ProgressBar_Small_Title = android.R.style.Widget_Holo_ProgressBar_Small_Title;
        public static final int Widget_Holo_RatingBar = android.R.style.Widget_Holo_RatingBar;
        public static final int Widget_Holo_RatingBar_Indicator = android.R.style.Widget_Holo_RatingBar_Indicator;
        public static final int Widget_Holo_RatingBar_Small = android.R.style.Widget_Holo_RatingBar_Small;
        public static final int Widget_Holo_ScrollView = android.R.style.Widget_Holo_ScrollView;
        public static final int Widget_Holo_SeekBar = android.R.style.Widget_Holo_SeekBar;
        public static final int Widget_Holo_Spinner = android.R.style.Widget_Holo_Spinner;
        public static final int Widget_Holo_Tab = android.R.style.Widget_Holo_Tab;
        public static final int Widget_Holo_TabWidget = android.R.style.Widget_Holo_TabWidget;
        public static final int Widget_Holo_TextView = android.R.style.Widget_Holo_TextView;
        public static final int Widget_Holo_TextView_SpinnerItem = android.R.style.Widget_Holo_TextView_SpinnerItem;
        public static final int Widget_Holo_WebTextView = android.R.style.Widget_Holo_WebTextView;
        public static final int Widget_Holo_WebView = android.R.style.Widget_Holo_WebView;
        public static final int Widget_ImageButton = android.R.style.Widget_ImageButton;
        public static final int Widget_ImageWell = android.R.style.Widget_ImageWell;
        /**
         * @deprecated
         */
        @Deprecated
        public static final int Widget_KeyboardView = android.R.style.Widget_KeyboardView;
        public static final int Widget_ListPopupWindow = android.R.style.Widget_ListPopupWindow;
        public static final int Widget_ListView = android.R.style.Widget_ListView;
        public static final int Widget_ListView_DropDown = android.R.style.Widget_ListView_DropDown;
        public static final int Widget_ListView_Menu = android.R.style.Widget_ListView_Menu;
        public static final int Widget_ListView_White = android.R.style.Widget_ListView_White;
        public static final int Widget_Material = android.R.style.Widget_Material;
        public static final int Widget_Material_ActionBar = android.R.style.Widget_Material_ActionBar;
        public static final int Widget_Material_ActionBar_Solid = android.R.style.Widget_Material_ActionBar_Solid;
        public static final int Widget_Material_ActionBar_TabBar = android.R.style.Widget_Material_ActionBar_TabBar;
        public static final int Widget_Material_ActionBar_TabText = android.R.style.Widget_Material_ActionBar_TabText;
        public static final int Widget_Material_ActionBar_TabView = android.R.style.Widget_Material_ActionBar_TabView;
        public static final int Widget_Material_ActionButton = android.R.style.Widget_Material_ActionButton;
        public static final int Widget_Material_ActionButton_CloseMode = android.R.style.Widget_Material_ActionButton_CloseMode;
        public static final int Widget_Material_ActionButton_Overflow = android.R.style.Widget_Material_ActionButton_Overflow;
        public static final int Widget_Material_ActionMode = android.R.style.Widget_Material_ActionMode;
        public static final int Widget_Material_AutoCompleteTextView = android.R.style.Widget_Material_AutoCompleteTextView;
        public static final int Widget_Material_Button = android.R.style.Widget_Material_Button;
        public static final int Widget_Material_ButtonBar = android.R.style.Widget_Material_ButtonBar;
        public static final int Widget_Material_ButtonBar_AlertDialog = android.R.style.Widget_Material_ButtonBar_AlertDialog;
        public static final int Widget_Material_Button_Borderless = android.R.style.Widget_Material_Button_Borderless;
        public static final int Widget_Material_Button_Borderless_Colored = android.R.style.Widget_Material_Button_Borderless_Colored;
        public static final int Widget_Material_Button_Borderless_Small = android.R.style.Widget_Material_Button_Borderless_Small;
        public static final int Widget_Material_Button_Colored = android.R.style.Widget_Material_Button_Colored;
        public static final int Widget_Material_Button_Inset = android.R.style.Widget_Material_Button_Inset;
        public static final int Widget_Material_Button_Small = android.R.style.Widget_Material_Button_Small;
        public static final int Widget_Material_Button_Toggle = android.R.style.Widget_Material_Button_Toggle;
        public static final int Widget_Material_CalendarView = android.R.style.Widget_Material_CalendarView;
        public static final int Widget_Material_CheckedTextView = android.R.style.Widget_Material_CheckedTextView;
        public static final int Widget_Material_CompoundButton_CheckBox = android.R.style.Widget_Material_CompoundButton_CheckBox;
        public static final int Widget_Material_CompoundButton_RadioButton = android.R.style.Widget_Material_CompoundButton_RadioButton;
        public static final int Widget_Material_CompoundButton_Star = android.R.style.Widget_Material_CompoundButton_Star;
        public static final int Widget_Material_CompoundButton_Switch = android.R.style.Widget_Material_CompoundButton_Switch;
        public static final int Widget_Material_DatePicker = android.R.style.Widget_Material_DatePicker;
        public static final int Widget_Material_DropDownItem = android.R.style.Widget_Material_DropDownItem;
        public static final int Widget_Material_DropDownItem_Spinner = android.R.style.Widget_Material_DropDownItem_Spinner;
        public static final int Widget_Material_EditText = android.R.style.Widget_Material_EditText;
        public static final int Widget_Material_ExpandableListView = android.R.style.Widget_Material_ExpandableListView;
        public static final int Widget_Material_FastScroll = android.R.style.Widget_Material_FastScroll;
        public static final int Widget_Material_GridView = android.R.style.Widget_Material_GridView;
        public static final int Widget_Material_HorizontalScrollView = android.R.style.Widget_Material_HorizontalScrollView;
        public static final int Widget_Material_ImageButton = android.R.style.Widget_Material_ImageButton;
        public static final int Widget_Material_Light = android.R.style.Widget_Material_Light;
        public static final int Widget_Material_Light_ActionBar = android.R.style.Widget_Material_Light_ActionBar;
        public static final int Widget_Material_Light_ActionBar_Solid = android.R.style.Widget_Material_Light_ActionBar_Solid;
        public static final int Widget_Material_Light_ActionBar_TabBar = android.R.style.Widget_Material_Light_ActionBar_TabBar;
        public static final int Widget_Material_Light_ActionBar_TabText = android.R.style.Widget_Material_Light_ActionBar_TabText;
        public static final int Widget_Material_Light_ActionBar_TabView = android.R.style.Widget_Material_Light_ActionBar_TabView;
        public static final int Widget_Material_Light_ActionButton = android.R.style.Widget_Material_Light_ActionButton;
        public static final int Widget_Material_Light_ActionButton_CloseMode = android.R.style.Widget_Material_Light_ActionButton_CloseMode;
        public static final int Widget_Material_Light_ActionButton_Overflow = android.R.style.Widget_Material_Light_ActionButton_Overflow;
        public static final int Widget_Material_Light_ActionMode = android.R.style.Widget_Material_Light_ActionMode;
        public static final int Widget_Material_Light_AutoCompleteTextView = android.R.style.Widget_Material_Light_AutoCompleteTextView;
        public static final int Widget_Material_Light_Button = android.R.style.Widget_Material_Light_Button;
        public static final int Widget_Material_Light_ButtonBar = android.R.style.Widget_Material_Light_ButtonBar;
        public static final int Widget_Material_Light_ButtonBar_AlertDialog = android.R.style.Widget_Material_Light_ButtonBar_AlertDialog;
        public static final int Widget_Material_Light_Button_Borderless = android.R.style.Widget_Material_Light_Button_Borderless;
        public static final int Widget_Material_Light_Button_Borderless_Colored = android.R.style.Widget_Material_Light_Button_Borderless_Colored;
        public static final int Widget_Material_Light_Button_Borderless_Small = android.R.style.Widget_Material_Light_Button_Borderless_Small;
        public static final int Widget_Material_Light_Button_Inset = android.R.style.Widget_Material_Light_Button_Inset;
        public static final int Widget_Material_Light_Button_Small = android.R.style.Widget_Material_Light_Button_Small;
        public static final int Widget_Material_Light_Button_Toggle = android.R.style.Widget_Material_Light_Button_Toggle;
        public static final int Widget_Material_Light_CalendarView = android.R.style.Widget_Material_Light_CalendarView;
        public static final int Widget_Material_Light_CheckedTextView = android.R.style.Widget_Material_Light_CheckedTextView;
        public static final int Widget_Material_Light_CompoundButton_CheckBox = android.R.style.Widget_Material_Light_CompoundButton_CheckBox;
        public static final int Widget_Material_Light_CompoundButton_RadioButton = android.R.style.Widget_Material_Light_CompoundButton_RadioButton;
        public static final int Widget_Material_Light_CompoundButton_Star = android.R.style.Widget_Material_Light_CompoundButton_Star;
        public static final int Widget_Material_Light_CompoundButton_Switch = android.R.style.Widget_Material_Light_CompoundButton_Switch;
        public static final int Widget_Material_Light_DatePicker = android.R.style.Widget_Material_Light_DatePicker;
        public static final int Widget_Material_Light_DropDownItem = android.R.style.Widget_Material_Light_DropDownItem;
        public static final int Widget_Material_Light_DropDownItem_Spinner = android.R.style.Widget_Material_Light_DropDownItem_Spinner;
        public static final int Widget_Material_Light_EditText = android.R.style.Widget_Material_Light_EditText;
        public static final int Widget_Material_Light_ExpandableListView = android.R.style.Widget_Material_Light_ExpandableListView;
        public static final int Widget_Material_Light_FastScroll = android.R.style.Widget_Material_Light_FastScroll;
        public static final int Widget_Material_Light_GridView = android.R.style.Widget_Material_Light_GridView;
        public static final int Widget_Material_Light_HorizontalScrollView = android.R.style.Widget_Material_Light_HorizontalScrollView;
        public static final int Widget_Material_Light_ImageButton = android.R.style.Widget_Material_Light_ImageButton;
        public static final int Widget_Material_Light_ListPopupWindow = android.R.style.Widget_Material_Light_ListPopupWindow;
        public static final int Widget_Material_Light_ListView = android.R.style.Widget_Material_Light_ListView;
        public static final int Widget_Material_Light_ListView_DropDown = android.R.style.Widget_Material_Light_ListView_DropDown;
        public static final int Widget_Material_Light_MediaRouteButton = android.R.style.Widget_Material_Light_MediaRouteButton;
        public static final int Widget_Material_Light_NumberPicker = android.R.style.Widget_Material_Light_NumberPicker;
        public static final int Widget_Material_Light_PopupMenu = android.R.style.Widget_Material_Light_PopupMenu;
        public static final int Widget_Material_Light_PopupMenu_Overflow = android.R.style.Widget_Material_Light_PopupMenu_Overflow;
        public static final int Widget_Material_Light_PopupWindow = android.R.style.Widget_Material_Light_PopupWindow;
        public static final int Widget_Material_Light_ProgressBar = android.R.style.Widget_Material_Light_ProgressBar;
        public static final int Widget_Material_Light_ProgressBar_Horizontal = android.R.style.Widget_Material_Light_ProgressBar_Horizontal;
        public static final int Widget_Material_Light_ProgressBar_Inverse = android.R.style.Widget_Material_Light_ProgressBar_Inverse;
        public static final int Widget_Material_Light_ProgressBar_Large = android.R.style.Widget_Material_Light_ProgressBar_Large;
        public static final int Widget_Material_Light_ProgressBar_Large_Inverse = android.R.style.Widget_Material_Light_ProgressBar_Large_Inverse;
        public static final int Widget_Material_Light_ProgressBar_Small = android.R.style.Widget_Material_Light_ProgressBar_Small;
        public static final int Widget_Material_Light_ProgressBar_Small_Inverse = android.R.style.Widget_Material_Light_ProgressBar_Small_Inverse;
        public static final int Widget_Material_Light_ProgressBar_Small_Title = android.R.style.Widget_Material_Light_ProgressBar_Small_Title;
        public static final int Widget_Material_Light_RatingBar = android.R.style.Widget_Material_Light_RatingBar;
        public static final int Widget_Material_Light_RatingBar_Indicator = android.R.style.Widget_Material_Light_RatingBar_Indicator;
        public static final int Widget_Material_Light_RatingBar_Small = android.R.style.Widget_Material_Light_RatingBar_Small;
        public static final int Widget_Material_Light_ScrollView = android.R.style.Widget_Material_Light_ScrollView;
        public static final int Widget_Material_Light_SearchView = android.R.style.Widget_Material_Light_SearchView;
        public static final int Widget_Material_Light_SeekBar = android.R.style.Widget_Material_Light_SeekBar;
        public static final int Widget_Material_Light_SegmentedButton = android.R.style.Widget_Material_Light_SegmentedButton;
        public static final int Widget_Material_Light_Spinner = android.R.style.Widget_Material_Light_Spinner;
        public static final int Widget_Material_Light_Spinner_Underlined = android.R.style.Widget_Material_Light_Spinner_Underlined;
        public static final int Widget_Material_Light_StackView = android.R.style.Widget_Material_Light_StackView;
        public static final int Widget_Material_Light_Tab = android.R.style.Widget_Material_Light_Tab;
        public static final int Widget_Material_Light_TabWidget = android.R.style.Widget_Material_Light_TabWidget;
        public static final int Widget_Material_Light_TextView = android.R.style.Widget_Material_Light_TextView;
        public static final int Widget_Material_Light_TextView_SpinnerItem = android.R.style.Widget_Material_Light_TextView_SpinnerItem;
        public static final int Widget_Material_Light_TimePicker = android.R.style.Widget_Material_Light_TimePicker;
        public static final int Widget_Material_Light_WebTextView = android.R.style.Widget_Material_Light_WebTextView;
        public static final int Widget_Material_Light_WebView = android.R.style.Widget_Material_Light_WebView;
        public static final int Widget_Material_ListPopupWindow = android.R.style.Widget_Material_ListPopupWindow;
        public static final int Widget_Material_ListView = android.R.style.Widget_Material_ListView;
        public static final int Widget_Material_ListView_DropDown = android.R.style.Widget_Material_ListView_DropDown;
        public static final int Widget_Material_MediaRouteButton = android.R.style.Widget_Material_MediaRouteButton;
        public static final int Widget_Material_NumberPicker = android.R.style.Widget_Material_NumberPicker;
        public static final int Widget_Material_PopupMenu = android.R.style.Widget_Material_PopupMenu;
        public static final int Widget_Material_PopupMenu_Overflow = android.R.style.Widget_Material_PopupMenu_Overflow;
        public static final int Widget_Material_PopupWindow = android.R.style.Widget_Material_PopupWindow;
        public static final int Widget_Material_ProgressBar = android.R.style.Widget_Material_ProgressBar;
        public static final int Widget_Material_ProgressBar_Horizontal = android.R.style.Widget_Material_ProgressBar_Horizontal;
        public static final int Widget_Material_ProgressBar_Large = android.R.style.Widget_Material_ProgressBar_Large;
        public static final int Widget_Material_ProgressBar_Small = android.R.style.Widget_Material_ProgressBar_Small;
        public static final int Widget_Material_ProgressBar_Small_Title = android.R.style.Widget_Material_ProgressBar_Small_Title;
        public static final int Widget_Material_RatingBar = android.R.style.Widget_Material_RatingBar;
        public static final int Widget_Material_RatingBar_Indicator = android.R.style.Widget_Material_RatingBar_Indicator;
        public static final int Widget_Material_RatingBar_Small = android.R.style.Widget_Material_RatingBar_Small;
        public static final int Widget_Material_ScrollView = android.R.style.Widget_Material_ScrollView;
        public static final int Widget_Material_SearchView = android.R.style.Widget_Material_SearchView;
        public static final int Widget_Material_SeekBar = android.R.style.Widget_Material_SeekBar;
        public static final int Widget_Material_SeekBar_Discrete = android.R.style.Widget_Material_SeekBar_Discrete;
        public static final int Widget_Material_SegmentedButton = android.R.style.Widget_Material_SegmentedButton;
        public static final int Widget_Material_Spinner = android.R.style.Widget_Material_Spinner;
        public static final int Widget_Material_Spinner_Underlined = android.R.style.Widget_Material_Spinner_Underlined;
        public static final int Widget_Material_StackView = android.R.style.Widget_Material_StackView;
        public static final int Widget_Material_Tab = android.R.style.Widget_Material_Tab;
        public static final int Widget_Material_TabWidget = android.R.style.Widget_Material_TabWidget;
        public static final int Widget_Material_TextView = android.R.style.Widget_Material_TextView;
        public static final int Widget_Material_TextView_SpinnerItem = android.R.style.Widget_Material_TextView_SpinnerItem;
        public static final int Widget_Material_TimePicker = android.R.style.Widget_Material_TimePicker;
        public static final int Widget_Material_Toolbar = android.R.style.Widget_Material_Toolbar;
        public static final int Widget_Material_Toolbar_Button_Navigation = android.R.style.Widget_Material_Toolbar_Button_Navigation;
        public static final int Widget_Material_WebTextView = android.R.style.Widget_Material_WebTextView;
        public static final int Widget_Material_WebView = android.R.style.Widget_Material_WebView;
        public static final int Widget_PopupMenu = android.R.style.Widget_PopupMenu;
        public static final int Widget_PopupWindow = android.R.style.Widget_PopupWindow;
        public static final int Widget_ProgressBar = android.R.style.Widget_ProgressBar;
        public static final int Widget_ProgressBar_Horizontal = android.R.style.Widget_ProgressBar_Horizontal;
        public static final int Widget_ProgressBar_Inverse = android.R.style.Widget_ProgressBar_Inverse;
        public static final int Widget_ProgressBar_Large = android.R.style.Widget_ProgressBar_Large;
        public static final int Widget_ProgressBar_Large_Inverse = android.R.style.Widget_ProgressBar_Large_Inverse;
        public static final int Widget_ProgressBar_Small = android.R.style.Widget_ProgressBar_Small;
        public static final int Widget_ProgressBar_Small_Inverse = android.R.style.Widget_ProgressBar_Small_Inverse;
        public static final int Widget_RatingBar = android.R.style.Widget_RatingBar;
        public static final int Widget_ScrollView = android.R.style.Widget_ScrollView;
        public static final int Widget_SeekBar = android.R.style.Widget_SeekBar;
        public static final int Widget_Spinner = android.R.style.Widget_Spinner;
        public static final int Widget_Spinner_DropDown = android.R.style.Widget_Spinner_DropDown;
        public static final int Widget_StackView = android.R.style.Widget_StackView;
        public static final int Widget_TabWidget = android.R.style.Widget_TabWidget;
        public static final int Widget_TextView = android.R.style.Widget_TextView;
        public static final int Widget_TextView_PopupMenu = android.R.style.Widget_TextView_PopupMenu;
        public static final int Widget_TextView_SpinnerItem = android.R.style.Widget_TextView_SpinnerItem;
        public static final int Widget_Toolbar = android.R.style.Widget_Toolbar;
        public static final int Widget_Toolbar_Button_Navigation = android.R.style.Widget_Toolbar_Button_Navigation;
        public static final int Widget_WebView = android.R.style.Widget_WebView;

        public style() {
            throw new RuntimeException("Stub!");
        }
    }

    public static final class transition {
        public static final int explode = android.R.transition.explode;
        public static final int fade = android.R.transition.fade;
        public static final int move = android.R.transition.move;
        public static final int no_transition = android.R.transition.no_transition;
        public static final int slide_bottom = android.R.transition.slide_bottom;
        public static final int slide_left = android.R.transition.slide_left;
        public static final int slide_right = android.R.transition.slide_right;
        public static final int slide_top = android.R.transition.slide_top;

        public transition() {
            throw new RuntimeException("Stub!");
        }
    }

    public static final class xml {
        public xml() {
            throw new RuntimeException("Stub!");
        }
    }
}
