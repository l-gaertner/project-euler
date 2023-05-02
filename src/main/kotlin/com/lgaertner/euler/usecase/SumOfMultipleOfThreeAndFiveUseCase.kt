package com.lgaertner.euler.usecase

import com.lgaertner.euler.math.collectionops.MultipleOfThreeOrFiveFilter
import com.lgaertner.euler.math.collectionops.MultiplesOfThreeOrFive
import com.lgaertner.euler.math.collectionops.Sum

class SumOfMultipleOfThreeAndFiveUseCase {
    fun execute(maxValue: Int): Int {
        if (maxValue < 1) throw IllegalArgumentException("maxValue must be greater than 0")

        val sum = Sum(MultiplesOfThreeOrFive(List(maxValue) { it + 1 }))
        return sum.value()
    }

}