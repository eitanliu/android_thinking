package com.example.libkn

class NativeLib {
    external fun getStringFromNative(): String
    external fun sayHello()

    companion object {
        init {
            System.loadLibrary("kn")
        }
    }
}