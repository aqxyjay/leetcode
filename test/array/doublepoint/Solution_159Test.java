package array.doublepoint;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_159Test {
    private Solution_159 s = new Solution_159();

    @Test
    public void test001() {
        String input = "eceba";
        assertEquals(3, s.lengthOfLongestSubstringTwoDistinct(input));
    }

    @Test
    public void test002() {
        String input = "ccaabbb";
        assertEquals(5, s.lengthOfLongestSubstringTwoDistinct(input));
    }
}