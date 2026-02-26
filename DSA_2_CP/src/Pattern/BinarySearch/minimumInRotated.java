package Patterns.BinarySearch;

public class minimumInRotated {
    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<  end){
            int mid = start+(end-start)/2;

            if(nums[mid] > nums[mid+1]) {
                start = mid+1;

            }else{
                end = mid;
            }
        }
        return nums[start ];

    }

    public static void main(String[] args) {
        int[] nums= { 2,3,4,5,1};
        System.out.println(findMin(nums));
    }
}
