package com.example.thinking.binding.data

import androidx.lifecycle.MutableLiveData

open class SafetyLiveData<T> : MutableLiveData<T> {

    constructor(value: T) : super(value)

    constructor() : super()

    override fun postValue(value: T) {
        super.postValue(value)
    }

    override fun setValue(value: T) {
        super.setValue(value)
    }

    @Suppress("UNCHECKED_CAST")
    override fun getValue(): T {
        return super.getValue() as T
    }
}