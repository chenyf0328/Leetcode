import java.util.HashMap;
import java.util.Iterator;

public class Solution138 {
    public static RandomListNode copyRandomList(RandomListNode head) {
        HashMap<RandomListNode,RandomListNode> hm=new HashMap<>();

        if (head==null)
            return null;

        RandomListNode initialHead=head;

        RandomListNode copyListHead=null;
        RandomListNode copyList=new RandomListNode(head.label);
        copyList.next=head.next;
        hm.put(head,copyList);

        copyListHead=copyList;

        head=head.next;

        while (head!=null){
            RandomListNode temp=new RandomListNode(head.label);
            copyList.next=temp;
            temp.next=head.next;
            copyList=temp;

            hm.put(head,temp);
            head=head.next;
        }

        while (initialHead!=null){
            hm.get(initialHead).random=hm.get(initialHead.random);
            initialHead=initialHead.next;
        }

        return copyListHead;
    }

    public static void main(String args[]){
        RandomListNode r1=new RandomListNode(-1);
        RandomListNode r2=new RandomListNode(-1);
        r1.next=r2;
        r2.next=null;

        copyRandomList(r1);
    }
}
