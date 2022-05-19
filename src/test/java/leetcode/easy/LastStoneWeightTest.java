package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastStoneWeightTest {
    LastStoneWeight lastStoneWeight = new LastStoneWeight();
    @Test
    void example01() {
            assertEquals(1, lastStoneWeight.lastStoneWeight(new int[]{2,7,4,1,8,1}));
    }
    @Test
    void example02() {
        assertEquals(1, lastStoneWeight.lastStoneWeight(new int[]{1}));
    }
}