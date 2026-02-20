package Pattern.BinarySearch;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start +(end - start)/2;
            if(nums[mid] >= target){
                end =  mid-1;//left side se search

            }else{
                start = mid +1;
            }


        }
        return start;

    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums, 2));
    }
}
