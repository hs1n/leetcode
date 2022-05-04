package leetcode.easy.ut;

import leetcode.easy.IntersectionOfTwoArrays2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoArrays2Test {
    IntersectionOfTwoArrays2 intersectionOfTwoArrays2 = new IntersectionOfTwoArrays2();

    @Test
    void example01() {
        assertArrayEquals(intersectionOfTwoArrays2.intersect(new int[]{1,2,2,1}, new int[]{2,2}), new int[]{2,2});
    }
    @Test
    void example02() {
        assertArrayEquals(intersectionOfTwoArrays2.intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4}), new int[]{4,9});
    }
    @Test
    void custom01() {
        assertArrayEquals(intersectionOfTwoArrays2.intersect(new int[]{1,3,8,9,3}, new int[]{1,0}), new int[]{1});
    }
}