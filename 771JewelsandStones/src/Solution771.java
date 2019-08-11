import java.util.HashMap;
import java.util.Map;

public class Solution771 {
    public int numJewelsInStones(String J, String S) {
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i=0;i<S.length();i++){
            if (map.containsKey(S.charAt(i)))
                map.put(S.charAt(i), map.get(S.charAt(i))+1);
            else
                map.put(S.charAt(i), 1);
        }

        for (int i=0;i<J.length();i++){
            if (map.containsKey(J.charAt(i)))
                result += map.get(J.charAt(i));
        }

        return result;
    }
}
