package solution.leetcode.string.mostcommonword;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Solution1 {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph
            .replaceAll("\\W+", " ")
            .toLowerCase()
            .split(" ");

        Set<String> banSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> counter = new HashMap<>();

        for (String word : words) {
            if (banSet.contains(word)) {
                continue;
            }
            int count = counter.getOrDefault(word, 0);
            counter.put(word, count + 1);
        }

        Entry<String, Integer> maxEntry = Collections.max(
            counter.entrySet(), 
            Map.Entry.comparingByValue()
        );
        return maxEntry.getKey();
    }
}
