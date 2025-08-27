package com.example.thinking.app

import android.content.Context
import android.content.ContextParams
import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.content.res.Resources
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.Display
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.DisplayCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.thinking.R
import com.example.thinking.databinding.ActivityDisplayBinding
import com.example.thinking.util.Logcat
import com.example.thinking.util.navigationBarHeight
import com.example.thinking.util.statusBarHeight
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min
import kotlin.math.roundToInt

class DisplayActivity : AppCompatActivity() {

    val binding by lazy {
        ActivityDisplayBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            val statusBarHeight = statusBarHeight
            Logcat.msg("statusBarHeight: $statusBarHeight, ${systemBars.top}", Logcat.E)
            val left = systemBars.left
            val right = systemBars.right
            val top = max(statusBarHeight, systemBars.top)
            val bottom = systemBars.bottom
            v.setPadding(left, top, right, bottom)
            insets
        }
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_SENSOR
        resources.configuration.orientation
        val display = ContextCompat.getDisplayOrDefault(this)
        display.rotation
        val statusBarHeight = statusBarHeight
        val navigationBarHeight = navigationBarHeight
        Logcat.msg("display: ${display.rotation}, $statusBarHeight, $navigationBarHeight, $display")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        Logcat.msg("onConfigurationChanged", Logcat.E)
        super.onConfigurationChanged(newConfig)
    }

    override fun applyOverrideConfiguration(overrideConfiguration: Configuration?) {
        Logcat.msg("applyOverrideConfiguration $overrideConfiguration", Logcat.E)
        super.applyOverrideConfiguration(overrideConfiguration)
    }

    override fun setTheme(resId: Int) {
        Logcat.msg("setTheme: $resId", Logcat.E)
        super.setTheme(resId)
    }

    override fun setTheme(theme: Resources.Theme?) {
        Logcat.msg("setTheme: $theme", Logcat.E)
        super.setTheme(theme)
    }

    override fun onApplyThemeResource(theme: Resources.Theme?, resid: Int, first: Boolean) {
        Logcat.msg("onApplyThemeResource: $resid, $first, $theme", Logcat.E)
        super.onApplyThemeResource(theme, resid, first)
    }

    override fun getTheme(): Resources.Theme {
        val theme = super.getTheme()
        // Logcat.msg("getTheme $theme")
        return theme
    }

    override fun createConfigurationContext(overrideConfiguration: Configuration): Context {
        Logcat.msg("createConfigurationContext $overrideConfiguration", Logcat.E)
        return super.createConfigurationContext(overrideConfiguration)
    }

    override fun createContext(contextParams: ContextParams): Context {
        Logcat.msg("createContext $contextParams", Logcat.E)
        return super.createContext(contextParams)
    }

    override fun createAttributionContext(attributionTag: String?): Context {
        Logcat.msg("createAttributionContext $attributionTag", Logcat.E)
        return super.createAttributionContext(attributionTag)
    }

    override fun createContextForSplit(splitName: String?): Context {
        Logcat.msg("createContextForSplit $splitName", Logcat.E)
        return super.createContextForSplit(splitName)
    }

    override fun createPackageContext(packageName: String?, flags: Int): Context {
        Logcat.msg("createPackageContext $packageName, $flags", Logcat.E)
        return super.createPackageContext(packageName, flags)
    }

    override fun createDeviceProtectedStorageContext(): Context {
        Logcat.msg("createDeviceProtectedStorageContext", Logcat.E)
        return super.createDeviceProtectedStorageContext()
    }

    override fun createDeviceContext(deviceId: Int): Context {
        Logcat.msg("createDeviceContext $deviceId", Logcat.E)
        return super.createDeviceContext(deviceId)
    }

    override fun createDisplayContext(display: Display): Context {
        Logcat.msg("createDisplayContext $display", Logcat.E)
        return super.createDisplayContext(display)
    }

    override fun createWindowContext(type: Int, options: Bundle?): Context {
        Logcat.msg("createWindowContext $type, $options", Logcat.E)
        return super.createWindowContext(type, options)
    }

    override fun createWindowContext(display: Display, type: Int, options: Bundle?): Context {
        Logcat.msg("createWindowContext Display $display, $type, $options", Logcat.E)
        return super.createWindowContext(display, type, options)
    }

    override fun attachBaseContext(newBase: Context) {
        val conf = updateConfiguration(newBase)
        // Plan 1：使用 ContextThemeWrapper.applyOverrideConfiguration
        applyOverrideConfiguration(conf)
        // Plan 2：使用 Context.createConfigurationContext
        // val context = newBase.createConfigurationContext(conf)
        // return super.attachBaseContext(context)
        // Plan 3：使用 Resources.updateConfiguration
        // newBase.resources.updateConfiguration(conf, null)
        // Plan 4：使用 Configuration.updateFrom 或 setTo
        // newBase.resources.configuration.updateFrom(conf)
        Logcat.msg("attachBaseContext $newBase", Logcat.E)
        return super.attachBaseContext(newBase)
    }

    private fun updateConfiguration(context: Context): Configuration {
        val resources = context.resources
        val configuration = resources.configuration
        val displayMetrics = resources.displayMetrics
        // val physicalWidth = min(displayMetrics.widthPixels, displayMetrics.heightPixels)
        // val physicalHeight = max(displayMetrics.widthPixels, displayMetrics.heightPixels)
        val display = ContextCompat.getDisplayOrDefault(context)
        val mode = DisplayCompat.getMode(context, display)
        val physicalWidth = min(mode.physicalWidth, mode.physicalHeight)
        val physicalHeight = max(mode.physicalWidth, mode.physicalHeight)
        val screenWidth = configuration.smallestScreenWidthDp
        val screenDensity = displayMetrics.density
        val screenDpi = configuration.densityDpi
        val designWidth = 420.0
        val designDensity = physicalWidth / designWidth
        val designDpi = (designDensity * 160).roundToInt()
        val newConfiguration = Configuration(configuration)
        val differDip = designDensity - screenDensity
        val differDpi = designDpi - screenDpi
        Logcat.msg("physical $physicalWidth x $physicalHeight")
        Logcat.msg("display $physicalWidth, $screenWidth, $designWidth, $display")
        Logcat.msg("DisplayMetrics ${DisplayMetrics.DENSITY_DEFAULT}, ${DisplayMetrics.DENSITY_DEVICE_STABLE}; $displayMetrics")
        Logcat.msg("width $physicalWidth, differ density $designDensity - $screenDensity = $differDip")
        Logcat.msg("width $physicalWidth, differ dpi $designDpi - $screenDpi = $differDpi")
        // 避免差异过大比较屏幕和设计稿，超过指定系数使用系统默认值
        // abs(screenWidth - designWidth) < 60
        // abs(screenWidth - designWidth) / designWidth < 0.15
        // abs(designDensity - screenDensity) < 0.6
        // abs(designDpi - screenDpi) < 96
        if (abs(screenWidth - designWidth) < 60) {
            newConfiguration.densityDpi = designDpi
            fun calcSize(size: Int) = (size * screenDensity / designDensity).roundToInt()
            newConfiguration.smallestScreenWidthDp = calcSize(configuration.smallestScreenWidthDp)
            newConfiguration.screenWidthDp = calcSize(configuration.screenWidthDp)
            newConfiguration.screenHeightDp = calcSize(configuration.screenHeightDp)
        }
        return newConfiguration
    }
}