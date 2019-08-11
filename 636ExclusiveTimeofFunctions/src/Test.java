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
    public static void main(String[] args){
        List<String> str = new ArrayList<>();
        str.add("0:start:0");
        str.add("1:start:2");
        str.add("1:end:5");
        str.add("0:end:6");

        Solution636 s = new Solution636();
        s.exclusiveTime(2, str);
    }
}
