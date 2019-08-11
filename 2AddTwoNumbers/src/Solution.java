import java.math.BigInteger;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(0);
        ListNode temp=new ListNode(0);
        int carry=0,val1=0,val2=0,sum=0;

        if (l1!=null && l2!=null){
            val1=l1.val;
            val2=l2.val;
            sum=val1+val2+carry;
            if (sum/10==1)
                result=new ListNode(sum%10);
            else
                result=new ListNode(sum);
            if (sum/10==1)
                carry=1;
            else
                carry=0;
            l1=l1.next;
            l2=l2.next;
        }
        temp=result;

        while (l1!=null && l2!=null){
            val1=l1.val;
            val2=l2.val;
            sum=val1+val2+carry;
            if (sum/10==1)
                temp.next=new ListNode(sum%10);
            else
                temp.next=new ListNode(sum);

            temp=temp.next;
            if (sum/10==1)
                carry=1;
            else
                carry=0;
            l1=l1.next;
            l2=l2.next;
        }

        if (l1==null && l2!=null){
            while(l2!=null){
                val2=l2.val;
                sum=val2+carry;
                if (sum/10==1)
                    temp.next=new ListNode(sum%10);
                else
                    temp.next=new ListNode(sum);

                temp=temp.next;
                if (sum/10==1)
                    carry=1;
                else
                    carry=0;
                l2=l2.next;
            }
        }

        if (l2==null && l1!=null){
            while(l1!=null){
                val1=l1.val;
                sum=val1+carry;
                if (sum/10==1)
                    temp.next=new ListNode(sum%10);
                else
                    temp.next=new ListNode(sum);

                temp=temp.next;
                if (sum/10==1)
                    carry=1;
                else
                    carry=0;
                l1=l1.next;
            }
        }

        if (carry==1) {
            temp.next = new ListNode(carry);
            temp = temp.next;
            temp.next = null;
        }

        temp.next=null;

        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ListNode l1=new ListNode(2);
        ListNode l2=new ListNode(4);
        ListNode l3=new ListNode(3);
        l1.next=l2;
        l2.next=l3;
        l3.next=null;

        ListNode l4=new ListNode(5);
        ListNode l5=new ListNode(6);
        ListNode l6=new ListNode(4);
        ListNode l7=new ListNode(6);
        l4.next=l5;
        l5.next=l6;
        l6.next=l7;
        l7.next=null;

        System.out.println(addTwoNumbers(l1,l4).val);
    }
}