public class Solution430 {
    Node returnResult = null;
    Node result = null;

    public Node flatten(Node head){

        if (head != null) {
            result = new Node();
            result.val = head.val;
            returnResult = result;
            helper(head);
        }
        else
            return null;

        return returnResult;
    }

    public void helper(Node root) {
        if (root == null)
            return;

        if (root.child != null) {
            result.next = new Node(root.child.val,null,null,null);
            result.next.prev = result;
            result = result.next;

            helper(root.child);
        }
        if (root.next != null) {
            result.next = new Node(root.next.val,null,null,null);
            result.next.prev = result;
            result = result.next;
        }
        helper(root.next);
    }
}
