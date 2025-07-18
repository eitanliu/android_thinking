package com.example.thinking.binding.data

import com.example.thinking.util.compareSet

open class SingleEqualsData<T> : SingleLiveData<T> {

    constructor(value: T) : super(value)

    constructor() : super()

    override fun setValue(value: T) {
        compareSet(value)
    }
}