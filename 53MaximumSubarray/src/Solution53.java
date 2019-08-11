public class Solution53 {
    public static int maxSubArray(int[] nums) {
//        int n=nums.length;
//        int[][] dp=new int[n][n];
//        int maxSum=Integer.MIN_VALUE;
//
//        for (int i=n-1;i>=0;i--){
//            for (int j=i;j<n;j++){
//                if (j==0)
//                    dp[i][j]=nums[j];
//                else
//                    dp[i][j]=dp[i][j-1]+nums[j];
//                if (dp[i][j]>maxSum) {
//                    maxSum=dp[i][j];
//                }
//            }
//        }
//
//        return maxSum;

        int n=nums.length;
        int maxSum=Integer.MIN_VALUE;
        int sum=0;

        for (int i=0;i<n;i++){
            if (sum>=0)
                sum+=nums[i];
            else
                sum=nums[i];
            if (sum>maxSum)
                maxSum=sum;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] testCase={1,2};
        maxSubArray(testCase);
    }
}
