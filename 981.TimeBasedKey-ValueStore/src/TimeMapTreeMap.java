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

public class TimeMapTreeMap {

    private Map<String, TreeMap<Integer, String>> map;

    public TimeMapTreeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key))
            map.put(key, new TreeMap<>());

        map.get(key).put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key))  return "";

        TreeMap<Integer, String> treeMap = map.get(key);
        if (treeMap.containsKey(timestamp))
            return treeMap.get(timestamp);

        return treeMap.floorKey(timestamp) == null ? "" : treeMap.get(treeMap.floorKey(timestamp));
    }

}
