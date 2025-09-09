package Searching;

public class search_in_rotated_array {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,8};
        int target = 2;
        System.out.println(search2(arr, target));

    }
    // Brute force with time complexity n^2
    public static int serch(int[] nums, int target){
        int n = nums.length;
        for(int i =0; i<n; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    //Optimized approach using binary search modified
    public static int  search2(int[] nums, int target){
        int n  = nums.length;
        int start = 0, end = n-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]== target){
                return mid;
            }
            // left side sorted array
            if(nums[start] <= nums[mid]){
                if(nums[start] <= target && target<= nums[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{//right sorted
                if(nums[mid] <=target && target <= nums[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }


        }
        return -1;

    }
}
