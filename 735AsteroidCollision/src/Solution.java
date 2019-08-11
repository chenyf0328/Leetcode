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
    public int[] asteroidCollision(int[] asteroids) {
        if (asteroids == null)
            return null;

        if (asteroids.length == 0 || asteroids.length == 1)
            return asteroids;

        Stack<Integer> stack = new Stack<>();
        stack.push(asteroids[0]);

        for (int i=1;i<asteroids.length;i++){
            if (stack.isEmpty()){
                stack.push(asteroids[i]);
                continue;
            }

            if (((asteroids[i] ^ stack.peek()) >>> 31) == 1){
                if (asteroids[i] > 0){
                    stack.push(asteroids[i]);
                }
                else{
                    while (!stack.isEmpty()){
                        if (((asteroids[i] ^ stack.peek()) >>> 31) == 1) {
                            if (Math.abs(asteroids[i]) > stack.peek()) {
                                stack.pop();
                                if (stack.isEmpty()){
                                    stack.push(asteroids[i]);
                                    break;
                                }
                            } else if (Math.abs(asteroids[i]) == stack.peek()) {
                                stack.pop();
                                break;
                            } else {
                                break;
                            }
                        }
                        else{
                            stack.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
            else{
                stack.push(asteroids[i]);
            }
        }

        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty())
            temp.push(stack.pop());

        int length = temp.size();
        int[] result = new int[temp.size()];
        for (int i=0;i<length;i++)
            result[i] = temp.pop();

        return result;
    }
}
