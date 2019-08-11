import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<Interval> list = new ArrayList<>();
        list.add(new Interval(2,3));
        list.add(new Interval(5,5));
        list.add(new Interval(2,2));
        list.add(new Interval(3,4));
        list.add(new Interval(3,4));
        Solution56 s = new Solution56();
        s.merge(list);
    }
}
