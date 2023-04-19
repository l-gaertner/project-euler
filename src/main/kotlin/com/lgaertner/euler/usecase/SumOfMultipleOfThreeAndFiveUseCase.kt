package com.lgaertner.euler.usecase

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

    interface FilterChain<K> {
        fun value(): K
    }

    class Filter<K>(private val filter : (K)->Boolean, private val value: K, private val next: FilterChain<K>) : FilterChain<K> {
        override fun value() : K {
            return if (filter(value))
                value
            else next.value()
        }
    }

    class FinalFilter<K>(private val defaultValue: K) : FilterChain<K> {
        override fun value(): K {
            return defaultValue
        }
    }

    class Sum(private val values: Collection<FilterChain<Int>>) {

        fun value() = values.map{it.value()}.sum();
    }
}