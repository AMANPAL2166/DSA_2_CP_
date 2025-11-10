package Stack;

import java.util.ArrayList;
import java.util.Arrays;

public class next_greater_n2 {
    public static void main(String[] args) {
        int[] arr = {3,4,2,6,7,3,7,3,8};
        System.out.println(solve_n2_Arraylist(arr));
        System.out.println(Arrays.toString(solve(arr)));

    }

    public static ArrayList<Integer> solve_n2_Arraylist(int[] arr) {
         ArrayList<Integer> result = new ArrayList<>();
         for(int i= 0; i<arr.length; i++){
             int nextgreater = -1;
             for(int j = i+1; j< arr.length; j++){
                 if(arr[j] > arr[i]){
                     nextgreater = arr[j];
                     break;
                 }
             }
             result.add(nextgreater);
         }
         return result;

    }

    public static int[] solve(int[] arr) {
        int[] result = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            result[i] = -1;
            for(int j= i+1; j<arr.length; j++){
                if(arr[j]>arr[i]){
                    result[i] = arr[j];
                    break;
                }
            }
        }
        return result;
    }

}
