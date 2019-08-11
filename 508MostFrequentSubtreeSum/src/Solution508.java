import java.util.*;

public class Solution508 {
    private HashMap<Integer, Integer> hp = null;
    private int sum = 0;
    private int[] result = null;

    public int[] findFrequentTreeSum(TreeNode root) {
        hp = new HashMap<>();

        if (root != null) {
            dfsOut(root);

            int[] all = new int[hp.size()];
            int num = 0;
            int big = 0;
            Iterator iter = hp.entrySet().iterator();
            while (iter.hasNext()) {
                Map.Entry entry = (Map.Entry) iter.next();
                if ((int) entry.getValue() > big) {
                    all[0] = (int) entry.getKey();
                    num = 1;
                    big = (int) entry.getValue();
                } else if ((int) entry.getValue() == big) {
                    all[num] = (int) entry.getKey();
                    num++;
                }
            }
            return Arrays.copyOfRange(all, 0, num);
        }
        else
            return new int[0];
    }

    public void addToHashMap(int sum){
        if (hp.containsKey(sum) == false)
            hp.put(sum,1);
        else
            hp.put(sum, hp.get(sum)+1);
    }

    public void dfsOut(TreeNode root){
        sum = 0;
        dfs(root);
        addToHashMap(sum);

        if (root.left == null && root.right == null)
            return;
        if (root.left == null) {
            sum = 0;
            dfs(root.right);
            addToHashMap(sum);
        }
        if (root.right == null) {
            sum = 0;
            dfs(root.left);
            addToHashMap(sum);
        }
        else {
            sum = 0;
            dfs(root.left);
            addToHashMap(sum);

            sum = 0;
            dfs(root.right);
            addToHashMap(sum);
        }
    }

    public void dfs(TreeNode root){
        if (root != null) {
            sum = sum + root.val;

            dfs(root.left);
            dfs(root.right);
        }
    }
}
