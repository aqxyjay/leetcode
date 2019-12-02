package array.slidewindow;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_1151Test {
    private Solution_1151 solution = new Solution_1151();

    @Test
    public void test001() {
        int[] input = {0, 0, 0, 1, 0};
        assertEquals(0, solution.minSwaps(input));
    }

    @Test
    public void test002() {
        int[] input = {1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1};
        assertEquals(3, solution.minSwaps(input));
    }

    @Test
    public void test003() {
        int[] input = {1, 0, 1, 0, 1};
        assertEquals(1, solution.minSwaps(input));
    }
}