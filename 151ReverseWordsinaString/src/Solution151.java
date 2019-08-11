public class Solution151 {
    public static String reverseWords(String s) {
        if (s.length()==0)
            return "";

        String[] splitString=s.split(" ");

        if (splitString.length==0)
            return "";

        String result="";

        result+=splitString[splitString.length-1];

        for (int i=splitString.length-2;i>=0;i--){
            if (!splitString[i].equals(""))
                result+=" "+splitString[i];
        }

        return result;
    }

    public static void main(String[] args){
        System.out.print(reverseWords("   a   "));
    }
}
