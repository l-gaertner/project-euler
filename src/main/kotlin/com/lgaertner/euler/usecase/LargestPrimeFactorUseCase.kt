package com.lgaertner.euler.usecase

import com.lgaertner.euler.math.Max
import com.lgaertner.euler.math.PrimeFactors

class LargestPrimeFactorUseCase {
    fun execute(number: Long): Long {
        val largestPrimeFactor = Max(PrimeFactors(number))
        return largestPrimeFactor.value()
    }
}