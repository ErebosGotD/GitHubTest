package com.example.githubtest

import org.junit.Test
import org.junit.Assert.assertEquals

class CalculatorTest {

    @Test
    fun testAddition() {
        val result = add(2, 3)
        assertEquals(5, result)
    }

    @Test
    fun testSubtraction() {
        val result = subtract(5, 2)
        assertEquals(3, result)
    }

    private fun add(a: Int, b: Int): Int {
        return a + b
    }

    private fun subtract(a: Int, b: Int): Int {
        return a - b
    }
}
