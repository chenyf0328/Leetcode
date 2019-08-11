/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

public class Test {
    public static void main(String[] args){
        KthLargest obj = new KthLargest(3, new int[]{4,5,8,2});
        int param_1 = obj.add(3);
        obj.add(5);   // returns 5
        obj.add(10);  // returns 5
        obj.add(9);   // returns 8
        obj.add(4);   // returns 8
    }
}
