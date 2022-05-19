package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {
    RotateArray rotateArray = new RotateArray();
    @Test
    void example01() {
        int[] expected = new int[]{1,2,3,4,5,6,7};
        rotateArray.rotate(expected, 3);
        assertArrayEquals(new int[]{5,6,7,1,2,3,4}, expected);
    }

    @Test
    void example02() {
        int[] expected = new int[]{-1,-100,3,99};
        rotateArray.rotate(expected, 2);
        assertArrayEquals(new int[]{3,99,-1,-100}, expected);
    }

    @Test
    void custom01() {
        int[] expected = new int[]{-1};
        rotateArray.rotate(expected, 2);
        assertArrayEquals(new int[]{-1}, expected);
    }
    @Test
    void custom02() {
        int[] expected = new int[]{1, 2};
        rotateArray.rotate(expected, 3);
        assertArrayEquals(new int[]{2, 1}, expected);
    }
}