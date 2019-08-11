public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,count=0;
        int[] temp=new int[m+n];

        while (i<m && j<n){
            if (nums1[i]<nums2[j]){
                temp[count++]=nums1[i++];
            }
            else{
                temp[count++]=nums2[j++];
            }
        }

        while(i<m){
            temp[count++]=nums1[i++];
        }

        while(j<n){
            temp[count++]=nums2[j++];
        }

        count=0;

        for (int k=0;k<m+n;k++){
            nums1[count]=temp[count];
            count++;
        }
    }
}
