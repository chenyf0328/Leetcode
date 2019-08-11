import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> time = new ArrayList<>();
        time.add("01:01");
        time.add("02:01");

        Solution539 s = new Solution539();
        s.findMinDifference(time);
    }
}
