package Pattern.BinarySearch;

public class FloorElement {
    public static int floor(int[] nums, int target){
        int st = 0;
        int end = nums.length;
        int result = 0;
        while(st<end){
            int mid = st+(end-st)/2;
            if(nums[mid] == target){
                return nums[mid];
            } else if (nums[mid] > target) {
                end = mid-1;

            }else{
                result = nums[mid];
                st = mid+1;

            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,8,9};
        System.out.println(floor(nums,3));
    }
}
