package com.example.thinking

import android.app.Application
import android.content.Context
import android.content.ContextParams
import android.content.res.Configuration
import android.os.Bundle
import android.view.Display
import com.example.thinking.util.ContextInitializer
import com.example.thinking.util.Logcat
import com.example.thinking.util.initializeComponent

class AppApplication : Application() {

    companion object {
        lateinit var instance: AppApplication
            private set
    }

    init {
        instance = this
    }

    override fun attachBaseContext(base: Context?) {
        Logcat.printTime()
        super.attachBaseContext(base)
    }

    override fun getParams(): ContextParams? {
        Logcat.printTime()
        return super.getParams()
    }

    override fun createPackageContext(packageName: String?, flags: Int): Context? {
        Logcat.printTime()
        return super.createPackageContext(packageName, flags)
    }

    override fun createContextForSplit(splitName: String?): Context? {
        Logcat.printTime()
        return super.createContextForSplit(splitName)
    }

    override fun createConfigurationContext(overrideConfiguration: Configuration): Context? {
        Logcat.printTime()
        return super.createConfigurationContext(overrideConfiguration)
    }

    override fun createDisplayContext(display: Display): Context? {
        Logcat.printTime()
        return super.createDisplayContext(display)
    }

    override fun createDeviceContext(deviceId: Int): Context {
        Logcat.printTime()
        return super.createDeviceContext(deviceId)
    }

    override fun createWindowContext(type: Int, options: Bundle?): Context {
        Logcat.printTime()
        return super.createWindowContext(type, options)
    }

    override fun createWindowContext(display: Display, type: Int, options: Bundle?): Context {
        Logcat.printTime()
        return super.createWindowContext(display, type, options)
    }

    override fun createContext(contextParams: ContextParams): Context {
        Logcat.printTime()
        return super.createContext(contextParams)
    }

    override fun createAttributionContext(attributionTag: String?): Context {
        Logcat.printTime()
        return super.createAttributionContext(attributionTag)
    }

    override fun createDeviceProtectedStorageContext(): Context? {
        return super.createDeviceProtectedStorageContext()
    }


    override fun onCreate() {
        Logcat.printTime()
        initializeComponent<ContextInitializer>()
        super.onCreate()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
    }
}