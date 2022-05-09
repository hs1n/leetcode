package leetcode.easy;

import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int pointer = 0;

        for (int n : nums) {
            if (n != 0) nums[pointer++] = n;
        }
        while (pointer < nums.length) nums[pointer++] = 0;

        System.out.println(Arrays.toString(nums));
    }
}