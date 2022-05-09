package leetcode.easy;

import leetcode.easy.RemoveDuplicatesFromSortedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    private final RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

    @Test
    void example01() {
        examination(new int[]{1, 1, 2}, new int[]{1, 2});
    }

    @Test
    void example02() {
        examination(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, new int[]{0, 1, 2, 3, 4});
    }

    private void examination(int[] nums, int[] expectedNums) {
        int k = removeDuplicatesFromSortedArray.removeDuplicates(nums);
        assertEquals(k, expectedNums.length);
        for (int i = 0; i < k; i++) {
            assertEquals(nums[i], expectedNums[i]);
        }
    }
}