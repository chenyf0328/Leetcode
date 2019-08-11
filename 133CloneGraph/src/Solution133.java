/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

public class Solution133 {

    // bfs: not completed
    /*public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null)
            return null;

        Queue<UndirectedGraphNode> queue = new ArrayDeque<>();
        HashMap<String, UndirectedGraphNode> map = new HashMap<>();
        HashMap<String, Boolean> mapVisited = new HashMap<>();

        UndirectedGraphNode resultRoot = new UndirectedGraphNode(node.label);

        if (node.neighbors.size() == 0)
            return resultRoot;

        queue.add(node);

        while (!queue.isEmpty()){
            UndirectedGraphNode temp = queue.poll();

            if (!mapVisited.containsKey(temp.label))
                map.put(String.valueOf(temp.label), new UndirectedGraphNode(temp.label));

            for (UndirectedGraphNode iter : temp.neighbors){
                if (!mapVisited.containsKey(iter.label)) {
                    queue.add(iter);

                    if (!map.containsKey(String.valueOf(iter.label)))
                        map.put(String.valueOf(iter.label), new UndirectedGraphNode(iter.label));

                    map.get(String.valueOf(temp.label)).neighbors.add(map.get(iter.label));
                }
            }

            mapVisited.put(String.valueOf(temp.label), true);

        }

        return map.get(String.valueOf(node.label));
    } */

    // dfs
    private HashMap<Integer, UndirectedGraphNode> map = new HashMap<>();

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        return clone(node);
    }

    private UndirectedGraphNode clone(UndirectedGraphNode node) {
        if (node == null) return null;

        if (map.containsKey(node.label)) {
            return map.get(node.label);
        }
        UndirectedGraphNode clone = new UndirectedGraphNode(node.label);
        map.put(clone.label, clone);
        for (UndirectedGraphNode neighbor : node.neighbors) {
            clone.neighbors.add(clone(neighbor));
        }
        return clone;
    }
}
