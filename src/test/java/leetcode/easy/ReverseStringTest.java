package leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    ReverseString reverseString = new ReverseString();

    @Test
    void example01() {
        char[] input = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] expected = new char[]{'o', 'l', 'l', 'e', 'h'};

        reverseString.reverseString(input);
        assertArrayEquals(input, expected);
    }
    @Test
    void example02() {
        char[] input = new char[]{'H','a','n','n','a','h'};
        char[] expected = new char[]{'h','a','n','n','a','H'};

        reverseString.reverseString(input);
        assertArrayEquals(input, expected);
    }
}