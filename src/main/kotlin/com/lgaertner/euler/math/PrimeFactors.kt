package com.lgaertner.euler.math

import kotlin.math.sqrt

class PrimeFactors(private val number: Long) : Wrapper<Collection<Number>> {

    fun values(): Collection<Long> {
        return if (isPrime()) {
            listOf(1, number)
        } else factorsWithoutOneAndSelf(number)
    }

    private fun isPrime(): Boolean {
        return isPrimeNumber(number)
    }

    private fun isPrimeNumber(value: Long): Boolean {
        if (value == 1L)
            return false
        if (value == 2L)
            return true
        return factorsWithoutOneAndSelf(value).isEmpty()
    }

    private fun factorsWithoutOneAndSelf(value: Long): Collection<Long> {
        val values = List(sqrt(value.toDouble()).toInt()) { it + 2L }
        val factorsWithoutOneAndSelf = values.filter { value % it == 0L }
        return factorsWithoutOneAndSelf.filter { isPrimeNumber(it) }
    }

    override fun evaluate(): Collection<Long> {
        return values()
    }
}