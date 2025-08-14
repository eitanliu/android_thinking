package com.example.thinking

import android.app.Application
import android.content.Context
import androidx.startup.AppInitializer
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
        AppInitializer.getInstance(this)
        super.onCreate()
    }
}