/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import java.util.Stack;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

public class BSTIterator {

    Stack<TreeNode> stack;
    TreeNode root = null;

    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        this.root = root;
        TreeNode tmp = root;

        while (tmp != null) {
            stack.push(tmp);
            tmp = tmp.left;
        }

    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if (this.stack.isEmpty())
            return false;
        else
            return true;
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode iter = stack.pop();
        TreeNode tmp = null;
        if (iter.right != null){
            tmp = iter.right;
            while (tmp != null) {
                stack.push(tmp);
                tmp = tmp.left;
            }
        }

        return iter.val;
    }

}
