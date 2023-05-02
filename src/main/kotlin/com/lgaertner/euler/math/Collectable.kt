package com.lgaertner.euler.math

interface Collectable<K> {
    fun collect(): Collection<K>
}