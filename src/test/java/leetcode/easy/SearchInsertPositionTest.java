package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {
    SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

    @Test
    void example01() {
        assertEquals(searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5), 2);
    }

    @Test
    void example02() {
        assertEquals(searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 2), 1);
    }

    @Test
    void example03() {
        assertEquals(searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7), 4);
    }
}