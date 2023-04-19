package com.lgaertner.euler.usecase

import com.lgaertner.euler.math.Sum

class SumOfMultipleOfThreeAndFiveUseCase {
    fun execute(maxValue: Int) : Int {
        if (maxValue < 1) throw IllegalArgumentException("maxValue must be greater than 0")

        val values = List(maxValue) {it + 1}
        val filteredValues = values.map{Filter({it % 3 == 0}, it, Filter({it % 5 == 0}, it, FinalFilter(0))).value()}.toList()
        val sum = Sum(filteredValues)
        return sum.value()
    }

    interface FilterChain {
        fun value(): Int
    }

    class Filter(private val filter : (Int)->Boolean, private val value: Int, private val next: FilterChain) : FilterChain {
        override fun value() : Int {
            return if (filter(value))
                value
            else next.value()
        }
    }

    class FinalFilter(private val defaultValue: Int) :FilterChain {
        override fun value(): Int {
            return defaultValue
        }
    }
}