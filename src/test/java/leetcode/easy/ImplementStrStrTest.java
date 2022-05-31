package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplementStrStrTest {
    ImplementStrStr testClass = new ImplementStrStr();

    @Test
    void example01() {
        assertEquals(2, testClass.strStr("hello", "ll"));
    }
    @Test
    void example02() {
        assertEquals(-1, testClass.strStr("aaaaa", "bba"));
    }
    @Test
    void custom01() {
        assertEquals(0, testClass.strStr("a", "a"));
    }
    @Test
    void custom02() {
        assertEquals(2, testClass.strStr("abc", "c"));
    }
}