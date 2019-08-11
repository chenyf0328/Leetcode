/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import java.util.ArrayList;
import java.util.List;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

/*
    Time Complexity: O(n)
    Space Complexity: O(n) 递归缓存
 */

public class Solution366 {

    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> findLeaves(TreeNode root) {
        while(root!=null){
            List<Integer> tmp = new ArrayList<>();
            root = findLeavesHelper(root, tmp);
            result.add(tmp);
        }

        return result;
    }

    public TreeNode findLeavesHelper(TreeNode root, List<Integer> tmp){
        if (root.left == null && root.right == null) {
            tmp.add(root.val);
            return null;
        }

        if (root.left != null)
            root.left = findLeavesHelper(root.left, tmp);

        if (root.right != null)
            root.right = findLeavesHelper(root.right, tmp);

        return root;
    }

}
