/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

/** \brief Conway's Life game, becasue we need to do it in the initial board, so I use 0 means original dead and dead after generation.
 *                                                                                     1 means original live and dead after generation
 *                                                                                     2 means dead -> live
 *                                                                                     3 means live -> live
 *
 *  \param     
 *
 *  \returns        
 */

public class Solution289 {
    private int width = 0;
    private int height = 0;

    public void gameOfLife(int[][] board) {
        height = board.length;
        width = board[0].length;

        for (int i=0;i<height;i++){
            for (int j=0;j<width;j++){

                // current live cell
                if (board[i][j] == 1){
                    if (countNeighbors(board, i,j) <= 1)
                        board[i][j] = 1;
                    else if (countNeighbors(board, i,j) > 3)
                        board[i][j] = 1;
                    else
                        board[i][j] = 3;
                }
                else{
                    if (countNeighbors(board, i,j) == 3)
                        board[i][j] = 2;
                }
            }
        }

        for (int i=0;i<height;i++) {
            for (int j = 0; j < width; j++) {
                if (board[i][j] == 2 || board[i][j] == 3)
                    board[i][j] = 1;
                else
                    board[i][j] = 0;
            }
        }
    }

    public int countNeighbors(int[][] board, int r, int c ) {
        int cntLive = 0;
        int[] dr = new int[]{-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = new int[]{-1, 0, 1, -1, 1, -1, 0, 1};

        //check the cells which are living around current cell
        for (int direc = 0; direc < 8; direc++)
            if (((r+dr[direc])>=0 && (r+dr[direc])<height) && ((c+dc[direc])>=0 && (c+dc[direc])< width))
                if (board[r + dr[direc]][c + dc[direc]] == 1 || board[r + dr[direc]][c + dc[direc]] == 3)
                    cntLive++;

        return cntLive;
    }
}
