package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    private static final PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    void example01() {
        assertTrue(palindromeNumber.isPalindrome(121));
    }

    @Test
    void example02() {
        assertFalse(palindromeNumber.isPalindrome(-121));
    }

    @Test
    void example03() {
        assertFalse(palindromeNumber.isPalindrome(10));
    }

    @Test
    void example04() {
        assertFalse(palindromeNumber.isPalindrome(123));
    }

    @Test
    void example05() {
        assertTrue(palindromeNumber.isPalindrome(1221));
    }

    @Test
    void example06() {
        assertFalse(palindromeNumber.isPalindrome(2147483647));
    }
}