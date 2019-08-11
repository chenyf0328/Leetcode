import java.util.ArrayList;
import java.util.List;

public class Solution442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> dupList=new ArrayList<Integer>();
        int index=0;
        for (int i=0;i<nums.length;i++){
            index=Math.abs(nums[i])-1;
            if (nums[index]<0)
                dupList.add(Math.abs(nums[i]));
            nums[index]=-nums[index];
        }
        return dupList;
    }
}
