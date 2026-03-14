package Recurssion;

public class FirstOccurance {
    public static int firstOccurance(int[] arr, int tar, int idx) {
        /// This method is good but not best, becoz we can get target before second iteration. Write 2nd method below.
        if(idx == arr.length){
            return -1;
        }
        int firstOcc = firstOccurance(arr,tar,idx+1);
        if(arr[idx] == tar){
            return idx;


        }else{
           return firstOcc;
        }
    }
    public static int firstOccurance_2(int[] arr, int tar, int idx) {
         if(idx == arr.length) {
             return -1;
         }
         if(arr[idx] == tar){
             return idx;
         }else{
             int first = firstOccurance(arr, tar, idx+1);
             return first;
         }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,22,2,2,2};
        System.out.println("Good Approach: "+firstOccurance(arr, 2, 0));
        System.out.println("Best Approach: " + firstOccurance_2(arr, 2, 0));
    }
}
