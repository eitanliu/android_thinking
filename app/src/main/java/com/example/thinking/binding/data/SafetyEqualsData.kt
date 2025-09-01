package com.example.thinking.binding.data

open class SafetyEqualsData<T> : SafetyLiveData<T> {

    constructor(value: T) : super(value)

    constructor() : super()

    override fun setValue(value: T) {
        if (isInitialized) {
            if (value != getValue()) {
                super.setValue(value)
            }
        } else {
            super.setValue(value)
        }
    }
}