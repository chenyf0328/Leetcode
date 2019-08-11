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

public class Solution393 {
    public boolean validUtf8(int[] data) {
        if (data == null || data.length == 0)
            return false;

        int cnt = data.length;
        int first = data[0];
        int firstLength = Integer.toBinaryString(first).length();

        first = first << ((firstLength > 8) ? firstLength-8 : 0);
        if ((first >> 7) == 0b0 && cnt == 1)
            return true;
        if ((first >> 6) == 0b10)
            return false;

        if (cnt == 1)
            return false;

        int count = 0;
        for(int d : data){
            if(count == 0){
                if((d>>5) == 0b110) count = 1;          //2 byte
                else if((d>>4) == 0b1110) count = 2;    //3 byte;
                else if((d>>3) == 0b11110) count = 3;   //4 byte
                else if((d>>7) == 1) return false;      //count==0, occupy one byte
            }
            else{
                if((d>>6)!=0b10) return false;
                count--;
            }
        }
        return true;
    }
}
