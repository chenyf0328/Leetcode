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

public class Solution482 {
    public String licenseKeyFormatting(String S, int K) {
        String result = "";
        String[] newSArray = S.split("-");
        StringBuilder sb = new StringBuilder();
        for (String iter: newSArray)
            sb.append(iter);
        String newS = sb.toString();

        if (newS.length() == 0)
            return "";

        if (newS.length()==1)
            return newS.toUpperCase();

        int mod = newS.length() % K;
        int num = newS.length() / K;

        if (mod != 0)
            result += newS.substring(0, mod) + "-";

        int index = mod;
        for (int i=0;i<num;i++){
            result += newS.substring(index, index+K) + "-";
            index += K;
        }
        return result.substring(0, result.length()-1).toUpperCase();
    }
}
