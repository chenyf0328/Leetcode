import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Solution120 {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int rows=triangle.size();
        int[][] dp=new int[rows][rows];
        int min=0;

//        for (int i=0;i<rows;i++){
//            for (int j=0;j<rows;j++) {
//                dp[i][j]=0;
//            }
//        }

        dp[0][0]=triangle.get(0).get(0);

        for (int i=1;i<rows;i++){
            for (int j=0;j<=i;j++) {
                if (j==i){
                    dp[i][j]=dp[i-1][j-1]+triangle.get(i).get(j);
                }
                else if (j - 1 >= 0) {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]) + triangle.get(i).get(j);
                }
                else{
                    dp[i][j]=dp[i-1][j]+triangle.get(i).get(j);
                }
            }
        }

        min=dp[rows-1][0];
        for (int i=1;i<rows;i++){
            if (min>dp[rows-1][i])
                min=dp[rows-1][i];
        }

        return min;
    }

    public static void main(String[] args){
        List<List<Integer>> triangle=new ArrayList<List<Integer>>();
        List<Integer> li=new ArrayList<>();
        li.add(1);
        triangle.add(new ArrayList<>(li));
        li.set(0,2);
        li.add(3);
        triangle.add(li);
        minimumTotal(triangle);
    }
}
