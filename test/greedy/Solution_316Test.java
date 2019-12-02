package greedy;

import greedy.Solution_316;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_316Test {

    private Solution_316 solution = new Solution_316();

    @Test
    public void test001() {
        String result = solution.removeDuplicateLetters("bcabc");
        assertEquals("abc", result);
    }

    @Test
    public void test002() {
        String result = solution.removeDuplicateLetters("cbacdcbc");
        assertEquals("acdb", result);
    }
}