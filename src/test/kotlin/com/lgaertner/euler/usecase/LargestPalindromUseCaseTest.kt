package com.lgaertner.euler.usecase

import org.junit.Test
import kotlin.test.assertEquals

class LargestPalindromUseCaseTest {

    @Test
    fun `should return 0 for 1`() {
        val useCase = LargestPalindromeForFactorsBelow(1)
        val value = useCase.palindrome()
        assertEquals(0, value)
    }

    @Test
    fun `should return 1 for 2`() {
        val useCase = LargestPalindromeForFactorsBelow(2)
        val value = useCase.palindrome()
        assertEquals(1, value)
    }

    @Test
    fun `should return 4 for 3`() {
        val useCase = LargestPalindromeForFactorsBelow(3)
        val value = useCase.palindrome()
        assertEquals(4, value)
    }

    @Test
    fun `should return 9 for 4`() {
        val useCase = LargestPalindromeForFactorsBelow(4)
        val value = useCase.palindrome()
        assertEquals(9, value)
    }

    @Test
    fun `should return 9 for 10`() {
        val useCase = LargestPalindromeForFactorsBelow(10)
        val value = useCase.palindrome()
        assertEquals(9, value)
    }

    @Test
    fun `should return 121 for 12`() {
        val useCase = LargestPalindromeForFactorsBelow(12)
        val value = useCase.palindrome()
        assertEquals(121, value)
    }

    @Test
    fun `should return 252 for 19`() {
        val useCase = LargestPalindromeForFactorsBelow(19)
        val value = useCase.palindrome()
        assertEquals(272, value)
    }
}