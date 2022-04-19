package leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @see <a href="https://leetcode.com/problems/contains-duplicate/">217. Contains Duplicate</a>
 */

public class ContainsDuplicate {

    // ~ 40 ms
    public boolean containsDuplicateSlow(int[] nums) {
        return !(Arrays.stream(nums).boxed().collect(Collectors.toSet()).size() == nums.length);
    }

    // ~ 4 ms
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            if (!numSet.add(num)) { // return false if set add failure.
                return true;
            }
        }
        return false;
    }
}