package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSum2Test {
    TwoSum2 twoSum2 = new TwoSum2();

    @Test
    void example01() {
        assertArrayEquals(new int[]{1, 2}, twoSum2.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void example02() {
        assertArrayEquals(new int[]{1, 3}, twoSum2.twoSum(new int[]{2, 3, 4}, 6));
    }

    @Test
    void example03() {
        assertArrayEquals(new int[]{1, 2}, twoSum2.twoSum(new int[]{-1, 0}, -1));
    }

}