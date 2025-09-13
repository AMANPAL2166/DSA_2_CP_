package Array;

public class Merge_sort {
    public static void main(String[] args) {


    }
    public   void merge(int[] nums1, int m, int[] nums2, int n) {

    int i = m - 1; // last element of nums1
    int j = n - 1; // last element of nums2
    int k = m + n - 1; // last position in nums1

        while (i >= 0 && j >= 0) {
        if (nums1[i] > nums2[j]) {
            nums1[k] = nums1[i];
            i--;
        } else {
            nums1[k] = nums2[j];
            j--;
        }
        k--;
    }

    // if nums2 still has elements
        while (j >= 0) {
        nums1[k] = nums2[j];
        j--;
        k--;
    }
}
}
}
