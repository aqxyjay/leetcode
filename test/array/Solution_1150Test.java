package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_1150Test {
    private Solution_1150 s = new Solution_1150();

    @Test
    public void test001() {
        int[] nums = {2, 4, 5, 5, 5, 5, 5, 6, 6};
        assertTrue(s.isMajorityElement(nums, 5));
    }

    @Test
    public void test002() {
        int[] nums = {10, 100, 101, 101};
        assertFalse(s.isMajorityElement(nums, 101));
    }

    @Test
    public void test003() {
        int[] nums = {198074889, 665397685, 665397685, 665397685};
        assertTrue(s.isMajorityElement(nums, 665397685));
    }
}