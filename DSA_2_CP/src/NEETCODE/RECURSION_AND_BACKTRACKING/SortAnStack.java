package NEETCODE.RECURSION_AND_BACKTRACKING;

import java.util.Stack;

public class SortAnStack {
    //function to sort the stack
    private static void sortStack(Stack<Integer> st){
        if(!st.isEmpty()){
            int temp = st.pop();
            sortStack(st);
            //call the helper function to insert value in order
            insert(st, temp);
        }
    }
    private static void insert(Stack<Integer> st, int temp){
        //base case
        if(st.isEmpty() || st.peek() <= temp){
            st.push(temp);
            return;
        }
        //pop the top element and recursively insert
        int val = st.pop();
        insert(st, temp);
        //push the pop element back
        st.push(val);
    }
    // Main function
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(1);
        stack.push(3);
        stack.push(2);

        sortStack(stack);

        // Print the sorted stack
        System.out.print("Sorted stack (descending order): ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
