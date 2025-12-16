package Sorting;

import java.util.Arrays;

/// / Question::-- Given 2 array, condition is arr1[i]+ arr2[i]>=k then we return true otherwise  return false.
/// Approach:::- We can sort the array in a way like one with ascending and another one with descending. Soo that we can meet greatest arr of i with smallesst one.

public class PermutationInArray {
    public static void main(String[] args) {
        int[] arr1  = {1, 2, 2, 1};
        int[] arr2 = {3, 3, 3, 4};
        int target  = 5;
        System.out.println(isPossible(target, arr1, arr2));


    }
    public static boolean isPossible(int k, int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0; i<arr2.length/2; i++){
            int temp = arr2[i];
            arr2[i] = arr2[arr2.length-1-i];
            arr2[arr2.length-1-i] = temp;
        }
        //check if every pair sum  is greater than k
        for(int i = 0; i<arr2.length; i++){
            if(arr1[i] + arr2[i] <k){
                return false;
            }
        }
        return true;
    }
}
