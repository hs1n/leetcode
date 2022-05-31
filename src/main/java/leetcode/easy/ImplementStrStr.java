package leetcode.easy;

/**
 * @see <a href="https://leetcode.com/problems/implement-strstr/">28. Implement strStr()</a>
 */
public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (haystack.length() < needle.length()) return -1;

        int limit = haystack.length() - needle.length();

        for (int i = 0; i <= limit; i++) {
            if (haystack.startsWith(needle, i)) {
                return i;
            }
        }
        return -1;
    }
}