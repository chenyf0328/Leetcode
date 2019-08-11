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

public class Test {
    public static void main(String[] args){
        Node head = new Node(4, null, null);
        Node node1 = new Node(2, null, null);
        Node node2 = new Node(1, null, null);
        Node node3 = new Node(3, null, null);
        Node node4 = new Node(5, null, null);

        head.left = node1;
        head.right = node4;
        node1.left = node2;
        node1.right = node3;

        Solution426 s = new Solution426();
        s.treeToDoublyList(head);
    }
}
