import java.util.*;

public class Solution402 {
    public String removeKdigits(String num, int k) {
        if (k == 0)
            return num;
        if (k == num.length())
            return "0";

        char[] numSplit = num.toCharArray();
        Stack<Character> stack = new Stack<>();
        Stack<Integer> stackIndex = new Stack<>();
        List<Integer> removeList = new ArrayList<>();
        String result = "";

        stack.push(numSplit[0]);
        stackIndex.push(0);
        for (int i=1;i<numSplit.length;i++){
            if (stack.peek()<numSplit[i]){
                removeList.add(i);
            }
            else if (stack.peek()>numSplit[i]){
                stack.pop();
                removeList.add(stackIndex.pop());
                stack.push(numSplit[i]);
                stackIndex.push(i);
            }
            else{
                if (numSplit.length - i == k-i+stack.size()){
                    for (int j=i;j<numSplit.length;j++){
                        removeList.add(j);
                    }
                    break;
                }
                else {
                    stack.push(numSplit[i]);
                    stackIndex.push(i);
                }
            }

            if (removeList.size() == k)
                break;
        }

        removeList.sort(new Comparator<Integer>(){
            public int compare(Integer arg0, Integer arg1) {
                return arg0 - arg1 <= 0 ? -1 : 1;
            }
        });

        result += num.substring(0, removeList.get(0));
        for (int i=0;i<removeList.size()-1;i++){
            result += num.substring(removeList.get(i)+1, removeList.get(i+1));
        }

        result += num.substring(removeList.get(removeList.size()-1)+1, num.length());

        for (int i=0;i<result.length();i++){
            if (result.charAt(0) == '0'){
                result = result.substring(1, result.length());
                continue;
            }
            else
                break;
        }

        if (result.equals(""))
            result = "0";

        return result;
    }
}


/*
* other's solution: AC
*
* if(k == 0 || num.length() == 0) return num;
         if(k == num.length()) return "0";

         for(int i = 0; i < k;i++)
         {
             int j = 0;
             if(j+1 < num.length() && num.charAt(j+1) == '0')  num = num.substring(2);
             else
             {
                boolean finish = false;
                j = 0;
                while(j+1 < num.length())
                {
                    if(num.charAt(j) <= num.charAt(j+1)) j++;
                    else
                    {
                        finish = true;
                        num = num.substring(0,j) + num.substring(j+1);
                        break;
                    }
                }

                if(!finish) num = num.substring(0,num.length()-1);
             }



            int z = 0;
            while(z < num.length() && num.charAt(z) == '0') z++;
            num = num.substring(z);

         }
         if(num.length() == 0) return "0";
         return num;
* */