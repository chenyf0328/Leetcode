import java.util.Arrays;

public class Solution561 {
    public int arrayPairSum(int[] nums) {
        int result=0;
//        sort(nums);
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i=i+2){
            result=result+nums[i];
        }
        return result;
    }

    public void sort(int[] nums){
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length-i-1;j++){
                if (nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
}
