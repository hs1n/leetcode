package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/pascals-triangle/">118. Pascal's Triangle</a>
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int r = 1; r <= numRows; r++) {
            List<Integer> layer = new ArrayList<>();
            for (int i = 1; i <= r; i++) {
                if (i == 1 || i == r) {
                    layer.add(1);
                } else {
                    int m = result.get(r - 2).get(i - 2);
                    int n = result.get(r - 2).get(i - 1);
                    layer.add(m + n);
                }
            }
            result.add(layer);
        }
        return result;
    }
}