package com.example.thinking.binding.data

import java.util.concurrent.atomic.AtomicBoolean

open class SingleNullData<T> : SingleLiveData<T?> {

    private val pendingGet = AtomicBoolean(false)

    val hasValue get() = pendingGet.get()

    constructor(value: T?) : super(value)

    constructor() : super()

    override fun setValue(value: T?) {
        pendingGet.set(true)
        super.setValue(value)
    }

    override fun getValue(): T? {
        val isGet = pendingGet.compareAndSet(true, false)
        if (!isGet) return null
        return super.getValue()
    }

    val realValue get() = super.getValue()
}