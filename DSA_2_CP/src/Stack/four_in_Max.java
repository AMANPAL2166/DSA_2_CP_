package Stack;

import java.util.ArrayList;
import java.util.Arrays;

public class four_in_Max {
    public static void main(String[] args) {
        int[] arr= {2,9,3,8,1,7,12,6,14,4,32,0,7,19,8,12};
        ArrayList<Integer> st = new ArrayList<>();
        int k = 4;
         for(int i=0; i<=arr.length-k; i++ ){
             int max = arr[i];
             for(int j = i+1; j< i+k; j++){
                 if(j< arr.length && arr[j] >max) {
                     max = arr[j];
                 }

             }
             st.add(max);
             i+=2;
         }
        System.out.println(st);
    }
}
