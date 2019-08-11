/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import java.util.ArrayDeque;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

class HitCounter {
    private ArrayDeque<Integer> queue;

    /** Initialize your data structure here. */
    public HitCounter() {
        queue = new ArrayDeque<>();
    }

    /** Record a hit.
     @param timestamp - The current timestamp (in seconds granularity). */
    public void hit(int timestamp) {
        queue.offer(timestamp);
    }

    /** Return the number of hits in the past 5 minutes.
     @param timestamp - The current timestamp (in seconds granularity). */
    public int getHits(int timestamp) {
        while (!queue.isEmpty() && queue.peek() <= timestamp - 300){
            queue.poll();
        }
        return queue.size();
    }
}