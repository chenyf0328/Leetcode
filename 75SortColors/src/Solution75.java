public class Solution75 {
    public void sortColors(int[] nums) {
        int red=0;
        int blue=nums.length-1;
        int temp=0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                temp = nums[red];
                nums[red] = nums[i];
                nums[i] = temp;

                red++;
            }
            else if (nums[i] == 2) {
                if (blue>=i) {
                    temp = nums[blue];
                    nums[blue] = nums[i];
                    nums[i] = temp;

                    blue--;
                    i--;
                }
            }
        }
    }
}
