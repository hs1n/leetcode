package leetcode.easy.ut;

import leetcode.easy.ReshapeTheMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReshapeTheMatrixTest {
    ReshapeTheMatrix reshapeTheMatrix = new ReshapeTheMatrix();

    @Test
    void example01() {
        int[][] input = {{1, 2}, {3, 4}};
        int[][] result = {{1, 2, 3, 4}};
        assertArrayEquals(reshapeTheMatrix.matrixReshape(input, 1, 4), result);
    }


    @Test
    void example02() {
        int[][] input = {{1, 2}, {3, 4}};
        int[][] result = {{1, 2}, {3, 4}};
        assertArrayEquals(reshapeTheMatrix.matrixReshape(input, 2, 4), result);
    }
}