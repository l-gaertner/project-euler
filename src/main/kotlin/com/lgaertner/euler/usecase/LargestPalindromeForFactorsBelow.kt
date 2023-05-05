package com.lgaertner.euler.usecase

class LargestPalindromeForFactorsBelow(private val maxFactors: Int) {
    fun palindrome(): Int {
        return maxFactors * maxFactors;
    }
}