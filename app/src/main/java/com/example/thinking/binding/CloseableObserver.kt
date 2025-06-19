package com.example.thinking.binding

import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import java.io.Closeable

abstract class LiveDataObserver<T>(
    private val observable: LiveData<T>,
) : CloseableObserver<T> {
    init {
        observable.observeForever(this)
    }

    override fun close() {
        observable.removeObserver(this)
    }
}

interface CloseableObserver<T> : Observer<T>, Closeable