@file:Suppress("NOTHING_TO_INLINE")

package com.example.thinking.util

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.Resources
import android.content.res.Resources.Theme
import android.graphics.drawable.Drawable
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.core.content.res.ResourcesCompat
import androidx.core.content.withStyledAttributes
import androidx.appcompat.R as CompatR

val Context.normalTextColor
    @SuppressLint("PrivateResource")
    get() : Int {
        var color = 0
        withStyledAttributes(android.R.style.TextAppearance, CompatR.styleable.TextAppearance) {
            color = getColor(CompatR.styleable.TextAppearance_android_textColor, color)
        }
        return color
    }

inline val Context.dividerHeight get() = listDivider?.intrinsicHeight ?: idp(1)

inline val Context.dividerWidth get() = listDivider?.intrinsicWidth ?: idp(1)

val Context.listDivider
    get() = run {
        var listDivider: Drawable? = null
        val dividerAttrs = intArrayOf(android.R.attr.listDivider)
        withStyledAttributes(0, dividerAttrs) {
            listDivider = getDrawable(0)
        }
        listDivider
    }

inline val Context.statusBarHeight get() = applicationContext.resources.statusBarHeight

inline val Context.navigationBarHeight get() = applicationContext.resources.navigationBarHeight

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


inline fun Context.color(@ColorRes id: Int, theme: Resources.Theme? = null) =
    resources.color(id, theme)

inline fun Resources.color(@ColorRes id: Int, theme: Theme? = null) =
    ResourcesCompat.getColor(this, id, theme)

inline fun Context.colorStateList(@ColorRes id: Int, theme: Resources.Theme? = null) =
    resources.colorStateList(id, theme)

inline fun Resources.colorStateList(@ColorRes id: Int, theme: Theme? = null) =
    ResourcesCompat.getColorStateList(this, id, theme)

inline fun Context.drawable(@DrawableRes id: Int, theme: Resources.Theme? = null) =
    resources.drawable(id, theme)

inline fun Resources.drawable(@DrawableRes id: Int, theme: Theme? = null) =
    ResourcesCompat.getDrawable(this, id, theme)

inline fun Context.string(@StringRes id: Int) = resources.string(id)

inline fun Resources.string(@StringRes id: Int) = getString(id)

inline fun Context.string(@StringRes id: Int, vararg args: Any) = resources.string(id, args)

inline fun Resources.string(@StringRes id: Int, vararg args: Any) = getString(id, args)