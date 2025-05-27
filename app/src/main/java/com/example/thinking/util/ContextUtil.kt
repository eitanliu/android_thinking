package com.example.thinking.util

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.content.Intent

fun Context.contextTree(tree: (context: Context) -> Unit) {
    tree(this)
    if (this is ContextWrapper) baseContext.contextTree(tree)
}

fun Context.baseIf(predicate: (context: Context) -> Boolean): Context? {
    if (predicate(this)) {
        return this
    } else if (this is ContextWrapper) {
        baseContext.baseIf(predicate)
    }
    return null
}

inline fun <reified T : Activity> Context.startActivity() {
    startActivity(Intent(this, T::class.java))
}

inline fun <reified T : Activity> Context.startActivity(noinline action: Intent.() -> Unit) {
    startActivity(Intent(this, T::class.java).apply(action))
}