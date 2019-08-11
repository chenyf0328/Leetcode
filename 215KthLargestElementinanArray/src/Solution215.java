import java.util.PriorityQueue;
import java.util.Queue;

public class Solution215 {
    public static int findKthLargest(int[] nums, int k) {
        Queue<Integer> pq=new PriorityQueue<Integer>();
        for (Integer iter: nums)
            pq.offer(iter);
        for (int i=0;i<nums.length-k;i++){
            pq.poll();
        }
        return pq.poll();
    }

    public static void main(String[] args) {
        System.out.print(findKthLargest(new int[]{3,2,1,5,6,4},3));
    }
}
