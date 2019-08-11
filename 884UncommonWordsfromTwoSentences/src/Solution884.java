import java.util.*;

public class Solution884 {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> words1 = new HashMap<>();
        Map<String, Integer> words2 = new HashMap<>();

        String[] wordsArray1 = A.split(" ");
        String[] wordsArray2 = B.split(" ");

        List<String> resultList = new ArrayList<>();

        for (String iter: wordsArray1)
            if (words1.containsKey(iter))
                words1.put(iter, words1.get(iter)+1);
            else
                words1.put(iter, 1);

        for (String iter: wordsArray2)
            if (words2.containsKey(iter))
                words2.put(iter, words2.get(iter)+1);
            else
                words2.put(iter, 1);

        for (String key: words1.keySet())
            if (words1.get(key) == 1 && !words2.containsKey(key))
                resultList.add(key);

        for (String key: words2.keySet())
            if (words2.get(key) == 1 && !words1.containsKey(key))
                resultList.add(key);

        String[] result = new String[resultList.size()];
        result = resultList.toArray(result);

        return result;
    }
}
