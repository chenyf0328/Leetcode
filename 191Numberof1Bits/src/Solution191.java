public class Solution191 {
    public int hammingWeight(int n) {
//        int number=Math.abs(n);
//        int remain=0;
//        int count=0;
//
//        if (number==0)
//            return 0;
//
//        while (number!=1){
//            remain=number%2;
//            if (remain==1)
//                count++;
//            number=number/2;
//        }
//        return ++count;

        int count=0;
        int mask=1;
        for (int i=0;i<32;i++){
            if ((n & mask)!=0){
                count++;
            }
            mask=mask << 1;
        }
        return count;
    }
}
