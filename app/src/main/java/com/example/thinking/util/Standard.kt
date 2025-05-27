@file:Suppress("NOTHING_TO_INLINE")

package com.example.thinking.util


inline fun hashCodeArray(vararg array: Any?, initial: Int = 0): Int {
    return array.fold(initial) { acc, obj ->
        31 * acc + obj.hashCode()
    }
}