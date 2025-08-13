package com.example.thinking.util

import android.accessibilityservice.AccessibilityService
import android.accessibilityservice.AccessibilityServiceInfo
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.view.accessibility.AccessibilityManager

class AccessibilityUtil {

    val Context.accessibilityManager get() = getSystemService(Context.ACCESSIBILITY_SERVICE) as AccessibilityManager

    inline fun <reified T : AccessibilityService> isAccessibilityEnabled(
        context: Context
    ): Boolean {
        return isAccessibilityEnabled(context, T::class.java)
    }

    fun isAccessibilityEnabled(
        context: Context, clazz: Class<*>
    ): Boolean {
        return isAccessibilityEnabled(context, context.packageName, clazz.name)
    }

    fun isAccessibilityEnabled(
        context: Context, pkg: String, cls: String
    ): Boolean {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH) {
            isAccessibilityEnabled14(context, pkg, cls)
        } else {
            isAccessibilityEnabledBase(context, pkg, cls)
        }
    }

    private fun isAccessibilityEnabled14(
        context: Context, pkg: String, cls: String
    ): Boolean {
        val accessibilityManager = context.accessibilityManager
        val list = accessibilityManager.getEnabledAccessibilityServiceList(
            AccessibilityServiceInfo.FEEDBACK_ALL_MASK
        )

        val clazzId = ComponentName(pkg, cls).flattenToShortString()
        for (info in list) {
            if (info.id == clazzId) {
                return true
            }
        }
        return false
    }

    private fun isAccessibilityEnabledBase(
        context: Context, pkg: String, cls: String
    ): Boolean {
        val clazzId = ComponentName(pkg, cls).flattenToShortString()
        val accessibilityEnabled = Settings.Secure.getInt(
            context.contentResolver, Settings.Secure.ACCESSIBILITY_ENABLED, 0
        ) == 1

        if (!accessibilityEnabled) return false

        val enabledServices = Settings.Secure.getString(
            context.contentResolver, Settings.Secure.ENABLED_ACCESSIBILITY_SERVICES
        ) ?: return false

        return enabledServices.split(':').any { it.contains(clazzId) }
    }

    inline fun <reified T : AccessibilityService> getAccessibilityIntent(
        context: Context
    ) = getAccessibilityIntent(context, T::class.java)

    fun getAccessibilityIntent(context: Context, clazz: Class<*>): Intent {
        val intent = Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS)
        val bundle = Bundle()
        val name = "${context.packageName}/${clazz.name}"
        bundle.putString(":settings:fragment_args_key", name)
        intent.putExtra(":settings:fragment_args_key", name)
        intent.putExtra(":settings:show_fragment_args", bundle)
        return intent
    }
}