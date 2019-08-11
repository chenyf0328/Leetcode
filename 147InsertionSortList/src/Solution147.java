public class Solution147 {
    public static ListNode insertionSortList(ListNode head) {
//        ListNode pre=head;
//        ListNode current=head;
//        ListNode helper=null;
//        ListNode preCurrent=head;
//
//        if (head==null)
//            return null;
//
//        while (current.next!=null){
//            preCurrent=current;
//            current=current.next;
//            while (pre!=current && pre.val<=current.val){
//                helper=pre;
//                pre=pre.next;
//            }
//            if (pre!=current && pre.val>current.val) {
//                if (helper!=null) {
//                    preCurrent.next=current.next;
//                    current.next=helper.next;
//                    helper.next = current;
//                    current=preCurrent;
//                }
//                else{
//                    preCurrent.next=current.next;
//                    current.next=pre;
//                    head=current;
//                }
//            }
//
//            helper=null;
//            pre=head;
//        }
//
//        return head;

        // Solution
        ListNode helper=new ListNode(0);
        ListNode pre=helper;
        ListNode current=head;
        while(current!=null) {
            pre=helper;
            while(pre.next!=null&&pre.next.val<current.val) {
                pre=pre.next;
            }
            ListNode next=current.next;
            current.next=pre.next;
            pre.next=current;
            current=next;
        }
        return helper.next;
    }

    public static void main(String args[]){
        ListNode head=new ListNode(4);
        ListNode h2=new ListNode(19);
        ListNode h3=new ListNode(14);
        ListNode h4=new ListNode(5);
        ListNode h5=new ListNode(-3);
        ListNode h6=new ListNode(1);
        ListNode h7=new ListNode(8);
        ListNode h8=new ListNode(5);
        ListNode h9=new ListNode(11);
        ListNode h10=new ListNode(15);
        head.next=h2;
        h2.next=h3;
        h3.next=h4;
        h4.next=h5;
        h5.next=h6;
        h6.next=h7;
        h7.next=h8;
        h8.next=h9;
        h9.next=h10;
        h10.next=null;

        insertionSortList(head);
    }
}
