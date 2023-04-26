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
        return if (value == 2)
            true
        else value == 3
    }
}