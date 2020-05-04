package com.test.coverage.android_coveragetools_demo

import org.junit.Assert.*
import org.junit.Test

class CounterTest {

    @Test
    fun testIncrease() {
        val counter = Counter()
        val value = counter.value

        val test = counter.increase()

        assertEquals(test, value + 1)
    }

    @Test
    fun testDecrease() {
        val counter = Counter()
        val value = counter.value

        val test = counter.decrease()

        assertEquals(test, value - 1)
    }

    @Test
    fun testMultiply() {
        val counter = Counter()
        val value = counter.value
        val num = 2

        val test = counter.multiply(num)

        assertEquals(test, value * num)
    }

}