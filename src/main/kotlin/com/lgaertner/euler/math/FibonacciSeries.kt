package com.lgaertner.euler.math

import com.lgaertner.euler.math.collectionops.Collectable

class FibonacciSeries(private val startValues: List<Int>, private val maxValue: Int) : Collectable<Int> {

    fun values(): List<Int> {
        if (startValues.last() > maxValue)
            return startValues.dropLast(1)

        val newValues: List<Int> =
            listOf(startValues, listOf(startValues.last() + startValues.dropLast(1).last())).flatten()

        return FibonacciSeries(newValues, maxValue).values()
    }

    override fun collect(): Collection<Int> {
        return values()
    }
}