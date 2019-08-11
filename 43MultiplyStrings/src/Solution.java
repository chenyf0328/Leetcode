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
    public String multiply(String num1, String num2) {
        int number1 = 0, number2 = 0;
        int add = 0;
        int result_len = 0;
        result_len = num2.length() + num1.length();
        int[] resultArray = new int[result_len];

        if (num1 == "" || num2 == "")
            return "";

        for (int i = num1.length()-1;i>=0;i--){
            add = 0;
            for (int j = num2.length()-1;j>=0;j--){
                int tempNumber = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = resultArray[i+j+1] + add + tempNumber % 10;
                resultArray[i+j+1] = sum % 10;
                add = tempNumber/10 + sum/10;
            }
            resultArray[i] += add;
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<result_len;i++){
            if (resultArray[i] != 0) {
                for (int j=i;j<result_len;j++)
                    sb.append(resultArray[j] + "");
                return sb.toString();
            }
        }

        return "0";
    }
}
