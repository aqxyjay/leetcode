package dp;

/**
 * https://leetcode-cn.com/problems/maximum-subarray/
 */
public class Solution_53 {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        int max = nums[0];

        for (int i = 1; i < n; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            max = Math.max(max, sum);
        }
        return max;
    }
}
