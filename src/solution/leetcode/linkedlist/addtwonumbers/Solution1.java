package solution.leetcode.linkedlist.addtwonumbers;

import types.leetcode.ListNode;

public class Solution1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(), node = root;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            if (carry != 0) {
                sum += carry;
            }
            carry = sum / 10;
            node.next = new ListNode(sum % 10);
            node = node.next;
        }
        return root.next;
    }
}
