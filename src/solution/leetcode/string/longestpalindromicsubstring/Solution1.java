package solution.leetcode.string.longestpalindromicsubstring;

public class Solution1 {
    int start = 0;
    int maxLength = 0;

    private void extendPalindrome(String s, int left, int right) {
        while (isValidIndex(s, left, right) && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        int length = right - left - 1;
        if (maxLength < length) {
            maxLength = length;
            start = left + 1;
        }
    }

    private boolean isValidIndex(String s, int left, int right) {
        return left >= 0 && right < s.length();
    }

    public String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            extendPalindrome(s, i, i);
            extendPalindrome(s, i, i + 1);
        }
        return s.substring(start, start + maxLength);
    }
}
