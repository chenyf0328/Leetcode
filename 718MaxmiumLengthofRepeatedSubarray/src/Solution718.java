public class Solution718 {
    public int findLength(int[] A, int[] B) {
        if (A.length == 0 || B.length==0)
            return 0;

        int minSize = 0;
        if (A.length < B.length)
            minSize = A.length;
        else
            minSize = B.length;

        int[][] dp = new int[minSize+1][minSize+1];
        int result = 0;
        for (int i=0;i<=minSize;i++){
            dp[0][i] = 0;
            dp[i][0] = 0;
        }

        for (int i=1;i<=minSize;i++){
            for (int j=1;j<=minSize;j++) {
                if (A[i - 1] == B[j - 1])
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = 0;

                if (result < dp[i][j])
                    result = dp[i][j];
            }
        }

        return result;
    }
}
