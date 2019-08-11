import java.util.HashSet;

public class Solution136 {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for (int n : nums)
            if (hs.contains(n))
                hs.remove(n);
            else
                hs.add(n);
        return (int)hs.toArray()[0];
    }
}
