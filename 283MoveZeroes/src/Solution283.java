public class Solution283 {
    public void moveZeroes(int[] nums) {
        int indexZero=0;

        for (int i=0;i<nums.length;i++){
            if (nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[indexZero];
                nums[indexZero]=temp;
                indexZero++;
            }
        }
    }
}
