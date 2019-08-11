import java.util.*;

public class Solution819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] strSplit = paragraph.split(" ");
        Map<String, Integer> mp = new HashMap<>();
        Set<String> set = new HashSet<>();

        for (String iter: strSplit){
            if (!((iter.charAt(iter.length()-1)>=65 && iter.charAt(iter.length()-1)<=90) || (iter.charAt(iter.length()-1)>=97 && iter.charAt(iter.length()-1)<=122))){
                iter = iter.substring(0, iter.length()-1);
            }

            iter = iter.toLowerCase();

            if (mp.containsKey(iter))
                mp.put(iter, mp.get(iter)+1);
            else
                mp.put(iter, 1);
        }

        for (String iter: banned)
            set.add(iter);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(mp.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (int) (o2.getValue()-o1.getValue() );
            }
        });

        for (int i=0;i<list.size();i++){
            if (!set.contains(list.get(i).getKey()))
                return list.get(i).getKey();
        }

        return null;
    }
}
