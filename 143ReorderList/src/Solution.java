/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import java.util.LinkedList;
import java.util.List;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

public class Solution {
    public void reorderList(ListNode head) {
        if (head == null)
            return;

        if (head.next == null)
            return;

        LinkedList<ListNode> list = new LinkedList<>();
        ListNode temp = head;
        while (temp.next != null){
            list.add(temp);
            temp = temp.next;
        }
        list.add(temp);

        int length = list.size();

        ListNode result = new ListNode(list.get(0).val);
        temp = result;
        for (int i=0;i<length/2;i++){
            temp.next = list.get(i);
            temp.next.next = list.get(length - i - 1);
            temp = temp.next.next;
        }
        if (length % 2 == 0){
            temp.next = null;
            return;
        }
        else{
            temp.next = list.get(length/2);
            temp.next.next = null;
        }

        head = result.next;

    }
}
