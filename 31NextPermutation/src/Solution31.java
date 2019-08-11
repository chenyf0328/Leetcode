public class Solution31 {
    public static void nextPermutation(int[] nums) {
        int indexChange=-1;
        for (int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                indexChange=i-1;
                break;
            }
        }

        if (indexChange==-1) {
            int temp=0;
            for (int i=0;i<nums.length;i++){
                for (int j=0;j<nums.length-i-1;j++){
                    if (nums[j]>nums[j+1]){
                        temp=nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                    }
                }
            }
        }
        else{
            int temp=0;
            swapNumIndex(nums,indexChange);
            for (int i=0;i<nums.length-indexChange-2;i++){
                for (int j=indexChange+1;j<nums.length-i-1;j++) {
                    if (nums[j]>nums[j+1]){
                        temp=nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                    }
                }
            }
        }
    }

    public static void swapNumIndex(int[] nums, int indexChange){
        int temp=0;
        if (indexChange+1!=nums.length-1) {
            for (int i = nums.length-1; i >= indexChange+1; i--) {
                if (nums[i]>nums[indexChange]) {
                    temp = nums[indexChange];
                    nums[indexChange] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
        }
        else{
            temp = nums[indexChange];
            nums[indexChange] = nums[indexChange+1];
            nums[indexChange+1] = temp;
        }
    }

    public static void main(String[] args) {
        nextPermutation(new int[]{1,3,2});
    }
}
