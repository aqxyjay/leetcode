package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/queue-reconstruction-by-height/submissions/
 * 假设有搅乱顺序的一群儿童成一个队列。
 * 每个儿童由一个整数对(w, k)表示，其中 w 是这个儿童的体重，k 是排在这个儿童前面且体重大于或等于 w 的儿童数量。
 * 编写一个算法来重建这个队列。
 * <p>
 * 注意:
 * <p>
 * 总儿童数量少于 1100 人。
 * <p>
 * 输入的数据是合理的，只是顺序给打乱了。
 * <p>
 * 示例
 * <p>
 * 输入:
 * [[8,0], [4,4], [8,1], [5,0], [6,1], [5,2]]
 * <p>
 * 输出:
 * [[5,0], [8,0], [5,2], [6,1], [4,4], [8,1]]
 * <p>
 * 解释:[5,2]前面两个儿童的体重分别是 5 和 8，且只有两个儿童;[6,1]前面只有[8,0]儿童的体重 大于他/她，并且不能和[5,2]换位置，否则会导致[5,2]的 2 不对。
 */
public class Solution_406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]);
        List<int[]> list = new ArrayList<>(people.length);
        for (int[] p : people) {
            list.add(p[1], p);
        }
        return list.toArray(new int[0][0]);
    }
}
