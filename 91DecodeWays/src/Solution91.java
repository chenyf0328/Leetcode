public class Solution91 {
    public int numDecodings(String s) {
        if(s.length() ==0) return 0;
        int[] count = new int[s.length()+1];      //count[i]记录从开始到i-1点有count[i]中可能的编码方式
        count[0]=1;
        if(s.charAt(0)>'0')
            count[1]=1;
        for(int i=2;i<=s.length();i++){
            if(s.charAt(i-1)>='1')
                count[i] = count[i-1];
            int sum = Integer.parseInt(s.substring(i-2,i));
            if(sum <=26 && s.charAt(i-2)!='0' )
                count[i] += count[i-2];
        }
        return count[s.length()];
    }
}
