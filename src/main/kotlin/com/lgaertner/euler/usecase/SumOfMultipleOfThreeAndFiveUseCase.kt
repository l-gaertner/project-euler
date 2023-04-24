package com.lgaertner.euler.usecase

import com.lgaertner.euler.math.Filter
import com.lgaertner.euler.math.FinalFilter
import com.lgaertner.euler.math.Sum

class SumOfMultipleOfThreeAndFiveUseCase {
    fun execute(maxValue: Int): Int {
        if (maxValue < 1) throw IllegalArgumentException("maxValue must be greater than 0")

        val filteredValues = List(maxValue) { it + 1 }.filter {
            Filter(
                { it % 3 == 0 },
                it,
                Filter(
                    { it % 5 == 0 },
                    it,
                    FinalFilter()
                )
            ).value()
        }
        val sum = filteredValues.sum()
        return sum
    }

}