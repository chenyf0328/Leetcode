import java.util.*;

public class Solution373 {

    class Pairs{
        int[] pairs = new int[2];

        public Pairs(int num1, int num2){
            pairs[0] = num1;
            pairs[1] = num2;
        }

        public int getSum(){
            return pairs[0] + pairs[1];
        }

        public int[] getPairs(){
            return pairs;
        }

    }

    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<int[]> result = new ArrayList<>();

        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0)
            return result;

        Queue<Pairs> pairsQueue = new PriorityQueue(new Comparator<Pairs>(){
            public int compare(Pairs pairs1, Pairs pairs2){
                return pairs1.getSum() - pairs2.getSum();
            }
        });

        for (int i=0;i<nums1.length;i++) {
            for (int j = 0; j < nums2.length; j++) {
                Pairs newPair = new Pairs(nums1[i], nums2[j]);
                pairsQueue.add(newPair);
            }
        }

        for (int i=0;i<k;i++) {
            if (i >= nums1.length * nums2.length)
                break;

            result.add(pairsQueue.poll().getPairs());
        }
        return result;
    }
}
