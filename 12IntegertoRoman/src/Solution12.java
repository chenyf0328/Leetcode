import java.util.HashMap;
import java.util.Map;

public class Solution12 {
    public String intToRoman(int num) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "I");map.put(5, "V");map.put(10, "X");map.put(50, "L");map.put(100, "C");map.put(500, "D");map.put(1000, "M");

        int[] key = new int[]{1, 5, 10, 50, 100, 500, 1000};
        String romanNum = "";

        for (int i=key.length-1;i>=0;i--){
            if (num==0)
                break;

            if (num/1 != 9 && num/10!=9 && num/100!=9 && num/key[i] != 0){
                int quotient = num/key[i];
                int remainder = num%key[i];

                if (quotient == 4){
                    romanNum += map.get(key[i])+map.get(5*key[i]);
                }
                else if (quotient == 9){
                    romanNum += map.get(key[i])+map.get(10*key[i]);
                }
                else{
                    for (int j=0;j<quotient;j++){
                        romanNum += map.get(key[i]);
                    }
                }

                num = remainder;
                i = key.length-1;

                if (num == 4){
                    romanNum += "IV";
                    break;
                }
                if (num == 9){
                    romanNum += "IX";
                    break;
                }
            }
            else if (num/10 == 9){
                romanNum += "XC";
                num -= 90;
            }
            else if(num/100 == 9){
                romanNum += "CM";
                num -= 900;
            }
            else if(num/1 == 9){
                romanNum += "IX";
                num -= 9;
            }
        }

        return romanNum;
    }
}
