package com.example.thinking.util

import android.app.Activity
import android.app.ActivityManager
import android.app.Application
import android.content.Context
import android.content.ContextWrapper
import android.content.Intent
import android.os.Build
import android.os.Process
import androidx.startup.AppInitializer
import androidx.startup.Initializer

val Context?.processName: String?
    get(): String? {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            Application.getProcessName()
        } else {
            this ?: return null
            val manager = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
            for (process in manager.runningAppProcesses) {
                if (process.pid == Process.myPid()) {
                    return process.processName
                }
            }
            null
        }
    }

fun Context.contextEach(action: (context: Context) -> Unit) {
    var context: Context? = this
    while (context != null) {
        action(context)
        context = if (context is ContextWrapper) {
            context.baseContext
        } else {
            null
        }
    }
}

inline fun <reified T> Context.contextType(): T? {
    return contextIf { it is T } as? T
}

fun Context.contextIf(predicate: (context: Context) -> Boolean): Context? {
    var context: Context? = this
    while (context != null) {
        if (predicate(context)) {
            return context
        } else if (context is ContextWrapper) {
            context = context.baseContext
        } else {
            context = null
        }
    }
    return null
}

inline fun <reified T : Initializer<T>> Context.initializeComponent(): T =
    AppInitializer.getInstance(this).initializeComponent(T::class.java)

inline fun <reified T : Activity> Context.startActivity() {
    startActivity(intent<T>())
}

inline fun <reified T : Activity> Context.startActivity(
    noinline action: Intent.() -> Unit
) {
    startActivity(intent<T>().apply(action))
}

inline fun <reified T : Activity> Context.intent(): Intent {
    return Intent(this, T::class.java)
}