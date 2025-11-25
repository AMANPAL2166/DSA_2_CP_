package Array;

import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};

        sor(arr);
    }

    public static void sor(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i + 1]) {
                int temp = arr[i+1];
                arr[i+1] = arr[i ];
                arr[i ] = temp;
            }
        }
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
