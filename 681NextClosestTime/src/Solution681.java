import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution681 {
    public String nextClosestTime(String time) {
        List<Character> charList = new ArrayList<>();
        for (int i=0;i<time.length();i++){
            if (time.charAt(i) != ':')
                charList.add(time.charAt(i));
        }

        char[] numList = new char[charList.size()];
        for (int i=0;i<numList.length;i++)
            numList[i] = charList.get(i);

        Arrays.sort(numList);

        String[] hourMin = time.split(":");

        int oldHour = Integer.parseInt(hourMin[0]);
        int oldMinute = Integer.parseInt(hourMin[1]);

        for (char iter: numList) {
            String newMin = hourMin[1].charAt(0) + String.valueOf(iter -'0');
            if ( Integer.parseInt(newMin)<=59 &&  Integer.parseInt(newMin)-oldMinute >0){
                return hourMin[0]+":" + newMin;
            }
        }

        for (char iter: numList) {
            String newMin = String.valueOf(iter -'0') + hourMin[1].charAt(1);
            if ( Integer.parseInt(newMin)<=59 &&  Integer.parseInt(newMin)-oldMinute >0){
                return hourMin[0]+":" + newMin.charAt(0)+numList[0];
            }
        }

        for (char iter: numList){
            String newHour = hourMin[0].charAt(0) + String.valueOf(iter -'0');
            if ( Integer.parseInt(newHour)<=23 &&  Integer.parseInt(newHour)-oldHour >0){
                return newHour+":"+String.valueOf(numList[0])+String.valueOf(numList[0]);
            }
        }

        for (char iter: numList){
            String newHour = String.valueOf(iter -'0') + hourMin[0].charAt(1);
            if ( Integer.parseInt(newHour)<=23 &&  Integer.parseInt(newHour)-oldHour >0){
                return newHour+":"+String.valueOf(numList[0])+String.valueOf(numList[0]);
            }
        }

        return String.valueOf(numList[0])+String.valueOf(numList[0])+":" +String.valueOf(numList[0])+String.valueOf(numList[0]);
    }
}
