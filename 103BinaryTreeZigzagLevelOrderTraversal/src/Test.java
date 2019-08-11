/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

/** \brief      
 *
 *  \param     
 *
 *  \returns        
 */

public class Test {
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.left.left = null;
        root.left.right = null;

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution s = new Solution();
        s.zigzagLevelOrder(root);
    }
}
