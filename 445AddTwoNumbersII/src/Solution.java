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

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        ListNode result;
        ListNode temp;
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        int carry = 0;

        temp = l1;
        if (temp.next == null)
            stack1.push(temp.val);
        else {
            while (!(temp.next == null)) {
                stack1.push(temp.val);
                temp = temp.next;
            }
            stack1.push(temp.val);
        }

        temp = l2;
        if (temp.next == null)
            stack2.push(temp.val);

        else {
            while (!(temp.next == null)) {
                stack2.push(temp.val);
                temp = temp.next;
            }
            stack2.push(temp.val);
        }

        result = new ListNode(0);
        temp = result;
        while (!stack1.isEmpty() && !stack2.isEmpty()){
            int add = stack1.pop() + stack2.pop() + carry;
            temp.next = new ListNode(add % 10);
            carry = add / 10;
            temp = temp.next;
        }

        if (stack1.isEmpty() && stack2.isEmpty()) {
            if (carry != 0)
                temp.next = new ListNode(carry);
        }
        else{
            if (!stack1.isEmpty()) {
                while (!stack1.isEmpty()) {
                    int add = stack1.pop() + carry;
                    carry = add / 10;
                    temp.next = new ListNode(add % 10);
                    temp = temp.next;
                }
                if (carry != 0)
                    temp.next = new ListNode(carry);
            }

            if (!stack2.isEmpty()) {
                while (!stack2.isEmpty()) {
                    int add = stack2.pop() + carry;
                    carry = add / 10;
                    temp.next = new ListNode(add % 10);
                    temp = temp.next;
                }
                if (carry != 0)
                    temp.next = new ListNode(carry);
            }
        }

        temp = result.next;
        if (temp.next == null)
            return temp;

        Stack<Integer> resultStack = new Stack<>();
        while (!(temp.next == null)) {
            resultStack.push(temp.val);
            temp = temp.next;
        }
        resultStack.push(temp.val);

        result = new ListNode(resultStack.pop());
        temp = result;
        while (!resultStack.isEmpty()){
            temp.next = new ListNode(resultStack.pop());
            temp = temp.next;
        }

        return result;
    }
}
