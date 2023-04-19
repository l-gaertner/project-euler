package com.lgaertner.euler.usecase

import com.lgaertner.euler.math.Range
import com.lgaertner.euler.math.Sum
import kotlin.math.max

class SumOfMultipleOfThreeAndFiveUseCase {
    fun execute(maxValue: Int) : Int {
        if (maxValue < 1) throw IllegalArgumentException("maxValue must be greater than 0")

        val range = List(maxValue) {it + 1}
        val filteredValues = range.map{if (it % 3 == 0 || it % 5 == 0) it else 0}.toList()
        val sum = Sum(filteredValues)
        return sum.value()
    }
}