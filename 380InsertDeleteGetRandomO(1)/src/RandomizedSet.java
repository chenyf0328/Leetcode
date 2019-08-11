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

public class RandomizedSet {

    private List<Integer> list = null;
    private Map<Integer, Integer> map = null;
    private int size;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        size = 0;
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (!map.containsKey(val)) {
            list.add(size, val);
            map.put(val, size++);
            return true;
        }
        else {
            return false;
        }
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!map.containsKey(val))
            return false;
        else if (size == 0)
            return false;
        else{
            int tailKey = list.get(size-1);
            map.put(tailKey,map.get(val));
            list.set(map.get(val),tailKey);
            size--;
            map.remove(val);
            return true;
        }
    }

    /** Get a random element from the set. */
    public int getRandom() {
        Random rand = new Random();
        int randNum = rand.nextInt(size);
        return list.get(randNum);
    }

}
