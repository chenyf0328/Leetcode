import java.util.HashSet;
import java.util.Map;

import java.util.List;
import java.util.Set;

public class Solution139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s.length() == 0) return false;

        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;

        //dp[i] true    s.substring(i) true

        for (int i = 0; i < s.length()+1; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
