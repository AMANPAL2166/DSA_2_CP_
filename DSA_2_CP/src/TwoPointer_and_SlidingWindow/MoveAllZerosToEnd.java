package TwoPointer_and_SlidingWindow;

import java.util.Arrays;

public class MoveAllZerosToEnd {
//    Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
//    Output: [1, 2, 4, 3, 5, 0, 0, 0]
///    Explanation: There are three 0s that are moved to the end.
    //Solution:: How i can move all the zeros to the end.
    //1) Naive approach - use temporary array
    static int[] pushzero(int[] arr){
        //declare new array of the size of given array
        //we don't need extra zeros just have a extra variable
        int count = 0;
        for(int i = 0; i<arr.length ; i++){
            if(arr[i]!=0){
                 arr[count] = arr[i];
                 count++;
            }

        }
//        fill the rest of the array with 0
        while(count<arr.length){
            arr[count] = 0;
            count++;
        }
        return arr;
    }
    //Two traversal function
    static int[] pushzero2(int[] arr){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != 0 ){
                arr[count++] = arr[i];

            }
        }
        while(count<arr.length){
            arr[count++] = 0;

        }
        return arr;
    }


    public static void main(String[] args) {
        int[]arr = {1,3,2,0,2};
        System.out.println(Arrays.toString(pushzero(arr)));
        System.out.println(Arrays.toString(pushzero2(arr)));
    }
    static void pushZerosToEnd(int[] arr) {

        // Pointer to track the position
        // for next non-zero element
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            // If the current element is non-zero
            if (arr[i] != 0) {

                // Swap the current element with
                // the 0 at index 'count'
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                // Move 'count' pointer to
                // the next position
                count++;
            }
        }
    }

}
