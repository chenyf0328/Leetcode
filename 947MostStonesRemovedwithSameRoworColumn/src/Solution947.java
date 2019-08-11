/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

/** \brief      
 *
 *  \param     
 *
 *  \returns        
 */

public class Solution947 {
    public int removeStones(int[][] stones) {
        // 元素默认值是false
        boolean[] visited = new boolean[stones.length];

        int result = 0;
        for (int i = 0; i < stones.length; i++) {
            // 如果此位置没有被访问过，并且此位置是岛，就里德广度优先遍历
            if (!visited[i]) {
                result++;
                dfs(stones, visited, i);
            }
        }
        return stones.length - result;
    }

    private void dfs(int[][] stones, boolean[] visited, int index) {
        // 标记此位置已经访问过了
        visited[index] = true;

        for (int i=0;i < stones.length;i++) {
            if (visited[i] == false && index != i) {
                if (stones[index][0] == stones[i][0])
                    dfs(stones, visited, i);
                if (stones[index][1] == stones[i][1])
                    dfs(stones, visited, i);
            }
        }
    }
}
