public class Solution98 {
    public static boolean isValidBST(TreeNode root, long min, long max) {
        if (root == null)
            return true;
        if (root.val<=min || root.val>=max)
            return false;
        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    }

    public static boolean isValidBST(TreeNode root){
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static void main(String[] args) {
        TreeNode t1=new TreeNode(2147483647);

        System.out.print(isValidBST(t1));
    }
}
