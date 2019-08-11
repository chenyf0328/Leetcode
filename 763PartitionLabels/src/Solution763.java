import java.util.ArrayList;
import java.util.List;

public class Solution763 {
    public static List<Integer> partitionLabels(String S) {
        List<Integer> result=new ArrayList<>();
        int[] map=new int[26];
        int start=0,end=0;

        for (int i=0;i<S.length();i++)
            map[S.charAt(i)-'a']=i;


        for (int i=0;i<S.length();i++){
            end=Math.max(map[S.charAt(i)-'a'],end);
            if (end==i){
                result.add(end-start+1);
                start=end+1;
            }
        }

        return result;
    }

    public static void main(String[] args){
        partitionLabels("a");
    }
}
