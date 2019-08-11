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
    public int subarraySum(int[] nums, int k) {
        int cnt = 0;
        int nums_length = nums.length;
        int[] sum = new int[nums_length];
        sum[0] = nums[0];

        if (nums[0]==k)
            cnt++;

        for (int i=1;i<nums_length;i++) {
            sum[i] += sum[i - 1] + nums[i];
            if (sum[i] == k)
                cnt++;
        }

        for (int i=1;i<nums_length;i++){
            if (nums[i] == k)
                cnt++;

            for (int j=i+1;j<nums_length;j++){
                int current = 0;
                if (i==j)
                    current = nums[i];
                else
                    current = sum[j] - sum[i-1];

                if (current == k)
                    cnt++;
            }
        }

        return cnt;
    }
}
