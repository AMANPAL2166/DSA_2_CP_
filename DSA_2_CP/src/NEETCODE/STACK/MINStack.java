package NEETCODE.STACK;

import java.util.Stack;

public class MINStack {
    Stack<Integer> min;
    Stack<Integer> st;

    public void MinStack() {
        min = new Stack<>();
        st = new Stack<>();

    }

    public void push(int val) {

        if(min.isEmpty() || val<=min.peek()){
            min.push(val);
        }
        st.push(val);
    }

    public void pop() {

        if(st.peek().equals(min.peek())){
            min.pop();
        }
        st.pop();
    }

    public int top() {
        return st.peek();

    }

    public int getMin() {
        return  min.peek();

    }

    public static void main(String[] args) {

    }
}
