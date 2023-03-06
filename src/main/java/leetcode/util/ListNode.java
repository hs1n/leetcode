package leetcode.util;

/**
 * @author hsin
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
        this.val = Integer.MIN_VALUE;
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String separator = ",";
        sb.append("[");
        if (this.val != Integer.MIN_VALUE) {
            sb.append(this.val);
        }
        while (this.next != null) {
            sb.append(separator).append(next.val);
            this.next = this.next.next;
        }
        sb.append("]");

        return sb.toString();
    }
}
