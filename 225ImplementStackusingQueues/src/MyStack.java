/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

public class MyStack {

    private Queue<Integer> q1;
    private Queue<Integer> q2;

    /** Initialize your data structure here. */
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if (empty()){
            q1.offer(x);
        }
        else if (q1.size() != 0){
            q1.offer(x);
        }
        else{
            q2.offer(x);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int size = 0;
        if (q1.size() != 0) {
            size = q1.size();
            for (int i = 0; i < size - 1; i++) {
                q2.offer(q1.poll());
            }
            return q1.poll();
        }
        else {
            size = q2.size();
            for (int i = 0; i < size - 1; i++) {
                q1.offer(q2.poll());
            }
            return q2.poll();
        }
    }

    /** Get the top element. */
    public int top() {
        int topNum = 0;
        int size = 0;

        if (q1.size() != 0) {
            size = q1.size();
            for (int i = 0; i < size - 1; i++) {
                q2.offer(q1.poll());
            }
            topNum = q1.poll();
            q2.offer(topNum);
        }
        else {
            size = q2.size();
            for (int i = 0; i < size - 1; i++) {
                q1.offer(q2.poll());
            }
            topNum = q2.poll();
            q1.offer(topNum);
        }
        return topNum;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        if (q1.size() == 0 && q2.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }

}
