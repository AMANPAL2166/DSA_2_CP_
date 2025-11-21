package Stack;

import java.util.Stack;

public class MinStack {
    public static class Minstack {
        Stack<Integer> allData;
        Stack<Integer> minData;

        public Minstack(){
            allData = new Stack<>();
            minData = new Stack<>();

        }
        int size(){
            return allData.size();
        }
        void push(int val){
            allData.push(val);
            if(minData.size() == 0 || val <= minData.peek()){
                minData.push(val);
            }

        }
        int pop(){
            if(size() == 0){
                System.out.println("Stack underflow.");
                return -1;
            }else{
                int val =  allData.peek();
                if(val == minData.peek()){
                    minData.pop();
                }
                return val;
            }

        }
        int top(){
            if(size() == 0){
                System.out.println("Stack underflow.");
                return -1;
            }else{
                return allData.peek();

            }

        }
        int min(){
            if(size() == 0){
                System.out.println("Stack underflow.");
                return -1;
            }else{
                return minData.peek();
            }

        }


    }
    public static void main(String[] args) {

        Minstack stack = new Minstack(); // Create stack of size 5

//        System.out.println("Is stack empty? " + stack.isEmpty());

        System.out.println("Pushing elements: 10, 20, 30");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.top();

//        System.out.println("Is stack full? " + stack.isFull());
        System.out.println("Top element (peek): " + stack.top());

//        System.out.println("Popping elements:");
//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }

//        System.out.println("Is stack empty now? " + stack.isEmpty());

        System.out.println("Trying to pop from empty stack:");
        stack.pop();
        System.out.println("Now peak of the element " + stack.min());
        System.out.println("Length of stack " + stack.size());

    }
}
