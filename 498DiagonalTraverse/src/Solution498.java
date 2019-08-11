public class Solution498 {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null)
            return null;

        if (matrix.length == 0)
            return null;

        int row = matrix.length;
        int col = matrix[0].length;
        int[] result = new int[row*col];

        if (row == 1 && col == 1) {
            result[0] = matrix[0][0];
            return result;
        }

        int sum = 0;
        if (row == 1){
            for (int iter: matrix[0]){
                result[sum++] = iter;
            }
            return result;
        }

        if (col == 1){
            for (int i=0;i<row;i++){
                result[sum++] = matrix[i][0];
            }
            return result;
        }

        int i=0, j=0;
        boolean dire = true;           // 方向：true: right/up  false: left/down

        while (!(i == row-1 && j == col-1)){
            result[sum++] = matrix[i][j];

            if (dire){
                if (i == 0 || i == row-1){
                    if (i==0){
                        if (j != col-1) {
                            j++;
                            dire = !dire;
                            continue;
                        }
                        else{
                            if (col % 2 == 0) {
                                i++;
                                j--;
                                dire = !dire;
                                continue;
                            }
                            else{
                                i++;
                                dire = !dire;
                                continue;
                            }
                        }
                    }
                    else {
                        if (j+1 == col-1 && i == row-1){
                            j++;
                            continue;
                        }
                        else {
                            j++;
                            i--;
                            continue;
                        }
                    }
                }
                else{
                    i--;
                    j++;
                    continue;
                }
            }
            else{
                if (j == 0 || j == col-1){
                    if (j == col-1){
                        if (i != 0) {
                            i++;
                            j--;
                            dire = !dire;
                            continue;
                        }
                        else{
                            if (col % 2 == 0){
                                i++;
                                j--;
                                //dire = !dire;
                                continue;
                            }
                            else{
                                i++;
                                dire = !dire;
                                continue;
                            }
                        }
                    }
                    else {
                        if (i != row-1) {
                            i++;
                            continue;
                        }
                        else{
                            if (row % 2 ==0){
                                j++;
                                dire = !dire;
                                continue;
                            }
                            else{
                                i--;
                                j++;
                                dire = !dire;
                                continue;
                            }
                        }
                    }
                }
                else{
                    i++;
                    j--;
                    continue;
                }
            }
        }

        result[sum++] = matrix[i][j];

        return result;
    }
}

// Accepted Solution
/*
boolean up = true;
        if (matrix.length == 0) return new int[0];
        int[] res = new int[matrix.length * matrix[0].length];
        int i = 0;
        int j = 0;
        for (int k = 0; k < matrix.length * matrix[0].length; k++) {
            res[k] = matrix[i][j];
            if (up) {// 往右上走
                if ((i-1) >= 0 && (j+1) < matrix[0].length) {
                    i--;
                    j++;
                } else if ((j+1) < matrix[0].length) {
                    j++;
                    up = false;
                } else if ((i+1) < matrix.length) {
                    i++;
                    up = false;
                } else break;
            } else {// 往左下走
                if ((i+1) < matrix.length && (j-1) >= 0) {
                    i++;
                    j--;
                } else if ((i+1) < matrix.length) {
                    i++;
                    up = true;
                } else if ((j+1) < matrix[0].length) {
                    j++;
                    up = true;
                } else break;
            }
        }
        return res;
 */