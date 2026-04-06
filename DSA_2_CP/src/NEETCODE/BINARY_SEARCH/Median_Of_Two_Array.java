package NEETCODE.BINARY_SEARCH;

public class Median_Of_Two_Array {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int[] merge = new int[m+n];
        int i=0,j=0,k = 0;
        while(i<n && j<m){
            if(nums1[i] <nums2[j]){
                merge[k++] = nums1[i++];
            }else{
                merge[k++]  = nums2[j++];
            }
        }
        while (i<n) merge[k++] = nums1[i++];
        while(j<m) merge[k++] = nums2[j++];
        int total = n+m;
        if(total % 2 ==1){
            return merge[total/2];
        }else{
            return (merge[total/2-1]+merge[total/2])/2.0;
        }

    }
}
