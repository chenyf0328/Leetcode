public class Solution14 {
    public static String longestCommonPrefix(String[] strs) {
        String result="";
        char myCh;
        boolean isSame=true;
        int index=0;

        if (strs==null)
            return "";
        if (strs.length==0)
            return "";

        while(isSame==true) {
            if (index<strs[0].length())
                myCh=strs[0].charAt(index);
            else
                return result;
            for (String iterStr : strs) {
                if (index<iterStr.length()){
                    if (myCh!=iterStr.charAt(index))
                        return result;
                }
                else
                    return result;
            }
            result+=myCh;
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] strs={"abcd","ab","aeed"};
        longestCommonPrefix(strs);
    }
}
