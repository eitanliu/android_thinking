package com.example.thinking.util

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object TimeUtil {

    fun localDateFormat(
        pattern: String, locale: Locale = Locale.getDefault()
    ) = SimpleDateFormat(pattern, locale)

    fun formatCurrent(pattern: String): String {
        return localDateFormat(pattern).format(Date())
    }

    fun formatDate(pattern: String, date: Date = Date()): String {
        return localDateFormat(pattern).format(date)
    }

    fun formatTimeMillis(pattern: String, time: Long = System.currentTimeMillis()): String {
        return localDateFormat(pattern).format(time)
    }
}