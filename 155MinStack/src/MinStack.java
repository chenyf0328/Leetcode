import java.util.PriorityQueue;
import java.util.Stack;

public class MinStack {
    Stack<Integer> st;
    PriorityQueue<Integer> pq;

    public MinStack() {
        st=new Stack<>();
        pq=new PriorityQueue<>();
    }

    public void push(int x) {
        pq.offer(x);
        st.push(x);
    }

    public void pop() {
        pq.remove(st.pop());
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return pq.peek();
    }
}
