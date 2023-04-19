package com.lgaertner.euler.usecase

import com.lgaertner.euler.math.Sum

class SumOfMultipleOfThreeAndFiveUseCase {
    fun execute(maxValue: Int) : Int {
        if (maxValue < 1) throw IllegalArgumentException("maxValue must be greater than 0")

        val values = List(maxValue) {it + 1}
        val filteredValues = values.filter{Filter({it % 3 == 0 || it % 5 == 0}, it).apply()}.toList()
        val sum = Sum(filteredValues)
        return sum.value()
    }

    interface FilterChain {
        fun apply(): Boolean
    }

    class Filter(private val filter : (Int)->Boolean, private val value: Int) : FilterChain {
        override fun apply() : Boolean {
            return (filter(value))
        }
    }
}