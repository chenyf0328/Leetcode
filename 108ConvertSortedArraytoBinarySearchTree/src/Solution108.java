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

// Big O: O(n)
// Space complexity: O(logn)
public class Solution108 {
    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null)
            return null;
        if (nums.length == 0)
            return null;

        TreeNode root = new TreeNode(nums[(nums.length/2)]);
        root.left = sortArrayToBSTHelper(0, nums.length/2 -1, nums);
        root.right = sortArrayToBSTHelper(nums.length/2 + 1, nums.length - 1, nums);

        return root;
    }

    public static TreeNode sortArrayToBSTHelper(int head, int tail, int[] nums){
        if (head > tail)
            return null;

        if (head == tail) {
            TreeNode newRoot = new TreeNode(nums[head]);
            newRoot.left = null;
            newRoot.right = null;
            return newRoot;
        }

        int mid = (head + tail)/2;
        TreeNode newRoot = new TreeNode(nums[mid]);
        newRoot.left = sortArrayToBSTHelper(head, mid - 1, nums);
        newRoot.right = sortArrayToBSTHelper(mid + 1, tail, nums);

        return newRoot;
    }

    public static void main(String[] args) {
        sortedArrayToBST(new int[]{-10,-3,0,5,9});
    }
}
