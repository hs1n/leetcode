package leetcode.easy;

import java.util.*;

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">1. Two Sum</a>
 */
public class TwoSum {
    public int[] twoSumByBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException();
    }

    public int[] twoSumByMap(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for (int index = 0; index < nums.length; index++) {
            if (hashMap.containsKey(nums[index])) {
                return new int[]{hashMap.get(nums[index]), index};
            } else {
                hashMap.put(target - nums[index], index);
            }
        }
        throw new IllegalArgumentException();
    }
}
