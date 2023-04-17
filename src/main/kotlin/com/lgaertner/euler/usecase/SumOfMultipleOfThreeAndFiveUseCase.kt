package com.lgaertner.euler.usecase

import com.lgaertner.euler.math.Sum

class SumOfMultipleOfThreeAndFiveUseCase {
    fun execute(maxValue: Int) : Int {
        val values = List(maxValue) { it + 1 }
        val filteredValues = values.filter{it % 3 == 0 || it % 5 == 0}
        val sum = Sum(filteredValues)
        return sum.value()
    }
}