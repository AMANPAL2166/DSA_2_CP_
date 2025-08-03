package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortMatrix {
    public static void sortMat(int[][] arr) {
        int k = arr.length;
        List<Integer> arrylist = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arrylist.add(arr[i][j]);


            }
        }
        Collections.sort(arrylist);
        System.out.println("matrix in arraylist: " + arrylist);
    }

    public static void main(String[] args){
    int[][] matrix = {

            {1, 5, 9},
            {2, 6, 10},
            {3, 7, 11}
    };

    sortMat(matrix);

}
    }


//class Solution {
//    int[][] sortedMatrix(int N, int Mat[][]) {
//        // code here
//
//        List<Integer> arr = new ArrayList<>();
//        for(int i = 0; i<N; i++){
//            for(int j = 0; j<Mat[i].length; j++){
//
//                arr.add(Mat[i][j]);
//            }
//
//        }
//        Collections.sort(arr);
//        // Create a new 2D array to store the sorted elements
//        int[][] sortedMat = new int[N][N];
//        int k = 0; // Index for the sorted ArrayList
//
//        // Populate the new 2D array with elements from the sorted ArrayList
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                sortedMat[i][j] = arr.get(k++);
//            }
//        }
//
//        // Return the sorted 2D array
//        return sortedMat;
//    }
//}