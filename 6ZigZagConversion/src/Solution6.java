public class Solution6 {
    public static String convert(String s, int numRows) {
        String resultStr="";
        int index=0;
        int col=1;
        if (s.isEmpty())
            return "";
        if (numRows==1)
            return s;

        for (int i=0;i<numRows;i++){
            if (i==0 || i==numRows-1) {
                index=i;
                if (index<s.length())
                    resultStr = resultStr + s.charAt(index);
                index=index+2*numRows-2;
                while(index<s.length()) {
                    resultStr = resultStr + s.charAt(index);
                    index=index+2*numRows-2;
                }
            }
            else{
                if (i<s.length()) {
                    index = i;
                    col = 1;
                    while (index < s.length()) {
                        resultStr += s.charAt(index);
                        if (col % 2 == 0)
                            index = index + 2 * i;
                        else
                            index = index + 2 * (numRows - i - 1);
                        col++;
                    }
                }
                else{
                    return resultStr;
                }
            }
        }
        return resultStr;
    }

    public static void main(String[] args) {
        convert("AB",3);
    }
}
