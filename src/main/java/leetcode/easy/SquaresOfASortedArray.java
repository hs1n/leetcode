package leetcode.easy;

/**
 * @author hsin
 * @see <a href="https://leetcode.com/problems/squares-of-a-sorted-array/">977. Squares of a Sorted Array</a>
 */
public class SquaresOfASortedArray {

    /**
     * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted
     * in non-decreasing order.
     * <p>
     * Constraints:
     * 1. 1 <= nums.length <= 104
     * 2. -104 <= nums[i] <= 104
     * 3. nums is sorted in non-decreasing order.
     *
     * @param nums an integer array nums sorted in non-decreasing order
     * @return an array of the squares of each number sorted in non-decreasing order.
     */
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;
        int cursor = end;
        while (start <= end) {
            if (Math.abs(nums[start]) >= Math.abs(nums[end])) {
                result[cursor] = nums[start] * nums[start];
                start++;
            } else {
                result[cursor] = nums[end] * nums[end];
                end--;
            }
            cursor--;
        }

        return result;
    }

    public int[] sortedSquaresBruteForce(int[] nums) {
        int[] results = new int[nums.length];
        for (int n = 0; n < results.length; n++) {
            for (int i = 0; i < results.length; i++) {
                if (i < results.length - 1 && Math.abs(nums[i]) > Math.abs(nums[i + 1])) {
                    // Swap
                    nums[i] = nums[i] ^ nums[i + 1];
                    nums[i + 1] = nums[i] ^ nums[i + 1];
                    nums[i] = nums[i] ^ nums[i + 1];
                }

                results[i] = (int) Math.pow(nums[i], 2);
            }
        }

        return results;
    }
}