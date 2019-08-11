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

public class Solution {
    public void rotate(int[][] matrix) {
        int[] temp = new int[matrix.length*matrix[0].length];

        int index = 0;
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                temp[index++] = matrix[i][j];
            }
        }

        index = 0;
        for (int i=matrix[0].length-1;i>=0;i--){
            for (int j=0;j<matrix.length;j++){
                matrix[j][i] = temp[index++];
            }
        }
    }
}
