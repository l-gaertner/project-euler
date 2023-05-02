package com.lgaertner.euler.math.collectionops

class Sum(private val values: Collection<Int>) {
    fun value() = values.sum()
}