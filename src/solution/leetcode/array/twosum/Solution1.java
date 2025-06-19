package solution.leetcode.array.twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (indexMap.containsKey(key)) {
                int index = indexMap.get(key);
                return new int[] {index, i};
            }
            indexMap.put(nums[i], i);
        }
        throw new IllegalStateException("두 수의 합이 target이 되는 경우가 존재하지 않습니다.");
    }
}
