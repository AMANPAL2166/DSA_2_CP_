package Pattern.BinarySearch;

import java.util.Arrays;

public class SortedRotatedArray {
    public static int search(int[] nums, int target) {
        int start = 0;
        int end= nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid] == target) {
                return mid;
            }
            //check which side is sorted
            if(nums[start]<nums[mid] ){//left part is sorted
                if(nums[start]<= target && target<nums[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{//right part is sorted
                if(nums[mid]< target && target<=nums[end]){
                    start= mid+1;
                }else{
                    end = mid-1;
                }

            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] start = {4,5,6,7,0,1,2};
        System.out.println(search(start,0));

    }
}
