package solution.leetcode.linkedlist.reverselinkedlist2;

import types.leetcode.ListNode;

public class Solution2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        ListNode root = new ListNode();
        root.next = head;

        ListNode start = root;
        for (int i = 1; i < left; i++) {
            start = start.next;
        }

        ListNode end = start.next;
        for (int i = 0; i < right - left; i++) {
            ListNode tmp = start.next;
            start.next = end.next;
            end.next = end.next.next;
            start.next.next = tmp;
        }

        return root.next;
    }
}
