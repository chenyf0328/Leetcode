import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution860 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0, twenty = 0;

        for (int eachBill : bills){
            if (eachBill == 5)
                five++;
            else if (eachBill == 10)
                if (five > 0) {
                    five--;
                    ten++;
                }
                else
                    return false;
            else
                if (five > 0 && ten >0){
                    five--;
                    ten--;
                    twenty++;
                }
                else if (five > 2){
                    five -= 3;
                    twenty++;
                }
                else
                    return false;
        }

        return true;
    }
}
