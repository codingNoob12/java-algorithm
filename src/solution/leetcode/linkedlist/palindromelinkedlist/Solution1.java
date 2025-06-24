package solution.leetcode.linkedlist.palindromelinkedlist;

import java.util.ArrayDeque;
import java.util.Deque;

import types.leetcode.ListNode;

public class Solution1 {
    public boolean isPalindrome(ListNode head) {
        Deque<Integer> stack = new ArrayDeque<>();
        ListNode p = head;
        while (p != null) {
            stack.push(p.val);
            p = p.next;
        }

        while (head != null) {
            if (stack.pop() != head.val) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
