/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import java.util.HashMap;
import java.util.Map;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

public class Solution503 {
    public int[] nextGreaterElements(int[] nums) {
        if (nums == null || nums.length == 0)
            return new int[0];

        int[] res = new int[nums.length];
        int cnt = 0;
        boolean flag = false;

        for (int i=0;i<nums.length;i++){
            int j = 0;
            if (i + 1 > nums.length - 1)
                j = 0;
            else
                j = i + 1;
            while (i != j){
                if (nums[j] > nums[i]){
                    res[cnt++] = nums[j];
                    flag = true;
                    break;
                }
                j++;

                if (j > nums.length - 1){
                    j = 0;
                }
            }

            if (flag == false)
                res[cnt++] = -1;

            flag = false;
        }

        return res;
    }
}
