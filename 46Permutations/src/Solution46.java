import java.util.ArrayList;
import java.util.List;

public class Solution46 {
    public static List<List<Integer>> permute(int[] nums) {
        List<Integer> perList=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        generatePer(nums,perList,result);
        return result;
    }

    public static void generatePer(int[] nums, List<Integer> perList, List<List<Integer>> result){
        if (perList.size()==nums.length){
            if (!result.contains(perList)){
                result.add(new ArrayList<Integer>(perList));                //result.add(perList); add的是地址，所以要new出来
            }
        }
        else {
            for (int i = 0; i < nums.length; i++) {
                if (!perList.contains(nums[i])) {
                    perList.add(nums[i]);
                    generatePer(nums, perList, result);
                    perList.remove(perList.size() - 1);
                }
                else
                    continue;
            }
        }
    }

    public static void main(String[] args) {
        permute(new int[]{1,2,3});
    }
}
