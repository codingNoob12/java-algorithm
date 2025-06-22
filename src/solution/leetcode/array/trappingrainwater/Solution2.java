package solution.leetcode.array.trappingrainwater;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution2 {
    public int trap(int[] height) {
        Deque<Integer> stack = new ArrayDeque<>();
        int totalStoredWater = 0;
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[stack.peek()] <= height[i]) {
                int top = stack.pop();

                if (stack.isEmpty()) {
                    break;
                }

                int level = Math.min(height[stack.peek()], height[i]);
                int dist = i - stack.peek() - 1;
                int storedWater = dist * (level - height[top]);
                totalStoredWater += storedWater;
            }
            stack.push(i);
        }
        return totalStoredWater;
    }
}
