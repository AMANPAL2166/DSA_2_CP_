package NEETCODE.STACK;

import java.util.Stack;

public class sortStack {
    public static void sortStack(Stack<Integer> input) {
        //crate a temp stack
        Stack<Integer> tmpStack= new Stack<>();
        while(!input.isEmpty()){
            //pop first element from the input stack
            int temp = input.pop();
            //while temp stack is not empty ans
            //top of stack is lesser than temp
            while(!tmpStack.isEmpty() && tmpStack.peek() <temp){
                //pop from the temp stack and push it to the input stack
                input.push(tmpStack.pop());
            }
            //push temp in temporary of stack
            tmpStack.push(temp);
        }
        while(!tmpStack.isEmpty()){
            input.push(tmpStack.pop());
        }


    }

    public static void main(String[] args) {
        Stack<Integer> input = new Stack<Integer>();
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);
        sortStack(input);
    }

}
