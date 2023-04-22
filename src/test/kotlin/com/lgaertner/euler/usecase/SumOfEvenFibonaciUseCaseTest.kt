package com.lgaertner.euler.usecase

import junit.framework.TestCase.assertEquals
import kotlin.test.Test

class SumOfEvenFibonaciUseCaseTest {

    private val sumOfEvenFibonaciUseCase = SumOfEvenFibonaciUseCase()

    @Test
    fun `should return 0 for 1`() {
        val result = sumOfEvenFibonaciUseCase.execute(1)
        assertEquals(0, result);
    }

    @Test
    fun `should return 0 for 2`() {
        val result = sumOfEvenFibonaciUseCase.execute(2)
        assertEquals(0, result);
    }


    @Test
    fun `should return 2 for 3`() {
        val result = sumOfEvenFibonaciUseCase.execute(3)
        assertEquals(2, result);
    }
}