package com.lgaertner.euler.usecase

import com.lgaertner.euler.math.Filter
import com.lgaertner.euler.math.FinalFilter
import com.lgaertner.euler.math.MultipleOfThreeOrFiveFilter
import com.lgaertner.euler.math.Sum

class SumOfMultipleOfThreeAndFiveUseCase {
    fun execute(maxValue: Int): Int {
        if (maxValue < 1) throw IllegalArgumentException("maxValue must be greater than 0")

        val sum = Sum(
            List(maxValue) { it + 1 }.filter {
                MultipleOfThreeOrFiveFilter(it).value()
            }
        )
        return sum.value()
    }

}