package MultiDimensionArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class greatestElement {
    public static void main(String[] args) {
        int[][] arr = {{1,2,42,52,3},{2,5,2,52,3}, {2,41,52,53,64},{2,41,52,8,99}};
        ///  Max element of array
//        int max = 0;
//        {2,41,52,53,64}
//        System.out.println(max);
        ///  sum of rows
//        List<Integer> rowSum = new ArrayList<>();
//        for(int i = 0;i<arr.length;i++){
//            int sum = 0;
//            for(int j = 0;j<arr[0].length;j++){
//                sum += arr[i][j];
//            }
//            rowSum.add(sum);
//
//        }
//        for(int i = 0;i<rowSum.size();i++){
//            System.out.print (rowSum.get(i) + " ");
//        }

        ///  Find the  minimum  element out of all the maximum elements of each row
        int[] store = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            int sum = 0;
            for(int j = 0;j<arr[0].length;j++){
                if(arr[i][j] > sum){
                    sum = arr[i][j];
                }
            }
            store[i]  = sum;


        }
        int min = store[0];
        for(int i = 1;i<store.length;i++){
            if(store[i]<min){
                min = store[i];
            }
        }
        System.out.print (min);


    }
}
