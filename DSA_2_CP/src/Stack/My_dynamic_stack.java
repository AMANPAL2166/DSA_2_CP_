package Stack;

public class My_dynamic_stack {
    public static void main(String[] args) {

        Build_Normal_stack.myStack stack = new Build_Normal_stack.myStack(5); // Create stack of size 5

        System.out.println("Is stack empty? " + stack.isEmpty());

        System.out.println("Pushing elements: 10, 20, 30");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.peek();


        System.out.println("Is stack full? " + stack.isFull());
        System.out.println("Top element (peek): " + stack.peek());

        System.out.println("Popping elements:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println("Is stack empty now? " + stack.isEmpty());

        System.out.println("Trying to pop from empty stack:");
        stack.pop(); // Should show underflow message

        stack.push(44);
//        System.out.println("length of stack; " + stack.size);
        System.out.println("Peek element in stack: " +stack.peek());
//        System.out.println("Size of the stack: " + stack.si);

    }
    static class myStack {
        int[] data;
        int toss;

        public myStack(int n) {
            // Define Data Structures
            data = new int[n];
            int toss = -1;
        }

        public boolean isEmpty() {
            // check if the stack is empty
            return  toss==-1;
        }
        public boolean isFull( ){
            return  toss == data.length-1;
        }

        public  void push(int x) {
            if(toss == data.length-1){
                int[] new_data = new int[2 * data.length];
                for(int i = 0; i< data.length; i++){
                    new_data[i] = data[i];
                }
                data = new_data;
                toss++;
                data[toss]  = x;



            }
            toss++;
            data[toss] = x;
        }

        public  int peek( ) {
            if(isEmpty()){
                System.out.println("Stack is underflow!! ");
                return -1;
            }
            return data[toss];
        }

        public  int pop( ) {
            if(isEmpty()){
                System.out.println("Stack underflow no element to pop.");
                return -1;
            }
            int val = data[toss];
            toss--;
            return  val;
        }
        public int size( ){
            return  toss+1;
        }
    }
}
