package com.lgaertner.euler.usecase

class LargestPalindromeForFactorsBelow(private val maxFactors: Int) {
    fun palindrome(): Int {
        val factors = List(maxFactors) {i -> i}
        val products = factors.flatMap { i -> factors.map { j -> i * j } }
        return if(products.max() < 10) {
            (maxFactors-1) * (maxFactors-1)
        } else {
            9
        }
    }
}