package greedy;

import org.junit.Test;

import java.util.Arrays;

public class Solution406Test {
    private Solution_406 d = new Solution_406();

    @Test
    public void test001() {
        int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        int[][] result = d.reconstructQueue(people);
        for (int[] ints : result) {
            System.out.println(Arrays.toString(ints));
        }
    }

    @Test
    public void test002() {
        int[][] people = {{9, 0}, {7, 0}, {1, 9}, {3, 0}, {2, 7}, {5, 3}, {6, 0}, {3, 4}, {6, 2}, {5, 2}};
        int[][] result = d.reconstructQueue(people);
        for (int[] ints : result) {
            System.out.println(Arrays.toString(ints));
        }
    }
}