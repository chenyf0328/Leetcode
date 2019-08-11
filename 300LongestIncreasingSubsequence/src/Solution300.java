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

public class Solution300 {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0)
            return 0;

        int maxLength = 0;
        int numsLength = nums.length;
        int[] dp = new int[numsLength];

        for (int i=numsLength-1;i>=0;i--){
            for (int j=i;j<numsLength;j++){
                if (nums[i]<nums[j])
                    dp[i] = Math.max(dp[i], dp[j]+1);
                maxLength = Math.max(maxLength, dp[i]);
            }
        }

        return maxLength+1;
    }
}
