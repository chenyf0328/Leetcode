/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import java.util.ArrayList;
import java.util.List;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();

        if (nums == null || nums.length == 0)
            return result;

        if (nums.length == 1){
            result.add(nums[0]);
            return result;
        }

        int num1 = nums[0], num2 = 0;
        int cnt1 = 1, cnt2 = 0;

        for (int i=0;i<nums.length;i++){
            int cur = nums[i];
            if (cur == num1)
                cnt1++;
            else if (cur == num2)
                cnt2++;
            else if (cnt1 == 0){
                num1 = cur;
                cnt1 = 1;
            }
            else if (cnt2 == 0){
                num2 = cur;
                cnt2 = 1;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;

        for (int i=0;i<nums.length;i++){
            if (nums[i] == num1)
                cnt1++;
            else if (nums[i] == num2)
                cnt2++;
        }

        if (cnt1 > nums.length/3)
            result.add(num1);

        if (cnt2 > nums.length/3)
            result.add(num2);

        return result;
    }
}
