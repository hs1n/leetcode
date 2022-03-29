package leetcode.easy;

import java.util.Arrays;

/**
 * @see <a href='https://leetcode.com/problems/roman-to-integer/'>13. Roman to Integer</a>
 */
public class LongestCommonPrefix {


    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;

        if (n == 1) {
            return strs[0];
        } else if (n > 1 && n <= 200) {
            int commonPrefixIndex = 0;

            Arrays.sort(strs);

            String first = strs[0];
            String last = strs[n - 1];

            for (int j = 0; j < Math.min(first.length(), last.length()); j++) {
                if (first.charAt(j) == last.charAt(j)) {
                    commonPrefixIndex++;
                } else {
                    break;
                }
            }

            return strs[0].substring(0, commonPrefixIndex);

        } else {
            throw new IllegalArgumentException();
        }
    }
}