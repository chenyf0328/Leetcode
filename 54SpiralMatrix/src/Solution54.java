import java.util.ArrayList;
import java.util.List;

public class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0)
            return new ArrayList<>();

        List<Integer> result = new ArrayList<>();
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];

        int r = 0, c = 0;
        int num = 0;

        while (true) {
            while (c < matrix[0].length && visited[r][c] != true) {
                result.add(matrix[r][c]);
                visited[r][c] = true;
                num++;
                if (num == matrix.length*matrix[0].length)
                    return result;
                c++;
            }
            c--;

            r++;
            while (r < matrix.length && visited[r][c] != true) {
                result.add(matrix[r][c]);
                visited[r][c] = true;
                num++;
                if (num == matrix.length*matrix[0].length)
                    return result;
                r++;
            }
            r--;

            c--;
            while (c >= 0 && visited[r][c] != true) {
                result.add(matrix[r][c]);
                visited[r][c] = true;
                num++;
                if (num == matrix.length*matrix[0].length)
                    return result;
                c--;
            }
            c++;

            r--;
            while (visited[r][c] != true) {
                result.add(matrix[r][c]);
                visited[r][c] = true;
                num++;
                if (num == matrix.length*matrix[0].length)
                    return result;
                r--;
            }
            r++;
            c++;
        }
    }
}
