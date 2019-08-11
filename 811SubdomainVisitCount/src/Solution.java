/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

public class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> result = new ArrayList<>();

        if (cpdomains.length == 0)
            return result;

        HashMap<String,Integer> map = new HashMap<>();

        for (String iter: cpdomains){
            String[] iterSplit = iter.split(" ");
            int cntIter = Integer.valueOf(iterSplit[0]);
            String domainIter = iterSplit[1];

            String[] domainIterSplit = domainIter.split("\\.");
            if (domainIterSplit.length == 2){
                if (map.containsKey(domainIterSplit[1])){
                    map.put(domainIterSplit[1], map.get(domainIterSplit[1])+cntIter);
                }
                else{
                    map.put(domainIterSplit[1], cntIter);
                }

                String key = domainIterSplit[0]+"."+domainIterSplit[1];
                if (map.containsKey(key)){
                    map.put(key, map.get(key)+cntIter);
                }
                else{
                    map.put(key, cntIter);
                }
            }

            if (domainIterSplit.length == 3){
                if (map.containsKey(domainIterSplit[2])){
                    map.put(domainIterSplit[2], map.get(domainIterSplit[2])+cntIter);
                }
                else{
                    map.put(domainIterSplit[2], cntIter);
                }

                String key = domainIterSplit[1]+"."+domainIterSplit[2];
                if (map.containsKey(key)){
                    map.put(key, map.get(key)+cntIter);
                }
                else{
                    map.put(key, cntIter);
                }

                key = domainIterSplit[0] + "." + domainIterSplit[1] + "." + domainIterSplit[2];
                if (map.containsKey(key)){
                    map.put(key, map.get(key)+cntIter);
                }
                else{
                    map.put(key, cntIter);
                }
            }
        }

        for (String iterKey: map.keySet()){
            String resultIter = String.valueOf(map.get(iterKey)) + " " + iterKey;
            result.add(resultIter);
        }

        return result;
    }
}
