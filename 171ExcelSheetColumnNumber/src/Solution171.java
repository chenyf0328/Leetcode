public class Solution171 {
    public int titleToNumber(String s) {
        int size=s.length();
        int result=0;
        int temp=0;

        for (int i=0;i<size;i++){
            temp=s.charAt(i)-'A'+1;
            result=26*result+temp;
        }

        return result;
    }
}
