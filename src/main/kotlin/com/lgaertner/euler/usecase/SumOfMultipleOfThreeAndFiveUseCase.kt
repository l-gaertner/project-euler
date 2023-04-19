package com.lgaertner.euler.usecase

import com.lgaertner.euler.math.Range
import com.lgaertner.euler.math.Sum

class SumOfMultipleOfThreeAndFiveUseCase {
    fun execute(maxValue: Int) : Int {
        if (maxValue < 1) throw IllegalArgumentException("maxValue must be greater than 0")

        val range = Range(1, maxValue)
        val filteredValues = range.values().filter{it % 3 == 0 || it % 5 == 0}
        val sum = Sum(filteredValues)
        return sum.value()
    }
}