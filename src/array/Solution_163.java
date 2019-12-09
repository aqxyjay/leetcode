package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode 163
 * https://leetcode-cn.com/problems/missing-ranges/
 */
public class Solution_163 {
    private static final String POINT = "->";

    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> resultList = new ArrayList<>();
        if (nums.length == 0) {
            addList(resultList, (long) lower - 1, (long) upper + 1);
            return resultList;
        }
        int length = nums.length;
        addList(resultList, (long)lower - 1, nums[0]);
        for (int i = 0; i < length - 1; i++) {
            addList(resultList, nums[i], nums[i + 1]);
        }
        addList(resultList, nums[length - 1], (long)upper + 1);
        return resultList;
    }

    private void addList(List<String> list, long start, long end) {
        if (end - start <= 1) {
            return;
        } else if (end - start == 2) {
            list.add(String.valueOf(start + 1));
        } else {
            list.add((start + 1) + POINT + (end - 1));
        }
    }
}
