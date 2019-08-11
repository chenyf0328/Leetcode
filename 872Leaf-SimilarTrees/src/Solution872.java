import java.util.ArrayList;
import java.util.List;

public class Solution872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        dfs(root1, l1);
        dfs(root2, l2);

        if (l1.size() != l2.size())
            return false;

        for (int i=0;i<l1.size();i++) {
            if (l1.get(i) != l2.get(i))
                return false;
        }
        return true;
    }

    public void dfs(TreeNode root, List<Integer> list){
        if (root.left == null && root.right == null)
            list.add(root.val);

        if (root.left != null)
            dfs(root.left, list);
        if (root.right != null)
            dfs(root.right, list);
    }
}
