import java.util.HashMap;
import java.util.Iterator;

public class Solution137 {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hp=new HashMap<>();

        for (int i=0;i<nums.length;i++){
            if (hp.get(nums[i])==null)
                hp.put(nums[i],1);
            else
                hp.put(nums[i], hp.get(nums[i])+1);
        }

        for (int i=0;i<nums.length;i++){
            if (hp.get(nums[i])==1)
                return nums[i];
        }

        return 0;
    }
}
