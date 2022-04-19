package leetcode.easy;

/**
 * @see <a href="https://leetcode.com/problems/search-insert-position/">35. Search Insert Position</a>
 */

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int minIndex = 0, maxIndex = nums.length - 1;

        while (minIndex <= maxIndex) {
            int midIndex = (minIndex + maxIndex) / 2;
            if (nums[midIndex] == target) {
                return midIndex;
            } else if (nums[midIndex] > target) { // target between min and mid
                maxIndex = midIndex - 1; // index of min = mid - 1
            } else {// target between mid and max
                minIndex = midIndex + 1; // index of min = mid + 1
            }
        }
        return minIndex;
    }
}