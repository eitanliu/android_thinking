package com.example.thinking.util

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty


interface NullableWriteProperty<in T, V> : ReadOnlyProperty<T, V> {

    /**
     * Sets the value of the property for the given object.
     * @param thisRef the object for which the value is requested.
     * @param property the metadata for the property.
     * @param value the value to set.
     */
    operator fun setValue(thisRef: T, property: KProperty<*>, value: V?)
}
