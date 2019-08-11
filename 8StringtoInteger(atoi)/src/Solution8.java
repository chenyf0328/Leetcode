public class Solution8 {
    public int myAtoi(String str) {
        str = str.trim();

        if (str.length() == 0)
            return 0;

        char flag = '+';
        int index = 0;

        if (str.charAt(0) == '-') {
            flag = '-';
            index++;
        }
        else if (str.charAt(0) == '+'){
            index++;
        }
        else if (str.charAt(0) < 48 || str.charAt(0) > 57){
            return 0;
        }

        double num = 0;
        while(index<str.length() && str.charAt(index) >=48 && str.charAt(index) <= 57){
            num = num*10 + str.charAt(index++)-'0';
        }

        double result = (flag == '-') ? -num : num;

        if (flag == '-') {
            if (result < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            else
                return (int)result;
        }
        else{
            if (result > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            else
                return (int)result;
        }
    }
}
