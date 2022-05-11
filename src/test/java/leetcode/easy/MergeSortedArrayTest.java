package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {
    MergeSortedArray mergeSortedArray = new MergeSortedArray();

    @Test
    void example01() {
        customTest(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3, new int[]{1, 2, 2, 3, 5, 6});
    }

    @Test
    void example02() {
        customTest(new int[]{1}, 1, new int[]{}, 0, new int[]{1});
    }

    @Test
    void example03() {
        customTest(new int[]{0}, 0, new int[]{1}, 1, new int[]{1});
    }

    @Test
    void exception01() {
        customTest(new int[]{2, 0}, 1, new int[]{1}, 1, new int[]{1, 2});
    }

    @Test
    void custom01() {
        customTest(new int[]{1, 2, 3, 3, 5, 0, 0}, 5, new int[]{1, 2}, 2, new int[]{1, 1, 2, 2, 3, 3, 5});
    }

    @Test
    void custom02() {
        customTest(new int[]{4, 0, 0, 0, 0, 0}, 1, new int[]{1, 2, 3, 5, 6}, 5, new int[]{1, 2, 3, 4, 5, 6});
    }

    private void customTest(int[] nums1, int m, int[] nums2, int n, int[] answer) {
        mergeSortedArray.merge(nums1, m, nums2, n);
        assertArrayEquals(nums1, answer);
    }
}
