package com.lgaertner.euler.usecase

import junit.framework.TestCase.assertEquals
import org.junit.Test

class SumOfMultipleOfThreeAndFiveUseCaseTest {

    private val useCase = SumOfMultipleOfThreeAndFiveUseCase()

    @Test
    fun `should return 0 when input is 1`() {
        //when
        val result = useCase.execute(1)
        //then
        assertEquals(0, result)
    }

    @Test
    fun `should return 3 when input is 3`() {
        //when
        val result = useCase.execute(3)
        //then
        assertEquals(3, result)
    }

    @Test
    fun `should return 8 when input is 5`() {
        //when
        val result = useCase.execute(5)
        //then
        assertEquals(8, result)
    }

    @Test
    fun `should return 33 when input is 10`() {
        //when
        val result = useCase.execute(10)
        //then
        assertEquals(33, result)
    }
}