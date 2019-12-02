package array.slidewindow;

/**
 * Leetcode 1176 member
 * https://leetcode-cn.com/problems/diet-plan-performance/
 */
public class Solution_1176 {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int ans = 0;
        int sum = 0;
        int n = calories.length;

        for (int i = 0; i < n; ++i) {
            sum += calories[i];
            if (i >= k) {
                sum -= calories[i - k];
            }
            if (i >= k - 1) {
                if (sum < lower) {
                    ans--;
                } else if (sum > upper) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
