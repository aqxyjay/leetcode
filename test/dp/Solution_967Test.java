package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_967Test {
    private Solution_967 s = new Solution_967();

    @Test
    public void test001() {
        int[] output = {181, 292, 707, 818, 929};
        assertArrayEquals(output, s.numsSameConsecDiff(3, 7));
    }

    @Test
    public void test002() {
        int[] output = {10, 12, 21, 23, 32, 34, 43, 45, 54, 56, 65, 67, 76, 78, 87, 89, 98};
        assertArrayEquals(output, s.numsSameConsecDiff(2, 1));
    }
}