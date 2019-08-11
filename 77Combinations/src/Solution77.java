import java.util.ArrayList;
import java.util.List;

public class Solution77 {
//    public List<List<Integer>> combine(int n, int k) {
//        List<Integer> perList=new ArrayList<>();
//        List<List<Integer>> result=new ArrayList<>();
//
//        generatePer(n,k,perList,result);
//        return result;
//    }
//
//    public void generatePer(int n, int k, List<Integer> perList, List<List<Integer>> result){
//        if (perList.size()==k){
//            if (!result.contains(perList)){
////                for (int i=0;i<k-1;i++){
////                    if (perList.get(i)>perList.get(i+1))
////                        return;
////                }
//                result.add(new ArrayList<Integer>(perList));
//            }
//        }
//        else {
//            for (int i = 1; i <= n; i++) {
//                if (!perList.contains(i)) {
//                    if (perList.size() != 0) {
//                        if (perList.get(perList.size() - 1) < i) {
//                            perList.add(i);
//                            generatePer(n, k, perList, result);
//                            perList.remove(perList.size() - 1);
//                        }
//                    }
//                    else {
//                        if (i>n-k+1){
//                            return;
//                        }
//                        else {
//                            perList.add(i);
//                            generatePer(n, k, perList, result);
//                            perList.remove(perList.size() - 1);
//                        }
//                    }
//                }
//                else
//                    continue;
//            }
//        }
//    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(k>n) return list;
        addToList(list, new ArrayList<Integer>(), k, n, 1);
        return list;
    }

    public static void addToList(List<List<Integer>> list, List<Integer> temp, int k, int n, int m){
        if(k==0){
            list.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i=m;i<=n+1-k;i++){
            temp.add(i);
            addToList(list,temp,k-1,n,i+1);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args){
        combine(4,3);
    }
}
