package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {
    MoveZeroes moveZeroes = new MoveZeroes();

    @Test
    void example01() {
        int[] actual = {0, 1, 0, 3, 12};
        moveZeroes.moveZeroes(actual);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, actual);
    }

    @Test
    void example02() {
        int[] actual = {0};
        moveZeroes.moveZeroes(actual);
        assertArrayEquals(new int[]{0}, actual);
    }
}