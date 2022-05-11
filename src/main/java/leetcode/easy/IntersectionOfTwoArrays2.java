package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/intersection-of-two-arrays-ii/">350. Intersection of Two Arrays II</a>
 */
public class IntersectionOfTwoArrays2 {
    /**
     * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
     * Runtime: 6 ms, faster than 28.14% of Java online submissions for Intersection of Two Arrays II.
     * Memory Usage: 43.7 MB, less than 57.39% of Java online submissions for Intersection of Two Arrays II.
     *
     * @param nums1 first input int array
     * @param nums2 second input int array
     * @return an array of their intersection
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] larger, smaller;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if (nums1.length > nums2.length) {
            larger = nums1;
            smaller = nums2;
        } else {
            larger = nums2;
            smaller = nums1;
        }

        ArrayList<Integer> tmp = new ArrayList<>();
        for (int i = 0, j = 0; i < larger.length && j < smaller.length; ) {
            if (larger[i] == smaller[j]) {
                tmp.add(larger[i]);
                i++;
                j++;
            } else if (larger[i] > smaller[j]) {
                j++;
            } else { // larger[i] < smaller[j]
                i++;
            }
        }
        return tmp.stream().mapToInt(k -> k).toArray();
    }

    /*
     * What if the given array is already sorted? How would you optimize your algorithm?
     * What if nums1's size is small compared to nums2's size? Which algorithm is better?
     * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
     */
}