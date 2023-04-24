package com.lgaertner.euler.math

class MultipleOfTwoFilter(private val value: Int) : FilterChain<Int> {
    override fun value(): Boolean {
        return Filter({ it % 2 == 0 }, value, FinalFilter()).value()
    }
}

class MultipleOfThreeFilter(private val value: Int) : FilterChain<Int> {
    override fun value(): Boolean {
        return Filter({ it % 3 == 0 }, value, FinalFilter()).value()
    }
}

class MultipleOfFiveFilter(private val value: Int) : FilterChain<Int> {
    override fun value(): Boolean {
        return Filter({ it % 5 == 0 }, value, FinalFilter()).value()
    }
}

class MultipleOfThreeOrFiveFilter(private val value: Int) : FilterChain<Int> {
    override fun value(): Boolean {
        return Filter({MultipleOfThreeFilter(it).value()}, value, Filter({MultipleOfFiveFilter(it).value()}, value, FinalFilter())).value()
    }
}