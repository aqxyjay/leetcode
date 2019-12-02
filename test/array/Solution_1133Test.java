package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_1133Test {
    private Solution_1133 s = new Solution_1133();

    @Test
    public void test001() {
        int[] input = {5, 7, 3, 9, 4, 9, 8, 3, 1};
        assertEquals(8, s.largestUniqueNumber(input));
    }

    @Test
    public void test002() {
        int[] input = {9, 9, 8, 8};
        assertEquals(-1, s.largestUniqueNumber(input));
    }

    @Test
    public void test003() {
        int[] input = {11, 10, 11};
        assertEquals(10, s.largestUniqueNumber(input));
    }
}