package array;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Leetcode 1133
 * https://leetcode-cn.com/problems/largest-unique-number/
 */
public class Solution_1133 {
    public int largestUniqueNumber(int[] A) {
        List<Integer> numbers = Arrays.stream(A).boxed().collect(Collectors.toList());
        numbers.sort(Comparator.reverseOrder());
        return getFirstMax(numbers, 0);
    }

    private int getFirstMax(List<Integer> numbers, int index) {
        if (index >= numbers.size()) {
            return -1;
        }
        int num = numbers.get(index);
        int lastIndex = numbers.lastIndexOf(num);
        if (lastIndex == index) {
            return num;
        }
        return getFirstMax(numbers, lastIndex + 1);
    }
}
