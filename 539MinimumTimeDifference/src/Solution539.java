import java.util.List;

public class Solution539 {
    public int findMinDifference(List<String> timePoints) {
        boolean times[] = new boolean[24 * 60];
        int maxMinu = Integer.MIN_VALUE;

        for (String iter: timePoints){
            String[] splitStr = iter.split(":");
            int hour = Integer.parseInt(splitStr[0]);
            int minu = Integer.parseInt(splitStr[1]);
            if (times[hour * 60 + minu])
                return 0;

            times[hour * 60 + minu] = true;

//            if (maxMinu < hour * 60 + minu)
//                maxMinu = hour * 60 + minu;
        }

        /*last = maxMinu;

        int min = Integer.MAX_VALUE, pre = -(23 * 60 + 60 - last);

        for (int i=0;i<times.length;i++){
            if (times[i]){
                last = i;
                min = Math.min(min, last - pre);
            }
            pre = i;
        }

        return min;*/

        int pre = -24 * 60, min = Integer.MAX_VALUE, first = 24 * 60, last = 0;
        for (int i = 0; i < times.length; i ++) {
            if (times[i]) {
                min = Math.min(min, i - pre);
                if (first >= i) {
                    first = i;
                }
                last = i;
                pre = i;
            }
        }
        return Math.min(min, 24 * 60 - last + first);
    }
}
