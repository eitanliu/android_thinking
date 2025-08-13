@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.example.thinking.util

import android.content.Context
import android.content.res.Resources
import android.util.TypedValue
import androidx.core.util.TypedValueCompat
import kotlin.math.roundToInt

inline fun Context.idp(value: Number): Int = dp2px(value.toFloat()).roundToInt()

inline fun Context.dp(value: Number): Float = dp2px(value.toFloat())

inline fun Context.dp2px(value: Float) = applyDimension(TypedValue.COMPLEX_UNIT_DIP, value)

inline fun Context.isp(value: Number): Int = sp2px(value.toFloat()).roundToInt()

inline fun Context.sp(value: Number): Float = sp2px(value.toFloat())

inline fun Context.sp2px(value: Float) = applyDimension(TypedValue.COMPLEX_UNIT_SP, value)

inline fun Context.px2dp(value: Float) = deriveDimension(
    TypedValue.COMPLEX_UNIT_DIP, value
)

inline fun Context.px2sp(value: Float) = deriveDimension(
    TypedValue.COMPLEX_UNIT_SP, value
)

inline fun Context.applyDimension(
    @TypedValueCompat.ComplexDimensionUnit unit: Int, value: Float,
) = resources.applyDimension(unit, value)

inline fun Context.deriveDimension(
    @TypedValueCompat.ComplexDimensionUnit unit: Int, pixelValue: Float,
) = resources.deriveDimension(unit, pixelValue)

inline fun Resources.idp(value: Number): Int = dp2px(value.toFloat()).roundToInt()

inline fun Resources.dp(value: Number): Float = dp2px(value.toFloat())

inline fun Resources.dp2px(value: Float) = applyDimension(TypedValue.COMPLEX_UNIT_DIP, value)

inline fun Resources.isp(value: Number): Int = sp2px(value.toFloat()).roundToInt()

inline fun Resources.sp(value: Number): Float = sp2px(value.toFloat())

inline fun Resources.sp2px(value: Float) = applyDimension(TypedValue.COMPLEX_UNIT_SP, value)

inline fun Resources.px2dp(value: Float) = deriveDimension(
    TypedValue.COMPLEX_UNIT_DIP, value
)

inline fun Resources.px2sp(value: Float) = deriveDimension(
    TypedValue.COMPLEX_UNIT_SP, value
)

inline fun Resources.applyDimension(
    @TypedValueCompat.ComplexDimensionUnit unit: Int, value: Float,
) = TypedValue.applyDimension(unit, value, displayMetrics)

inline fun Resources.deriveDimension(
    @TypedValueCompat.ComplexDimensionUnit unit: Int, pixelValue: Float,
) = TypedValueCompat.deriveDimension(unit, pixelValue, displayMetrics)

inline val Resources.scaledDensity
    get() = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 1f, displayMetrics)

inline val Resources.density
    get() = displayMetrics.density