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
    /// ---Recursion----
    public static int search_(int[] nums,int target){
        int n = nums.length;
        return helper(nums, target, 0, n-1);
    }

    public static int  helper(int[] nums , int target,int low, int high ) {
        //base case
        if(low>high) return -1;
        int mid = low+(high-low)/2;
        if(nums[mid] == target) return mid;
        else if (nums[mid]> target) {
            return helper(nums, target, low, mid-1);
        }else{
            return helper(nums, target, mid+1, high);
        }

    }


    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        System.out.println(search_(arr,9));
    }
}
