/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import java.util.HashSet;
import java.util.Set;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

public class Solution202 {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);
        int sum = 0;

        while (true) {
            while (n >= 10) {
                sum += (n % 10) * (n % 10);
                n /= 10;
            }
            sum += n * n;

            if (sum == 1)
                return true;

            if (set.contains(sum))
                return false;
            else {
                set.add(sum);
                n = sum;
                sum = 0;
            }
        }
    }
}
