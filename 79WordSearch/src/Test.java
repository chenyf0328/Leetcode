public class Test {
    public static void main(String[] args){
        Solution79 s = new Solution79();
//        char[][] board = new char[][]{{'A','B','C','E'},
//                                      {'S','F','C','S'},
//                                      {'A','D','E','E'}};
//        s.exist(board,"ABCCED");

        char[][] board = new char[][]{{'a','a','a','a'},{'a','a','a','a'},{'a','a','a','a'}};
        s.exist(board,"aaaaaaaaaaaaa");
    }
}
