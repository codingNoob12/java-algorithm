package solution.leetcode.linkedlist.swapnodesinpairs;

import types.leetcode.ListNode;

public class Solution3 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(head.next.next);
        next.next = head;
        return next;
    }
}
