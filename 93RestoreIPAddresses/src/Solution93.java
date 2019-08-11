/**
 * \file        Solution93.java
 * \brief       Leetcode 93
 * \author      Yifan Chen
 */

import java.util.ArrayList;
import java.util.List;

/** \brief Solution93 class.
 *
 *   Longer description goes here.
 */
public class Solution93 {
    List<String> list;

    /** \brief Solve the question 93 on Leetcode
     *
     *  \param s The String s is the original number String waited to be separated into ip address
     *
     *  \returns The result of IP address we get
     */
    public List<String> restoreIpAddresses(String s) {
        list = new ArrayList<String>();
        /**
         * 初始传入的字符串长度只能为4-12
         */
        addDot(s,"",3);

        return list;
    }

    /** \brief iterative method
     *
     *  \param s The String needed to be handle
     *  \param result The result of String
     *  \param k The remaining "."
     *  \returns nothing
     */
    private void addDot(String s,String result, int k){

        //传入字符串必须合法
        if(s.length() <= k){
            return;
        }
        if(s.length() > 3*(k+1)){
            return;
        }
        if(k == 0){//最后一段，判断小于256
            if((s.charAt(0) == '0' && s.length() > 1 ) || Integer.parseInt(s) >= 256)
                return;
            list.add(result + "." + s);
            return;
        }
        //遍历前面3位，如果小于256，则参与递归
        for(int i = 1; i <= s.length(); i++){
            String temp = s.substring(0,i);//当前段小于256，表示合法，可以继续
            if(Integer.parseInt(temp) < 256){
                String str = s.substring(i);
                //分情况，如果result为空，则前面不加"."
                if(result.length() > 0){
                    temp = result + "." + temp;
                }
                addDot(str,temp, k-1);
                //如果第一个数字为0，则不再继续循环
                if(s.charAt(0) == '0'){
                    break;
                }
            }else{
                break;
            }
        }
    }

}
