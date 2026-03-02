package Pattern.BinarySearch;

public class findOneInInfinite {
    public static int firstOccrence(int[] nums  ){
        int st = 0, end = 1;
        while(nums[end]<1){
            st = end;
            end = end*2;

        }
        //now we can use first occurance binary seach
        int ans = 0;
        while(st<=end){
            int mid = st+(end -st)/2;
            if(nums[mid] >=1 ){
                ans = mid;
                end = mid-1;

            } else if (nums[mid]>1) {
                end = mid-1;
            } else{
                st = mid+1;
            }



        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = {0,0,0, 1,1,1,1};
        System.out.println(firstOccrence(nums));
    }
}
