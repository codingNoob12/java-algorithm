package solution.leetcode.linkedlist.swapnodesinpairs;

import types.leetcode.ListNode;

public class Solution1 {
    public ListNode swapPairs(ListNode head) {
        ListNode root = new ListNode();
        root.next = head;

        ListNode p = root, q = root.next;
        while (q != null && q.next != null) {
            ListNode r = q.next;

            p.next = r;
            q.next = r.next;
            r.next = q;

            p = q;
            q = p.next;
        }

        return root.next;
    }
}
