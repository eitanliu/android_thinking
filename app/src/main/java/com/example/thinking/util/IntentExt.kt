@file:Suppress("NOTHING_TO_INLINE")

package com.example.thinking.util

import android.content.Intent
import android.os.Build
import android.os.Parcelable
import java.io.Serializable

/**
 * 栈顶复用
 * 回调 onNewIntent()
 */
fun Intent.singleTop() = apply {
    addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
}

/**
 * 栈内复用
 * 回调 onNewIntent()
 */
fun Intent.singleTask() = apply {
    addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
    addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
}

/**
 * 清空栈顶、自身
 * 回调 onCreate()
 */
fun Intent.clearTop() = apply {
    addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
}

/**
 * 清空栈
 * 销毁 singleInstance 模式外的全部 Activity
 * 回调 onCreate()
 */
fun Intent.clearTask() = apply {
    addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
}

/**
 * 不执行转场动画
 */
fun Intent.noAnim() = apply {
    addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
}

inline fun Intent.getBooleanOrNull(
    key: String, default: Int = 0
) = if (hasExtra(key)) getBooleanExtra(key, default != 0) else null

inline fun Intent.getByteOrNull(
    key: String, default: Byte = 0
) = if (hasExtra(key)) getByteExtra(key, default) else null

inline fun Intent.getCharOrNull(
    key: String, default: Char = '\u0000'
) = if (hasExtra(key)) getCharExtra(key, default) else null

inline fun Intent.getShortOrNull(
    key: String, default: Short = 0
) = if (hasExtra(key)) getShortExtra(key, default) else null

inline fun Intent.getIntOrNull(
    key: String, default: Int = 0
) = if (hasExtra(key)) getIntExtra(key, default) else null

inline fun Intent.getLongOrNull(
    key: String, default: Long = 0L
) = if (hasExtra(key)) getLongExtra(key, default) else null

inline fun Intent.getFloatOrNull(
    key: String, default: Float = 0f
) = if (hasExtra(key)) getFloatExtra(key, default) else null

inline fun Intent.getDoubleOrNull(
    key: String, default: Double = 0.0
) = if (hasExtra(key)) getDoubleExtra(key, default) else null

@Suppress("UNCHECKED_CAST", "DEPRECATION")
inline fun <reified T> Intent.getParcelableArrayCompat(
    key: String
) = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
    getParcelableArrayExtra<T>(key, T::class.java)
} else getParcelableArrayExtra(key) as? Array<T>

@Suppress("DEPRECATION")
inline fun <reified T : Parcelable> Intent.getParcelableArrayListCompat(
    key: String
) = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
    getParcelableArrayListExtra<T>(key, T::class.java)
} else getParcelableArrayListExtra<T>(key)

@Suppress("DEPRECATION")
inline fun <reified T : Parcelable> Intent.getParcelableExtraCompat(
    key: String
) = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
    getParcelableExtra(key, T::class.java)
} else getParcelableExtra(key)

@Suppress("DEPRECATION")
inline fun <reified T : Serializable> Intent.getSerializableCompat(
    key: String
) = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
    getSerializableExtra(key, T::class.java)
} else getSerializableExtra(key) as? T