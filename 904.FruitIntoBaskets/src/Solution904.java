/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import java.util.HashMap;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */
/*
    Sliding Window
    Time Complexity: O(N), where N is the length of tree.
    Space Complexity: O(N)
 */

public class Solution904 {
    public int totalFruit(int[] tree) {
        if (tree == null || tree.length == 0)
            return 0;

        int ans = 0, i = 0;
        Counter counter = new Counter();
        for (int j=0;j<tree.length;j++){
            counter.add(tree[j], 1);
            while (counter.size() == 3){
                counter.add(tree[i], -1);
                if (counter.get(tree[i]) == 0)
                    counter.remove(tree[i]);
                i++;
            }

            ans = Math.max(ans, j-i+1);
        }

        return ans;
    }

    class Counter extends HashMap<Integer, Integer> {

        public int get(int k) {
            return containsKey(k) ? super.get(k) : 0;
        }

        public void add(int k, int value) {
            put(k, get(k) + value);
        }
    }
}