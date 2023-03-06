package leetcode.easy;

/**
 * @author hsin
 * @see <a href="https://leetcode.com/problems/merge-sorted-array/">88. Merge Sorted Array</a>
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int c1 = 0;
        int c2 = 0;
        int[] clone1 = nums1.clone();

        for (; i < nums1.length || n == 0; i++) {
            if (m == 0) {
                nums1[i] = nums2[c2++];
            } else if (m > c1 && n > c2) {
                if (clone1[c1] <= nums2[c2]) {
                    nums1[i] = clone1[c1++];
                } else {
                    nums1[i] = nums2[c2++];
                }
            } else {
                break; // c1 or c2 touch limit
            }
        }

        while (m > c1) {
            nums1[i++] = clone1[c1++];
        }

        while (n > c2) {
            nums1[i++] = nums2[c2++];
        }
    }
}