package leetcode.easy;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/reshape-the-matrix/">566. Reshape the Matrix</a>
 */
public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] matrix, int newRow, int newCol) {
        int origCol = matrix[0].length, origRow = matrix.length;

        if (origRow * origCol != newRow * newCol)
            return matrix;

        int[][] result = new int[newRow][newCol];
        int m = 0, n = 0;

        for (int[] mat : matrix) {
            for (int j = 0; j < origCol; j++) {
                result[m][n++] = mat[j];
                if (n == newCol) {
                    n = 0;
                    m++;
                }
            }
        }

        return result;
    }
}