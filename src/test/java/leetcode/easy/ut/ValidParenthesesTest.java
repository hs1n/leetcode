package leetcode.easy.ut;

import leetcode.easy.ValidParentheses;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {
    private final ValidParentheses validParentheses = new ValidParentheses();

    @Test
    void example01() {
        assertTrue(validParentheses.isValid("()"));
    }

    @Test
    void example02() {
        assertTrue(validParentheses.isValid("()[]{}"));
    }

    @Test
    void example03() {
        assertFalse(validParentheses.isValid("(]"));
    }
    @Test
    void custom01() {
        assertTrue(validParentheses.isValid("()[]{}()[]{}()[]{}()[]{}()[]{}[](){}{}"));
    }
    @Test
    void custom02() {
        assertTrue(validParentheses.isValid("(()((()(()([{}]))))())"));
    }
    @Test
    void custom03() {
        assertFalse(validParentheses.isValid("}["));
    }
}