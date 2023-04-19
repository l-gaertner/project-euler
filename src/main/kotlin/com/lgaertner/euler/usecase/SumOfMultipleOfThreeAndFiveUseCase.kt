package com.lgaertner.euler.usecase

import com.lgaertner.euler.math.Sum

class SumOfMultipleOfThreeAndFiveUseCase {
    fun execute(maxValue: Int) : Int {
        if (maxValue < 1) throw IllegalArgumentException("maxValue must be greater than 0")

        val filteredValues = List(maxValue){value: Int ->
            Filter(
                {it % 3 == 0},
                value + 1,
                Filter(
                    {it % 5 == 0},
                    value + 1,
                    FinalFilter(0)
                )
            )}
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

    class FinalFilter(private val defaultValue: Int) : FilterChain {
        override fun value(): Int {
            return defaultValue
        }
    }

    class Sum(private val values: Collection<FilterChain>) {

        fun value() = values.map{it.value()}.sum();
    }
}