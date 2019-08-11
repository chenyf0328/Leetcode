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

/*
    Time Complexity: O(V+E)
    Space Complexity: O(V)
    v为图的顶点数，E为边数。
 */
public class Solution332 {
    Store myStore = new Store();
    List<String> result = new ArrayList<>();

    public List<String> findItinerary(List<List<String>> tickets) {

        for (int i=0;i<tickets.size();i++){
            myStore.add(tickets.get(i).get(0),tickets.get(i).get(1));
        }

        String depart = "JFK";

        dfs(depart);

        return result;
    }

    public void dfs(String str){
        Queue<String> queue = myStore.get(str);

        while(queue != null && !queue.isEmpty()){
            dfs(queue.poll());
        }

        result.add(0, str);
    }

    class Store extends HashMap<String, Queue<String>>{

        public void add(String key, String value){
            Comparator<String> OrderDistance =  new Comparator<String>(){
                public int compare(String str1, String str2) {
                    return str1.compareTo(str2);
                }
            };

            if (containsKey(key)){
                get(key).add(value);
            }
            else{
                Queue<String> pq = new PriorityQueue<>(OrderDistance);
                pq.add(value);
                put(key, pq);
            }
        }
    }
}
