package leetcode.medium;

import leetcode.util.ListNode;

/**
 * @author hsin
 * @see <a href="https://leetcode.com/problems/remove-nth-node-from-end-of-list/">19. Remove Nth Node From End of List</a>
 */

public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode slow = head;
        ListNode fast = head;

        for (int i = 0; i < n; i++) {
            if (fast.next == null) {

                // If count = N i.e. delete the head node
                if (i == n - 1) {
                    head = head.next;
                }

                return head;
            }
            fast = fast.next;
        }

        while (fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        if (slow != null && slow.next != null) {
            slow.next = slow.next.next;
        }
        return head;
    }
}
