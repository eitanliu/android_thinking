package com.example.thinking.util

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle

/**
 * [androidx.savedstate.SavedStateWriter]
 */

val SavedStateHandle.bundle: Bundle
    get() {
        val keys = keys()
        return Bundle(keys.size).also {
            keys.forEach { key ->
                it.putValue(key, get(key))
            }
        }
    }

fun SavedStateHandle.toMap(): Map<String, Any?> {
    val state: MutableMap<String, Any?> = HashMap()
    for (key in keys()) {
        state[key] = this[key]
    }
    return state
}