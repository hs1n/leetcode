package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInAString3Test {
    ReverseWordsInAString3 reverseWordsInAString3 = new ReverseWordsInAString3();

    @Test
    void example01() {
        String input = "Let's take LeetCode contest", expected = "s'teL ekat edoCteeL tsetnoc";
        assertEquals(expected, reverseWordsInAString3.reverseWordsByStringBuilder(input));
        assertEquals(expected, reverseWordsInAString3.reverseWordsByPrimitiveDataType(input));
    }

    @Test
    void example02() {
        String input = "God Ding", expected = "doG gniD";
        assertEquals(expected, reverseWordsInAString3.reverseWordsByStringBuilder(input));
        assertEquals(expected, reverseWordsInAString3.reverseWordsByPrimitiveDataType(input));
    }
}