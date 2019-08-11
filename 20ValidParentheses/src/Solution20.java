import java.util.Stack;

public class Solution20 {
    public static boolean isValid(String s) {
        if (s.length()==1)
            return false;

        Stack<Character> st=new Stack<>();
        for (char c: s.toCharArray()){
            switch(c){
                case '(': st.push(')'); break;
                case '[': st.push(']'); break;
                case '{': st.push('}'); break;
                default:
                    if (st.isEmpty())
                        return false;
                    if (c!=st.pop())
                        return false;
                    break;
            }
        }
        if (st.isEmpty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        isValid("()[]{}");
    }
}
