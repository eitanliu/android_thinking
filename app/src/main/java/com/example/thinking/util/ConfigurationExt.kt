package com.example.thinking.util

import android.content.res.Configuration
import android.os.Build
import androidx.core.os.LocaleListCompat

val Configuration.localeListCompat
    get() = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        LocaleListCompat.wrap(locales)
    } else LocaleListCompat.create(locale)


fun LocaleListCompat.toArray() = toList().toTypedArray()
fun LocaleListCompat.toList() = (0 until size()).mapNotNull { get(it) }

fun LocaleListCompat.toSequence() = sequence {
    for (i in 0 until size()) {
        get(i)?.let { yield(it) }
    }
}