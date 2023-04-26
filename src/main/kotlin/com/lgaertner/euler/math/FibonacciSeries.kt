package com.lgaertner.euler.math

class FibonacciSeries(private val startValues: List<Int>, private val maxValue: Int) {

    fun values(): List<Int> {
        if (startValues.last() > maxValue)
            return startValues.dropLast(1)

        val newValues: List<Int> =
            listOf(startValues, listOf(startValues.last() + startValues.dropLast(1).last())).flatten()

        return FibonacciSeries(newValues, maxValue).values()
    }
}