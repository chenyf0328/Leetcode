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
import java.util.Stack;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

public class Solution {
    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null)
            return result;

        boolean flag = false;           // false: left -> right, true: right -> left

        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        traversal(flag, list);

        return result;
    }

    public void traversal(boolean flag, List<TreeNode> list){
        if (list.size() == 0)
            return;

        if (flag){
            List<Integer> nest = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();

            for (int i=0;i<list.size();i++) {
                if (list.get(i) != null){
                    nest.add(list.get(i).val);

                    stack.push(list.get(i).right);
                    stack.push(list.get(i).left);
                }
            }

            if (nest.size() != 0)
                result.add(nest);

            List<TreeNode> next = new ArrayList<>();
            while (!stack.isEmpty()){
                next.add(stack.pop());
            }

            traversal(flag = false, next);
        }
        else{
            Stack<TreeNode> stack = new Stack<>();
            List<Integer> nest = new ArrayList<>();

            for (int i=0;i<list.size();i++){
                if (list.get(i) != null){
                    nest.add(list.get(i).val);

                    stack.push(list.get(i).left);
                    stack.push(list.get(i).right);
                }
            }

            if (nest.size() != 0)
                result.add(nest);

            List<TreeNode> next = new ArrayList<>();
            while (!stack.isEmpty()){
                next.add(stack.pop());
            }

            traversal(flag = true, next);
        }
    }
}
