package com.lgaertner.euler.math

class Max(private val values: Wrapper<Collection<Number>>) {
    fun value(): Number {
        return values.collapse().maxOf { it.toLong() }
    }
}