package com.lgaertner.euler.math

class MultipleOfTwoMap(private val value: Int) : MapChain<Int> {
    override fun value(): Int {
        return Map({ it % 2 == 0 }, value, FinalMap(0)).value()
    }
}

class MultipleOfTwoFilter(private val value: Int) : FilterChain<Int> {
    override fun value(): Boolean {
        return Filter({ it % 2 == 0 }, value, FinalFilter()).value()
    }
}
