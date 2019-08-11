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

public class Solution426 {
    private Node head = null;

    public Node treeToDoublyList(Node root) {
        if (root == null)
            return null;

        head = new Node(root.val, null, null);

        if (root.left == null && root.right == null) {
            head.left = head;
            head.right = head;
            return head;
        }

        DFShelper(root.left);
        DFShelper(root.right);

        return head;
    }

    private void DFShelper(Node root){
        if (root == null)
            return;

        Node temp = new Node(root.val, null, null);

        if (head.left == null && head.right == null) {
            head.left = temp;
            head.right = temp;

            temp.left = head;
            temp.right = head;

            if (temp.val < head.val)
                head = temp;
        }
        else{
            Node iter = head;

            if (temp.val <= head.val){
                Node findHead = head;
                while (findHead.right != head)
                    findHead = findHead.right;

                findHead.right = temp;
                temp.left = findHead;
                temp.right = head;
                head.left = temp;

                head = temp;
            }
            else {
                while (true) {
                    if (iter.val <= temp.val && iter.right.val >= temp.val) {
                        iter.right.left = temp;
                        temp.right = iter.right;
                        iter.right = temp;
                        temp.left = iter;

                        break;
                    }
                    else{
                        if (iter.right == head) {
                            iter.right.left = temp;
                            temp.right = iter.right;
                            iter.right = temp;
                            temp.left = iter;

                            break;
                        }
                        iter = iter.right;
                    }
                }
            }
        }

        DFShelper(root.left);
        DFShelper(root.right);
    }
}
