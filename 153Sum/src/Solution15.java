import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i=0;i<nums.length;i++){
            int begin = i+1, end = nums.length-1;
            int sum = nums[i];

            if (i>0 && nums[i] == nums[i-1])
                continue;

            while(begin < end){
                if (sum + nums[begin] + nums[end] == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[begin]);
                    list.add(nums[end]);
                    result.add(list);

                    begin++;
                    end--;

                    while(begin < nums.length-1){
                        if (nums[begin] == nums[begin-1])
                            begin++;
                        else {
                            break;
                        }
                    }
                }
                else if (sum + nums[begin] + nums[end] > 0)
                    end--;
                else
                    begin++;
            }
        }

        return result;
    }
}
