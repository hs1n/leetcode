package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaresOfASortedArrayTest {
    SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();

    @Test
    void example01() {
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, squaresOfASortedArray.sortedSquares(new int[]{-4, -1, 0, 3, 10}));
    }

    @Test
    void example02() {
        assertArrayEquals(new int[]{4, 9, 9, 49, 121}, squaresOfASortedArray.sortedSquares(new int[]{-7, -3, 2, 3, 11}));
    }

    @Test
    void custom01() {
        assertArrayEquals(new int[]{1}, squaresOfASortedArray.sortedSquares(new int[]{1}));
    }

    @Test
    void custom02() {
        assertArrayEquals(new int[]{1}, squaresOfASortedArray.sortedSquares(new int[]{-1}));
    }
}