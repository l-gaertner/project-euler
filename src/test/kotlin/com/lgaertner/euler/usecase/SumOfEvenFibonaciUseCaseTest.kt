package com.lgaertner.euler.usecase

import junit.framework.TestCase.assertEquals
import kotlin.test.Test

class SumOfEvenFibonaciUseCaseTest {

    private val sumOfEvenFibonaciUseCase = SumOfEvenFibonaciUseCase()

    @Test
    fun `should return 0 for 0`() {
        val result = sumOfEvenFibonaciUseCase.below(0)
        assertEquals(0, result);
    }

    @Test
    fun `should return 0 for 1`() {
        val result = sumOfEvenFibonaciUseCase.below(1)
        assertEquals(0, result);
    }

    @Test
    fun `should return 2 for 2`() {
        val result = sumOfEvenFibonaciUseCase.below(2)
        assertEquals(2, result);
    }

    @Test
    fun `should return 2 for 3`() {
        val result = sumOfEvenFibonaciUseCase.below(3)
        assertEquals(2, result);
    }

    @Test
    fun `should return 2 for 10`() {
        val result = sumOfEvenFibonaciUseCase.below(10)
        assertEquals(10, result);
    }


    @Test
    fun `should return 2 for 20`() {
        val result = sumOfEvenFibonaciUseCase.below(20)
        assertEquals(10, result);
    }
}