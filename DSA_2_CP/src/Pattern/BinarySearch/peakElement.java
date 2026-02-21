package Pattern.BinarySearch;

public class peakElement {
    public static int findPeakElement(int[] nums) {
        int start = 0;//track index
        int end = nums.length-1;
        //run the loop till the end -1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(nums[mid]<nums[mid+1]){
                start= start+1;
            }else{
                end = mid;
            }
        }
        return start;

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(findPeakElement(nums));

    }
}
