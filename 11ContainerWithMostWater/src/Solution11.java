public class Solution11 {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int maxArea = 0;


        while(left < right){
            int area = (right -left)*Math.min(height[left], height[right]);
            if (area > maxArea)
                maxArea = area;

            if (height[left] < height[right]) {
                left++;
            }
            else{
                right--;
            }
        }

        return maxArea;
    }
}
