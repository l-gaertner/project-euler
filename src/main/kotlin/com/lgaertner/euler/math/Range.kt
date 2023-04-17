package com.lgaertner.euler.math

class Range(private val start: Int, private val end: Int) : Iterable<Int> {


    override fun iterator(): Iterator<Int> {
        return List(end - start + 1) { it + start }.iterator()
    }
}