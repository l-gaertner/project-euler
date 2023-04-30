package com.lgaertner.euler.usecase

import com.lgaertner.euler.math.PrimeFactors

class LargestPrimeFactorUseCase {
    fun execute(number: Long): Long {
        val largestPrimeFactor = PrimeFactors(number).values().max()
        return largestPrimeFactor
    }
}

