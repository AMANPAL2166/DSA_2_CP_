package Pattern.Stack;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();

    }

    public void push(int val) {
        stack.push(val);
        //check minstack
        if(minStack.isEmpty() || val<=minStack.peek()){
            minStack.push(val);
        }

    }

    public void pop() {
        //check minstack is equls to stack.peek() then pop
        if(stack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        //pop stack
        stack.pop();

    }

    public int top() {
        //return stack peek
        return stack.peek();

    }

    public int getMin() {
        //return peek of minStack
        return minStack.peek();

    }

    public static void main(String[] args) {

    }
}
