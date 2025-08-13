@file:Suppress("NOTHING_TO_INLINE")

package com.example.thinking.util

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.Resources
import android.content.res.Resources.Theme
import android.graphics.drawable.Drawable
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.core.content.res.ResourcesCompat
import androidx.core.content.withStyledAttributes
import androidx.appcompat.R as CompatR

val Context.defaultTextColor
    @SuppressLint("PrivateResource")
    get() : Int {
        var color = 0
        withStyledAttributes(android.R.style.TextAppearance, CompatR.styleable.TextAppearance) {
            color = getColor(CompatR.styleable.TextAppearance_android_textColor, color)
        }
        return color
    }

val Context.dividerHeight get() = listDivider?.intrinsicHeight ?: idp(1)

val Context.dividerWidth get() = listDivider?.intrinsicWidth ?: idp(1)

val Context.listDivider
    get() = run {
        var listDivider: Drawable? = null
        val dividerAttrs = intArrayOf(android.R.attr.listDivider)
        withStyledAttributes(0, dividerAttrs) {
            listDivider = getDrawable(0)
        }
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