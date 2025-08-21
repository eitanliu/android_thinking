package com.example.thinking.util


/**
 * [Sequence.associate]
 */
inline fun <T, K, V> Sequence<T>.associateNotNull(transform: (T) -> Pair<K, V>?): Map<K, V> {
    return associateNotNullTo(LinkedHashMap(), transform)
}

/**
 * [Sequence.associateTo]
 */
inline fun <T, K, V, M : MutableMap<in K, in V>> Sequence<T>.associateNotNullTo(
    destination: M, transform: (T) -> Pair<K, V>?
): M {
    for (element in this) {
        val pair = transform(element) ?: continue
        destination += pair
    }
    return destination
}

/**
 * [Sequence.associateBy]
 */
inline fun <T, K> Sequence<T>.associateByNotNull(keySelector: (T) -> K?): Map<K, T> {
    return associateByNotNullTo(LinkedHashMap(), keySelector)
}

inline fun <T, K, V> Sequence<T>.associateByNotNull(
    keySelector: (T) -> K?, valueTransform: (T) -> V?
): Map<K, V> {
    return associateByNotNullTo(LinkedHashMap(), keySelector, valueTransform)
}

inline fun <T, K, V> Sequence<T>.associateByKeyNotNull(
    keySelector: (T) -> K?, valueTransform: (T) -> V?
): Map<K, V?> {
    return associateByKeyNotNullTo(LinkedHashMap(), keySelector, valueTransform)
}

/**
 * [Sequence.associateByTo]
 */
inline fun <T, K, M : MutableMap<in K, in T>> Sequence<T>.associateByNotNullTo(
    destination: M, keySelector: (T) -> K?
): M {
    for (element in this) {
        val key = keySelector(element) ?: continue
        destination.put(key, element)
    }
    return destination
}

inline fun <T, K, V, M : MutableMap<in K, in V>> Sequence<T>.associateByNotNullTo(
    destination: M, keySelector: (T) -> K?, valueTransform: (T) -> V?
): M {
    for (element in this) {
        val key = keySelector(element) ?: continue
        val value = valueTransform(element) ?: continue
        destination.put(key, value)
    }
    return destination
}

inline fun <T, K, V, M : MutableMap<in K, in V?>> Sequence<T>.associateByKeyNotNullTo(
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
 * [Sequence.associateWith]
 */
inline fun <K, V> Sequence<K>.associateWithNotNull(valueSelector: (K) -> V?): Map<K, V> {
    return associateWithNotNullTo(LinkedHashMap(), valueSelector)
}

/**
 * [Sequence.associateWithTo]
 */
inline fun <K, V, M : MutableMap<in K, in V>> Sequence<K>.associateWithNotNullTo(
    destination: M, valueSelector: (K) -> V?
): M {
    for (element in this) {
        val value = valueSelector(element) ?: continue
        destination.put(element, value)
    }
    return destination
}