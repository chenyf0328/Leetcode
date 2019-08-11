public class MySolution200 {
    public int numIslands(char[][] grid) {
            if (grid == null || grid.length == 0 || grid[0].length == 0)
                return 0;

            int result = 0;
            boolean[][] visited = new boolean[grid.length][grid[0].length];

            for (int i=0;i<grid.length;i++){
                for (int j=0;j<grid[0].length;j++){
                    if (grid[i][j] == '1' && visited[i][j] == false) {
                        bfs(grid, visited, i, j);
                        result++;
                    }
                }
            }

            return result;
    }

    public void bfs(char[][] grid, boolean[][] visited, int i, int j){
        if (i<grid.length && i>=0 && j<grid[0].length && j>=0 && visited[i][j] == false && grid[i][j] == '1') {
            visited[i][j] = true;

            bfs(grid, visited, i, j+1);
            bfs(grid, visited, i + 1, j);
            bfs(grid, visited, i, j-1);
            bfs(grid, visited, i - 1, j);
        }
    }
}
