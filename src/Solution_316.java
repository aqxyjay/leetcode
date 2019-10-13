/**
 * Leetcode 316
 * https://leetcode-cn.com/problems/remove-duplicate-letters/
 */
public class Solution_316 {
    public String removeDuplicateLetters(String s) {
        if (s == null) {
            return null;
        }
        if (s.length() == 0) {
            return "";
        }
        int[] count = new int[26];
        int pos = 0;
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(pos)) {
                pos = i;
            }
            if (--count[s.charAt(i) - 'a'] == 0) {
                break;
            }
        }
        String ch = String.valueOf(s.charAt(pos));
        String remainCh = s.substring(pos + 1).replaceAll(ch, "");
        return ch + removeDuplicateLetters(remainCh);
    }
}
