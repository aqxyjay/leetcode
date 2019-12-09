package array.doublepoint;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Solution_1213Test {
    private Solution_1213 s = new Solution_1213();

    @Test
    public void test001() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 5, 7, 9};
        int[] arr3 = {1, 3, 4, 5, 8};
        List<Integer> output = Arrays.asList(1, 5);
        assertEquals(output, s.arraysIntersection(arr1, arr2, arr3));
    }
}