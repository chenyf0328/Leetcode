public class Solution148 {
    public ListNode sortList(ListNode head) {
        if (head==null)
            return null;

        ListNode left=head;
        ListNode right=null;
        while (left.next!=null){
            left=left.next;
        }
        right=left;
        mergeSort(head, right);

        return head;
    }

    public ListNode findMiddle(ListNode head, ListNode tail){
        ListNode slow=head;
        ListNode fast=head;
        while (fast.next!=tail.next && fast.next.next!=tail.next){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public void mergeSort(ListNode left, ListNode right){
        if (left!=right){
            ListNode mid=findMiddle(left, right);
            mergeSort(left,mid);
            mergeSort(mid.next,right);
            merge(left,right);
        }
    }

    public void merge(ListNode left, ListNode right){
        ListNode mid=findMiddle(left, right);
        ListNode i=left;
        ListNode j=mid.next;

        ListNode temp=new ListNode(-1);
        ListNode point=temp;

        while (i!=mid.next && j!=right.next){
            if (i.val<j.val) {
                temp.val = i.val;
                temp.next=new ListNode(-1);
                temp = temp.next;
                i = i.next;
            }
            else{
                temp.val = j.val;
                temp.next=new ListNode(-1);
                temp = temp.next;
                j = j.next;
            }
        }

        while (i!=mid.next){
            temp.val = i.val;
            temp.next=new ListNode(-1);
            temp = temp.next;
            i = i.next;
        }

        while (j!=right.next){
            temp.val = j.val;
            temp.next=new ListNode(-1);
            temp = temp.next;
            j = j.next;
        }

        while(left!=right.next){
            left.val=point.val;
            left=left.next;
            if (point.next!=null)
                point=point.next;
        }
    }

    public static void main(String args[]){
        ListNode head=new ListNode(4);
        ListNode h2=new ListNode(2);
        ListNode h3=new ListNode(3);
        ListNode h4=new ListNode(1);
        head.next=h2;
        h2.next=h3;
        h3.next=h4;

//        sortList(head);
    }
}
