import java.util.*;

public class Solution368 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);

        int[] count = new int[nums.length];
        int max = 0;

        for(int j = 1; j < nums.length; j++) {
            for(int i = 0; i < j; i++) {
                if(nums[j] % nums[i] == 0) {
                    count[j] = Math.max(count[j], count[i] + 1);
                    max = Math.max(max, count[j]);
                }
            }
        }
        for(int i = nums.length-1; i >= 0; i--) {
            if(count[i] == max) {
                if(res.size() < 1) {
                    res.add(nums[i]);
                    max--;
                }
                else if(res.get(res.size()-1)%nums[i] == 0) {
                    res.add(nums[i]);
                    max--;
                }
            }
        }
        return res;
    }
}
