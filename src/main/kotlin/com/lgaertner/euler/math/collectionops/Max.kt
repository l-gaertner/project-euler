package com.lgaertner.euler.math.collectionops

class Max(private val values: Collectable<Number>) {
    fun value(): Number {
        return values.collect().maxOf { it.toLong() }
    }
}