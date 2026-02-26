package Patterns.BinarySearch;

public class Occurnace {
    public static int NumOccurance(int[] nums, int target){
        int fistOccurance = firstOcc( nums , target);
        int lastOccurance = SecondOcc( nums,  target);
        int ans = lastOccurance-fistOccurance+1;
        return ans;
    }

    public static int firstOcc(int[] nums,int target) {
        int start = 0, end= nums.length;
        int firstOccour = nums.length;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid] == target){
                firstOccour = mid ;
                end = mid-1;
            }else if(nums[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return firstOccour;
    }
    public static int SecondOcc(int[] nums,int target) {
        int start = 0, end= nums.length;
        int LastOccour = nums.length;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid] == target){
                LastOccour = mid ;
                start = mid+1;
            }else if(nums[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return LastOccour;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};
        System.out.println(NumOccurance(nums, 2) );

    }
}
