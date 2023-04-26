package com.lgaertner.euler.usecase

class LargestPrimeFactorUseCase {
    fun execute(number: Int): Int {
        val primeFactor = PrimeFactors(number)
        if (primeFactor.isPrime()) {
            return number
        } else {
            return 2
        }
    }
}

class PrimeFactors(private val number: Int) {

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