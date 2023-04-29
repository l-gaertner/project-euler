package com.lgaertner.euler.math

class PrimeFactors(private val number: Int) : Wrapper<Collection<Int>> {

    fun values(): Collection<Int> {
        return if (isPrime()) {
            listOf(1, number)
        } else FactorsWithoutOneAndSelf(number)
    }

    private fun isPrime(): Boolean {
        return isPrimeNumber(number)
    }

    private fun isPrimeNumber(value: Int): Boolean {
        if (value == 1)
            return false
        if (value == 2)
            return true
        return FactorsWithoutOneAndSelf(value).isEmpty()
    }

    private fun FactorsWithoutOneAndSelf(value: Int): Collection<Int> {
        val primesBelow = primesBelow(value)
        val primeFactorsWithoutSelf = primesBelow.filter{ value % it == 0 }
        return primeFactorsWithoutSelf
    }

    private fun primesBelow(value: Int): Collection<Int> {
        val values = MutableList(value - 2) { it + 2 }
        for (currentValue in values) {
            var multipleOfCurrentValue = currentValue * 2
            while (multipleOfCurrentValue in 1 until value) {
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