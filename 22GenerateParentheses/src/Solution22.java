import java.util.ArrayList;
import java.util.List;

public class Solution22 {
    List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        helper(n, "", 0, 0);
        return result;
    }

    public void helper(int n,String A, int left, int right){
        if (A.length() == 2*n) {
            result.add(A);
            return;
        }

        if (left < n){
            helper(n, A+"(", left+1, right);
        }
        if (right < left){
            helper(n, A+")", left, right+1);
        }
    }
}
