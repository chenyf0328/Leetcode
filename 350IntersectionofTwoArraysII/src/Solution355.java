import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Solution355 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length==0)
            return nums1;
        if (nums2.length==0)
            return nums2;

        List<Integer> result=new ArrayList<>();

        quickSort(nums1,0,nums1.length-1);
        quickSort(nums2,0,nums2.length-1);

        int i=0,j=0;
        while (i<nums1.length && j<nums2.length){
            if (nums1[i]==nums2[j]){
                result.add(nums1[i]);
                i++;
                j++;
            }
            else if (nums1[i]<nums2[j])
                i++;
            else
                j++;
        }

        int[] resultArray=new int[result.size()];
        Iterator<Integer> iter=result.iterator();
        int index=0;
        while(iter.hasNext()){
            resultArray[index++]=iter.next();
        }

        return resultArray;
    }

    public void quickSort(int[] num, int left, int right){
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
}
