package leetcode.easy;

/**
 * @see <a href="https://leetcode.com/problems/palindrome-number/">9. Palindrome Number</a>
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int reverted = 0;
        int length = (int) (Math.log10(x) + 1);

        if (x < 0 || x > Math.pow(2, 31) - 1 || (x % 10 == 0 && x != 0)) {
            return false;
        } else {
            for (int i = 0; i < length; i++) {
                reverted *= 10;
                reverted += (x / (int) Math.pow(10, i)) % 10;
            }
        }
        return x == reverted;
    }
}
