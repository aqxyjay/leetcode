package array.doublepoint;

import java.util.ArrayList;
import java.util.List;

public class Solution_1213 {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0, j = 0, k = 0; i < arr1.length && j < arr2.length && k < arr3.length; i++, j++, k++) {
            int a = arr1[i];
            int b = arr2[j];
            int c = arr3[k];
            if (a == b && a == c) {
                resultList.add(a);
            }
            if (a > b || a > c) {
                i--;
            }
            if (b > a || b > c) {
                j--;
            }
            if (c > a || c > b) {
                k--;
            }
        }
        return resultList;
    }
}
