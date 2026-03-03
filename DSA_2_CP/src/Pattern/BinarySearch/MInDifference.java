package Pattern.BinarySearch;

public class MInDifference {
    public static int minDifference(int[] nums, int ele) {
        int st = 0, end = nums.length-1;
        int ans = 0;
        while (st<=end) {
            int mid = st+(end-st)/2;
            if(nums[mid] == ele){
                return mid;
            } else if (nums[mid]<ele) {
                st = mid+1;
            }else{
                if( Math.abs(ele -nums[mid])> Math.abs(ele- nums[mid-1]) ){
                    ans = mid-1;
                }else{
                    ans = mid;
                }
                end = mid-1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6,7,11,18};
        System.out.println(minDifference(nums, 15));
    }
}
