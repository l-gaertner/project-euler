package com.lgaertner.euler.math

class MultipleOfTwoFilter(private val value: Int) : FilterChain<Int> {
    override fun value(): Int {
        return Filter({ it % 2 == 0 }, value, FinalFilter(0)).value()
    }
}