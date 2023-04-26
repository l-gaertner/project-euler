package com.lgaertner.euler.usecase

class LargestPrimeFactorUseCase {
    fun execute(number: Int): Int {
        val primeFactor = PrimeFactors(number)
        return primeFactor.values().max()
    }
}

class PrimeFactors(private val number: Int) {

    fun values(): Collection<Int> {
        return if (isPrime()) {
            listOf(1, number)
        } else FactorsWithoutOneAndSelf(number)
    }

    private fun isPrime(): Boolean {
        return isPrimeNumber(number)
    }

    private fun isPrimeNumber(value: Int):Boolean {
        if (value == 1)
            return false
        if (value == 2)
            return true
        return FactorsWithoutOneAndSelf(value).isEmpty()
    }

    private fun FactorsWithoutOneAndSelf(value: Int): Collection<Int> {
        val values = List(value - 2) {it + 2}
        val factorsWithoutOneAndSelf = values.filter{value % it == 0}
        return factorsWithoutOneAndSelf.filter{isPrimeNumber(it)}
    }
}