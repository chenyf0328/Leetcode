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

public class Solution944 {
    public int minDeletionSize(String[] A) {
        int cnt = 0;

        if (A == null || A.length == 0 || A.length == 1)
            return cnt;

        for (int i=0;i<A[0].length();i++){
            for (int j=0;j<A.length - 1;j++){
                if (A[j].charAt(i) > A[j + 1].charAt(i)){
                    cnt++;
                    break;
                }
            }
        }

        return cnt;
    }
}
