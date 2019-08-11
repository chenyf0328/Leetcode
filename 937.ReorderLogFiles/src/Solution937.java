/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import java.util.Arrays;
import java.util.Comparator;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

/*
    Time complexity: O(nlogn)
    Space complexity: O(n)
 */

public class Solution937 {
    public String[] reorderLogFiles(String[] logs) {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                int i1 = str1.indexOf(' ');
                int i2 = str2.indexOf(' ');
                char c1 = str1.charAt(i1+1);
                char c2 = str2.charAt(i2+1);

                if (c1 <= '9'){
                    return c2 <= '9' ? 0 : 1;
                }
                else if (c2 <= '9'){
                    return -1;          // 这边不能返回0， 因为返回零的话代表str1 和str2相同，那之后这两个数就不会都参与比较了，会有问题。所以返回-1,0,1要严格按照小于等于大于来做
                }
                else{
                    String strSubStr1 = str1.substring(i1+1, str1.length());
                    String strSubStr2 = str2.substring(i2+1, str2.length());
                    if (strSubStr1.compareTo(strSubStr2) == 0)
                        return str1.substring(0, i1).compareTo(str2.substring(0, i2));
                    return strSubStr1.compareTo(strSubStr2);
                }
            }
        };

        Arrays.sort(logs, comparator);
        return logs;
    }
}
