package com.lgaertner.euler.usecase

import com.lgaertner.euler.math.Sum

class SumOfMultipleOfThreeAndFiveUseCase {
    fun execute(maxValue: Int) : Int {
        if (maxValue < 1) throw IllegalArgumentException("maxValue must be greater than 0")

        val values = List(maxValue) {it + 1}
        val filteredValues = values.map{Filter({it % 3 == 0 || it % 5 == 0}, it, 0).apply()}.toList()
        val sum = Sum(filteredValues)
        return sum.value()
    }

    class Filter(private val filter : (Int)->Boolean, private val value: Int, private val default: Int) {
        fun apply() : Int {
            return if (filter(value))
                value
            else default
        }
    }
}