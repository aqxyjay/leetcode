import java.util.Arrays;

/**
 * Leetcode 164
 * https://leetcode-cn.com/problems/maximum-gap/
 */
public class Solution_164 {
    public int maximumGap(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            int value = nums[i + 1] - nums[i];
            answer = answer < value ? value : answer;
        }
        return answer;
    }
}
