package Recurssion;

import java.util.Arrays;

public class Sort {
    public static void insertationSort(int[] nums, int n){
        //base case
        if( n==1 ){
            return;
        }
        //call function
        insertationSort(nums, n-1);
        //insert last element to it's correct position in a sorted array
        int last = nums[n-1];
        int j = n-2;
         /* Move elements of arr[0..i-1], that are
          greater than key, to one position ahead
          of their current position */
        while(j>=0 && nums[j]>last) {
            nums[j+1] = nums[j];
            j--;
        }
        nums[j+1] = last;


    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6};

        insertationSort(arr, arr.length);

        System.out.println(Arrays.toString(arr));
    }
}
