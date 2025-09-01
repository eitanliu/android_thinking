package com.example.thinking.binding.data

import androidx.annotation.MainThread
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.example.thinking.binding.CloseableObserver
import com.example.thinking.binding.LiveDataObserver
import java.util.concurrent.atomic.AtomicBoolean

open class SingleLiveData<T> : SafetyLiveData<T> {

    private val pending = AtomicBoolean(false)
    private val observers = linkedMapOf<Observer<in T>, SingleLiveData<T>.ObserverWrapper>()
    val isObserved get() = !pending.get()

    constructor(value: T) : super(value)

    constructor() : super()

    @MainThread
    fun observe(
        owner: ViewModel, single: Boolean, observer: Observer<in T>
    ): CloseableObserver<T> {
        return observeCloseable(single, observer).also {
            owner.addCloseable(it)
        }
    }

    @MainThread
    open fun observe(
        owner: LifecycleOwner, single: Boolean, observer: Observer<in T>
    ) {
        if (single) {
            super.observe(owner, ObserverWrapper(this, single, observer))
        } else {
            super.observe(owner, observer)
        }

    }

    @MainThread
    open fun observeForever(
        single: Boolean, observer: Observer<in T>
    ) {
        if (single) {
            super.observeForever(ObserverWrapper(this, single, observer))
        } else {
            super.observeForever(observer)
        }

    }

    @MainThread
    open fun observeCloseable(
        single: Boolean = true, observer: Observer<in T>
    ): CloseableObserver<T> {
        val wrapper = ObserverWrapper(this, single, observer)
        super.observeForever(wrapper)
        return wrapper
    }

    @MainThread
    final override fun observe(owner: LifecycleOwner, observer: Observer<in T>) {
        observe(owner, true, observer)
    }

    @MainThread
    final override fun observeForever(observer: Observer<in T>) {
        observeForever(true, observer)
    }

    @MainThread
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
        observable: LiveData<T>,
        private val single: Boolean,
        private val observer: Observer<in T>,
    ) : LiveDataObserver<T>(observable) {
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