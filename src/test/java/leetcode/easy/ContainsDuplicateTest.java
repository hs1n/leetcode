package leetcode.easy;

import leetcode.easy.ContainsDuplicate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {
    ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Test
    void example01() {
        assertTrue(containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    @Test
    void example02() {
        assertFalse(containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    @Test
    void example03() {
        assertTrue(containsDuplicate.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}