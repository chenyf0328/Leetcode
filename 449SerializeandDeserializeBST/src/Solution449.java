import java.util.ArrayList;

public class Solution449 {
    private ArrayList<TreeNode> serial_list = new ArrayList<>();
    private String result = "0";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null)
            return "";

        serial_list.add(root);

        for (int i=0;i<serial_list.size();i++){
            TreeNode newNode = serial_list.get(i);

            if (newNode == null) {
                serial_list.add(new TreeNode(Integer.MIN_VALUE));
                serial_list.add(new TreeNode(Integer.MIN_VALUE));
            }
            else if (newNode.val != Integer.MIN_VALUE) {
                serial_list.add(newNode.left);
                serial_list.add(newNode.right);
            }
        }

        for (int i=0;i<serial_list.size();i++){
            result += (serial_list.get(i) == null) ? " ," : " " + serial_list.get(i).val;
        }

        return result;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        TreeNode newRoot = null;

        if (data == " ")
            return null;

        String[] strArr = data.split(" ");

        newRoot = DFS(strArr, 1, newRoot);

        return newRoot;
    }

    public TreeNode DFS(String[] strArr, int i, TreeNode root){
        if (i >= strArr.length)
            return null;

        if (!strArr[i].equals(",") && Integer.parseInt(strArr[i]) != Integer.MIN_VALUE)
            root = new TreeNode(Integer.parseInt(strArr[i]));
        else if (strArr[i].equals(",")){
            root = null;
            return null;
        }
        else{
            return root;
        }

        root.left = DFS(strArr, 2*i, root.left);
        root.right = DFS(strArr, 2*i+1, root.right);

        return root;
    }
}
