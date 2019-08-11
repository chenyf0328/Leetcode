public class Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);

        root.left = new TreeNode(3);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(2);
        root.left.right = null;

        root.left.left.left = null;
        root.left.left.right = null;

        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        root.right.left.left = null;
        root.right.left.right = null;

        root.right.right.left = null;
        root.right.right.right = null;

        // 2,1,3
//        TreeNode root = new TreeNode(2);
//
//        root.left = new TreeNode(1);
//        root.right = new TreeNode(3);
//
//        root.left.left = null;
//        root.left.right = null;
//
//        root.right.left = null;
//        root.right.right = null;
//
        Solution449 test = new Solution449();

        // 1,null,2
//        TreeNode root = new TreeNode(1);
//
//        root.left = null;
//        root.right = new TreeNode(2);
//
//        root.right.left = null;
//        root.right.right = null;
//
//        Solution449 test = new Solution449();
//
//        System.out.println(test.serialize(root));

//        TreeNode result;
        TreeNode testRoot = test.deserialize(test.serialize(root));

        int x;
        x=1;
    }
}
