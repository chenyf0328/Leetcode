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

public class Solution234 {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // slow is the middle of List
        while (slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode next = null;
        ListNode prev = null;
        ListNode curr = slow;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // check one by one
        while (prev != null && head != null){
            if (prev.val != head.val){
                return false;
            }
            prev = prev.next;
            head = head.next;
        }

        return true;
    }
}
