public class Solution96 {
    public static int numTrees(int n) {
        if (n==0 || n==1)
            return n;

        int[] G=new int[n+1];
        G[0]=1;
        G[1]=1;

        for (int i=2;i<=n;i++)
            for (int j=0;j<i;j++)
                G[i] = G[i] + G[j]*G[i-j-1];

        return G[n];
    }

    public static void main(String[] args) {
        System.out.print(numTrees(4));
    }
}
