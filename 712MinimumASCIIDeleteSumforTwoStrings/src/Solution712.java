public class Solution712 {
    public int minimumDeleteSum(String s1, String s2) {
        int s1_length = s1.length();
        int s2_length = s2.length();

        int[][] dp = new int[s1_length+1][s2_length+1];
        dp[0][0] = 0;

        for (int i=1;i<=s1_length;i++){
            dp[i][0] = dp[i-1][0] + (int)s1.charAt(i-1);
        }
        for (int i=1;i<=s2_length;i++){
            dp[0][i] = dp[0][i-1] + (int)s2.charAt(i-1);
        }

        for (int i=1;i<=s1_length;i++) {
            for (int j=1;j<=s2_length;j++) {
                int addition = 0;
                addition = s1.charAt(i-1) == s2.charAt(j-1) ? 0 : (int)s1.charAt(i-1) + (int)s2.charAt(j-1);

                dp[i][j] = Math.min(dp[i-1][j] + (int)s1.charAt(i-1), Math.min(dp[i][j-1] + (int)s2.charAt(j-1), dp[i-1][j-1] + addition));
            }
        }

        return dp[s1_length][s2_length];
    }
}
