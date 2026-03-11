package Recurssion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PrintAnArray {
    public static int printArray(int[] arr, int idx) {
        //base case
        if(idx == arr.length-1){
            return arr[arr.length-1];
        }
        System.out.println(arr[idx]);
        return printArray(arr,idx+1);

    }
    public static void printArrayRe(int[] arr, int idx) {
        //base case
        if(idx == arr.length ){
            return ;
        }

        printArrayRe(arr,idx+1);
        System.out.println(arr[idx]);

    }


    public static void main(String[] args) {
        int[] arr = {1,2,4,5 };
//        System.out.println("Print array in original order: "+printArray( arr,0));
//        System.out.println("Print array in reverse order: " );
        printArrayRe(arr, 0);
    }
}
