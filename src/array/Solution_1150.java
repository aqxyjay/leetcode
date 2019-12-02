package array;

import java.util.Arrays;

/**
 * Leetcode 1150
 * https://leetcode-cn.com/problems/check-if-a-number-is-majority-element-in-a-sorted-array/
 */
public class Solution_1150 {
    public boolean isMajorityElement(int[] nums, int target) {
        long amount = Arrays.stream(nums).parallel().filter(num -> num == target).count();
        long others = nums.length - amount;
        if (others == 0) {
            return true;
        }
        return (double) amount / others > 1;
    }
}
