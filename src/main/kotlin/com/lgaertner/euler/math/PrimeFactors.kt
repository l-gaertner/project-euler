package com.lgaertner.euler.math

class PrimeFactors(private val number: Int) : Wrapper<Collection<Int>> {

    fun values(): Collection<Int> {
        return primeFactors(number)
    }

    private fun primeFactors(value: Int): Collection<Int> {
        val primesBelow = primesUntil(value)
        val primeFactorsWithoutSelf = primesBelow.filter{ value % it == 0 }
        return primeFactorsWithoutSelf
    }

    private fun primesUntil(value: Int): Collection<Int> {
        val values = MutableList(value - 1) { it + 2 }
        for (currentValue in values) {
            var multipleOfCurrentValue = currentValue * 2
            while (multipleOfCurrentValue in 1 .. value) {
                values[multipleOfCurrentValue - 2] = 0
                multipleOfCurrentValue += currentValue
            }
        }
        return values.filter { it != 0 }
    }

    override fun collapse(): Collection<Int> {
        return values()
    }
}