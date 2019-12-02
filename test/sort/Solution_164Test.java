package sort;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_164Test {
    private Solution_164 solution = new Solution_164();

    @Test
    public void test001() {
        int[] nums = {10};
        int result = solution.maximumGap(nums);
        assertEquals(0, result);
    }

    @Test
    public void test002() {
        int[] nums = {3, 6, 9, 1};
        int result = solution.maximumGap(nums);
        assertEquals(3, result);
    }
}