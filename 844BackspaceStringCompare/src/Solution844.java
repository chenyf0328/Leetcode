public class Solution844 {
    public boolean backspaceCompare(String S, String T) {
        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder(S);

        for (i=0;i<S.length();i++){
            if (S.charAt(i)!='#') {
                sb.setCharAt(j++, sb.charAt(i));
            }
            else{
                if (j!=0)
                    j--;
            }
        }

        S = sb.substring(0, j--);
        sb = new StringBuilder(T);
        j = 0;

        for (i=0;i<T.length();i++){
            if (T.charAt(i)!='#') {
                sb.setCharAt(j++, sb.charAt(i));
            }
            else{
                if (j!=0)
                    j--;
            }
        }

        T = sb.substring(0, j--);
        return S.equals(T);

//        System.out.println(sb.substring(0, j--));

    }
}
