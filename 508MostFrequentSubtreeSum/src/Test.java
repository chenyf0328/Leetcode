import java.util.List;

public class Test {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(1);

        Solution508 s = new Solution508();
        s.findFrequentTreeSum(root);
    }
}
