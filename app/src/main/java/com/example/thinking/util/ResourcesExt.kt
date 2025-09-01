@file:Suppress("NOTHING_TO_INLINE")

package com.example.thinking.util

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.Resources
import android.content.res.Resources.Theme
import android.graphics.drawable.Drawable
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.core.content.res.ResourcesCompat

inline val Context.statusBarHeight get() = applicationContext.resources.statusBarHeight

inline val Context.navigationBarHeight get() = applicationContext.resources.navigationBarHeight

inline fun Context.colorOrNull(@ColorRes id: Int, theme: Theme? = null) =
    resources.colorOrNull(id, theme)

inline fun Context.colorStateListOrNull(@ColorRes id: Int, theme: Theme? = null) =
    resources.colorStateListOrNull(id, theme)

inline fun Context.drawableOrNull(@DrawableRes id: Int, theme: Theme? = null) =
    resources.drawableOrNull(id, theme)

inline fun Context.stringOrNull(@StringRes id: Int) = resources.stringOrNull(id)

inline fun Context.stringOrNull(@StringRes id: Int, vararg args: Any) =
    resources.stringOrNull(id, args)

inline fun Context.color(@ColorRes id: Int, theme: Resources.Theme? = null) =
    resources.color(id, theme)

inline fun Context.colorStateList(@ColorRes id: Int, theme: Resources.Theme? = null) =
    resources.colorStateList(id, theme)

inline fun Context.drawable(@DrawableRes id: Int, theme: Resources.Theme? = null) =
    resources.drawable(id, theme)

inline fun Context.string(@StringRes id: Int) = resources.string(id)

inline fun Context.string(@StringRes id: Int, vararg args: Any) = resources.string(id, args)

@Suppress("DiscouragedApi", "InternalInsetResource")
val Resources.statusBarHeight
    get() = try {
        val resId = getIdentifier("status_bar_height", "dimen", "android")
        if (resId != 0) getDimensionPixelSize(resId) else 0
    } catch (_: Throwable) {
        0
    }

@Suppress("DiscouragedApi", "InternalInsetResource")
val Resources.navigationBarHeight
    get() = try {
        val resId = getIdentifier("navigation_bar_height", "dimen", "android")
        if (resId != 0) getDimensionPixelSize(resId) else 0
    } catch (_: Throwable) {
        0
    }

inline fun Resources.colorOrNull(
    @ColorRes id: Int, theme: Theme? = null
): Int? = try {
    ResourcesCompat.getColor(this, id, theme)
} catch (_: Throwable) {
    null
}

inline fun Resources.colorStateListOrNull(
    @ColorRes id: Int, theme: Theme? = null
): ColorStateList? = try {
    ResourcesCompat.getColorStateList(this, id, theme)
} catch (_: Throwable) {
    null
}

inline fun Resources.drawableOrNull(
    @DrawableRes id: Int, theme: Theme? = null
): Drawable? = try {
    ResourcesCompat.getDrawable(this, id, theme)
} catch (_: Throwable) {
    null
}

inline fun Resources.stringOrNull(
    @StringRes id: Int
): String? = try {
    getString(id)
} catch (_: Throwable) {
    null
}

inline fun Resources.stringOrNull(
    @StringRes id: Int, vararg args: Any
): String? = try {
    getString(id, args)
} catch (_: Throwable) {
    null
}

inline fun Resources.color(
    @ColorRes id: Int, theme: Theme? = null
): Int = ResourcesCompat.getColor(this, id, theme)

inline fun Resources.colorStateList(
    @ColorRes id: Int, theme: Theme? = null
): ColorStateList = ResourcesCompat.getColorStateList(this, id, theme)!!

inline fun Resources.drawable(
    @DrawableRes id: Int, theme: Theme? = null
): Drawable = ResourcesCompat.getDrawable(this, id, theme)!!

inline fun Resources.string(@StringRes id: Int) = getString(id)

inline fun Resources.string(@StringRes id: Int, vararg args: Any) = getString(id, args)