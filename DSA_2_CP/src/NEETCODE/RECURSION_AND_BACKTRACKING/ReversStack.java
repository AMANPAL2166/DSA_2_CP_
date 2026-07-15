package NEETCODE.RECURSION_AND_BACKTRACKING;

import java.util.Stack;

public class ReversStack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(1);
        stack.push(3);
        stack.push(2);

//        System.out.print("Stack Before reverse: ");
//        while (!stack.isEmpty()) {
//            System.out.print(stack + " ");
//        }

        reverStack(stack);
        System.out.println();

        // Print the sorted stack
        System.out.print("Stack after reverse: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    private static void reverStack(Stack<Integer> stack) {
        if(!stack.isEmpty()){
            int temp = stack.pop();
            reverStack(stack);
            insetAtbottom(stack, temp);
        }
    }

    private static void insetAtbottom(Stack<Integer> stack, int temp) {
        if(stack.isEmpty()) {
            stack.push(temp);
            return;
        }
        int val = stack.pop();
        insetAtbottom(stack, temp);
        stack.push(val);
    }
}
