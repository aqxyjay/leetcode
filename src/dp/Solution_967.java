package dp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/numbers-with-same-consecutive-differences/
 */
public class Solution_967 {
    public int[] numsSameConsecDiff(int N, int K) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, List<Integer>> kNumMap = getKNumMap(K);
        for (int i = 1; i <= 9; i++) {
            ans.addAll(getNums(i, N, kNumMap));
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    private Map<Integer, List<Integer>> getKNumMap(int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int i = 0; i < 10; i++) {
            if (i < k) {
                map.get(i).add(i + k);
            } else {
                map.get(i).add(i - k);
            }
        }
        return map;
    }

    private List<Integer> getNums(int i, int n, Map<Integer, List<Integer>> kNumMap) {
        List<Integer> nums = new ArrayList<>();
        int depth = 0;
        int num = i;
        while (depth < n) {
            int result = (int) (num * Math.pow(10, n));
            List<Integer> neighbors = kNumMap.get(num);
            for (int neighbor : neighbors) {

            }
            depth++
        }
        return null;
    }
}
