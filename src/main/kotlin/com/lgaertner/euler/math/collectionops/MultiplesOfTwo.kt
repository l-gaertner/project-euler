package com.lgaertner.euler.math.collectionops

class MultiplesOfTwo (private val values: Collectable<Int>) : Collectable<Int>{
    override fun collect(): Collection<Int> {
        return values.collect().filter { MultipleOfTwoFilter(it).value() }
    }
}