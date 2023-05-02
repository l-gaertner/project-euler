package com.lgaertner.euler.math.collectionops

interface Collectable<K> {
    fun collect(): Collection<K>
}