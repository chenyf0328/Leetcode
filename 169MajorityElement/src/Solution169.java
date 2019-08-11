import java.util.HashMap;
import java.util.Iterator;

public class Solution169 {
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hp=new HashMap<>();

        for (int i=0;i<nums.length;i++){
            hp.put(nums[i],0);
        }

        for (int i=0;i<nums.length;i++)
            hp.put(nums[i],hp.get(nums[i])+1);

        for (int i=0;i<nums.length;i++){
            if (hp.get(nums[i])>(nums.length/2))
                return nums[i];
        }

        return 0;
    }

    public static void main(String[] args) {
        majorityElement(new int[]{1,2,3,1,1,1,4});
    }
}
