package array;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution_1243Test {

    private Solution_1243 solution = new Solution_1243();

    @Test
    public void test001() {
        int[] input = {6, 2, 3, 4};
        List<Integer> output = List.of(6, 3, 3, 4);
        assertEquals(output, solution.transformArray(input));
    }

    @Test
    public void test002() {
        int[] input = {1, 6, 3, 4, 3, 5};
        List<Integer> output = List.of(1, 4, 4, 4, 4, 5);
        assertEquals(output, solution.transformArray(input));
    }
}