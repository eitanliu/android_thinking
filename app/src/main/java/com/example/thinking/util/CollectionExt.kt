package com.example.thinking.util

fun <T> Iterable<T>.collectionSizeOrDefault(
    default: Int
): Int = if (this is Collection<*>) this.size else default

inline fun <T, K, V> Iterable<T>.associateNotNull(transform: (T) -> Pair<K, V>?): Map<K, V> {
    val capacity = mapCapacity(collectionSizeOrDefault(10)).coerceAtLeast(16)
    return associateNotNullTo(LinkedHashMap(capacity), transform)
}

inline fun <T, K, V, M : MutableMap<in K, in V>> Iterable<T>.associateNotNullTo(
    destination: M, transform: (T) -> Pair<K, V>?
): M {
    for (element in this) {
        transform(element)?.let { it -> destination += it }
    }
    return destination
}