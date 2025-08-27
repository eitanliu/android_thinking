package com.example.thinking.util

/**
 * [Array.associate]
 */
inline fun <T, K, V> Array<T>.associateNotNull(transform: (T) -> Pair<K, V>?): Map<K, V> {
    val capacity = mapCapacity(size).coerceAtLeast(16)
    return associateNotNullTo(LinkedHashMap(capacity), transform)
}

/**
 * [Array.associateTo]
 */
inline fun <T, K, V, M : MutableMap<in K, in V>> Array<T>.associateNotNullTo(
    destination: M, transform: (T) -> Pair<K, V>?
): M {
    for (element in this) {
        val pair = transform(element) ?: continue
        destination += pair
    }
    return destination
}

/**
 * [Array.associateBy]
 */
inline fun <T, K> Array<T>.associateByNotNull(keySelector: (T) -> K?): Map<K, T> {
    val capacity = mapCapacity(size).coerceAtLeast(16)
    return associateByNotNullTo(LinkedHashMap(capacity), keySelector)
}

inline fun <T, K, V> Array<T>.associateByNotNull(
    keySelector: (T) -> K?, valueTransform: (T) -> V?
): Map<K, V> {
    val capacity = mapCapacity(size).coerceAtLeast(16)
    return associateByNotNullTo(LinkedHashMap(capacity), keySelector, valueTransform)
}

inline fun <T, K, V> Array<T>.associateByKeyNotNull(
    keySelector: (T) -> K?, valueTransform: (T) -> V?
): Map<K, V?> {
    val capacity = mapCapacity(size).coerceAtLeast(16)
    return associateByKeyNotNullTo(LinkedHashMap(capacity), keySelector, valueTransform)
}

/**
 * [Array.associateByTo]
 */
inline fun <T, K, M : MutableMap<in K, in T>> Array<T>.associateByNotNullTo(
    destination: M, keySelector: (T) -> K?
): M {
    for (element in this) {
        val key = keySelector(element) ?: continue
        destination.put(key, element)
    }
    return destination
}

inline fun <T, K, V, M : MutableMap<in K, in V>> Array<T>.associateByNotNullTo(
    destination: M, keySelector: (T) -> K?, valueTransform: (T) -> V?
): M {
    for (element in this) {
        val key = keySelector(element) ?: continue
        val value = valueTransform(element) ?: continue
        destination.put(key, value)
    }
    return destination
}

inline fun <T, K, V, M : MutableMap<in K, in V?>> Array<T>.associateByKeyNotNullTo(
    destination: M, keySelector: (T) -> K?, valueTransform: (T) -> V?
): M {
    for (element in this) {
        val key = keySelector(element) ?: continue
        val value = valueTransform(element)
        destination.put(key, value)
    }
    return destination
}

/**
 * [Array.associateWith]
 */
inline fun <K, V> Array<K>.associateWithNotNull(valueSelector: (K) -> V?): Map<K, V> {
    val capacity = mapCapacity(size).coerceAtLeast(16)
    return associateWithNotNullTo(LinkedHashMap(capacity), valueSelector)
}

/**
 * [Array.associateWithTo]
 */
inline fun <K, V, M : MutableMap<in K, in V>> Array<K>.associateWithNotNullTo(
    destination: M, valueSelector: (K) -> V?
): M {
    for (element in this) {
        val value = valueSelector(element) ?: continue
        destination.put(element, value)
    }
    return destination
}