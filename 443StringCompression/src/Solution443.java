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

public class Solution443 {
    public int compress(char[] chars) {
        if (chars.length == 0 || chars == null)
            return 0;

        if (chars.length == 1)
            return 1;

        int cnt = 1;
        int index = 0;
        char pre = chars[0];

        for (int i=1;i<chars.length;i++){
            if (chars[i] == pre){
                cnt += 1;
            }
            else{
                if (cnt != 1) {
                    chars[index++] = pre;
                    while (cnt/10 != 0){
                        chars[index] = (char)(cnt/10 + '0');
                        cnt %= 10;
                        index++;
                    }
                    chars[index] = (char)(cnt + '0');
                    index++;
                }
                else{
                    chars[index] = pre;
                    index++;
                }
                cnt = 1;
                pre = chars[i];
            }

            if (i == chars.length-1){
                if (cnt == 1)
                    chars[index++] = pre;
                else{
                    chars[index++] = pre;
                    while (cnt/10 != 0){
                        chars[index] = (char)(cnt/10 + '0');
                        cnt %= 10;
                        index++;
                    }
                    chars[index] = (char)(cnt + '0');
                    index++;
                }
            }
        }

        return index;
    }
}
