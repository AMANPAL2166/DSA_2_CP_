package Array;

import java.util.Arrays;

public class Memory_discussion {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 33;
        arr[1] = 34;
        arr[2] = 54;
        arr[3] = 30;
        arr[4] = 00;
        swap(arr, 0, 4);
//        int[] new_arr = arr;//At this movement, I try to understand memory storage.
//        new_arr[4] = 99;
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
        int[] arr2 = arr;
        arr2[0] = 9;
        arr2[4] = 1;
        System.out.println("Array's addition exp..: "+Arrays.toString(arr));
        System.out.println("Array's addition exp..: "+Arrays.toString(arr2));
        int[] newarray = new int[5];
        newarray[0] = 99;
        newarray[1] = 3;
        newarray[2] = 55;
        newarray[3] = 1;
        newarray[4] = 4;
        int[]  addarray = new int[arr.length];
        for(int i = 0; i<addarray.length; i++){
            addarray[i] = arr[i] + newarray[i];
        }
        System.out.println("Array's addition exp..: "+Arrays.toString(newarray));
        System.out.println("Adding arr1 and newarray: " + Arrays.toString(addarray) );
    }
    //This function use for swap two number in array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
