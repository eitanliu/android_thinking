package com.example.thinking

import android.app.ActivityManager
import android.app.Application
import android.content.Context
import android.os.Build
import android.os.Process
import androidx.startup.AppInitializer
import com.example.thinking.util.ContextInitializer
import com.example.thinking.util.Logcat
import com.example.thinking.util.TimeUtil

class AppApplication : Application() {

    companion object {
        lateinit var instance: AppApplication
            private set
    }

    init {
        instance = this
    }

    override fun attachBaseContext(base: Context?) {
        Logcat.msg(TimeUtil.formatCurrent("MM-dd HH:mm:ss.SSS"))
        super.attachBaseContext(base)
    }

    override fun onCreate() {
        Logcat.msg(TimeUtil.formatCurrent("MM-dd HH:mm:ss.SSS"))
        AppInitializer.getInstance(this).initializeComponent(ContextInitializer::class.java)
        Logcat.msg("${processName(this)}")
        super.onCreate()
    }

    private fun processName(context: Context): String? {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            return Application.getProcessName()
        } else {
            val manager = context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
            for (process in manager.runningAppProcesses) {
                if (process.pid == Process.myPid()) {
                    return process.processName
                }
            }
        }
        return null
    }
}