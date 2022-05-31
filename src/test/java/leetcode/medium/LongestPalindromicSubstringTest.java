package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {
    LongestPalindromicSubstring testClass = new LongestPalindromicSubstring();

    @Test
    void example01() {
        assertEquals("bab", testClass.longestPalindrome("babad"));
    }

    @Test
    void example02() {
        assertEquals("bb", testClass.longestPalindrome("cbbd"));
    }
}