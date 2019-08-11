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

public class Solution252 {
    public boolean canAttendMeetings(int[][] intervals) {
        // bubble to sort the original array
        for (int i=0;i<intervals.length;i++){
            for (int j=0;j<intervals.length-i-1;j++){
                if (intervals[j][0]>intervals[j+1][0]){
                    int[] temp = intervals[j];
                    intervals[j] = intervals[j+1];
                    intervals[j+1] = temp;
                }
            }
        }

        // compare intervals available
        for (int i=1;i<intervals.length;i++){
            if (intervals[i][0] < intervals[i-1][1]){
                return false;
            }
        }

        return true;
    }
}
