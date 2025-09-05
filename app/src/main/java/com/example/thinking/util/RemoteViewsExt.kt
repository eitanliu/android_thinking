package com.example.thinking.util

import android.view.View
import android.widget.RemoteViews
import androidx.annotation.DrawableRes
import androidx.annotation.IdRes

/**
 * [View.setBackgroundResource]
 */
fun RemoteViews.setBackgroundResource(
    @IdRes id: Int, @DrawableRes resid: Int
) = setInt(id, "setBackgroundResource", resid)

/**
 * [View.setAlpha]
 */
fun RemoteViews.setAlpha(
    @IdRes id: Int, alpha: Float
) = setFloat(id, "setAlpha", alpha)