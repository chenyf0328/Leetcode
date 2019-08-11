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
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);

        Solution s = new Solution();
        s.addTwoNumbers(l1, l2);
    }
}
