package com.lgaertner.euler.usecase

class LargestPrimeFactorUseCase {
    fun execute(number: Int): Int {
        if (isPrime(number)) {
            return number
        } else {
            return 2
        }
    }

    private fun isPrime(value: Int): Boolean {
        if (value == 2)
            return true

        val values = List(value - 2) {it + 2}
        val divisors = values.filter{value % it == 0}
        return divisors.isEmpty()
    }
}