package com.lgaertner.euler.math

interface FilterChain<K> : Wrapper<K> {
    override fun value(): K
}

class Filter<K>(private val filter : (K)->Boolean, private val value: K, private val next: FilterChain<K>) :
    FilterChain<K> {
    override fun value() : K {
        return if (filter(value))
            value
        else next.value()
    }
}

class FinalFilter<K>(private val defaultValue: K) : FilterChain<K> {
    override fun value(): K {
        return defaultValue
    }
}
