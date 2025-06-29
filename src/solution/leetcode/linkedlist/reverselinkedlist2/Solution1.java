package solution.leetcode.linkedlist.reverselinkedlist2;

import types.leetcode.ListNode;

public class Solution1 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        ListNode root = new ListNode();
        root.next = head;
        ListNode node = root, prev = null;
        for (int i = 0; i < left; i++) {
            prev = node;
            node = node.next;
        }

        ListNode reversePrev = prev, reverseHead = node;
        prev = node;
        node = node.next;

        for (; left < right; left++) {
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }

        reversePrev.next = prev;
        reverseHead.next = node;

        return root.next;
    }
}
