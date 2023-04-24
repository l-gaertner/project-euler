package com.lgaertner.euler.usecase

import com.lgaertner.euler.math.MultipleOfTwoFilter
import com.lgaertner.euler.math.Sum

class SumOfEvenFibonaciUseCase {
    fun below(maxValue: Int): Int {
        return if (maxValue < 2)
            0
        else {
            Sum(FibonacciSeries(listOf(1, 1), maxValue).values().filter { MultipleOfTwoFilter(it).value() }).value()
        }
    }
}

class FibonacciSeries(private val startValues: List<Int>, private val maxValue: Int) {

    fun values(): List<Int> {
        if (startValues.last() > maxValue)
            return startValues.dropLast(1)

        val newValues: List<Int> =
            listOf(startValues, listOf(startValues.last() + startValues.dropLast(1).last())).flatten()

        return FibonacciSeries(newValues, maxValue).values()
    }
}