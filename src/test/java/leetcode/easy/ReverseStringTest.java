package leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    ReverseString reverseString = new ReverseString();

    @Test
    void example01() {
        char[] actual = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] expected = new char[]{'o', 'l', 'l', 'e', 'h'};

        reverseString.reverseString(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void example02() {
        char[] actual = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        char[] expected = new char[]{'h', 'a', 'n', 'n', 'a', 'H'};

        reverseString.reverseString(actual);
        assertArrayEquals(expected, actual);
    }
}