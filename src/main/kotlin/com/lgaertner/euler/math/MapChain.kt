package com.lgaertner.euler.math

interface MapChain<K> : Wrapper<K> {
    override fun value(): K
}

class Map<K>(private val filter: (K) -> Boolean, private val value: K, private val next: MapChain<K>) :
    MapChain<K> {
    override fun value(): K {
        return if (filter(value))
            value
        else next.value()
    }
}

class FinalMap<K>(private val defaultValue: K) : MapChain<K> {
    override fun value(): K {
        return defaultValue
    }
}
