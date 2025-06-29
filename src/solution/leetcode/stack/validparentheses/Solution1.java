package solution.leetcode.stack.validparentheses;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> table = new HashMap<>() {{
            put(')', '(');
            put('}', '{');
            put(']', '[');
        }};
        for (char c : s.toCharArray()) {
            if (!table.containsKey(c)) {
                stack.push(c);
            } else if (stack.isEmpty() || stack.pop() != table.get(c)
            ) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
