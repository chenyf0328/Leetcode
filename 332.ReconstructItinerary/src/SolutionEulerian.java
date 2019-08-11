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
    Eulerian Path
    Time Complecity: O(n)
    Space Complexity: O(n)
 */

public class SolutionEulerian {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> graph = new HashMap<>();
        for(List<String> ticket: tickets) {
            PriorityQueue<String> nexts = graph.get(ticket.get(0));
            if (nexts == null) {
                nexts = new PriorityQueue<>();
                graph.put(ticket.get(0), nexts);
            }
            nexts.add(ticket.get(1));
        }
        return eulerian(graph, "JFK");
    }

    private List<String> eulerian(Map<String, PriorityQueue<String>> graph, String city) {
        List<String> route = new ArrayList<>();
        route.add(city);
        PriorityQueue<String> nexts = graph.get(city);
        if (nexts == null) return route;
        while (!nexts.isEmpty()) {
            String next = nexts.remove();
            route.addAll(1, eulerian(graph, next));
        }
        return route;
    }
}
