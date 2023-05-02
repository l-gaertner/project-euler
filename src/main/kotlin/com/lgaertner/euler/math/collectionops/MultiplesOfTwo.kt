package com.lgaertner.euler.math.collectionops

class MultiplesOfTwo (private val values: Collection<Int>) : Collectable<Int>{
    override fun collect(): Collection<Int> {
        return values.filter { MultipleOfTwoFilter(it).value() }
    }
}