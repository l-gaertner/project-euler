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
}