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
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        String result = new String();
        Stack<Character> nestStack = null;

        for (int i = 0;i<s.length();i++){
            if (s.charAt(i) != ']')
                stack.push(s.charAt(i));
            else{
                StringBuilder sb = new StringBuilder();
                nestStack = new Stack<>();
                while (stack.peek() != '[')
                    nestStack.push(stack.pop());
                stack.pop();

                while (!nestStack.isEmpty()){
                    sb.append(nestStack.pop());
                }
                String temp = sb.toString();

                String timeStr = "";
                int times = 0;
                Stack<Character> numStack = new Stack<>();
                while (!stack.isEmpty() && stack.peek() >= '0' && stack.peek() <= '9')
                    numStack.push(stack.pop());
                while (!numStack.isEmpty())
                    timeStr += numStack.pop();
                times = Integer.parseInt(timeStr);

                for (int j = 0;j < times; j++) {
                    for (int k=0;k<temp.length();k++) {
                        stack.push(temp.charAt(k));
                    }
                }
            }
        }

        Stack<Character> resultStack = new Stack<>();
        while (!stack.isEmpty()){
            resultStack.push(stack.pop());
        }

        while (!resultStack.isEmpty()){
            result += resultStack.pop();
        }

        return result;
    }
}
