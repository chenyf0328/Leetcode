public class Solution38 {
    public static String countAndSay(int n) {
        String seq="1";
        if (n==1)
            return "1";
        else if (n==2)
            return "11";
        else if (n==3)
            return "21";
        else
            return generateSeq("21",4,n);
    }

    public static String generateSeq(String seq, int currentIndex,int n){
        int count=0;
        String newSeq="";
        char currentChar=seq.charAt(0);
        for (int i=0;i<seq.length();i++){
            if (currentChar==seq.charAt(i))
                count++;
            else {
                newSeq=newSeq+String.valueOf(count)+currentChar;
                currentChar = seq.charAt(i);
                count = 1;
            }
        }
        newSeq=newSeq+String.valueOf(count)+currentChar;

        if (currentIndex==n)
            return newSeq;
        else
            return generateSeq(newSeq,currentIndex+1,n);
    }

    public static void main(String[] args){
        System.out.print(countAndSay(7));
    }
}
