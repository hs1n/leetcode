package leetcode.easy;

/**
 * @see <a href="https://leetcode.com/problems/reverse-string/">344. Reverse String</a>
 */

public class ReverseString {
    public void reverseString(char[] s) {
        int start = 0, end = s.length - 1;
        while (start < end) {
            // Swap s[start] and s[end]
            s[start] ^= s[end];
            s[end] ^= s[start];
            s[start] ^= s[end];

            start++;
            end--;
        }
    }
}