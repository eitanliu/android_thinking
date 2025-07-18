package com.example.thinking.binding.data

import androidx.annotation.MainThread
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import java.io.Closeable
import java.util.concurrent.atomic.AtomicBoolean

open class SingleLiveData<T> : SafetyLiveData<T> {

    private val pending = AtomicBoolean(false)
    private val observers = linkedMapOf<Observer<in T>, SingleLiveData<T>.ObserverWrapper>()
    val isObserved get() = !pending.get()

    constructor(value: T) : super(value)

    constructor() : super()

    @MainThread
    fun observe(owner: ViewModel, single: Boolean, observer: Observer<in T>) {
        super.observeForever(ObserverWrapper(single, observer).also {
            owner.addCloseable(it)
        })
    }

    @MainThread
    fun observe(owner: LifecycleOwner, single: Boolean, observer: Observer<in T>) {
        if (single) {
            super.observe(owner, ObserverWrapper(single, observer))
        } else {
            super.observe(owner, observer)
        }

    }

    @MainThread
    fun observeForever(single: Boolean, observer: Observer<in T>) {
        if (single) {
            super.observeForever(ObserverWrapper(single, observer))
        } else {
            super.observeForever(observer)
        }

    }

    @MainThread
    override fun observe(owner: LifecycleOwner, observer: Observer<in T>) {
        super.observe(owner, ObserverWrapper(true, observer))
    }

    override fun observeForever(observer: Observer<in T>) {
        super.observeForever(ObserverWrapper(true, observer))
    }

    override fun removeObserver(observer: Observer<in T>) {
        val wrapper = observers.remove(observer)
        if (wrapper != null) {
            super.removeObserver(wrapper)
        } else {
            super.removeObserver(observer)
        }
    }

    @MainThread
    override fun setValue(value: T) {
        pending.set(true)
        super.setValue(value)
    }

    inner class ObserverWrapper(
        private val single: Boolean,
        private val observer: Observer<in T>
    ) : Observer<T>, Closeable {
        init {
            observers[observer] = this
        }

        override fun onChanged(value: T) {
            if (single) {
                val isUpdate = pending.compareAndSet(true, false)
                if (isUpdate) observer.onChanged(value)
            } else {
                observer.onChanged(value)
            }
        }

        override fun close() {
            removeObserver(this)
        }
    }

}