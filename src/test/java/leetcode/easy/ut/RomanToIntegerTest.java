package leetcode.easy.ut;

import leetcode.easy.RomanToInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RomanToIntegerTest {

    RomanToInteger romanToInteger = new RomanToInteger();

    @Test
    void example01() {
        assertEquals(3, romanToInteger.romanToInt("III"));
        assertEquals(3, romanToInteger.romanToIntHashMap("III"));
    }

    @Test
    void example02() {
        assertEquals(58, romanToInteger.romanToInt("LVIII"));
        assertEquals(58, romanToInteger.romanToIntHashMap("LVIII"));
    }

    @Test
    void example03() {
        assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
        assertEquals(1994, romanToInteger.romanToIntHashMap("MCMXCIV"));
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