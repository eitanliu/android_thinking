package com.example.thinking.util

import kotlin.reflect.KProperty


interface Getter<T> {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): T
}

interface Setter<T>: Getter<T> {
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T)
}

interface NullableSetter<T>: Getter<T> {
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T?)
}