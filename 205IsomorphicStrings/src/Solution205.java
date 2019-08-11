import java.util.HashMap;
import java.util.Map;

public class Solution205 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Character> mp = new HashMap<>();
        Map<Character, Character> mp2 = new HashMap<>();

        char[] chararray = s.toCharArray();
        char[] chararray2 = t.toCharArray();

        for (int pt = 0; pt<chararray.length;pt++){
            if (mp.containsKey(chararray[pt])){
                if (mp.get(chararray[pt]) != t.charAt(pt)){
                    return false;
                }
            }
            else{
                mp.put(chararray[pt], t.charAt(pt));
            }
        }

        for (int pt = 0; pt<chararray2.length;pt++){
            if (mp2.containsKey(chararray2[pt])){
                if (mp2.get(chararray2[pt]) != s.charAt(pt)) {
                    return false;
                }
            }
            else{
                mp2.put(chararray2[pt], s.charAt(pt));
            }
        }

        return true;
    }
}
