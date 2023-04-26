package com.lgaertner.euler.usecase

import kotlin.test.Test

class LargestPrimeFactorUseCaseTest {
    private val useCase = LargestPrimeFactorUseCase()
    @Test
    fun `should return 2 as largest prime factor of 2 `() {
        val largestPrimeFactor = useCase.execute(2)
    }
}