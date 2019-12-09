package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_259Test {
    private Solution_259 s = new Solution_259();

    @Test
    public void test001() {
        int[] nums = {-2, 0, 1, 3};
        assertEquals(2, s.threeSumSmaller(nums, 2));
    }
}