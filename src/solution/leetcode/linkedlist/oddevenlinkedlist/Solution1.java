package solution.leetcode.linkedlist.oddevenlinkedlist;

import types.leetcode.ListNode;

public class Solution1 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode oddHead = head, evenHead = head.next;
        ListNode odd = oddHead, even = evenHead;
        while (even != null && even.next != null) {
            odd.next = even.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;

        return oddHead;
    }
}
