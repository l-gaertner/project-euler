package com.lgaertner.euler.usecase

class SumOfEvenFibonaciUseCase {
    fun execute(i: Int):Int {
        return if (i < 3)
            0
        else 2

    }
}