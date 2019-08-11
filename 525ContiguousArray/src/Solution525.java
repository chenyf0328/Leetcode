public class Solution525 {
    public int findMaxLength(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return 0;

        int sum = 0;
        int res = 0;

        for (int i=0;i<nums.length;i++)
            if (nums[i] == 0) nums[i] = -1;

        for (int i=0;i<nums.length;i++){
            sum = 0;
            sum += nums[i];
            for (int j=i+1;j<nums.length;j++){
                sum += nums[j];
                if (sum == 0){
                    res = Math.max(res, j-i+1);
                }
            }
        }

        return res;
    }
}
