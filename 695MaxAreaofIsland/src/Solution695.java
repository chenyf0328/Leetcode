public class Solution695 {
    private int maxArea = 0;
    private int tempMaxArea = 0;

    public int maxAreaOfIsland(int[][] grid) {
        boolean visited[][] = new boolean[grid.length][grid[0].length];

        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                if (visited[i][j] == false) {
                    tempMaxArea = 0;
                    helper(visited, grid, i, j);
                    if (maxArea < tempMaxArea)
                        maxArea = tempMaxArea;
                }
            }
        }

        return maxArea;
    }

    public void helper(boolean[][] visited, int[][] grid, int i, int j){
        if (grid[i][j] == 1 && visited[i][j] == false) {
            visited[i][j] = true;
            tempMaxArea++;

            if (i-1 >= 0)
                helper(visited, grid, i-1, j);

            if (j+1 < grid[0].length)
                helper(visited, grid, i, j+1);

            if (i+1 < grid.length)
                helper(visited, grid, i+1, j);

            if (j-1 >= 0)
                helper(visited, grid, i, j-1);
        }
    }
}
