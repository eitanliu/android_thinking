package com.example.thinking.util

import android.app.Activity
import android.content.ComponentName
import android.content.Context
import android.content.pm.PackageManager
import android.content.res.Configuration
import android.content.res.Resources
import android.os.Build
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.WindowManager
import androidx.core.content.ContextCompat
import kotlin.math.min
import kotlin.math.roundToInt

class DisplayAdapter(val context: Context) {
    companion object {

        val statusBarHeight by lazy { Resources.getSystem().statusBarHeight }

        val navigationBarHeight by lazy { Resources.getSystem().navigationBarHeight }

        const val KEY_DESIGN_WIDTH = "design_width"

        inline fun <reified T : Activity> getDisplayWidth(context: Context): Int? {
            return getDesignWidth(context, T::class.java)
        }

        fun getDesignWidth(context: Context, clazz: Class<*>): Int? {
            val packageName = context.packageName
            val packageManager = context.packageManager
            val componentName = ComponentName(packageName, clazz.name)
            val info = packageManager.getActivityInfo(componentName, PackageManager.GET_META_DATA)
            val metaData = info.metaData
            return metaData?.getDesignWidth() ?: getAppDesignWidth(context)
        }

        fun getAppDesignWidth(context: Context): Int? {
            val packageName = context.packageName
            val packageManager = context.packageManager
            val info = packageManager.getApplicationInfo(packageName, PackageManager.GET_META_DATA)
            val metaData = info.metaData
            return metaData?.getDesignWidth()
        }

        @Suppress("NOTHING_TO_INLINE")
        private inline fun Bundle.getDesignWidth(): Int? {
            return getInt(KEY_DESIGN_WIDTH).takeIf { containsKey(KEY_DESIGN_WIDTH) }
        }

        fun getDisplayMetrics(context: Context): DisplayMetrics {
            val display = ContextCompat.getDisplayOrDefault(context)
            val displayMetrics = DisplayMetrics()
            // displayMetrics.setToDefaults()
            display.getRealMetrics(displayMetrics)
            val windowManager = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                val metrics = windowManager.maximumWindowMetrics
                val bounds = metrics.bounds
                displayMetrics.widthPixels = bounds.width()
                displayMetrics.heightPixels = bounds.height()
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE) {
                    val density = metrics.density
                    displayMetrics.density = density
                    displayMetrics.scaledDensity = density
                    val calcDensityDpi = (density * DisplayMetrics.DENSITY_DEFAULT).roundToInt()
                    displayMetrics.densityDpi = calcDensityDpi
                }
            }
            return displayMetrics
        }
    }

    fun calcDesignConfiguration(
        designWidth: Int? = getAppDesignWidth(),
        displayMetrics: DisplayMetrics = getDisplayMetrics(),
        predicate: (config: DesignConfig) -> Boolean
    ): Configuration? {
        val resources = context.resources
        val configuration = resources.configuration
        if (designWidth == null) return null

        val widthPixels = displayMetrics.widthPixels
        val heightPixels = displayMetrics.heightPixels
        val smallestPixels = min(widthPixels, heightPixels)

        val screenDpi = displayMetrics.densityDpi
        val screenDensity = screenDpi / DisplayMetrics.DENSITY_DEFAULT.toFloat()
        val screenWidth = (smallestPixels / screenDensity).roundToInt()

        val calcDesignDensity = smallestPixels / designWidth.toFloat()
        val designDpi = (calcDesignDensity * DisplayMetrics.DENSITY_DEFAULT).roundToInt()
        val designDensity = designDpi / DisplayMetrics.DENSITY_DEFAULT.toFloat()
        val designConfig = DesignConfig(
            designWidth, designDpi, designDensity,
            screenWidth, screenDpi, screenDensity
        )

        val newConfiguration = Configuration(configuration)
        if (predicate(designConfig)) {
            val configDpi = configuration.densityDpi
            val configDensity = configDpi / DisplayMetrics.DENSITY_DEFAULT.toFloat()
            fun calcSize(size: Int) = (size * configDensity / designDensity).roundToInt()
            newConfiguration.densityDpi = designDpi
            newConfiguration.smallestScreenWidthDp = calcSize(configuration.smallestScreenWidthDp)
            newConfiguration.screenWidthDp = calcSize(configuration.screenWidthDp)
            newConfiguration.screenHeightDp = calcSize(configuration.screenHeightDp)
        } else {
            return null
        }
        return newConfiguration
    }

    inline fun <reified T : Activity> getDesignWidth() = getDesignWidth(T::class.java)

    fun getDesignWidth(clazz: Class<*>) = getDesignWidth(context, clazz)

    fun getAppDesignWidth() = getAppDesignWidth(context)

    fun getDisplayMetrics(): DisplayMetrics {
        return getDisplayMetrics(context)
    }

    class DesignConfig(
        val designWidth: Int,
        val designDpi: Int,
        val designDensity: Float,
        val screenWidth: Int,
        val screenDpi: Int,
        val screenDensity: Float,
    )
}