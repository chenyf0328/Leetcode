import java.util.*;

class Solution515 {
    private int levelMax;
    private List<Integer> result = new ArrayList<>();
    private Queue<TreeNode> myQueue = new ArrayDeque<>();
    private Queue<TreeNode> newMyQueue = new ArrayDeque<>();

    public List<Integer> largestValues(TreeNode root) {
        levelMax = Integer.MIN_VALUE;
        if (root != null) {
            result.add(root.val);

            myQueue.offer(root);
            BFS();
        }

        return result;
    }

    public void BFS(){
        boolean changeFlag = false;
        while (myQueue.size() != 0) {
            levelMax = Integer.MIN_VALUE;
            while (myQueue.size() != 0) {
                TreeNode u = myQueue.poll();
                if (u.left != null) {
                    newMyQueue.offer(u.left);
                    if (levelMax <= u.left.val) {
                        changeFlag = true;
                        levelMax = u.left.val;
                    }
                }
                if (u.right != null) {
                    newMyQueue.offer(u.right);
                    if (levelMax <= u.right.val) {
                        changeFlag = true;
                        levelMax = u.right.val;
                    }
                }
            }

            if (changeFlag == true)
                result.add(levelMax);

            changeFlag = false;

            Iterator<TreeNode> iter = newMyQueue.iterator();
            while (iter.hasNext()) {
                myQueue.offer(iter.next());
            }

            newMyQueue.clear();
        }
    }
}