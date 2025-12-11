package Array;

public class FindMin_In_sorted_Array {
    public static void main(String[] args) {
        int[] arr = { 1,2,4,5,6,7};
        System.out.println(findMin(arr));

    }
    public static int findMin(int[] nums) {
        int l = 0, r = nums.length-1;
        while(l<r){
            int mid = l+(r-l)/2;
            if(nums[mid] >nums[r]){
                l = mid+1;
            }else {
                r = mid;
            }

        }
        return nums[l];

    }
}
