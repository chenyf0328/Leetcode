public class Solution134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int canComplete=0;
        int[] consume=new int[gas.length];

        for (int i=0;i<gas.length;i++){
            consume[i]=gas[i]-cost[i];
        }

        for (int i=0;i<gas.length;i++){
            for (int j=0;j<gas.length;j++){
                if (i+j<gas.length)
                    canComplete=canComplete+consume[i+j];
                else
                    canComplete=canComplete+consume[i+j-gas.length];

                if (canComplete<0){
                    break;
                }
            }
            if (canComplete<0)
                canComplete=0;
            else
                return i;
        }

        return -1;
    }
}
