@file:Suppress("NOTHING_TO_INLINE")

package com.example.thinking.util

import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.RemoteViews

typealias AppWidgetReceiverCallback = (context: Context, intent: Intent) -> Unit

inline val Context.appWidgetManager get() = AppWidgetManager.getInstance(this)

inline fun Context.isRequestPinAppWidgetSupported() =
    AppWidgetUtil.isRequestPinAppWidgetSupported(this)

inline fun <reified T : AppWidgetProvider> Context.requestPinAppWidget(
    from: String? = null,
    extras: Bundle? = null,
    successCallback: PendingIntent? = null,
) = AppWidgetUtil.requestPinAppWidget<T>(this, from, extras, successCallback)

inline fun <reified T : AppWidgetProvider> T.updateAppWidget(
    context: Context,
    remoteViews: RemoteViews,
    appWidgetIds: IntArray? = null,
    appWidgetManager: AppWidgetManager? = null,
) {
    val appWidgetManager = appWidgetManager ?: context.appWidgetManager
    appWidgetManager.updateAppWidget<T>(context, remoteViews, appWidgetIds)
}

inline fun <reified T : AppWidgetProvider> AppWidgetManager.updateAppWidget(
    context: Context, remoteViews: RemoteViews, appWidgetIds: IntArray?
) {
    appWidgetIds?.also {
        updateAppWidget(it, remoteViews)
    } ?: updateAppWidget<T>(context, remoteViews)
}

inline fun <reified T : AppWidgetProvider> AppWidgetManager.updateAppWidget(
    context: Context, remoteViews: RemoteViews
) {
    val componentName = ComponentName(context, T::class.java)
    updateAppWidget(componentName, remoteViews)
}

inline fun <reified T : AppWidgetProvider> T.getWidgetIds(
    context: Context
) = AppWidgetUtil.getWidgetIds<T>(context)

inline fun <reified T : AppWidgetProvider> T.pendingRefresh(
    context: Context,
    from: String? = null
) = AppWidgetUtil.pendingRefresh<T>(context, from)

inline fun <reified T : AppWidgetProvider> T.refreshIntent(
    context: Context,
    from: String? = null
) = AppWidgetUtil.refreshIntent<T>(context, from)

