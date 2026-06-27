package NEETCODE.RECURSION_AND_BACKTRACKING;

import java.util.Stack;

public class Delete {
    private static void deletMiddleElement(Stack<Integer> st, int k){
        //Base case
        if(k==1){
            st.pop();
            return;
        }
        //Hypothesis
        int temp = st.pop();
        deletMiddleElement(st, k-1);
        //Induction
        st.push(temp);

    }
    private static void deleteLastElement(Stack<Integer> st, int k){
        //base case
        if(k == 1){
            st.pop();
            return;
        }
        //Hypothesis
        int temp = st.pop();
        deleteLastElement(st, k-1);
        //Induction
        st.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(3);
        st.push(2);
        int lastEle = st.size();
        int k = ((st.size()/2)+1);
       // deletMiddleElement(st,k);
        deleteLastElement(st, lastEle);
        System.out.println(st);
    }
}
