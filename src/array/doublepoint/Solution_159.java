package array.doublepoint;

import java.util.*;

/**
 * Leetcode 169
 * https://leetcode-cn.com/problems/longest-substring-with-at-most-two-distinct-characters/
 */
public class Solution_159 {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int len = s.length();
        if (len < 3) {
            return len;
        }

        int left = 0;
        int right = 0;
        Map<Character, Integer> map = new HashMap<>();
        int ans = 2;

        while (right < len) {
            if (map.size() < 3) {
                map.put(s.charAt(right), right++);
            }
            if (map.size() == 3) {
                int index = Collections.min(map.values());
                map.remove(s.charAt(index));
                left = index + 1;
            }
            ans = Math.max(ans, right - left);
        }

        return ans;
    }
}
