/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

/*
    Time complexity: O(n^3)
 */
public class Solution18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        Map<List<Integer>, Integer> map = new HashMap<>();

        for (int i=0;i<nums.length - 2;i++){
            for (int j=i+1;j<nums.length - 1;j++){
                int begin = j + 1;
                int end = nums.length - 1;

                while(begin < end) {
                    int cur = nums[i] + nums[j] + nums[begin] + nums[end];
                    if (cur == target) {
                        List<Integer> tmp = new ArrayList<>();
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[begin]);
                        tmp.add(nums[end]);
                        if (!map.containsKey(tmp)){
                            result.add(tmp);
                            map.put(tmp, 1);
                        }
                        begin++;
                        end--;
                    } else if (cur > target) {
                        end--;
                    } else {
                        begin++;
                    }
                }
            }
        }

        return result;
    }
}
