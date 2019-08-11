public class Solution50 {
    public static double myPow(double x, int n) {
        if (n==0){
            return 1.0;
        }

        if (n==Integer.MIN_VALUE){
            double half=myPow(x,n/2);
            return half*half;
        }

        if (n<0){
            n=n*(-1);
            x=1/x;
        }

        return fastPow(x,n);
    }

    public static double fastPow(double x, int n){

        if (n==1){
            return x;
        }

        double half=fastPow(x,n/2);

        if (n%2==0)
            return half*half;
        else
            return half*half*x;
    }

    public static void main(String args[]){
        myPow(1.0,-2147483648);
    }
}
