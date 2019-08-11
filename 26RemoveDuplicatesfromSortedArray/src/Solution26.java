public class Solution26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int length = 1;
        int pastNum = nums[0];

        for (int i=1;i<nums.length;i++){
            if (nums[i] == pastNum){
                continue;
            }
            else{
                nums[length] = nums[i];
                length++;
                pastNum = nums[i];
            }
        }

        return length;
    }
}
