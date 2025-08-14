package com.example.thinking.util

import android.app.ActivityManager
import android.app.Application
import android.content.Context
import android.os.Build
import android.os.Process
import android.util.Log
import androidx.startup.Initializer
import java.lang.ref.WeakReference


class ContextInitializer : Initializer<ContextInitializer> {

    companion object {
        const val TAG = "ContextInitializer"
        private var _context: WeakReference<Context?> = WeakReference(null)

        @JvmStatic
        val context: Context get() = _context.get() ?: throw ContextNotInitializedException()

        @JvmStatic
        fun init(context: Context) {
            Log.d(TAG, "initContext: $context ${processName(context)}")
            _context = WeakReference(context.applicationContext)
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

    override fun create(context: Context): ContextInitializer {
        init(context)
        return this
    }

    override fun dependencies(): List<Class<out Initializer<*>?>?> {
        return emptyList()
    }
}