package com.lgaertner.euler.usecase

import com.lgaertner.euler.math.Max
import com.lgaertner.euler.math.PrimeFactors

class LargestPrimeFactorUseCase {
    fun execute(number: Int): Int {
        val largestPrimeFactor = Max(PrimeFactors(number))
        return largestPrimeFactor.value()
    }
}

