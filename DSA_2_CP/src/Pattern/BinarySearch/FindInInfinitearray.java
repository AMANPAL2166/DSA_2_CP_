package Pattern.BinarySearch;

public class FindInInfinitearray {
    public static int findInINfin(int[] nums, int target){
        //we don't know last index so that first we need to find end which is greater than target
        int st  = 0, end = 1;
        while(target>nums[end]){
            st = end;
            end = end*2;
        }
        //new we can use binary search
        while(st<  end-1 ){
            int mid = st+(end-st)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid]>target){
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums ={1,4,6,7};
        System.out.println(findInINfin(nums,7));
    }
}
