public class Solution204 {
    public int countPrimes(int n) {
        if (n==0)
            return 0;
        if (n==1)
            return 0;
        if (n==2)
            return 0;

        boolean[] del=new boolean[n];
        del[2]=false;

        for (int i=3;i<n;i++){
            if (i%2==0)
                del[i]=true;
            else
                del[i]=false;
        }

        for (int i=3;i<n;i++){
            if (del[i]==false){
                if (i*i>n)
                    break;
                for (int j=2;i*j<n;j++){
                    del[i*j]=true;
                }
            }
        }

        int count=0;
        for (int i=2;i<n;i++){
            if (del[i]==false)
                count++;
        }
        return count;
    }
}
