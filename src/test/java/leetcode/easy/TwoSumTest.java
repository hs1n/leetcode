package leetcode.easy;

import leetcode.easy.TwoSum;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    private static final TwoSum twoSum = new TwoSum();

    @Nested
    @DisplayName("Brute Force")
    class BruteForceTest {

        @Test
        void example1ByBruteForce() {
            assertArrayEquals(new int[]{0, 1}, twoSum.twoSumByBruteForce(new int[]{2, 7, 11, 15}, 9));
        }

        @Test
        void example2ByBruteForce() {
            assertArrayEquals(new int[]{1, 2}, twoSum.twoSumByBruteForce(new int[]{3, 2, 4}, 6));
        }

        @Test
        void example3ByBruteForce() {
            assertArrayEquals(new int[]{0, 1}, twoSum.twoSumByBruteForce(new int[]{3, 3}, 6));
        }

    }

    @Nested
    @DisplayName("HashMap")
    class HashMapTest {

        @Test
        void example1ByMap() {
            assertArrayEquals(new int[]{0, 1}, twoSum.twoSumByMap(new int[]{2, 7, 11, 15}, 9));
        }

        @Test
        void example2ByMap() {

            assertArrayEquals(new int[]{1, 2}, twoSum.twoSumByMap(new int[]{3, 2, 4}, 6));
        }

        @Test
        void example3ByMap() {
            assertArrayEquals(new int[]{0, 1}, twoSum.twoSumByMap(new int[]{3, 3}, 6));
        }
    }
}