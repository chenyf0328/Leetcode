public class Solution832 {
    public int[][] flipAndInvertImage(int[][] A) {
        int rowSize = A[0].length;

        for (int i=0;i<A.length;i++){
            for (int j=0; j<A[i].length/2;j++){
                int temp = A[i][j];
                A[i][j] = A[i][rowSize - 1 - j];
                A[i][rowSize - 1 - j] = temp;
            }

            for (int j=0; j<A[i].length;j++){
                if (A[i][j]==0)
                    A[i][j] = 1;
                else
                    A[i][j] = 0;
            }
        }

        return A;
    }
}
