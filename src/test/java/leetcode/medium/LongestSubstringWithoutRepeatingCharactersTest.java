package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {
    LongestSubstringWithoutRepeatingCharacters testClass = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    void example01() {
        assertEquals(3, testClass.lengthOfLongestSubstring("abcabcbb"));
    }
    @Test
    void example02() {
        assertEquals(1, testClass.lengthOfLongestSubstring("bbbbb"));
    }
    @Test
    void example03() {
        assertEquals(3, testClass.lengthOfLongestSubstring("pwwkew"));
    }
    @Test
    void custom01() {
        assertEquals(2, testClass.lengthOfLongestSubstring("aad"));
    }
    @Test
    void custom02() {
        assertEquals(3, testClass.lengthOfLongestSubstring("dvdf"));
    }
}