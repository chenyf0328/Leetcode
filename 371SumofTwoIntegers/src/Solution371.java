public class Solution371 {
    public int getSum(int a, int b) {
        if (a==0)
            return b;

        int result=0;
        result=a^b;
        int c=(a&b) << 1;

        return getSum(c,result);
    }
}
