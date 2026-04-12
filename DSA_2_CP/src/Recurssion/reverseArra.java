package Recurssion;

import java.util.ArrayList;

public class reverseArra {
    public static void reverse(int[] arr, int start, int end) {
        //base case: when pointer cross or meet
        if(start>=end) return;
        //swap the element at start and end
        int temp = arr[start];
        arr[start] =arr[end];
        arr[end] = temp;
        //recursive call moving the middle
        reverse(arr, start+1, end-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

    }
}
