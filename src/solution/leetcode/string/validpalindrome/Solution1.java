package solution.leetcode.string.validpalindrome;

public class Solution1 {
    public boolean isPalindrome(String s) {
        String converted = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String reversed = new StringBuilder(converted).reverse().toString();
        return converted.equals(reversed);
    }
}
