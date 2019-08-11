/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import javafx.util.Pair;

import java.util.*;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

/*
    Time Complexity: O(1) for each set operation, and O(logN) for each get operation, where NN is the number of entries in the TimeMap.
    Space Complexity: O(N)
*/

public class TimeMap {
    /** Initialize your data structure here. */

    private Map<String, List<Pair<Integer, String>>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key))
            map.put(key, new ArrayList<>());

        map.get(key).add(new Pair(timestamp, value));
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key))  return "";

        List<Pair<Integer, String>> list = map.get(key);
        int i = Collections.binarySearch(list, new Pair<>(timestamp, ""), (a, b) -> Integer.compare(a.getKey(), b.getKey()));

        if (i >= 0)
            return list.get(i).getValue();
        else if (i == -1)
            return "";
        else
            return list.get(-i-2).getValue();
    }
}
