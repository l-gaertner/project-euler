package com.lgaertner.euler.math

class Range(private val start: Int, private val end: Int) {
    fun values(): Collection<Int> {
        return List(end - start + 1) { it + start }
    }
}