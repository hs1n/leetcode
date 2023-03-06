package leetcode.medium;

/**
 * @author hsin
 * @see <a href="https://leetcode.com/problems/longest-palindromic-substring/">5. Longest Palindromic Substring</a>
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int start = 0;
        int pLength = 0;

        if (s.length() < 2) {
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            int pStart = i - 1;
            int pEnd = i + 1;

            while (pEnd < s.length() && s.charAt(pEnd) == s.charAt(i)) {
                pEnd++;
            }
            while (pStart >= 0 && s.charAt(pStart) == s.charAt(i)) {
                pStart--;
            }
            while (pStart >= 0 && pEnd < s.length() && s.charAt(pStart) == s.charAt(pEnd)) {
                pStart--;
                pEnd++;
            }

            int newLength = pEnd - pStart - 1;
            if (pLength < newLength) {
                pLength = newLength;
                start = pStart + 1;
            }
        }
        return s.substring(start, start + pLength);
    }
}