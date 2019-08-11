import java.util.List;

public class Test {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.left = null;
        root.right.right = new TreeNode(9);

        Solution515 s = new Solution515();
        List<Integer> result = s.largestValues(root);

        for (Integer x: result){
            System.out.println(x);
        }
    }
}
