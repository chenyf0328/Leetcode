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

/*
Time complexity: O(N), where N is a number of nodes in the tree, since one visits each node exactly once.

Space complexity: O(log(N)) in the best case of completely balanced tree and \mathcal{O}(N)O(N) in the worst case of completely unbalanced tree, to keep a recursion stack.
*/
public class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return dfs(p, q);
    }

    public boolean dfs(TreeNode pr, TreeNode qr){
        if (pr == null && qr == null)
            return true;
        if (pr == null || qr == null)
            return false;
        return (pr.val == qr.val) && dfs(pr.left, qr.left) && dfs(pr.right, qr.right);
    }
}