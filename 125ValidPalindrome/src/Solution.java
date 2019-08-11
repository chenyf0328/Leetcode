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

public class Solution {
    public boolean isPalindrome(String s) {
        if (s.equals(""))
            return true;

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i=0;i<s.length();i++){
            if ((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='0' && s.charAt(i)<='9'))
                if (s.charAt(i)>='A' && s.charAt(i)<='Z')
                    sb1.append((char)(s.charAt(i)+'a'-'A'));
                else
                    sb1.append(s.charAt(i));
        }

        for (int i=s.length()-1;i>=0;i--){
            if ((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='0' && s.charAt(i)<='9'))
                if (s.charAt(i)>='A' && s.charAt(i)<='Z')
                    sb2.append((char)(s.charAt(i)+'a'-'A'));
                else
                    sb2.append(s.charAt(i));
        }

        if (sb1.toString().equals(sb2.toString()))
            return true;
        else
            return false;
    }
}
