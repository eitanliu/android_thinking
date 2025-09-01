package com.example.thinking.binding.data

import androidx.annotation.MainThread
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.example.thinking.binding.CloseableObserver

open class LastNullData<T> : SingleNullData<T?> {
    private var lastObserver: Observer<in T?>? = null

    constructor(value: T) : super(value)

    constructor() : super()

    @MainThread
    override fun observe(
        owner: LifecycleOwner, single: Boolean, observer: Observer<in T?>
    ) {
        lastObserver?.also { removeObserver(it) }
        lastObserver = observer
        super.observe(owner, single, observer)
    }

    @MainThread
    override fun observeForever(single: Boolean, observer: Observer<in T?>) {
        lastObserver?.also { removeObserver(it) }
        lastObserver = observer
        super.observeForever(single, observer)
    }

    @MainThread
    override fun observeCloseable(
        single: Boolean, observer: Observer<in T?>
    ): CloseableObserver<T?> {
        lastObserver?.also { removeObserver(it) }
        lastObserver = observer
        return super.observeCloseable(single, observer)
    }
}