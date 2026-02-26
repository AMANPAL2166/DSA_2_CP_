package Patterns.BinarySearch;

public class Binaraysearch {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right =nums.length-1;
        while(left<right){
            int mid = left +(right-left)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return -1;

    }
    public static int searchIndecrese(int[] nums, int target){
        //given a decrissiong array
        int start = 0, end= nums.length-1;
        while(start<=end){
            int mid = start+(end - start)/2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid]>target) {
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {8,7,6,5,4,3,2};
        System.out.println("Non-decreasing: "+search(nums, 9));
        System.out.println("decreasing: " + searchIndecrese(nums,70));
    }

}
