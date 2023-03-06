package leetcode.easy;

/**
 * @author hsin
 * @see <a href="https://leetcode.com/problems/remove-element/">27. Remove Element</a>
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[r] = nums[i];
                r++;
            }
        }
        return r;
    }
}
