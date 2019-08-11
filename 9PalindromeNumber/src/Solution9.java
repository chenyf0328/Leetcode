public class Solution9 {
    public static boolean isPalindrome(int x) {
        int reversedNum=0;

        if (x<0)
            return false;
        if (x>=0 && x<10)
            return true;
        if (x%10==0)
            return false;

        while(x>reversedNum){
            reversedNum=reversedNum*10+x%10;
            x/=10;
        }

        if (x==reversedNum || x==reversedNum/10)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        isPalindrome(11);
    }
}
