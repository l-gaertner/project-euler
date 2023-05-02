package com.lgaertner.euler.usecase

import com.lgaertner.euler.math.FibonacciSeries
import com.lgaertner.euler.math.collectionops.MultipleOfTwoFilter
import com.lgaertner.euler.math.collectionops.MultiplesOfTwo
import com.lgaertner.euler.math.collectionops.Sum

class SumOfEvenFibonaciUseCase {
    fun below(maxValue: Int): Int {
        return if (maxValue < 2)
            0
        else {
            Sum(MultiplesOfTwo(FibonacciSeries(listOf(1, 1), maxValue))).value()
        }
    }
}

