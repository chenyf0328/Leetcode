import java.util.HashMap;
import java.util.LinkedList;

public class LRUCache {
    private int capacity=0;
    private int realNum=0;

    private ListNode myLL;
    private HashMap<Integer,Integer> hp=null;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        myLL=null;
        hp=new HashMap<>();
    }

    public int get(int key) {
        ListNode temp=myLL;
        if (hp.containsKey(key)==true){
            while (temp!=null){
                if (temp.key==key) {
                    if (temp!=myLL && temp.next!=null) {
                        temp.prev.next = temp.next;
                        temp.next.prev = temp.prev;
                        temp.next = myLL;
                        myLL.prev = temp;
                        temp.prev = null;
                        myLL=temp;
                    }
                    else if (temp==myLL){
                        return temp.value;
                    }
                    else if (temp.next==null){
                        temp.next=myLL;
                        temp.prev.next=null;
                        myLL.prev=temp;
                        myLL=temp;
                    }

                    return temp.value;
                }
                else
                    temp=temp.next;
            }
        }
        else
            return -1;

        return 0;
    }

    public void put(int key, int value) {
        ListNode temp=myLL;
        if (realNum<capacity) {
            if (hp.containsKey(key) == true) {
                if (temp.next==null) {
                    temp.key = key;
                    temp.value=value;
                }

                while (temp.next != null) {
                    if (temp.key == key) {
                        temp.value = value;

                        myLL.prev = temp;
                        temp.prev.next = temp.next;
                        temp.next.prev = temp.prev;
                        temp.next = myLL;
                        myLL.prev = temp;
                        temp.prev = null;
                        myLL=temp;

                        return;
                    }
                    else
                        temp = temp.next;
                }
            }
            else {
                hp.put(key,key);
                temp = myLL;

                if (temp==null){
                    temp=new ListNode();
                    temp.key=key;
                    temp.value=value;
                    temp.next=null;
                    myLL=temp;
                }
                else {
                    while (temp.next != null)
                        temp = temp.next;
                    temp.next = new ListNode(key, value);
                    temp.next.prev = temp;
                    temp.next.next = null;

                    temp.next.next=myLL;
                    myLL.prev=temp.next;
                    temp.next.prev=null;
                    myLL=temp.next;
                    temp.next=null;
                }
                realNum++;
            }
        }
        else{
            if (hp.containsKey(key) == true) {
                if (temp.key==key){
                    temp.value=value;
                    return;
                }

                if (temp.next==null) {
                    temp.key = key;
                    temp.value=value;
                }

                while (temp.next != null) {
                    if (temp.key == key) {
                        temp.value = value;

                        myLL.prev = temp;
                        temp.prev.next = temp.next;
                        temp.next.prev = temp.prev;
                        temp.next = myLL;
                        myLL.prev = temp;
                        temp.prev = null;
                        myLL=temp;

                        return;
                    }
                    else
                        temp = temp.next;
                }

                temp.value=value;

                temp.prev.next=null;
                temp.next=myLL;
                myLL.prev=temp;
                temp.prev=null;
                myLL=temp;
            }
            else {
                temp = myLL;
                ListNode tempPrev = null;
                while (temp.next != null) {
                    temp = temp.next;
                }
                hp.remove(temp.key);
                hp.put(key, key);
                if (temp != myLL) {
                    tempPrev = temp.prev;
                    temp = new ListNode(key, value);
                    tempPrev.next = temp;
                    temp.prev = tempPrev;
                    temp.next = null;

                    tempPrev.next = null;
                    temp.next = myLL;
                    myLL.prev = temp;
                    temp.prev = null;
                    myLL = temp;
                }
                else {
                    myLL.key = key;
                    myLL.value = value;
                }
            }
        }
    }
}
