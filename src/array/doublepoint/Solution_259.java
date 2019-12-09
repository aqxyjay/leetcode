package array.doublepoint;

import java.util.Arrays;

/**
 * Leetcode 259
 * https://leetcode-cn.com/problems/3sum-smaller/
 */
public class Solution_259 {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            ans += doublePoint(nums, i + 1, target - nums[i]);
        }
        return ans;
    }

    private int doublePoint(int[] nums, int start, int target) {
        int ans = 0;
        int left = start;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] < target) {
                ans += right - left;
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }
}
