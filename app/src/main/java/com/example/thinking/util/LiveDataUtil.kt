package com.example.thinking.util

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.example.thinking.binding.CloseableObserver
import com.example.thinking.binding.LiveDataObserver
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext


fun <T> LiveData<T>.observe(
    owner: ViewModel,
    observer: Observer<in T>,
) {
    owner.addCloseable(observeCloseable(observer))
}

fun <T> LiveData<T>.observeCloseable(
    observer: Observer<in T>
): CloseableObserver<in T> {
    return object : LiveDataObserver<T>(this) {
        override fun onChanged(value: T) {
            observer.onChanged(value)
        }
    }
}

fun <T> MutableLiveData<T>.compareSet(newValue: T): Boolean {
    return if (isInitialized) {
        if (value == newValue) {
            return false
        } else {
            value = newValue
            true
        }
    } else {
        value = newValue
        true
    }
}

suspend fun <T> MutableLiveData<T>.awaitCompareSet(
    newValue: T, context: CoroutineContext = Dispatchers.Main
): Boolean = withContext(context) {
    compareSet(newValue)
}

suspend fun <T> MutableLiveData<T>.awaitSet(
    newValue: T, context: CoroutineContext = Dispatchers.Main
): Unit = withContext(context) {
    value = newValue
}

