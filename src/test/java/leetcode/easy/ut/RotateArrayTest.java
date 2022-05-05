package leetcode.easy.ut;

import leetcode.easy.RotateArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {
    RotateArray rotateArray = new RotateArray();
    @Test
    void example01() {
        int[] input = new int[]{1,2,3,4,5,6,7};
        rotateArray.rotate(input, 3);
        assertArrayEquals(input, new int[]{5,6,7,1,2,3,4});
    }

    @Test
    void example02() {
        int[] input = new int[]{-1,-100,3,99};
        rotateArray.rotate(input, 2);
        assertArrayEquals(input, new int[]{3,99,-1,-100});
    }

    @Test
    void custom01() {
        int[] input = new int[]{-1};
        rotateArray.rotate(input, 2);
        assertArrayEquals(input, new int[]{-1});
    }
    @Test
    void custom02() {
        int[] input = new int[]{1, 2};
        rotateArray.rotate(input, 3);
        assertArrayEquals(input, new int[]{2, 1});
    }
}