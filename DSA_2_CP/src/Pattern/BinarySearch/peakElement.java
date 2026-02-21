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
    public static int peakBrute(int[] nums){
        int n= nums.length;
        //run the loop till the n-1
        for(int i = 0;i<nums.length-1 ;i++){
            if(nums[i] > nums[i+1]){
                return i;
            }

        }
        return n-1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,9};
        System.out.println("Binary search: "+findPeakElement(nums));
//        System.out.println("Brute: "+ peakBrute(nums));

    }
}
