package leetcode.easy;


import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author hsin
 * @see <a href="https://leetcode.com/problems/valid-parentheses/">20. Valid Parentheses</a>
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        int size = s.length();

        if (size >= 1 && size <= 10000) {
            if (size % 2 != 0) { // impossible to match parent
                return false;
            } else {
                Deque<Character> deque = new ArrayDeque<>();
                for (int i = 0; i < size; i++) {
                    char currentChar = s.charAt(i);

                    if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                        deque.push(currentChar);
                    } else {
                        if (deque.isEmpty()) {
                            return false;
                        }
                        char peekChar = deque.peek();

                        if ((currentChar == ')' && peekChar == '(')
                                || (currentChar == ']' && peekChar == '[')
                                || (currentChar == '}' && peekChar == '{')) {
                            deque.pop();
                        } else {
                            return false;
                        }
                    }
                }
                return deque.isEmpty();
            }
        } else {
            throw new IllegalArgumentException("String length over 10000 or less then 1");
        }
    }
}