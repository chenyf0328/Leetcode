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
    KMP
    Time complexity: O(m+n)     m为子串的长度，n为原字符串的长度
    Space complexity: O(m)      m为子串的长度(next数组)
 */
public class Solution28 {

    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0)
            return 0;

        return KMP(haystack, needle);
    }

    public static int KMP(String ts, String ps) {
        char[] t = ts.toCharArray();
        char[] p = ps.toCharArray();
        int i = 0; // 主串的位置
        int j = 0; // 模式串的位置
        int[] next = getNext(ps);

        while (i < t.length && j < p.length) {
            if (j == -1 || t[i] == p[j]) { // 当j为-1时，要移动的是i，当然j也要归0
                i++;
                j++;
            }
            else {
                // i不需要回溯了
                j = next[j]; // j回到指定位置
            }
        }

        if (j == p.length) {
            return i - j;
        }
        else {
            return -1;
        }
    }

    public static int[] getNext(String ps) {
        char[] p = ps.toCharArray();
        int[] next = new int[p.length];

        next[0] = -1;
        int j = 0;
        int k = -1;

        while (j < p.length - 1) {
            if (k == -1 || p[j] == p[k]) {
                next[++j] = ++k;
            }
            else{
                k = next[k];
            }
        }

        return next;
    }
}
