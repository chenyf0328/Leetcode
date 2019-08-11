public class Solution547 {
    // way 1: 并查集
    public int findCircleNum(int[][] M) {
        int n = M.length;
        //建立并查集
        int[] root = new int[n];
        for(int i = 0; i < n; i++){
            root[i] = i;
        }
        int count = n;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                int ti = i, tj = j;
                if(M[ti][tj] == 1){
                    while(root[ti] != ti)   ti = root[ti];
                    while(root[tj] != tj)   tj = root[tj];
                    if(ti == tj)    continue;
                    //合并
                    root[ti] = tj;
                    count--;
                }
            }
        }
        return count;
    }

    /*
    DFS

    public int findCircleNum(int[][] M) {
        boolean[] visited = new boolean[M.length];
        int count = 0;
        for (int i = 0; i < M.length; i++) {
            if (!visited[i]) {
                dfs(M, visited, i);
                count++;
            }
        }
        return count;
    }

    private void dfs(int[][] M, boolean[] visited, int i){
        for (int j = 0; j < M.length; j++) {
            if (M[i][j] == 1 && !visited[j]) {
                visited[j] = true;
                dfs(M, visited, j);
            }
        }
    }
    */
}
