import java.util.Arrays;

public class Solution455 {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int indexCookie=0, content=0;

        for (int i=0;i<g.length;i++){
            while (indexCookie<s.length){
                if (g[i]<=s[indexCookie]) {
                    indexCookie++;
                    content++;
                    break;
                }
                indexCookie++;
            }
            if(indexCookie==s.length)
                break;
        }

        return content;
    }

    public static void main(String[] args){
        findContentChildren(new int[]{1,2,3},new int[]{3});
    }
}
