package com.example;

import java.util.HashMap;
import java.util.Map;

public class RomanToArabicConverter {
    private static final Map<Character, Integer> romanMap = new HashMap<>();

    static {
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }

    public static int convert(String roman) {
        if (roman == null || roman.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty");
        }

        int total = 0;
        int prevValue = 0;
        
        for (int i = roman.length() - 1; i >= 0; i--) {
            char currentChar = roman.charAt(i);
            int currentValue = romanMap.getOrDefault(currentChar, -1);
            
            if (currentValue == -1) {
                throw new IllegalArgumentException("Invalid Roman numeral character: " + currentChar);
            }

            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
            prevValue = currentValue;
        }
        return total;
    }
}
