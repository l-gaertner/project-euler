package com.lgaertner.euler.usecase

import junit.framework.TestCase.assertEquals
import kotlin.test.Test

class LargestPrimeFactorUseCaseTest {
    private val useCase = LargestPrimeFactorUseCase()
    @Test
    fun `should return 2 as largest prime factor of 2`() {
        val largestPrimeFactor = useCase.execute(2)
        assertEquals(2, largestPrimeFactor)
    }

    @Test
    fun `should return 3 as largest prime factor of 3`() {
        val largestPrimeFactor = useCase.execute(3)
        assertEquals(3, largestPrimeFactor)
    }

    @Test
    fun `should return 2 as largest prime factor of 4`() {
        val largestPrimeFactor = useCase.execute(4)
        assertEquals(2, largestPrimeFactor)
    }

    @Test
    fun `should return 5 as largest prime factor of 5`() {
        val largestPrimeFactor = useCase.execute(5)
        assertEquals(5, largestPrimeFactor)
    }
}