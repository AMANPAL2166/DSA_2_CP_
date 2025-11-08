package Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class four_in_Max {
    public static void main(String[] args) {
        int[] arr= {2,9,3,8,1,7,12,6,14,4,32,0,7,19,8,12};

        //___________--- N^2---__________Time complexity--
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
         n(arr);
    }

    public static void n(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int k = 4;
        int[] next_greater_element = new int[arr.length];
        st.push(arr.length-1);
        next_greater_element[arr.length-1] = arr.length;
        for(int i= arr.length-2; i>=0;i--){
            //pop-answer-push
            while(st.size()>0 && arr[i] >= arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                next_greater_element[arr.length-1] = arr.length;

            }else{
                next_greater_element[ i] = st.peek();
            }
            st.push(i);
        }
        int j = 0;
        for(int i =0; i<=arr.length-k;i++ ){
            //enter the loop to find the maximum of the window at i
            if(j<i){
                j=i;
            }
            while(next_greater_element[j] < i +k){
                j =next_greater_element[j];

            }
            System.out.println(arr[j]);

        }
    }
}
