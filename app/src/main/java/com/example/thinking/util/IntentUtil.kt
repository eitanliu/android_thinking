package com.example.thinking.util

import android.content.Intent

object IntentUtil {

    /**
     * 跳转桌面(模拟 HOME 键)
     */
    val launcherIntent = run {
        Intent(Intent.ACTION_MAIN)
            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            .addCategory(Intent.CATEGORY_HOME)
    }

    /**
     * 桌面主页
     */
    val launcherHome = launcherIntent.clearTasks()
}