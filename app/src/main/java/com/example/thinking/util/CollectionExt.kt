package com.example.thinking.util

fun <T> Iterable<T>.collectionSizeOrDefault(
    default: Int
): Int = if (this is Collection<*>) this.size else default

/**
 * [Iterable.associate]
 */
inline fun <T, K, V> Iterable<T>.associateNotNull(transform: (T) -> Pair<K, V>?): Map<K, V> {
    val capacity = mapCapacity(collectionSizeOrDefault(10)).coerceAtLeast(16)
    return associateNotNullTo(LinkedHashMap(capacity), transform)
}

/**
 * [Iterable.associateTo]
 */
inline fun <T, K, V, M : MutableMap<in K, in V>> Iterable<T>.associateNotNullTo(
    destination: M, transform: (T) -> Pair<K, V>?
): M {
    for (element in this) {
        val pair = transform(element) ?: continue
        destination += pair
    }
    return destination
}

/**
 * [Iterable.associateBy]
 */
inline fun <T, K> Iterable<T>.associateByNotNull(keySelector: (T) -> K?): Map<K, T> {
    val capacity = mapCapacity(collectionSizeOrDefault(10)).coerceAtLeast(16)
    return associateByNotNullTo(LinkedHashMap(capacity), keySelector)
}

inline fun <T, K, V> Iterable<T>.associateByNotNull(
    keySelector: (T) -> K?, valueTransform: (T) -> V?
): Map<K, V> {
    val capacity = mapCapacity(collectionSizeOrDefault(10)).coerceAtLeast(16)
    return associateByNotNullTo(LinkedHashMap(capacity), keySelector, valueTransform)
}

inline fun <T, K, V> Iterable<T>.associateByKeyNotNull(
    keySelector: (T) -> K?, valueTransform: (T) -> V?
): Map<K, V?> {
    val capacity = mapCapacity(collectionSizeOrDefault(10)).coerceAtLeast(16)
    return associateByKeyNotNullTo(LinkedHashMap(capacity), keySelector, valueTransform)
}

/**
 * [Iterable.associateByTo]
 */
inline fun <T, K, M : MutableMap<in K, in T>> Iterable<T>.associateByNotNullTo(
    destination: M, keySelector: (T) -> K?
): M {
    for (element in this) {
        val key = keySelector(element) ?: continue
        destination.put(key, element)
    }
    return destination
}

inline fun <T, K, V, M : MutableMap<in K, in V>> Iterable<T>.associateByNotNullTo(
    destination: M, keySelector: (T) -> K?, valueTransform: (T) -> V?
): M {
    for (element in this) {
        val key = keySelector(element) ?: continue
        val value = valueTransform(element) ?: continue
        destination.put(key, value)
    }
    return destination
}

inline fun <T, K, V, M : MutableMap<in K, in V?>> Iterable<T>.associateByKeyNotNullTo(
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
 * [Iterable.associateWith]
 */
inline fun <K, V> Iterable<K>.associateWithNotNull(valueSelector: (K) -> V?): Map<K, V> {
    val capacity = mapCapacity(collectionSizeOrDefault(10)).coerceAtLeast(16)
    return associateWithNotNullTo(LinkedHashMap(capacity), valueSelector)
}

/**
 * [Iterable.associateWithTo]
 */
inline fun <K, V, M : MutableMap<in K, in V>> Iterable<K>.associateWithNotNullTo(
    destination: M, valueSelector: (K) -> V?
): M {
    for (element in this) {
        val value = valueSelector(element) ?: continue
        destination.put(element, value)
    }
    return destination
}