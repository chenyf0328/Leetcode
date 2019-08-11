import java.util.*;

public class Solution253 {
    public int minMeetingRooms(Interval[] intervals) {
        if (intervals.length == 0)
            return 0;
        if (intervals.length == 1)
            return 1;

        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        int rooms = 1;

        Arrays.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval arg0,Interval arg1){
                Integer a = arg0.start;
                Integer b = arg1.start;
                int temp=Integer.compare(a,b);
                return temp;
            }
        });

        minPQ.offer(intervals[0].end);
        for (int i=0;i<intervals.length-1;i++){
            if (minPQ.size() != 0) {
                if (intervals[i + 1].start < minPQ.peek()) {
                    rooms++;
                    minPQ.offer(intervals[i + 1].end);
                } else {
                    minPQ.poll();
                    minPQ.offer(intervals[i+1].end);
                }
            }
            else{
                minPQ.offer(intervals[i+1].end);
            }
        }

        return rooms;
    }
}
