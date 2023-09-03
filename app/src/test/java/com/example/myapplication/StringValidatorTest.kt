package com.example.myapplication

import org.junit.Test
import org.junit.Assert.*

class StringValidatorTest {

    @Test
    fun testTooShortInput() {
        val input = "A1!"
        assertFalse(StringValidator.isValid(input, 10))
    }

    @Test
    fun testTooLongInput() {
        val input = "Aa1!Aa1!Aa1!Aa1!Aa1!"
        assertFalse(StringValidator.isValid(input, 10))
    }

    @Test
    fun testMatchingInputLength() {
        val input = "Aa1!Aa1!Aa"
        assertTrue(StringValidator.isValid(input, 10))
    }

    @Test
    fun testMissingUppercase() {
        val input = "aa1!aa1!aa"
        assertFalse(StringValidator.isValid(input, 10))
    }

    @Test
    fun testMissingLowercase() {
        val input = "AA1!AA1!AA"
        assertFalse(StringValidator.isValid(input, 10))
    }

    @Test
    fun testMissingSpecialCharacter() {
        val input = "Aa1Aa1Aa1"
        assertFalse(StringValidator.isValid(input, 10))
    }

    @Test
    fun testMissingDigit() {
        val input = "Aa!Aa!Aa!"
        assertFalse(StringValidator.isValid(input, 10))
    }

    @Test
    fun testWhitespaceAtBeginning() {
        val input = " Aa1!Aa1!"
        assertFalse(StringValidator.isValid(input, 10))
    }

    @Test
    fun testWhitespaceInMiddle() {
        val input = "Aa1 !Aa1!"
        assertFalse(StringValidator.isValid(input, 10))
    }

    @Test
    fun testWhitespaceAtEnd() {
        val input = "Aa1!Aa1! "
        assertFalse(StringValidator.isValid(input, 10))
    }
}
