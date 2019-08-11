import java.util.Vector;

public class TwoSum {
    public int[] solution(int[] nums, int target) {
        boolean judgeBreak = false;
        int sum = 0;
        int index0 = 0, index1 = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    index0 = i;
                    index1 = j;
                    judgeBreak = true;
                }
            }
            if (judgeBreak == true) {
                break;
            }
        }
        return new int[]{index0, index1};
    }

//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//
//    }
}
