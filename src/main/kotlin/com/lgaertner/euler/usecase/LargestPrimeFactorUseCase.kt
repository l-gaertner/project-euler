package com.lgaertner.euler.usecase

class LargestPrimeFactorUseCase {
    fun execute(number: Int): Int {
        val primeFactor = PrimeFactors(number)
        if (primeFactor.values().isNotEmpty()) {
            return primeFactor.values().max()
        } else {
            return 2
        }
    }
}

class PrimeFactors(private val number: Int) {

    fun values(): Collection<Int> {
        return if (isPrime()) {
            listOf(1, number)
        } else listOf()
    }

    fun isPrime(): Boolean {
        return isPrime(number)
    }
    private fun isPrime(value: Int): Boolean {
        if (value == 2)
            return true

        val values = List(value - 2) {it + 2}
        val divisors = values.filter{value % it == 0}
        return divisors.isEmpty()
    }
}