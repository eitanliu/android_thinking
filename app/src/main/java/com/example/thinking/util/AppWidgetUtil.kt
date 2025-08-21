package com.example.thinking.util

import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle

object AppWidgetUtil {

    const val ACTION_WIDGET_PIN = "ACTION_WIDGET_PIN"
    const val ACTION_WIDGET_REFRESH = "ACTION_WIDGET_REFRESH"

    const val EXTRA_FROM = "EXTRA_FROM"

    val DEFAULT_FLAG = PendingIntent.FLAG_UPDATE_CURRENT or run {
        if (Build.VERSION.SDK_INT >= 31) PendingIntent.FLAG_IMMUTABLE else 0
    }

    fun onReceive(
        context: Context, intent: Intent,
        pinCallback: AppWidgetReceiverCallback? = null,
        refreshCallback: AppWidgetReceiverCallback? = null,
    ) {
        when (intent.action) {
            ACTION_WIDGET_PIN -> pinCallback?.invoke(context, intent)
            ACTION_WIDGET_REFRESH -> refreshCallback?.invoke(context, intent)
        }
    }

    fun isRequestPinAppWidgetSupported(context: Context): Boolean {
        try {
            val appWidgetManager = AppWidgetManager.getInstance(context)
            return appWidgetManager.isRequestPinAppWidgetSupported
        } catch (e: Throwable) {
            e.printStackTrace()
        }
        return false
    }

    inline fun <reified T> requestPinAppWidget(
        context: Context,
        from: String? = null,
        extras: Bundle? = null,
        successCallback: PendingIntent? = null,
    ): Boolean {
        try {
            val appWidgetManager = AppWidgetManager.getInstance(context)
            if (!appWidgetManager.isRequestPinAppWidgetSupported) {
                return false
            }

            val provider = ComponentName(context, T::class.java)
            val extras = (extras ?: Bundle()).apply {
                putString(EXTRA_FROM, from)
            }
            val callback = successCallback ?: pendingPin<T>(context, from)
            return appWidgetManager.requestPinAppWidget(provider, extras, callback)
        } catch (e: Throwable) {
            e.printStackTrace()
        }
        return false
    }

    inline fun <reified T> getWidgetIds(context: Context) = AppWidgetManager.getInstance(context)
        .getAppWidgetIds(ComponentName(context, T::class.java))

    inline fun <reified T> pendingPin(
        context: Context,
        from: String? = null
    ) = pendingBroadcast(context, pinIntent<T>(context, from))

    inline fun <reified T> pendingRefresh(
        context: Context,
        from: String? = null
    ) = pendingBroadcast(context, refreshIntent<T>(context, from))

    inline fun <reified T> pinIntent(
        context: Context,
        from: String? = null
    ) = Intent(context, T::class.java).apply {
        setAction(ACTION_WIDGET_PIN)
        if (from != null) putExtra(EXTRA_FROM, from)
    }

    inline fun <reified T> refreshIntent(
        context: Context,
        from: String? = null
    ) = Intent(context, T::class.java).apply {
        setAction(ACTION_WIDGET_REFRESH)
        if (from != null) putExtra(EXTRA_FROM, from)
    }

    fun pendingBroadcast(
        context: Context,
        intent: Intent,
        requestCode: Int = 0,
    ): PendingIntent {
        return PendingIntent.getBroadcast(context, requestCode, intent, DEFAULT_FLAG)
    }

    fun pendingActivity(
        context: Context,
        intent: Intent,
        requestCode: Int = 0,
    ): PendingIntent {
        return PendingIntent.getActivity(context, requestCode, intent, DEFAULT_FLAG)
    }

    fun pendingService(
        context: Context,
        intent: Intent,
        requestCode: Int = 0,
    ): PendingIntent {
        return PendingIntent.getService(context, requestCode, intent, DEFAULT_FLAG)
    }
}