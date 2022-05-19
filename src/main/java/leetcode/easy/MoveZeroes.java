package leetcode.easy;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/move-zeroes/">283. Move Zeroes</a>
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int pointer = 0;

        for (int n : nums) {
            if (n != 0) nums[pointer++] = n;
        }
        while (pointer < nums.length) nums[pointer++] = 0;
    }
}