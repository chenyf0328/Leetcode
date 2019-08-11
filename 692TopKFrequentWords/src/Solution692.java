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

public class Solution692 {
    public List<String> topKFrequent(String[] words, int k) {
        if (words == null || words.length == 0)
            return new ArrayList<>();

        List<String> res = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();

        for (String iter: words){
            if (map.containsKey(iter)){
                map.put(iter, map.get(iter)+1);
            }
            else{
                map.put(iter, 1);
            }
        }

        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<String,Integer>>(){
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return -1*(o1.getValue()-o2.getValue());
            }
        });

        int i=0;
        while (k>0){
            int j=i+1;
            while (j<list.size()){
                if (list.get(i).getValue() == list.get(j).getValue()) {
                    if (list.get(i).getKey().compareTo(list.get(j).getKey()) > 0) {
                        Map.Entry<String, Integer> temp = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, temp);
                    }
                    j++;
                }
                else{
                    break;
                }
            }
            res.add(list.get(i).getKey());
            i++;
            k--;
        }

        return res;
    }
}
