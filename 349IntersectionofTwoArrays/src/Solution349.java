import java.util.HashSet;
import java.util.Iterator;

public class Solution349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length==0)
            return nums1;
        if (nums2.length==0)
            return nums2;

//        int size=(nums1.length>nums2.length) ? nums1.length : nums2.length;
//        int[] resultArray=new int[size];
        HashSet<Integer> result=new HashSet<>();

        quickSort(nums1,0,nums1.length-1);
        quickSort(nums2,0,nums2.length-1);

        if (nums1.length<=nums2.length)
            for (int i=0;i<nums2.length;i++){
                for (int j=0;j<nums1.length;j++){
                    if (nums2[i]==nums1[j]){
                        result.add(nums2[i]);
                        break;
                    }
                }
            }
        else
            for (int i=0;i<nums1.length;i++){
                for (int j=0;j<nums2.length;j++){
                    if (nums1[i]==nums2[j]){
                        result.add(nums1[i]);
                        break;
                    }
                }
            }

        int[] resultArray=new int[result.size()];
        Iterator<Integer> iter=result.iterator();
        int index=0;
        while(iter.hasNext()){
            resultArray[index++]=iter.next();
        }

        return resultArray;
    }

    public static void quickSort(int[] num, int left, int right){
        int i,j,t,temp;
        if (left>right)
            return;

        temp=num[left];
        i=left;
        j=right;
        while(i!=j){
            while (num[j]>=temp && i<j){
                j--;
            }
            while (num[i]<=temp && i<j){
                i++;
            }
            if (i<j){
                t=num[i];
                num[i]=num[j];
                num[j]=t;
            }
        }

        num[left]=num[i];
        num[i]=temp;

        quickSort(num,left,i-1);
        quickSort(num,i+1,right);
    }

    public static void main(String[] args){
        intersection(new int[]{},new int[]{1});
    }
}
