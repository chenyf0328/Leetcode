public class Solution172 {
    public int trailingZeroes(int n) {
        if (n==0)
            return 0;

        int count=0;
        while (n/5!=0){
            n=n/5;
            count=count+n;
        }
        return count;
    }
}
