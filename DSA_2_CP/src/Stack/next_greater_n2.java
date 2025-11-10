package Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class next_greater_n2 {
    public static void main(String[] args) {
        int[] arr = {3,4,2,6,7,3,7,3,8};
        System.out.println(solve_n2_Arraylist(arr));//This method used O(n^2)
        System.out.println(Arrays.toString(solve(arr)));//This method used  same O(n^2)
        System.out.println(Arrays.toString(using_n(arr)));//This method is optimized method using stack O(n)

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

    public static int[] using_n(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] next_greater = new int[arr.length];
        next_greater[arr.length-1] = -1;
        st.push(arr[arr.length-1]);
        for(int i = arr.length-2; i>=0; i--){
            //first pop then answer then push
            // -a+
            while(st.size()>0 && arr[i]>st.peek()){
                st.pop();
            }
            if(st.size()==0){
                next_greater[i] =-1;
            }else{
                next_greater[i] = st.peek();
            }
            st.push(arr[i]);

        }
        return next_greater;
    }

}
