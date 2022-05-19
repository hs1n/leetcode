package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {
    SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

    @Test
    void example01() {
        assertEquals(2, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5));
    }

    @Test
    void example02() {
        assertEquals(1, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 2));
    }

    @Test
    void example03() {
        assertEquals(4, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7));
    }
}