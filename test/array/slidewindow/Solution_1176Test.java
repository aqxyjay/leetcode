package array.slidewindow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_1176Test {
    private Solution_1176 solution = new Solution_1176();

    @Test
    public void test001() {
        int[] calories = {1, 2, 3, 4, 5};
        assertEquals(0, solution.dietPlanPerformance(calories, 1, 3, 3));
    }

    @Test
    public void test002() {
        int[] calories = {6, 5, 0, 0};
        assertEquals(0, solution.dietPlanPerformance(calories, 2, 1, 5));
    }
}