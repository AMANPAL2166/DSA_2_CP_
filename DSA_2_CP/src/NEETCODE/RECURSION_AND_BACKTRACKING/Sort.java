package NEETCODE.RECURSION_AND_BACKTRACKING;

import java.util.ArrayList;
import java.util.Stack;

public class Sort {
    public static void sortArray(ArrayList<Integer> arr){
        if(arr.size() <= 1) return ;
        //remove last element
        int temp = arr.remove(arr.size()-1);
        //Sort remaining array
        sortArray(arr);
        //Temp ko correct position pe insert karo
        insert(arr,temp);

    }

    private static void insert(ArrayList<Integer> arr, int temp) {
        //correct position mil gyi
        if(arr.size() == 0 || arr.get(arr.size()-1)<=temp){
            arr.add(temp);
        }
        //remove last element
        int val  = arr.remove(arr.size()-1);
        //recursive call
        insert(arr,temp);
        //reenter removed element
        arr.add(val);
    }
    public static void sort(Stack<Integer> st){
        //base case
        if(st.size() <=1){
            return;
        }
        //remove top element
        int temp = st.pop();
        //sort remainig stack
        sort(st);
        //insert temp at correct position
        insertStack(st, temp);
    }

    private static void insertStack(Stack<Integer> st, int temp) {
        //correct position mil gyi
        if(st.isEmpty() || st.peek()<= temp){
            st.push(temp);
            return;
        }
        //Top hatao
        int val = st.pop();
        //recursive call
        insertStack(st, temp);
        //push remove element
        st.push(val);
    }
    private static void printArray(int[] arr, int n){
        //Base case
        if(n==0) return;

        //Hypothesis
        printArray(arr,n-1);

        //Induction
        System.out.print(arr[n-1]+" ");
    }
    public static void main(String[] args){

//        Stack<Integer> st = new Stack<>();
//
//        st.push(5);
//        st.push(1);
//        st.push(3);
//        st.push(2);
//
//        System.out.println("Before: " + st);
//
//        sort(st);
//
//        System.out.println("After : " + st);

//        ArrayList<Integer> arr = new ArrayList<>();
//
//        arr.add(5);
//        arr.add(1);
//        arr.add(3);
//        arr.add(2);
//
//        System.out.println("Before: " + arr);
//
//        sortArray(arr);
//
//        System.out.println("After : " + arr);
        int[] nums = {2, 3, 1, 42};
        printArray(nums,4);
    }

}
