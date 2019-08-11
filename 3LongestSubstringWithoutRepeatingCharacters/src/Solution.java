import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        Set<Integer> lengthSet=new HashSet<>();
        Set letterSet=new HashSet();
        int l=0,r=0;
        int length=0;
        int maxLength=0;
        while(r<s.length()){
            if (!letterSet.contains(s.charAt(r))) {
                letterSet.add(s.charAt(r));
                length=r-l+1;
                lengthSet.add(length);
                r++;
            }
            else {
                letterSet.remove(s.charAt(l));
                l++;
                if (l==r) {
                    r++;
                    if (r==s.length()){
                        letterSet.add(s.charAt(1));
                        break;
                    }
                }
                while (s.charAt(l)==s.charAt(r)){
                    if (r==l+1) {
                        lengthSet.add(1);
                        letterSet.remove(s.charAt(l));
                        l++;
                        r++;
                        if (r == s.length()) {
                            letterSet.add(s.charAt(1));
                            l--;
                            break;
                        }
                    }
                    else {
                        l++;
                        r++;
                        break;
                    }
                }
                letterSet.add(s.charAt(l));
            }
        }
        Iterator<Integer> iter=lengthSet.iterator();
        if (iter.hasNext())
            maxLength=iter.next();
        while(iter.hasNext()){
            int temp=iter.next();
            if (maxLength<temp) {
                maxLength=temp;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print(lengthOfLongestSubstring("busvutpwmu"));
    }
}
