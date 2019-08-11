public class Solution617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1==null && t2==null)
            return null;

        if (t1!=null && t2!=null){
            t1.val=t1.val+t2.val;
            if (t1.left==null)
                t1.left=mergeTrees(t1.left,t2.left);
            else
                mergeTrees(t1.left,t2.left);

            if (t1.right==null)
                t1.right=mergeTrees(t1.right,t2.right);
            else
                mergeTrees(t1.right,t2.right);
        }
        else if (t2!=null && t1==null){
            t1=new TreeNode(t2.val);
            t1.left=mergeTrees(t1.left,t2.left);
            t1.right=mergeTrees(t1.right,t2.right);
        }
        else{
            mergeTrees(t1.left,null);
            mergeTrees(t1.right,null);
        }

        return t1;
    }
}
