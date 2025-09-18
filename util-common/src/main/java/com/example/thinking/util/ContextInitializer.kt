package com.example.thinking.util

import android.app.ActivityManager
import android.app.Application
import android.content.Context
import android.os.Build
import android.os.Process
import android.util.Log
import androidx.startup.AppInitializer
import androidx.startup.Initializer
import java.lang.ref.WeakReference


class ContextInitializer : Initializer<ContextInitializer> {

    companion object {
        const val TAG = "ContextInitializer"
        private var ref: WeakReference<ContextInitializer?> = WeakReference(null)

        val context: Context get() = ref.get()?.context ?: throw ContextNotInitializedException()

        val contextOrNull get() = ref.get()?.contextOrNull

        @JvmStatic
        fun init(context: Context): ContextInitializer {
            val appInitializer = AppInitializer.getInstance(context)
            val instance = appInitializer.initializeComponent(ContextInitializer::class.java)
            return instance
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

    private var _context: Context? = null

    val context get() = _context ?: throw ContextNotInitializedException()

    val contextOrNull get() = _context

    override fun create(context: Context): ContextInitializer {
        Log.d(TAG, "initContext: ${processName(context)}, $context")
        ref = WeakReference(this)
        _context = context
        return this
    }

    override fun dependencies(): List<Class<out Initializer<*>?>?> {
        return emptyList()
    }
}