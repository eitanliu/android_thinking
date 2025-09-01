package com.example.thinking.binding

import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import java.io.Closeable

abstract class LiveDataObserver<T>(
    val observable: LiveData<T>,
) : CloseableObserver<T> {

    override fun close() {
        observable.removeObserver(this)
    }
}

interface CloseableObserver<T> : Observer<T>, Closeable