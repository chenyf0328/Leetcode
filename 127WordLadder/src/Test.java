import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        Solution127 s = new Solution127();
        List<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");
        System.out.println(s.ladderLength("hit", "cog",wordList));
    }
}
