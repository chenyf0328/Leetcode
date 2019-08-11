public class Solution66 {
    public int[] plusOne(int[] digits) {
        int[] newDigits=new int[digits.length+1];
        for (int i=digits.length-1;i>=0;i--){
            if (digits[i]==9)
                if (i==0){
                    digits[i]=0;
                    for (int j=0;j<digits.length;j++)
                        newDigits[j+1]=digits[j];
                    newDigits[0]=1;
                    return newDigits;
                }
                else
                    digits[i]=0;
            else {
                digits[i] ++;
                return digits;
            }
        }

        return digits;
    }
}
