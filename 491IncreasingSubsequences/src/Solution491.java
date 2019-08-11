import java.util.*;

public class Solution491 {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        List<Integer> holder = new ArrayList<>();
        findSubsequence(res,holder,0,nums);
        List ans = new ArrayList(res);
        return ans;
    }
    private void findSubsequence(Set<List<Integer>> res,List<Integer>  holder,int index, int[] nums){
        if(holder.size() >= 2){
            res.add(new ArrayList(holder));
        }
        for(int i = index;i<nums.length;i++){
            if(holder.size()==0 || holder.get(holder.size()-1) <= nums[i]){
                holder.add(nums[i]);
                findSubsequence(res,holder,i+1,nums);
                holder.remove(holder.size()-1);
            }
        }
    }
}
