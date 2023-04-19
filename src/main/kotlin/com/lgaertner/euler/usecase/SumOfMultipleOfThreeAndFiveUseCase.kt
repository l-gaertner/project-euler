package com.lgaertner.euler.usecase

import com.lgaertner.euler.math.Sum

class SumOfMultipleOfThreeAndFiveUseCase {
    fun execute(maxValue: Int) : Int {
        if (maxValue < 1) throw IllegalArgumentException("maxValue must be greater than 0")

        val values = List(maxValue) {it + 1}
        val filteredValues = List(maxValue){
            Filter(
                {it % 3 == 0},
                it + 1,
                Filter(
                    {it % 5 == 0},
                    it + 1,
                    FinalFilter(0)
                )
            )}
        val sum = Sum(filteredValues.map{it.value()})
        return sum.value()
    }

    interface LazyInt {
        fun value(): Int
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

    class Sum(private val values: Collection<Int>) {

        fun value() = values.sum();
    }
}