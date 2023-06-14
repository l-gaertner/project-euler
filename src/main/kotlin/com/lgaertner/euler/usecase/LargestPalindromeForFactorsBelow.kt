package com.lgaertner.euler.usecase

class LargestPalindromeForFactorsBelow(private val maxFactors: Int) {
    fun palindrome(): Int {
        val factors = List(maxFactors) {i -> i}
        val products = factors.flatMap { i -> factors.map { j -> i * j } }
        val palindromes = products.filter {i -> isPalindrome(i)}
        return palindromes.max()
    }

    fun isPalindrome(value: Int) : Boolean {
        val stringValue = value.toString()
        for (a in List(stringValue.length - 1) {i -> i}) {
            if (!stringValue[a].equals(stringValue[stringValue.length - 1 - a])) {
                return false
            }
        }
        return true
    }
}