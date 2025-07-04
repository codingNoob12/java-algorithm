package solution.leetcode.array.trappingrainwater;

public class Solution1 {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int storedWater = 0;
        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            if (leftMax <= rightMax) {
                storedWater += leftMax - height[left];
                left++;
            } else {
                storedWater += rightMax - height[right];
                right--;
            }
        }
        return storedWater;
    }
}
