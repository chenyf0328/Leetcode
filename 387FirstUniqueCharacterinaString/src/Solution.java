/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import java.util.HashMap;
import java.util.Map;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

public class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i=0;i<s.length();i++){
            char iterChar =  s.charAt(i);
            if (!map.containsKey(iterChar)){
                map.put(iterChar, 1);
            }
            else{
                if (map.get(iterChar) == 1)
                    map.put(iterChar, 2);
                else
                    continue;
            }
        }

        for (int i = 0;i<s.length();i++){
            char iterChar =  s.charAt(i);
            if (map.get(iterChar) == 1)
                return i;
        }

        return -1;
    }
}
