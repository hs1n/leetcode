package leetcode.easy;


import java.util.Stack;

/**
 * @see <a href="https://leetcode.com/problems/valid-parentheses/">20. Valid Parentheses</a>
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        int size = s.length();

        if (size >= 1 && size <= 10000) {
            if (size % 2 != 0) { // impossible to match parent
                return false;
            } else {
                Stack<Character> stack = new Stack<>();
                for (int i = 0; i < size; i++) {
                    char currentChar = s.charAt(i);

                    if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                        stack.push(currentChar);
                    } else {
                        if (stack.isEmpty()) {
                            return false;
                        }
                        char peekChar = stack.peek();

                        if ((currentChar == ')' && peekChar == '(')
                                || (currentChar == ']' && peekChar == '[')
                                || (currentChar == '}' && peekChar == '{')) {
                            stack.pop();
                        } else {
                            return false;
                        }
                    }
                }
                return stack.isEmpty();
            }
        } else {
            throw new IllegalArgumentException("String length over 10000 or less then 1");
        }
    }
}