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
    public static void main(String[] args) {
        Solution755 s = new Solution755();
        int[] waterLevel = new int[]{13,7,9,6,4,4,4,10,15,9};
        s.pourWater(waterLevel, 7, 1);

        for (Integer iter : waterLevel){
            System.out.println(iter);
        }
    }
}
