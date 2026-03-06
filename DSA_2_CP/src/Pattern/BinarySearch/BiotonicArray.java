package Pattern.BinarySearch;

public class BiotonicArray {
    public static int findBiotonic(int[] nums) {
        int st = 0, end = nums.length;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]){
                return mid;
            } else if (nums[mid]>nums[st]) {
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,1,2};
        System.out.println(findBiotonic(nums));
    }
}
