public class Solution704 {
    public int search(int[] nums, int target) {
        int begin = 0, end = nums.length - 1;
        int point = 0;

        while (begin <= end){
            point = (begin + end)/2;
            if (nums[point] == target)
                return point;
            else if (nums[point]>target)
                end = point - 1;
            else
                begin = point + 1;
        }

        return -1;
    }
}
