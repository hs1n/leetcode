package leetcode.easy.ut;

import leetcode.easy.PalindromeNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    private static final PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    void example01() {
        assertEquals(true, palindromeNumber.isPalindrome(121));
    }

    @Test
    void example02() {
        assertEquals(false, palindromeNumber.isPalindrome(-121));
    }

    @Test
    void example03() {
        assertEquals(false, palindromeNumber.isPalindrome(10));
    }

    @Test
    void example04() {
        assertEquals(false, palindromeNumber.isPalindrome(123));
    }

    @Test
    void example05() {
        assertEquals(true, palindromeNumber.isPalindrome(1221));
    }

    @Test
    void example06() {
        assertEquals(false, palindromeNumber.isPalindrome(2147483647));
    }
}