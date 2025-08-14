package com.example.thinking.accessibility

import android.util.Log

object DumpAndroidR {
    private const val TAG = "DumpAndroidR"

    fun dump() {
        try {
            val rClass = Class.forName("android.R")
            for (innerClass in rClass.classes) {
                Log.i(TAG, "=== ${innerClass.simpleName} ===")
                for (f in innerClass.fields) {
                    if (f.type == Int::class.javaPrimitiveType) {
                        val value = f.getInt(null)
                        Log.i(TAG, "${f.name} = 0x${Integer.toHexString(value)}")
                    }
                }
            }
        } catch (e: Exception) {
            Log.e(TAG, "Error dumping internal R", e)
        }
    }
}
