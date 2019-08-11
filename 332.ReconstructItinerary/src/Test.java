/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import java.util.ArrayList;
import java.util.List;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

public class Test {
    public static void main(String[] args) {
        Solution332 s = new Solution332();
        List<String> list1 = new ArrayList<>();
        list1.add("MUC");
        list1.add("LHR");
        List<String> list2 = new ArrayList<>();
        list2.add("JFK");
        list2.add("MUC");
        List<String> list3 = new ArrayList<>();
        list3.add("SFO");
        list3.add("SJC");
        List<String> list4 = new ArrayList<>();
        list4.add("LHR");
        list4.add("SFO");

        List<List<String>> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);

        s.findItinerary(list);
    }
}
