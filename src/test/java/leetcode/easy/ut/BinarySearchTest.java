package leetcode.easy.ut;

import leetcode.easy.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    BinarySearch binarySearch = new BinarySearch();

    @Test
    void example01() {
        assertEquals(binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 9), 4);
    }

    @Test
    void example02() {
        assertEquals(binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 2), -1);
    }

    @Test
    void custom01() {
        assertEquals(binarySearch.search(new int[]{5}, 5), 0);
    }

    @Test
    void custom02() {
        assertEquals(binarySearch.search(new int[]{2, 5}, 2), 0);
    }
}