package com.lgaertner.euler.math.collectionops

class Sum(private val values: Collectable<Int>) {
    fun value() = values.collect().sum()
}