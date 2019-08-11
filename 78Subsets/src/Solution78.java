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

/*
    Time complexity: O(2^n)
    Space complexity: O(n)
 */
public class Solution78 {

    public List<List<Integer>> subsets(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), nums, 0);
        return ans;
    }

    private void backtrack(List<List<Integer>> ans, List<Integer> list, int[] nums, int index) {

        ans.add(new ArrayList<>(list));

        for(int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            backtrack(ans, list, nums, i+1);
            list.remove(list.size() - 1);
        }

        return;
    }

}
