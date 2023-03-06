package leetcode.easy;

/**
 * @author hsin
 * @see <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">26. Remove Duplicates from Sorted Array</a>
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        } else if (nums.length > 1 && nums.length <= 30000) {
            int r = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[r] != nums[i]) {
                    r++;
                    nums[r] = nums[i];
                }
            }
            return r + 1;
        } else {
            throw new IllegalArgumentException("int[] length error");
        }
    }
}