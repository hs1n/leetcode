package leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangleTest {
    PascalsTriangle pascalsTriangle = new PascalsTriangle();

    @Test
    void example01() {

        List<List<Integer>> result = new ArrayList<>();
        result.add(Collections.singletonList(1));
        result.add(Arrays.asList(1, 1));
        result.add(Arrays.asList(1, 2, 1));
        result.add(Arrays.asList(1, 3, 3, 1));
        result.add(Arrays.asList(1, 4, 6, 4, 1));

        assertEquals(pascalsTriangle.generate(5), result);
    }
    @Test
    void example02() {

        List<List<Integer>> result = new ArrayList<>();
        result.add(Collections.singletonList(1));

        assertEquals(pascalsTriangle.generate(1), result);
    }
}