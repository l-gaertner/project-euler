package com.lgaertner.euler.usecase

class SumOfEvenFibonaciUseCase {
    fun execute(i: Int):Int {
        return if (i < 2)
            0
        else 2

    }
}