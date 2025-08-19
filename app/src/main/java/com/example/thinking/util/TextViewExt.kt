package com.example.thinking.util

import android.graphics.drawable.Drawable
import android.widget.TextView

fun TextView.setCompoundDrawablesRelative(
    start: Drawable? = null,
    top: Drawable? = null,
    end: Drawable? = null,
    bottom: Drawable? = null
) {
    val drawables = compoundDrawablesRelative
    val start = start ?: drawables[0]
    val top = top ?: drawables[1]
    val end = end ?: drawables[2]
    val bottom = bottom ?: drawables[3]
    setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom)
}