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

public class Solution338 {
    public int[] countBits(int num) {
        int[] P = new int[num+1];
        int b = 4;
        if (num == 0)
            P[0] = 0;
        else if (num == 1) {
            P[0] = 0;
            P[1] = 1;
        }
        else if (num == 2){
            P[0] = 0;
            P[1] = 1;
            P[2] = 1;
        }
        else{
            P[0] = 0;
            P[1] = 1;
            P[2] = 1;
            P[3] = 2;
        }

        while (0+b <= num) {
            for (int i = 0; i < b; i++) {
                if (i+b <= num)
                    P[i+b] = P[i] + 1;
                else
                    break;
            }
            b <<= 1;    // left move, b = b * 2;
        }

        return P;
    }
}
