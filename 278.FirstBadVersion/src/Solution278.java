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

/*
    Time complexity: O(logn)
    Space complexity: O(1)

    Tips: mid = (head + tail) / 2 may cause overflow. We should use mid = head + (tail - head) / 2 instead
 */
public class Solution278 {
    public int firstBadVersion(int n) {
        if (n <= 0)
            return 0;

        int head=1, tail=n, mid;
        int badIndex = 0;

        while (head <= tail){
//            mid = head + (tail - head)/2;     // instead of mid = (head + tail) / 2;
//            if (isBadVersion(mid)){
//                badIndex = mid;
//                tail = mid - 1;
//            }
//            else{
//                head = mid + 1;
//            }
        }

        return badIndex;
    }
}
