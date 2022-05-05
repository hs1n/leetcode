package leetcode.easy;

/**
 * @see <a href="https://leetcode.com/problems/rotate-array/">189. Rotate Array</a>
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        int[] tmp = nums.clone();
        k = k % nums.length;
        for (int i = 0; i < tmp.length; i++) {
            if (nums.length - k + i < nums.length) {
                nums[i] = tmp[nums.length - k + i];
            } else {
                nums[i] = tmp[i - k];
            }
        }
    }
}