package solution.leetcode.string.reorderdatainlogfiles;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public String[] reorderLogFiles(String[] logs) {
        List<String> letterLogs = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();
        for (String log : logs) {
            String[] parts = log.split(" ", 2);
            if (Character.isDigit(parts[1].charAt(0))) {
                digitLogs.add(log);
            } else {
                letterLogs.add(log);
            }
        }

        letterLogs.sort((s1, s2) -> {
            String[] ps1 = s1.split(" ", 2);
            String[] ps2 = s2.split(" ", 2);
            int compare = ps1[1].compareTo(ps2[1]);
            if (compare == 0) {
                return ps1[0].compareTo(ps2[0]);
            }
            return compare;
        });

        letterLogs.addAll(digitLogs);
        return letterLogs.toArray(new String[0]);
    }
}
