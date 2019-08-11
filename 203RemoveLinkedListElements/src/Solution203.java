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

public class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;

        if (head.next == null)
            if (head.val == val)
                return null;
            else
                return head;

        ListNode iter = head;

        while (iter.val == val){
            head = iter.next;
            iter = iter.next;

            if (head == null)
                return null;
        }

        iter = head;

        while (iter.next != null){
            if (iter.next.val == val){
                iter.next = iter.next.next;
            }
            else{
                iter = iter.next;
            }
        }

        return head;
    }
}
