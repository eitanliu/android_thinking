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