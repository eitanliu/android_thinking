package com.example.thinking.util

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle

/**
 * [androidx.savedstate.SavedStateWriter]
 */

fun SavedStateHandle.toBundle(): Bundle {
    val keys = keys()
    val bundle = Bundle(keys.size)
    for (key in keys) {
        bundle.putValue(key, get(key))
    }
    return bundle
}

fun SavedStateHandle.toMap(): Map<String, Any?> {
    val keys = keys()
    val state = LinkedHashMap<String, Any?>(keys.size)
    for (key in keys) {
        state[key] = get(key)
    }
    return state
}