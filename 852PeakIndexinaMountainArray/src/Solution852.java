public class Solution852 {
    public int peakIndexInMountainArray(int[] A) {
        int peak = 0;

        for (peak = 1; peak <= A.length-1; peak++)
            if (A[peak]>A[peak+1])
                return peak;

        return 0;
    }
}
