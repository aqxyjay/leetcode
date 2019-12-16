package dp;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/numbers-with-same-consecutive-differences/
 */
public class Solution_967 {
    private List<Integer> ans = new ArrayList<>();

    public int[] numsSameConsecDiff(int N, int K) {
        if (N == 1) {
            return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        }
        for (int i = 1; i <= 9; i++) {
            getNums(i, i, N - 1, K);
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    private void getNums(int num, int pre, int n, int k) {
        if (n <= 0) {
            ans.add(num);
            return;
        }
        for (int i = 0; i <= 9; i++) {
            if (Math.abs(pre - i) == k) {
                getNums(num * 10 + i, i, n - 1, k);
            }
        }
    }
}
