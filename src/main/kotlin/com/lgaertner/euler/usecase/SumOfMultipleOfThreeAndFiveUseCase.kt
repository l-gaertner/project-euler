package com.lgaertner.euler.usecase

import com.lgaertner.euler.math.Map
import com.lgaertner.euler.math.FinalMap
import com.lgaertner.euler.math.Sum

class SumOfMultipleOfThreeAndFiveUseCase {
    fun execute(maxValue: Int): Int {
        if (maxValue < 1) throw IllegalArgumentException("maxValue must be greater than 0")

        val filteredValues = List(maxValue) { value: Int ->
            Map(
                { it % 3 == 0 },
                value + 1,
                Map(
                    { it % 5 == 0 },
                    value + 1,
                    FinalMap(0)
                )
            )
        }
        val sum = Sum(filteredValues)
        return sum.value()
    }

}