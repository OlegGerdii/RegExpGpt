package com.example.myapplication

object StringValidator {

    /**
     * Validates the given input string based on multiple criteria:
     * - Maximum string length
     * - Contains at least one uppercase letter, one lowercase letter, one digit, and one special character
     * - Does not contain any whitespace characters
     *
     * @param input The string to validate
     * @param maxLength The maximum allowed length for the string
     * @return True if the string meets all criteria, false otherwise
     */
    fun isValid(input: String, maxLength: Int): Boolean {
        if (input.length > maxLength) return false

        val pattern = """^(?=.*[A-Z])(?=.*[a-z])(?=.*\d)(?=.*[!"#$%&'()*+,-./:;<=>?@\[\]^_`{|}~])[^\s]{1,}$""".toRegex()

        return pattern.matches(input)
    }
}
