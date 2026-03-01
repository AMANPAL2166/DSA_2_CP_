package Pattern.BinarySearch;

public class CeilInsorted {
    public static int ceil(int[] nums, int ele){
        int st = 0, end = nums.length;
        int ans = -1;
        while(st<end){
            int mid = st+(end-st)/2;
//            if(nums[mid] == ele){
//                return nums[mid];
//            }
            if(nums[mid]>ele){
                ans = nums[mid];
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6,7};
        System.out.println(ceil(nums,6));
    }
}
