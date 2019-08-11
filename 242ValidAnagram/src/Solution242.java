/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

import java.util.HashMap;
import java.util.Map;

public class Solution242 {
    public boolean isAnagram(String s, String t) {
        // Solution 1
        /*
        Map<Character, Integer> map = new HashMap<>();

        for (int i=0;i<s.length();i++){
            char cur = s.charAt(i);
            if (map.containsKey(cur))
                map.put(cur, map.get(cur) + 1);
            else
                map.put(cur, 1);
        }

        for (int i=0;i<t.length();i++){
            char cur = t.charAt(i);
            if (map.containsKey(cur)){
                if (map.get(cur) == 1)
                    map.remove(cur);
                else
                    map.put(cur, map.get(cur) - 1);
            }
            else
                return false;
        }

        if (map.isEmpty())
            return true;
        else
            return false;
        */

        // Solution 2: use sort
        String name1="dormitory";
        String name2="dirtyroom";

        char[] chararray1 = name1.toCharArray();
        char[] chararray2 = name2.toCharArray();

        int length1 = chararray1.length;
        int length2 = chararray2.length;

        // Bubble sort
        for (int i=0;i<length1;i++){
            for (int j=0;j<length1-i-1;j++){
                if (chararray1[j]>chararray1[j+1]){
                    char temp = chararray1[j];
                    chararray1[j] = chararray1[j+1];
                    chararray1[j+1] = temp;
                }
            }
        }

        for (int i=0;i<length2;i++){
            for (int j=0;j<length2-i-1;j++){
                if (chararray2[j]>chararray2[j+1]){
                    char temp = chararray2[j];
                    chararray2[j] = chararray2[j+1];
                    chararray2[j+1] = temp;
                }
            }
        }

        // check one element by element
        for (int i=0;i<length1;i++){
            if (chararray1[i] != chararray2[i])
                return false;
        }

        return true;
    }
}
