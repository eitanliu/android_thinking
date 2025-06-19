package com.example.thinking.binding.data

import com.example.thinking.util.compareSet

open class EqualsLiveData<T> : SafetyLiveData<T> {

    constructor(value: T) : super(value)

    constructor() : super()

    override fun setValue(value: T) {
        compareSet(value)
    }
}