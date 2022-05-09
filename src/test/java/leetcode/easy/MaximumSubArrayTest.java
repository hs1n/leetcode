package leetcode.easy;

import leetcode.easy.ContainsDuplicate;
import leetcode.easy.MaximumSubArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubArrayTest {
    MaximumSubArray maximumSubArray = new MaximumSubArray();

    @Test
    void example01() {
        assertEquals(maximumSubArray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}), 6);
    }

    @Test
    void example02() {
        assertEquals(maximumSubArray.maxSubArray(new int[]{1}), 1);
    }

    @Test
    void example03() {
        assertEquals(maximumSubArray.maxSubArray(new int[]{5,4,-1,7,8}), 23);
    }
}