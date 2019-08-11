public class Solution67 {
    public static String addBinary(String a, String b) {
        int length=(a.length()<b.length())? a.length():b.length();
        char carry='0';
        String result="";
        char select;

        if (a.length()>b.length())
            select='a';
        else
            select='b';

        if (select=='a') {
            for (int i = length - 1; i >= 0; i--) {
                if (((carry - '0') + (a.charAt(i+a.length()-b.length()) - '0') + (b.charAt(i) - '0')) == 1) {
                    result = '1' + result;
                    carry = '0';
                } else if ((carry - '0') + (a.charAt(i+a.length()-b.length()) - '0') + (b.charAt(i) - '0') == 2) {
                    result = '0' + result;
                    carry = '1';
                } else if ((carry - '0') + (a.charAt(i+a.length()-b.length()) - '0') + (b.charAt(i) - '0') == 0) {
                    result = '0' + result;
                    carry = '0';
                } else {
                    result = '1' + result;
                    carry = '1';
                }
            }
        }
        else{
            for (int i = length - 1; i >= 0; i--) {
                if (((carry - '0') + (a.charAt(i) - '0') + (b.charAt(i+b.length()-a.length()) - '0')) == 1) {
                    result = '1' + result;
                    carry = '0';
                } else if ((carry - '0') + (a.charAt(i) - '0') + (b.charAt(i+b.length()-a.length()) - '0') == 2) {
                    result = '0' + result;
                    carry = '1';
                } else if ((carry - '0') + (a.charAt(i) - '0') + (b.charAt(i+b.length()-a.length()) - '0') == 0) {
                    result = '0' + result;
                    carry = '0';
                } else {
                    result = '1' + result;
                    carry = '1';
                }
            }
        }

        if (select=='a') {
            for (int i=a.length()-b.length()-1;i>=0;i--){
                if ((carry-'0')+(a.charAt(i)-'0')==1){
                    result='1'+result;
                    carry='0';
                }
                else if((carry-'0')+(a.charAt(i)-'0')==2){
                    result='0'+result;
                    carry='1';
                }
                else if((carry-'0')+(a.charAt(i)-'0')==0){
                    result='0'+result;
                    carry='0';
                }
                else{
                    result='1'+result;
                    carry='1';
                }
            }
        }
        else{
            for (int i=b.length()-a.length()-1;i>=0;i--){
                if ((carry-'0')+(b.charAt(i)-'0')==1){
                    result='1'+result;
                    carry='0';
                }
                else if((carry-'0')+(b.charAt(i)-'0')==2){
                    result='0'+result;
                    carry='1';
                }
                else if((carry-'0')+(b.charAt(i)-'0')==0){
                    result='0'+result;
                    carry='0';
                }
                else{
                    result='1'+result;
                    carry='1';
                }
            }
        }

        if (carry=='1')
            result='1'+result;

        return result;
    }

    public static void main(String args[]){
        System.out.print(addBinary("100","110010"));
    }
}
