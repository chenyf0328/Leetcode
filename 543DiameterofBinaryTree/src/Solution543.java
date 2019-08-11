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

public class Solution543 {
    // 全局变量，记录最大直径
    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        getDepth(root);
        return diameter;
    }

    // 此函数是返回树的最大深度
    private int getDepth(TreeNode root) {
        if (root == null)
            return 0;
        int l = getDepth(root.left);
        int r = getDepth(root.right);
        diameter = Math.max(diameter, l + r);
        return Math.max(l, r) + 1;
    }
}