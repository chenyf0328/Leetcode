import java.util.ArrayList;
import java.util.List;

public class Solution386 {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result=new ArrayList<>();
        result.add(1);
        int candid=0;

        for (int i=0;i<n-1;i++){
            candid=result.get(result.size()-1)*10;
            if (candid<=n){
                result.add(candid);
                continue;
            }
            else {
                candid=result.get(result.size() - 1);
                if (candid % 10 == 9 && result.get(result.size() - 1) != n) {
                    while (candid % 10 == 9) {
                        candid /= 10;
                    }
                    result.add(candid + 1);
                }
                else if (result.get(result.size() - 1) == n){
                    candid=candid/10;
                    while (candid%10==9)
                        candid/=10;
                    result.add(candid+1);
                }
                else {
                    result.add(result.get(result.size() - 1) + 1);
                }
            }
        }

        return result;
    }
}