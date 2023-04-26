package com.lgaertner.euler.usecase

import com.lgaertner.euler.math.FibonacciSeries
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

