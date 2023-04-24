package com.lgaertner.euler.usecase

import com.lgaertner.euler.math.Filter
import com.lgaertner.euler.math.FilterChain
import com.lgaertner.euler.math.FinalFilter
import com.lgaertner.euler.math.Sum

class SumOfMultipleOfThreeAndFiveUseCase {
    fun execute(maxValue: Int): Int {
        if (maxValue < 1) throw IllegalArgumentException("maxValue must be greater than 0")

        val filteredValues = List(maxValue) { value: Int ->
            Filter(
                { it % 3 == 0 },
                value + 1,
                Filter(
                    { it % 5 == 0 },
                    value + 1,
                    FinalFilter(0)
                )
            )
        }
        val sum = Sum(filteredValues)
        return sum.value()
    }

}