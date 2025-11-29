package Array;

import java.util.Arrays;

public class Find_Kth_Largest {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest_Opt(arr, k));

    }
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n-k];

    }
    public static int findKthLargest_Opt(int[] nums, int k) {
         //Convert to kth smallest problem;
        k = nums.length-k;
        return quickselect(nums, 0, nums.length-1, k);
    }
    private static int quickselect(int[] nums, int left, int right , int k){
        int pivotIndex = partition(nums, left, right);
        if(pivotIndex == k){
            return nums[pivotIndex];
        } else if (pivotIndex>k) {
            return quickselect(nums, left , pivotIndex-1, k);
        }else {
            return quickselect(nums, pivotIndex+1, right , k);
        }
    }
    private static int partition(int[] nums, int left , int right ){
        int pivot = nums[right];
        int i = left-1;

        for(int j = left ; j<right; j++){
            if(nums[j] <= pivot) {
                i++;
            }
        }
        swap(nums, i+1, right);return i+1;
    }
    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]  = nums[j];
        nums[j] = temp;
    }


}
