public class Solution33 {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length-1;

        while(start <= end){
            int mid = (start+end)/2;

            if (target == nums[mid]){
                return mid;
            }
            else if (nums[mid]>nums[start]){
                if (target >= nums[start] && target<=nums[mid-1]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else if (nums[mid]<nums[end]){
                if (target >= nums[mid+1] && target <= nums[end]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else{
                start = mid + 1;
            }
        }

        return -1;
    }
}
