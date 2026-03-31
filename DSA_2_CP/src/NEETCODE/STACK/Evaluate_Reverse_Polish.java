package NEETCODE.STACK;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Evaluate_Reverse_Polish {
    public static int evalRPN(String[] tokens) {
        // 1. Array initialize karna zaroori hai error hatane ke liye
        int[] stack = new int[tokens.length];
        int top = 0;

        for (String t : tokens) {
            if (t.equals("+")) {
                stack[top - 2] = stack[top - 2] + stack[top - 1];
                top--;
            } else if (t.equals("-")) {
                stack[top - 2] = stack[top - 2] - stack[top - 1];
                top--;
            } else if (t.equals("*")) {
                stack[top - 2] = stack[top - 2] * stack[top - 1];
                top--;
            } else if (t.equals("/")) {
                stack[top - 2] = stack[top - 2] / stack[top - 1];
                top--;
            } else {
                // 2. String ko int mein convert karke array mein daalo
                stack[top++] = Integer.parseInt(t);
            }
        }
        // Result hamesha index 0 par bachega
        return stack[0];
    }
    public static int evalRPN_Stack(String[] tokens) {
        Stack<Integer> st  = new Stack<>();
        for(String s:tokens){
            if(s.equals("+")){
                int a = st.pop();
                int b = st.pop();
                st.push(a+b);
            }else if(s.equals("-")){
                int a = st.pop();
                int b = st.pop();
                st.push(b-a);
            } else if(s.equals("*")){
                int a = st.pop();
                int b = st.pop();
                st.push(a*b);
            } else if(s.equals("/")){
                int a = st.pop();
                int b = st.pop();
                st.push(b/a);
            }else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.peek();
    }

}
