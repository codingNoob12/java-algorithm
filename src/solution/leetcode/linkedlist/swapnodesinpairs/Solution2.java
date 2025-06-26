package solution.leetcode.linkedlist.swapnodesinpairs;

import types.leetcode.ListNode;

public class Solution2 {
    public ListNode swapPairs(ListNode head) {
        ListNode node = head;
        while (node != null && node.next != null) {
            int tmp = node.val;
            node.val = node.next.val;
            node.next.val = tmp;

            node = node.next.next;
        }
        return head;
    }
}
