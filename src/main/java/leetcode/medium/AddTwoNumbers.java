package leetcode.medium;

import leetcode.util.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/add-two-numbers/">2. Add Two Numbers</a>
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode cursor = result;
        int overflow = 0;
        while (l1 != null | l2 != null | overflow > 0) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += overflow;
            cursor.next = new ListNode(sum % 10);
            overflow = sum / 10;

            cursor = cursor.next;

        }
        return result.next;
    }
}
