package leetcode.medium;

import leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthNodeFromEndOfListTest {
    RemoveNthNodeFromEndOfList testClass = new RemoveNthNodeFromEndOfList();

    @Test
    void example01() {
        ListNode input = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        ListNode expected = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(5))));
        assertEquals(testClass.removeNthFromEnd(input, 2).toString(), expected.toString());
    }
    @Test
    void example02() {
        ListNode input = new ListNode(1,new ListNode(2));
        ListNode expected = new ListNode(1);
        assertEquals(testClass.removeNthFromEnd(input, 1).toString(), expected.toString());
    }
}