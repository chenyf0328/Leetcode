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

public class TestCompare {
    public static void main(String[] args) {
        String[] str = new String[]{"ab 9 4", "acd bsa", "ab 82"};

        Solution937 s = new Solution937();
        System.out.println(Arrays.toString(s.reorderLogFiles(str)));
    }
}
