package Array;

 //https://www.geeksforgeeks.org/problems/three-great-candidates0515/1
//Our task to get max product of the array with three combo of element:: )
public class Max_Pro_3element {
    public static int product(int[]arr){
        int n = arr.length;
        int maxA = Integer.MIN_VALUE,
                maxB = Integer.MIN_VALUE, maxC = Integer.MIN_VALUE;

        // Initialize Minimum and second minimum element
        int minA = Integer.MAX_VALUE, minB = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {

            // Update Maximum, second maximum
            // and third maximum element
            if (arr[i] > maxA) {
                maxC = maxB;
                maxB = maxA;
                maxA = arr[i];
            } else if (arr[i] > maxB) {
                maxC = maxB;
                maxB = arr[i];
            } else if (arr[i] > maxC) {
                maxC = arr[i];
            }

            // Update Minimum and second minimum element
            if (arr[i] < minA) {
                minB = minA;
                minA = arr[i];
            } else if (arr[i] < minB) {
                minB = arr[i];
            }
        }

        return Math.max(minA * minB * maxA, maxA * maxB * maxC);
    }

    public static void main(String[] args) {
        int[] arr = { -10, -3, -5, -6, -20};
        System.out.println(product(arr));


    }
}
