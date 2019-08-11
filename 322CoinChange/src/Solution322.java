/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import java.util.Arrays;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

public class Solution322 {
////    private int minNum = Integer.MAX_VALUE;
//    private boolean flag = false;
//    private int totalNum = 0;
//
//    public int coinChange(int[] coins, int amount) {
//
//        Arrays.sort(coins);
//        helper(0,coins.length-1, coins, amount);
//
//        if (flag == false)
//            return -1;
//
//        return totalNum;
//    }
//
//    private void helper(int cntNum, int index, int[] coins, int amount){
//        if (amount == 0) {
////            if (minNum > cntNum){
////                minNum = cntNum;
////                flag = true;
////            }
//            flag = true;
//            totalNum = cntNum;
//            return;
//        }
//
//        if (index == 0 && coins[0] > amount)
//            return;
//
//        if (index < 0)
//            return;
//
//        int currentNum = 0;
//
//        for (int i=index;i>=0;i--){
//            currentNum = amount / coins[i];
//
//            for (int j=currentNum;j>0;j--) {
//                if (currentNum != 0) {
//                    amount -= j * coins[i];
//                    cntNum += j;
//                    helper(cntNum, i - 1, coins, amount);
//
//                    if (flag == true)
//                        return;
//
//                    amount += j * coins[i];
//                    cntNum -= j;
//                }
//            }
//        }
//    }

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            dp[i] = 0x7fffffff;                 // 0x7FFFFFFF 代表Maths.MAX_VALUE     因为第一位是符号位所以 0111 1111 1111 1111 .......
            for (int j = 0; j < coins.length; j++)
                if (i >= coins[j] && dp[i - coins[j]] != 0x7fffffff)
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
        }
        return dp[amount] == 0x7fffffff ? -1 : dp[amount];
    }

}
