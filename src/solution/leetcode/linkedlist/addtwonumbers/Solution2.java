package solution.leetcode.linkedlist.addtwonumbers;

import java.math.BigInteger;

import types.leetcode.ListNode;

public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1_reversed = reverseList(l1);
        ListNode l2_reversed = reverseList(l2);
        BigInteger result = toBigInt(l1_reversed).add(toBigInt(l2_reversed));
        return toReversedList(result);
    }

    private ListNode reverseList(ListNode node) {
        ListNode prev = null;
        while (node != null) {
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }

    private BigInteger toBigInt(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            head = head.next;
        }
        return new BigInteger(sb.toString());
    }

    private ListNode toReversedList(BigInteger num) {
        ListNode prev = null, node = null;
        for (char ch : String.valueOf(num).toCharArray()) {
            node = new ListNode(Character.getNumericValue(ch), prev);
            prev = node;
        }
        return node;
    }
}
