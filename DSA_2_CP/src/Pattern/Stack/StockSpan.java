package Pattern.Stack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class StockSpan {
    public static ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        //Initilize with 1
        for(int i = 0;i<arr.length;i++ ){
            ans.add(1);
        }
        //traverse till the length 0f array
        for(int i = 0;i<arr.length;i++){
            for(int j = i-1;j>=0 && arr[i]>=arr[j];j--){

                ans.set(i, ans.get(i)+1);


            }
        }
        return ans;
    }
    public static ArrayList<Integer> calculateSpan_2(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(arr.length,1));


        Stack<Integer> st = new Stack<>();
        //traverse till the length 0f array
        for(int i = 0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans.set(i,( i+1));
            }else{
                ans.set(i,(i-st.peek()));
            }
            st.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {

        int[] arr = {10, 4, 5, 90, 120, 80};

        ArrayList<Integer> span = calculateSpan_2(arr);

        for (int x : span) {
            System.out.print(x + " ");
        }
    }
}
