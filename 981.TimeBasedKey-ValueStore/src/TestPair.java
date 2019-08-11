/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import javafx.util.Pair;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

public class TestPair {

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(19, "happy");

        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
}
