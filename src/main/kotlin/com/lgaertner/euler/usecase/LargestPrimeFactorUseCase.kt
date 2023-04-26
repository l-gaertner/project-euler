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
        } else FactorsWithoutOneAndSelf()
    }

    private fun isPrime(): Boolean {
        return isPrimeNumber(number)
    }

    private fun isPrimeNumber(value: Int):Boolean {
        if (value == 2)
            return true
        return FactorsWithoutOneAndSelf().isEmpty()
    }

    private fun FactorsWithoutOneAndSelf(): Collection<Int> {
        val values = List(number - 2) {it + 2}
        val factorsWithoutOneAndSelf = values.filter{number % it == 0}
        return factorsWithoutOneAndSelf
    }
}