public class Solution684 {
    public int[] findRedundantConnection(int[][] edges) {
        int size = edges.length;
        int[] parent = new int[1001];
        for (int i=1;i<1001;i++){
            parent[i] = i;
        }

        for (int i=0;i<size;i++){
            int a = edges[i][0];
            int b = edges[i][1];

            if (findRoot(parent, a) == findRoot(parent, b))
                return edges[i];

            parent[findRoot(parent, b)] = findRoot(parent, a);
        }

        return null;
    }

    public int findRoot(int[] parent, int n){
        if (parent[n] == n)
            return n;

        parent[n] = findRoot(parent, parent[n]);
        return parent[n];
    }
}
