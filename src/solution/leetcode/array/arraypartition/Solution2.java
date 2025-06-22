package solution.leetcode.array.arraypartition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution2 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        List<Integer> pair = new ArrayList<>();
        int sum = 0;
        for (int num : nums) {
            pair.add(num);
            if (pair.size() == 2) {
                sum += Collections.min(pair);
                pair.clear();
            }
        }
        return sum;
    }
}
