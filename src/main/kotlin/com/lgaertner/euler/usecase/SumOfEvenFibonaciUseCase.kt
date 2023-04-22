package com.lgaertner.euler.usecase

class SumOfEvenFibonaciUseCase {
    fun execute(i: Int): Int {
        return if (i < 2)
            0
        else 2
    }
}

class FibonacciNumber(private val startValues:List<Int>, private val limit: Int) {

    fun values(): List<Int> {
        return startValues
    }
}