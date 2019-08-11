import java.util.Arrays;

public class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE;
        int closetSum = 0;

        Arrays.sort(nums);

        for (int i=0;i<nums.length-2;i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int temp_closestSum = nums[i] + nums[left] + nums[right];
                int temp_diff = Math.abs(temp_closestSum - target);

                if (temp_diff < diff) {
                    closetSum = temp_closestSum;
                    diff = temp_diff;
                }

                if (temp_closestSum < target)
                    left++;
                else if (temp_closestSum > target)
                    right--;
                else
                    return target;
            }
        }
        return closetSum;
    }
}
