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
        } else divisorsWithoutOneAndSelf()
    }

    private fun isPrime(): Boolean {
        if (number == 2)
            return true
        return divisorsWithoutOneAndSelf().isEmpty()
    }

    private fun divisorsWithoutOneAndSelf(): Collection<Int> {
        val values = List(number - 2) {it + 2}
        return values.filter{number % it == 0}
    }
}