package array.slidewindow;

/**
 * Leetcode 1151
 * https://leetcode-cn.com/problems/minimum-swaps-to-group-all-1s-together/solution/c-yi-ci-chuang-kou-bian-li-by-da-li-wang/
 */
public class Solution_1151 {
    public int minSwaps(int[] data) {
        int sum = 0;
        int num = 0;
        int ans = data.length;

        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }

        if (sum <= 1) {
            return 0;
        }

        for (int i = 0; i < data.length; i++) {
            if (data[i] == 1) {
                num++;
            }
            if (i >= sum - 1) {
                ans = Math.min(ans, sum - num);
                num -= (data[i - sum + 1] == 1 ? 1 : 0); // slide to right
            }
        }
        return ans;
    }
}
