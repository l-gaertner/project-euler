package com.lgaertner.euler.math

class Sum(private val values: Collection<Wrapper<Int>>) {

    fun value() = values.sumOf { it.value() };
}
