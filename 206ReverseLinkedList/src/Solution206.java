import java.util.Iterator;
import java.util.Stack;

public class Solution206 {
    public static ListNode reverseList(ListNode head) {
        ListNode result=new ListNode(0);
        ListNode node=null;
        Stack<Integer> st=new Stack<Integer>();

        if (head==null)
            return null;

        while (head!=null){
            st.push(head.val);
            head=head.next;
        }

        result.val=st.pop();
        result.next=null;
        if (!st.isEmpty()) {
            node=new ListNode(st.pop());
            result.next = node;
            node.next=null;
        }

        while (!st.isEmpty()){
            int temp=st.pop();
            node.next=new ListNode(temp);
            node.next.next=null;
            node=node.next;
        }

        return result;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        l1.next=l2;
        l2.next=null;

        reverseList(l1);
    }
}
