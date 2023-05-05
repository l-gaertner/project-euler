package com.lgaertner.euler.usecase

class LargestPalindromeForFactorsBelow(private val maxFactors: Int) {
    fun palindrome(): Int {
        return if(maxFactors * maxFactors < 10) {
            maxFactors * maxFactors
        } else {
            (maxFactors-1) * (maxFactors-1)
        }
    }
}