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
    public static int findPeakElement_2(int[] nums) {
        int start = 0;//track index
        int end = nums.length-1;
        //run the loop till the end -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            //edge case
            if(mid == 0){
                if(nums[mid] > nums[mid+1]){
                    return mid;
                }else{
                    return mid+1;
                }
            } else if (mid == nums.length-1) {
                if(nums[mid-1]>nums[mid]){
                    return mid-1;
                }else{
                    return mid;
                }
            }
            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]){
                return mid;
            } else if (nums[mid]>nums[mid-1]) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;

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
        int[] nums = {1,2,3};
        System.out.println("Binary search: "+findPeakElement_2(nums));
//        System.out.println("Brute: "+ peakBrute(nums));

    }
}
