public class Solution807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] rowMax = new int[grid.length];
        int[] colMax = new int[grid[0].length];
        int maxNum = 0;
        int sum = 0;

        for (int i=0;i<grid.length;i++){
            maxNum = grid[i][0];
            for (int j=0;j<grid[i].length;j++){
                if (maxNum < grid[i][j])
                    maxNum = grid[i][j];
            }
            rowMax[i] = maxNum;
        }

        for (int j=0;j<grid[0].length;j++){
            maxNum = grid[0][j];
            for (int i=0;i<grid.length;i++){
                if (maxNum < grid[i][j])
                    maxNum = grid[i][j];
            }
            colMax[j] = maxNum;
        }

        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[i].length;j++){
                sum += Math.min(rowMax[i],colMax[j]) - grid[i][j];
            }
        }

        return sum;
    }
}