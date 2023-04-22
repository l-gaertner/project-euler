package com.lgaertner.euler.usecase

import com.lgaertner.euler.math.Filter
import com.lgaertner.euler.math.FinalFilter
import com.lgaertner.euler.math.Sum

class SumOfEvenFibonaciUseCase {
    fun execute(limit: Int): Int {
        return if (limit < 2)
            0
        else {
            Sum(FibonacciSeries(listOf(1,1), limit).values().map{ Filter({it % 2 == 0}, it, FinalFilter(0)) }).value()
        }
    }
}

class FibonacciSeries(private val startValues:List<Int>, private val limit: Int) {

    fun values(): List<Int> {
        if (startValues.last() > limit)
            return startValues.dropLast(1)

        val newValues:List<Int> = listOf(startValues, listOf(startValues.last() + startValues.dropLast(1).last())).flatten()

        return FibonacciSeries(newValues, limit).values()
    }
}