package com.lgaertner.euler.math

class Max(private val values: Wrapper<Collection<Int>>) {
    fun value(): Int {
        return values.collapse().max()
    }
}