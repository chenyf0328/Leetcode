import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static int reverse(int x) {
//        int result=0,tempFlow=0,power=0;
//        boolean isPosi=true;
//        int tempX=x;
//        Queue<Integer> q=new LinkedList<Integer>();
//        if (tempX>0)
//            isPosi=true;
//        else if (tempX<0) {
//            isPosi = false;
//            tempX=-1*tempX;
//        }
//        else
//            return 0;
//
//        while(tempX/10!=0){
//            q.offer(tempX%10);
//            tempX=tempX/10;
//        }
//
//        q.offer(tempX);
//
//        for (int i=0;i<q.size();i++){
//            if (q.peek()==0)
//                q.remove();
//            else
//                break;
//        }
//        if (q.isEmpty())
//            return 0;
//        else{
//            while(!q.isEmpty()) {
//                tempFlow=result;
//                power=q.poll() * (int) (Math.pow(10, q.size()));
//                result = tempFlow + power;
//                if (result < tempFlow || result<power)
//                    return 0;
//            }
//        }
//
//        if (isPosi==false)
//            return (-1)*result;
//        else
//            return result;

        int res = 0;
        while (x != 0) {
            int t = res * 10 + x % 10;
            if (t / 10 != res)
                return 0;
            res = t;
            x /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print(reverse(1534236469));
    }
}
