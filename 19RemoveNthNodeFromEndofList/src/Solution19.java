/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import java.util.Stack;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return null;

        Stack<ListNode> mystack = new Stack<>();
        ListNode root = head;
        ListNode remove = null;
        ListNode previous = null;

        while(root != null){
            mystack.add(root);
            root = root.next;
        }

        if (mystack.size() == 1)
            return null;

        if (n == mystack.size())
            return head.next;

        for (int i=0;i<n;i++)
            remove = mystack.pop();

        previous = mystack.pop();

        previous.next = remove.next;

        return head;
    }
}
