import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> visited = new HashSet<>();
        Set<String> wordSet = new HashSet<>(wordList);
        int dist = 0;
        visited.add(beginWord);

        while (!visited.contains(endWord)){
            Set<String> temp = new HashSet<>();
            for (String iter: visited){
                for (int i=0;i<iter.length();i++) {
                    for (int j = 'a'; j < 'z'+1; j++) {
                        char[] charArray = iter.toCharArray();
                        charArray[i] = (char)j;
                        String newStr = new String(charArray);
                        if (wordSet.contains(newStr)){
                            wordSet.remove(newStr);
                            temp.add(newStr);
                        }
                    }
                }
            }
            dist++;
            if (temp.size() == 0){
                return 0;
            }

            visited = temp;
        }
        return dist+1;
    }
}
