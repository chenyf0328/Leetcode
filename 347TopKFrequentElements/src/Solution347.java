import java.util.*;

public class Solution347 {
    class Pair{
        private int num;
        private int sum;
        public Pair(int num, int sum){
            this.num = num;
            this.sum = sum;
        }
        public int getNum(){
            return this.num;
        }
        public int getSum(){
            return this.sum;
        }
    }

    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int iter: nums){
            if (mp.containsKey(iter))
                mp.put(iter, mp.get(iter)+1);
            else
                mp.put(iter, 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>(){
            public int compare(Pair a, Pair b){
                return b.getSum() - a.getSum();
            }
        });

        for (int iter: mp.keySet()){
            pq.add(new Pair(iter, mp.get(iter)));
        }

        for (int i=0;i<k;i++){
            result.add(pq.poll().getNum());
        }

        return result;
    }
}
