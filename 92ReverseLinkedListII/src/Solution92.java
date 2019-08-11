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

public class Solution92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null || m >= n) {
            return head;
        }

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        head = dummyNode;

        ListNode preNode = head;            // preNode

        for (int i = 1; i < m; i++) {
            preNode = preNode.next;
        }

        // iteration
        ListNode nodeA = preNode.next;
        ListNode nodeB = preNode.next.next;
        ListNode nodeResult = nodeA;

        int i = 0;
        while (m + i < n) {
            nodeA.next = nodeB.next;
            nodeB.next = nodeResult;
            nodeResult = nodeB;
            nodeB = nodeA.next;
            i++;
        }

        preNode.next = nodeResult;

        return dummyNode.next;
    }
}
