package com.lgaertner.euler.usecase

import com.lgaertner.euler.math.PrimeFactors

class LargestPrimeFactorUseCase {
    fun execute(number: Int): Int {
        val largestPrimeFactor = PrimeFactors(number).values().max()
        return largestPrimeFactor
    }
}

