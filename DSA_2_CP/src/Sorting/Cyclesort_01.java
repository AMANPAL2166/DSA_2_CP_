//Given an array arr[] of size n-1 with distinct integers in the range of [1, n]. This array represents a permutation of the integers from 1 to n with one element missing. Find the missing element in the array.
//https://www.geeksforgeeks.org/dsa/find-the-missing-number/
package Sorting;
//First explain Cycle_sort:- Cycle sort is all about for those question whose range between 0-n. It's better time & space compalaxity.

//Given an array arr[] of size n-1 with distinct integers in the range of [1, n]. This array represents a permutation of the integers from 1 to n with one element missing. Find the missing element in the array.
//Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
//Output: 6
//Explanation: All the numbers from 1 to 8 are present except 6.

//Input: arr[] = [1, 2, 3, 5]
//Output: 4
//Explanation: Here the size of the array is 4, so the range will be [1, 5]. The missing number between 1 to 5 is 4


import java.util.Arrays;

//-----/::) MOre code will upload on 29-08-2025
public class Cyclesort_01 {

    static int  missingNum(int[]arr){
        int n = arr.length;
        int i = 0;
        while (i<n){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                //swap
                swap(arr, i, correctIndex);

            }else{
                i++;
            }
        }
        for(int j = 0; j<n; j++){
            if(arr[j] != j+1){
                return j+1;
            }
        }
        return n+1;

    }
    static void swap(int[] arr, int i , int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,5,6};

        int missing = missingNum(arr);
        System.out.println( "Original Arrays:" +  Arrays.toString(arr));
        System.out.println("Missing Arrays: " + missing);

    }

}
