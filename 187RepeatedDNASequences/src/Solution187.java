import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution187 {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> answer = new ArrayList<>();
        Map<Integer, Integer> mp = new HashMap<>();
        int key = 0;
        int pt = 0, dpt = 0;

        while((pt + 9) < s.length()){
            dpt++;
            key = (key << 3) | ((s.charAt(pt+dpt-1) & 0x7) & 0x3ffffff);
            if (dpt < 10)
                continue;

            if (mp.get(key) == null){
                mp.put(key, 1);
            }
            else if (mp.get(key) != 2){
                answer.add(s.substring(pt, pt+10));
                mp.put(key, 2);
            }

            key = 0;
            dpt = 0;
            pt++;
        }

        return answer;
    }
}
