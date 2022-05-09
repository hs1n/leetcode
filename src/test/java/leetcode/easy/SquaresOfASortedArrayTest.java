package leetcode.easy;

import leetcode.easy.SquaresOfASortedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaresOfASortedArrayTest {
    SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();

    @Test
    void example01() {
        assertArrayEquals(squaresOfASortedArray.sortedSquares(new int[]{-4, -1, 0, 3, 10}), new int[]{0, 1, 9, 16, 100});
    }

    @Test
    void example02() {
        assertArrayEquals(squaresOfASortedArray.sortedSquares(new int[]{-7, -3, 2, 3, 11}), new int[]{4, 9, 9, 49, 121});
    }

    @Test
    void custom01() {
        assertArrayEquals(squaresOfASortedArray.sortedSquares(new int[]{1}), new int[]{1});
    }

    @Test
    void custom02() {
        assertArrayEquals(squaresOfASortedArray.sortedSquares(new int[]{-1}), new int[]{1});
    }
}