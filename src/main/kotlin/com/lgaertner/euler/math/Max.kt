package com.lgaertner.euler.math

class Max(private val values: Wrapper<Collection<Long>>) {
    fun value(): Long {
        return values.collapse().max()
    }
}