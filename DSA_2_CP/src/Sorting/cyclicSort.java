package Sorting;


import java.util.Arrays;

public class cyclicSort {

    public static int[] sort(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i<n){
            int correctIdx = arr[i];
            if( arr[i] >= 0 && arr[i] <n &&arr[i] != arr[correctIdx])  swap(arr, i, correctIdx);
            else i++;

        }
        return arr;
    }

    public static void swap(int[] arr, int first, int second ) {
        int temp = arr[first] ;
        arr[first] = arr[second];
        arr[second]= temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,3,4,0};
        System.out.println(Arrays.toString(sort(arr)));
    }

}
