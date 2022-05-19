package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReshapeTheMatrixTest {
    ReshapeTheMatrix reshapeTheMatrix = new ReshapeTheMatrix();

    @Test
    void example01() {
        int[][] actual = {{1, 2}, {3, 4}};
        int[][] expected = {{1, 2, 3, 4}};
        assertArrayEquals(expected, reshapeTheMatrix.matrixReshape(actual, 1, 4));
    }


    @Test
    void example02() {
        int[][] actual = {{1, 2}, {3, 4}};
        int[][] expected = {{1, 2}, {3, 4}};
        assertArrayEquals(expected, reshapeTheMatrix.matrixReshape(actual, 2, 4));
    }
}