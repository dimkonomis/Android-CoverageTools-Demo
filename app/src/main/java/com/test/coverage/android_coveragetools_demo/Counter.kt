package com.test.coverage.android_coveragetools_demo

class Counter {

    var value = 0

    fun increase(): Int {
        value += 1
        return value
    }

    fun decrease(): Int {
        value -= 1
        return value
    }

}
