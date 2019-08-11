/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import java.util.*;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

public class KthLargest {
    private int[] arr = null;
    private int k = 0;
    Queue<Integer> pq = new PriorityQueue<Integer>(11,
            new Comparator<Integer>() {
                public int compare(Integer i1, Integer i2) {
                    return -1 * (i1 - i2);
                }
            });

    public KthLargest(int k, int[] nums) {
        this.k = k;

        for (int iter: nums)
            pq.add(iter);

        arr = new int[pq.size()+1];

        int len = pq.size();
        for (int i=0;i<len;i++)
            arr[i] = pq.poll();

        arr[arr.length-1] = Integer.MIN_VALUE;
    }

    public int add(int val) {
        for (int i=0;i<arr.length;i++){
            if (arr[i] >= val){
                continue;
            }
            for (int j = arr.length - 1;j > i;j--){
                arr[j] = arr[j - 1];
            }
            arr[i] = val;
            break;
        }

        return arr[k-1];
    }
}
