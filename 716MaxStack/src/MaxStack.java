/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import java.util.ArrayList;
import java.util.List;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

public class MaxStack {

    private List<Integer> stack;
    private int maxIndex;

    public MaxStack() {
        this.stack = new ArrayList<>();
        this.maxIndex = 0;
    }

    public void push(int x) {
        this.stack.add(x);
        if (this.stack.size() == 1)
            maxIndex = 0;
        else {
            if (this.stack.get(maxIndex) <= x){
                maxIndex = this.stack.size()-1;
            }
        }
    }

    public int pop() {
        int num = this.stack.get(stack.size()-1);
        this.stack.remove(stack.size()-1);

        if (stack.size() == 0)
            return num;

        if (stack.size() == 1){
            maxIndex = 0;
            return num;
        }

        if (stack.size() == maxIndex){
            int maxNum = stack.get(stack.size()-1);
            for (int i = stack.size() - 2; i >= 0; i--) {
                if (maxNum < stack.get(i)){
                    maxNum = stack.get(i);
                    maxIndex = i;
                }
            }
        }

        return num;
    }

    public int top() {
        return this.stack.get(stack.size()-1);
    }

    public int peekMax() {
        return this.stack.get(maxIndex);
    }

    public int popMax() {
        int num = this.stack.get(maxIndex);
        this.stack.remove(maxIndex);

        if (stack.size() == 0) {
            return num;
        }

        int maxNum = stack.get(stack.size()-1);

        if (stack.size()==1)
            maxIndex = 0;
        else {
            for (int i = stack.size() - 2; i >= 0; i--) {
                if (maxNum < stack.get(i)){
                    maxNum = stack.get(i);
                    maxIndex = i;
                }
            }
        }

        return num;
    }

    /*  AC Solution
        Stack<Integer> stack;
    Stack<Integer> maxStack;
    public MaxStack() {
        stack = new Stack<>();
        maxStack = new Stack<>();
    }

    public void push(int x) {
        pushHelper(x);
    }

    public void pushHelper(int x) {
        int tempMax = maxStack.isEmpty() ? Integer.MIN_VALUE : maxStack.peek();
        if (x > tempMax) {
            tempMax = x;
        }
        stack.push(x);
        maxStack.push(tempMax);
    }

    public int pop() {
        maxStack.pop();
        return stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int peekMax() {
        return maxStack.peek();
    }

    public int popMax() {
        int max = maxStack.peek();
        Stack<Integer> temp = new Stack<>();

        while (stack.peek() != max) {
            temp.push(stack.pop());
            maxStack.pop();
        }
        stack.pop();
        maxStack.pop();
        while (!temp.isEmpty()) {
            int x = temp.pop();
            pushHelper(x);
        }
        return max;
    }
     */

}
