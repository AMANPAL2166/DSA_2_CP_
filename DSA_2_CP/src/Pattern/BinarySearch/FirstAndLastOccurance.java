package Pattern.BinarySearch;

public class FirstAndLastOccurance {
    public static int firstOccur(int[] nums, int tar){
        int st = 0, end = nums.length;
        int ans = 0;
        while(st<=end){
            int mid = st+(end - st)/2;
            if(nums[mid] == tar){
                ans = mid;
                end = mid-1;
            } else if (nums[mid] > tar) {
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        return ans;
    }
    public static int lastOccuce(int[] nums, int tar){
        int st = 0, end= nums.length;
        int ans = 0;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(nums[mid] == tar){
                ans = mid;
                st = mid+1;
            } else if (nums[mid] > tar) {
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,4,4,4,4,4,5,6};
        System.out.println("First occurance: " + firstOccur(nums,4));
        System.out.println("Last occurance: "+ lastOccuce(nums, 4));
    }
}
