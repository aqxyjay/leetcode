package array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Leetcode 1243
 * https://leetcode-cn.com/problems/array-transformation/
 */
public class Solution_1243 {
    public List<Integer> transformArray(int[] arr) {
        int[] oldArr = arr.clone();
        int[] newArr = arr.clone();
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                newArr[i]++;
            } else if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                newArr[i]--;
            }
        }
        if (!Arrays.equals(oldArr, newArr)) {
            return transformArray(newArr);
        }
        return Arrays.stream(arr).boxed().collect(Collectors.toList());
    }
}
