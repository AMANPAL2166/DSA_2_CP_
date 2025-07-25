package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Bubblesort1 {
    //Sort the array using Bubble sort
    public static void sort(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n ; i++){
            for(int j = 1; j<n-i; j++) {
                if (arr[j]  < arr[j - 1]) {
                    //swap the element
                    int temp = arr[j  ];
                    arr[j ] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }


    }
    //Using Hashset remove dublicates:::::)
    public static List<Integer> remove (int[] arr){
        HashSet<Integer> uniqueselements = new HashSet<>();
        //Hashset manage dublicates in arrys. It'll return only once;
        for(int ret: arr){
            uniqueselements.add(ret);
        }
        return new ArrayList<>(uniqueselements);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6,2,6,7};
        System.out.println("Original Array: "+ Arrays.toString(arr) );
        sort(arr);
        System.out.println( "Sorted arrays: "+ Arrays.toString(arr));
        List<Integer> removedublicates = remove(arr);
        System.out.println("Remove dublicates: "+ remove(arr));
    }
}
