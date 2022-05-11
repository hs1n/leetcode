package leetcode.easy;

/**
 * @see <a href="https://leetcode.com/problems/maximum-subarray/">53. Maximum Subarray</a>
 */

public class MaximumSubArray {

    public int maxSubArray(int[] nums) {
        if (nums.length < 1 || nums.length > 100000) {
            throw new IllegalArgumentException("Argument over limit");
        } else {
            int current = 0; // init
            int max = Integer.MIN_VALUE;
            for (int num : nums) {
                current += num;
                if (current > max)
                    max = current;
                if (current < 0)
                    current = 0;
            }
            return max;
        }
    }
}