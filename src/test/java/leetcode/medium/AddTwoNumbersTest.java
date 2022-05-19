package leetcode.medium;

import leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTwoNumbersTest {
    private static final AddTwoNumbers testClass = new AddTwoNumbers();

    @Test
    void example01() {
        ListNode input1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode input2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));
        assertEquals(testClass.addTwoNumbers(input1, input2).toString(), expected.toString());
    }

    @Test
    void example02() {
        ListNode input1 = new ListNode(0);
        ListNode input2 = new ListNode(0);
        ListNode expected = new ListNode(0);
        assertEquals(testClass.addTwoNumbers(input1, input2).toString(), expected.toString());
    }
}