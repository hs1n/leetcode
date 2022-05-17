package leetcode.medium;

import java.sql.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @see <a href="https://leetcode.com/problems/valid-sudoku/">36. Valid Sudoku</a>
 */

public class ValidSudoku {
    private static final int BOARD_WIDTH = 9;

    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Integer>> rowMap = new HashMap<>(9);
        Map<Integer, Set<Integer>> columnMap = new HashMap<>(9);
        Map<Integer, Set<Integer>> squareMap = new HashMap<>(9);

        if (board.length != BOARD_WIDTH || board[0].length != BOARD_WIDTH)
            throw new IllegalArgumentException("Board size not valid");

        for (int i = 0; i < BOARD_WIDTH; i++) {
            for (int j = 0; j < BOARD_WIDTH; j++) {
                if (board[i][j] != '.') {
                    int s = (i / 3) * 3 + j / 3;

                    rowMap.putIfAbsent(i, new HashSet<>(9));
                    columnMap.putIfAbsent(j, new HashSet<>(9));
                    squareMap.putIfAbsent(s, new HashSet<>(9));

                    int n = board[i][j] - '0';

                    if (!rowMap.get(i).add(n) || !columnMap.get(j).add(n) || !squareMap.get(s).add(n))
                        return false;
                }
            }
        }
        return true;
    }
}