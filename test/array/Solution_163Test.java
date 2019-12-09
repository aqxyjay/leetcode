package array;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Solution_163Test {
    private Solution_163 s = new Solution_163();

    @Test
    public void test001() {
        int[] nums = {0, 1, 3, 5, 75};
        int lower = 0;
        int upper = 99;
        List<String> output = Arrays.asList("2", "4->49", "51->74", "76->99");
        assertTrue(output.equals(s.findMissingRanges(nums, lower, upper)));
    }
}