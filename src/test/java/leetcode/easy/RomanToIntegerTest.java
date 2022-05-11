package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RomanToIntegerTest {

    RomanToInteger romanToInteger = new RomanToInteger();


    @Nested
    @DisplayName("Hash Map")
    class HashMapTest {
        @Test
        void example01() {
            assertEquals(3, romanToInteger.romanToIntHashMap("III"));
        }

        @Test
        void example02() {
            assertEquals(58, romanToInteger.romanToIntHashMap("LVIII"));
        }

        @Test
        void example03() {
            assertEquals(1994, romanToInteger.romanToIntHashMap("MCMXCIV"));
        }
    }

    @Nested
    @DisplayName("Custom Method")
    class CustomMethodTest {
        @Test
        void example01() {
            assertEquals(3, romanToInteger.romanToInt("III"));
        }

        @Test
        void example02() {
            assertEquals(58, romanToInteger.romanToInt("LVIII"));
        }

        @Test
        void example03() {
            assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
        }
    }

    @Test
    void custom01() {
        assertEquals(3999, romanToInteger.romanToInt("MMMCMXCIX"));
        assertEquals(3999, romanToInteger.romanToIntHashMap("MMMCMXCIX"));
    }

    @Test
    void exception01() {
        NullPointerException thrown = assertThrows(
                NullPointerException.class,
                () -> romanToInteger.romanToInt("JJJJJ"),
                "Expected romanToInt() to throw, but it didn't"
        );
    }
    @Test
    void exception02() {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> romanToInteger.romanToInt(""),
                "Expected romanToInt() to throw, but it didn't"
        );
    }
}