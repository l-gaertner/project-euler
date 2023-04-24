package com.lgaertner.euler.math

interface FilterChain<K> {
    fun value(): Boolean
}

class Filter<K>(private val filter: (K) -> Boolean, private val value: K, private val next: FilterChain<K>) :
    FilterChain<K> {
    override fun value(): Boolean {
        return if (filter(value))
            true
        else next.value()
    }
}

class FinalFilter<K> : FilterChain<K> {
    override fun value(): Boolean {
        return true
    }
}
