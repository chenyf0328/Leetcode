public class Solution583 {
    public int minDistance(String word1, String word2) {
        if (word1.equals(word2))
            return 0;

        int word1Length = word1.length(), word2Length = word2.length();
        int result = Integer.MIN_VALUE;

        int[][] dp = new int[word1Length+1][word2Length+1];
        for (int i=0;i<=word1Length;i++)
            dp[i][0] = 0;

        for (int i=0;i<=word2Length;i++)
            dp[0][i] = 0;

        for (int i=1;i<=word1Length;i++){
            for (int j=1;j<=word2Length;j++){
                if (word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                    result = Math.max(result, dp[i][j]);
                }
                else
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
            }
        }

        return word1Length + word2Length - 2 * result;
    }
}
