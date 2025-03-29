package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RomanToArabicConverterTest {

    @Test
    void testValidConversions() {
        assertEquals(1, RomanToArabicConverter.convert("I"));
        assertEquals(4, RomanToArabicConverter.convert("IV"));
        assertEquals(9, RomanToArabicConverter.convert("IX"));
        assertEquals(40, RomanToArabicConverter.convert("XL"));
        assertEquals(90, RomanToArabicConverter.convert("XC"));
        assertEquals(400, RomanToArabicConverter.convert("CD"));
        assertEquals(900, RomanToArabicConverter.convert("CM"));
        assertEquals(58, RomanToArabicConverter.convert("LVIII"));
        assertEquals(1994, RomanToArabicConverter.convert("MCMXCIV"));
    }

    @Test
    void testInvalidInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            RomanToArabicConverter.convert("IIII");
        });
        assertTrue(exception.getMessage().contains("Invalid"));
    }
}
