package NEETCODE.BINARY_SEARCH;

public class Binary_Search {
    public static int search(int[] nums, int target) {
        int n = 0;
        int m = nums.length-1;
        while(n<=m){
            int mid = n + (m-n)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                m = mid-1 ;
            }else{
                n = mid +1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        System.out.println(search(arr,2));
    }
}
