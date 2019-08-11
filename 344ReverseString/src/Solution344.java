import java.util.Iterator;
import java.util.Stack;

public class Solution344 {
    public String reverseString(String s) {
        /*Stack st=new Stack();
        String resultStr="";
        for (int i=0;i<s.length();i++)
            st.push(s.charAt(i));
        for (int i=0;i<s.length();i++)
            resultStr+=st.pop();
        return resultStr;*/

        if (s.isEmpty())
            return "";

        int start=0,end=s.length()-1;
        char[] result=s.toCharArray();
        char temp;
        while(start<=end){
            temp=result[start];
            result[start]=result[end];
            result[end]=temp;
            start++;
            end--;
        }

        return new String(result);
    }
}
