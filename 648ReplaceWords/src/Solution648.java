import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution648 {
    public String replaceWords(List<String> dict, String sentence) {
        String result = "";
        String[] splitStr = sentence.split(" ");
        Map<String, Integer> map = new HashMap<>();
        boolean flag = false;

        for (String iter: dict)
            map.put(iter, 1);

        for (String iter: splitStr){
            flag = false;

            for (int i=0;i<iter.length();i++){
                if (map.containsKey(iter.substring(0, i))) {
                    result += iter.substring(0, i) + " ";
                    flag = true;
                    break;
                }
            }
            if (flag == false)
                result += iter + " ";
        }

        return result.substring(0, result.length()-1);
    }
}
