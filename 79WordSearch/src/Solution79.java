public class Solution79 {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if (word.length() == 1) {
                    if (board[i][j] == word.charAt(0))
                        return true;
                }
                else {
                    if (board[i][j] == word.charAt(0)) {
                        visited[i][j] = true;
                        if (helper(board, word, visited, i, j, 1) == true)
                            return true;
                        else
                            visited = new boolean[rows][cols];
                    }
                }
            }
        }

        return false;
    }

    private boolean helper(char[][] board, String word, boolean[][] visited,int i, int j, int index){
        int drows[] = new int[]{-1,0,1,0};
        int dcols[] = new int[]{0,1,0,-1};
        for (int k=0;k<4;k++){
            int newRow = i+drows[k];
            int newCol = j+dcols[k];
            if (newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board[0].length) {
                if (visited[newRow][newCol] == false) {
                    if (index == word.length() - 1 && board[newRow][newCol] == word.charAt(index))
                        return true;

                    if (board[newRow][newCol] == word.charAt(index)) {
                        boolean[][] visitedTemp = new boolean[board.length][board[0].length];
                        for(int n = 0;n < visited.length;n++){
                            visitedTemp[n] = visited[n].clone();
                        }
                        visitedTemp[newRow][newCol] = true;
                        if (helper(board, word, visitedTemp, newRow, newCol, index + 1) == true)
                            return true;
                        else
                            continue;
                    }
                }
            }

            if (k == 3)
                return false;
        }

        return false;
    }
}
