import java.util.Arrays;

public class Solution611 {
    public int triangleNumber(int[] nums) {
        if (nums.length<3)
            return 0;

        int result = 0;

        Arrays.sort(nums);

        for (int i=0;i<nums.length-2;i++){
            for (int j=i+1;j<nums.length;j++){
                for (int k=j+1;k<nums.length;k++){
                    if (nums[i]+nums[j]<=nums[k])
                        break;
                    else
                        result++;
                }
            }
        }

        return result;
    }
}
