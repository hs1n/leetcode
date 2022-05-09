package leetcode.easy;

import leetcode.easy.RemoveElement;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    private final RemoveElement removeElement = new RemoveElement();

    private void customJudge(int[] nums, int val, int[] expectedNums, int expectedResult) {
        assertEquals(expectedResult, removeElement.removeElement(nums, val));

        Arrays.sort(nums, 0, expectedResult);
        Arrays.sort(expectedNums, 0, expectedResult);
        for (int i = 0; i < expectedResult; i++) {
            assertEquals(nums[i], expectedNums[i]);
        }
    }

    @Test
    void example1() {
        this.customJudge(new int[]{3, 2, 2, 3}, 3, new int[]{2, 2, 0, 0}, 2);
    }

    @Test
    void example2() {
        this.customJudge(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, new int[]{0, 1, 4, 0, 3, 2, 2, 2}, 5);
    }
}