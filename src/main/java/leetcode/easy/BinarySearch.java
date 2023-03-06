package leetcode.easy;

/**
 * @author hsin
 * @see <a href="https://leetcode.com/problems/binary-search/">704. Binary Search</a>
 */
public class BinarySearch {

    /**
     * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to
     * search target in nums. If target exists, then return its index. Otherwise, return -1.
     * <p>
     * You must write an algorithm with O(log n) runtime complexity.
     * <p>
     * Constraints:
     * <p>
     * 1. 1 <= nums.length <= 104
     * 2. -104 < nums[i], target < 104
     * 3. All the integers in nums are unique.
     * 4. nums is sorted in ascending order.
     * <p>
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search.
     * Memory Usage: 54.7 MB, less than 26.34% of Java online submissions for Binary Search.
     *
     * @param nums   integers nums which is sorted in ascending order
     * @param target search target in nums
     * @return If target exists, then return its index. Otherwise, return -1
     */
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (end >= start) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}