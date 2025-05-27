@file:Suppress("NOTHING_TO_INLINE")

package com.example.thinking.util

import android.content.Context
import android.content.res.Resources
import android.content.res.Resources.Theme
import android.graphics.drawable.Drawable
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.core.content.res.ResourcesCompat

val Context.defaultTextColor
    get() : Int {
        val attrs = intArrayOf(android.R.attr.textColor)
        val ta = obtainStyledAttributes(android.R.style.TextAppearance, attrs)
        val defaultTextColor = ta.getColor(0, 0)
        ta.recycle()
        return defaultTextColor
    }

val Context.dividerHeight get() = listDivider?.intrinsicHeight ?: idp(1)

val Context.dividerWidth get() = listDivider?.intrinsicWidth ?: idp(1)

val Context.listDivider
    get() = run {
        var listDivider: Drawable? = null
        val dividerAttrs = intArrayOf(android.R.attr.listDivider)
        obtainStyledAttributes(dividerAttrs).apply {
            listDivider = getDrawable(0)
        }.recycle()
        listDivider
    }

inline fun Context.color(@ColorRes id: Int, theme: Resources.Theme? = null) =
    resources.color(id, theme)

inline fun Context.drawable(@DrawableRes id: Int, theme: Resources.Theme? = null) =
    resources.drawable(id, theme)


inline fun Resources.color(@ColorRes id: Int, theme: Theme? = null) =
    ResourcesCompat.getColor(this, id, theme)

inline fun Resources.drawable(@DrawableRes id: Int, theme: Theme? = null) =
    ResourcesCompat.getDrawable(this, id, theme)