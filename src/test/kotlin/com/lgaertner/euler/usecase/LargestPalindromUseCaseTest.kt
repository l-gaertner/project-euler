package com.lgaertner.euler.usecase

import org.junit.Test

class LargestPalindromUseCaseTest {

    @Test
    fun `should return 1 for 1`() {
        val useCase = LargestPalindromeForFactorsBelow(1);
        val value = useCase.palindrome();
    }
}