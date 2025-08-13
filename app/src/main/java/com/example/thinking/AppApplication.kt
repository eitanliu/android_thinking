package com.example.thinking

import android.app.Application

class AppApplication : Application() {

    companion object {
        lateinit var instance: AppApplication
            private set
    }

    init {
        instance = this
    }

    override fun onCreate() {
        super.onCreate()
    }
}