/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import java.util.List;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

public class Test {
    public static void main(String[] args){
        String[] str = new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        Solution s = new Solution();
        List<String> list = s.subdomainVisits(str);

        for (String iter: list){
            System.out.println(iter);
        }
    }
}
