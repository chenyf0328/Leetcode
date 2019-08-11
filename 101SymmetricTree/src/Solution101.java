/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Map;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

/*
Time complexity : O(n). Because we traverse the entire input tree once, the total run time is O(n), where nn is the total number of nodes in the tree.
Space complexity : The number of recursive calls is bound by the height of the tree. In the worst case, the tree is linear and the height is in O(n)O(n). Therefore, space complexity due to recursive calls on the stack is O(n)O(n) in the worst case.
*/
public class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        if (root.left == null && root.right == null)
            return true;
        if ((root.left != null && root.right == null) || (root.left == null && root.right != null))
            return false;
        if (root.left.val != root.right.val)
            return false;
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode r1, TreeNode r2){
        if (r1 == null && r2 == null)
            return true;
        if (r1 == null || r2 == null)
            return false;
        return (r1.val == r2.val) && isMirror(r1.left,r2.right) && isMirror(r1.right, r2.left);
    }
}
