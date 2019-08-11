import java.util.*;

public class Solution56 {
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.size()==0)
            return new ArrayList<>();

        if (intervals.size() == 1)
            return intervals;

        Map<Integer, Interval> map = new HashMap<>();
        List<Interval> result = new ArrayList<>();

        for (Interval iter: intervals) {
            if (map.containsKey(iter.start)){
                if (iter.end > map.get(iter.start).end)
                    map.put(iter.start, iter);
                else
                    continue;
            }
            map.put(iter.start, iter);
        }

        List<Map.Entry<Integer, Interval>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Interval>>() {
            public int compare(Map.Entry<Integer, Interval> o1, Map.Entry<Integer, Interval> o2) {
                return (int) (o1.getKey()-o2.getKey());
            }
        });

        if (list.size() == 1) {
            result.add(list.get(0).getValue());
            return result;
        }
        else {
            if ((list.get(1).getValue().start <= list.get(0).getValue().end)){
                if (list.get(1).getValue().end >= list.get(0).getValue().end)
                    result.add(new Interval(list.get(0).getValue().start, list.get(1).getValue().end));
                else
                    result.add(list.get(0).getValue());
            }
            else{
                result.add(list.get(0).getValue());
                result.add(list.get(1).getValue());
            }
            for (int i = 2; i < list.size(); i++) {
                if ((list.get(i).getValue().start <= result.get(result.size()-1).end)){
                    if (list.get(i).getValue().end >= result.get(result.size()-1).end) {
                        result.add(new Interval(result.get(result.size()-1).start, list.get(i).getValue().end));
                        result.remove(result.size() - 2);
                    }
                }
                else
                    result.add(list.get(i).getValue());
            }
        }

        return result;
    }
}
