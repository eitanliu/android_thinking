package com.example.thinking.util

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.core.content.withStyledAttributes
import androidx.appcompat.R as CompatR


val Context.normalTextColor
    @Suppress("PrivateResource")
    get() : Int {
        var color = 0
        withStyledAttributes(
            null, CompatR.styleable.TextAppearance,
            defStyleRes = android.R.style.TextAppearance
        ) {
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
        withStyledAttributes(null, dividerAttrs) {
            listDivider = getDrawable(0)
        }
        listDivider
    }