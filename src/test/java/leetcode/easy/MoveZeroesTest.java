package leetcode.easy;

import leetcode.easy.MoveZeroes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {
    MoveZeroes moveZeroes = new MoveZeroes();

    @Test
    void example01() {
        int[] input = {0, 1, 0, 3, 12};
        moveZeroes.moveZeroes(input);
        assertArrayEquals(input, new int[]{1, 3, 12, 0, 0});
    }

    @Test
    void example02() {
        int[] input = {0};
        moveZeroes.moveZeroes(input);
        assertArrayEquals(input, new int[]{0});
    }
}