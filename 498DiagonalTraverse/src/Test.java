public class Test {
    public static void main(String[] args) {
        int test[][] = {{2,5},{8,4},{0,-1}};
        Solution498 s = new Solution498();
        int result[] = s.findDiagonalOrder(test);

        for (int iter: result){
            System.out.print(iter + " ");
        }
    }
}
