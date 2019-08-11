import java.util.Set;
import java.util.TreeSet;

public class Solution888 {
    public int[] fairCandySwap(int[] A, int[] B) {
        int totalA = 0, totalB = 0;
        Set<Integer> set = new TreeSet<>();

        for (int iter: A)
            totalA += iter;

        for (int iter: B) {
            totalB += iter;
            set.add(iter);
        }

        for (int iter: A)
            if (totalA-iter > totalB+iter) {
                if (set.contains((totalA - totalB - 2 * iter) / 2))
                    return new int[]{iter, (totalA - totalB - 2 * iter) / 2};
            }
            else
                if (set.contains((totalB-totalA+2*iter)/2))
                    return new int[]{iter, (totalB-totalA + 2*iter)/2};

        return null;
    }
}
