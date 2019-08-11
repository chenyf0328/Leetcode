import java.util.*;

public class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();

        for (String iter: strs){
            char[] splitStrs = iter.toCharArray();
            Arrays.sort(splitStrs);

            // convert char[] to String for map key use
            StringBuilder sb = new StringBuilder();
            String newKey = "";
            for (char charIter: splitStrs){
                sb.append(charIter);
            }
            newKey = sb.toString();

            if (mp.containsKey(newKey)){
                mp.get(newKey).add(iter);
            }
            else{
                List<String> mpList = new ArrayList<>();
                mpList.add(iter);
                mp.put(newKey, mpList);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for (List<String> iter: mp.values()){
            result.add(iter);
        }

        return result;
    }
}
