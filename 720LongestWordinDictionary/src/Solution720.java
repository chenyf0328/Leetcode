import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution720 {
    public String longestWord(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        List<String> temp = new ArrayList<>();
        boolean flag = false;

        for (String iter: words)
            map.put(iter, 1);

        for (String iter: words){
            flag = false;
            for (int i=0;i<iter.length();i++){
                if (!map.containsKey(iter.substring(0,i+1))) {
                    flag = true;
                    break;
                }
            }

            if (flag == true)
                continue;

            if (temp.size() == 0)
                temp.add(iter);

            if (temp.get(temp.size()-1).length() == iter.length())
                temp.add(iter);
            else if (temp.get(temp.size()-1).length()<iter.length()) {
                temp.clear();
                temp.add(iter);
            }
        }

        String result = "";
        for (String iter: temp){
            if (result == "")
                result = iter;
            else{
                if (result.equals(iter))
                    continue;

                for (int i=0;i<result.length();i++){
                    if (result.charAt(i)>iter.charAt(i)) {
                        result = iter;
                        break;
                    }
                    if (result.charAt(i)<iter.charAt(i))
                        break;
                }
            }
        }

        return result;
    }
}
