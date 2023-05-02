package com.lgaertner.euler.math.collectionops

class MultiplesOfThreeOrFive(private val values: Collection<Int>) : Collectable<Int> {
    override fun collect(): Collection<Int> {
        return values.filter { MultipleOfThreeOrFiveFilter(it).value() }
    }
}