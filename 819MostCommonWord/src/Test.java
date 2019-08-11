public class Test {
    public static void main(String[] args){
        String str = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = new String[]{"hit"};
        Solution819 s= new Solution819();
        s.mostCommonWord(str, banned);
    }
}
