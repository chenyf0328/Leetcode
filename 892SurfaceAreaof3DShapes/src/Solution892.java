public class Solution892 {
    public int surfaceArea(int[][] grid) {
        int area = 0;
        int zeroPlace = 0;

        for (int i=0;i<grid.length;i++)
            for (int j=0;j<grid[0].length;j++)
                if (grid[i][j] == 0)
                    zeroPlace++;
                else
                    area += (4*grid[i][j]);

        area += 2*(grid.length*grid.length - zeroPlace);

        if (grid.length == 1)
            return area;

        int min = 0;
        for (int i=0;i<grid[0].length;i++){
            int j = 0;
            while (j<grid.length-1){
                if (grid[j][i]<grid[j+1][i])
                    area -= 2*grid[j][i];
                else
                    area -= 2*grid[j+1][i];

                j++;
            }
        }

        for (int i=0;i<grid.length;i++) {
            int j = 0;
            while (j<grid[0].length-1){
                if (grid[i][j]<grid[i][j+1])
                    area -= 2*grid[i][j];
                else
                    area -= 2*grid[i][j+1];

                j++;
            }
        }

        return area;
    }
}
