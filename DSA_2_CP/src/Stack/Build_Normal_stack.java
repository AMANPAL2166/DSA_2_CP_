package Stack;

public class Build_Normal_stack {
    public static void main(String[] args) {

        myStack m = new myStack(9);
        System.out.println(m.isEmpty());

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
             if(isFull()){
                 System.out.println("Stack is overflow!! " + x);
                 return;
             }
             toss++;
             data[toss] = x;
         }

         public  int peek(int x) {
             if(isEmpty()){
                 System.out.println("Stack is underflow!! ");
                 return -1;
             }
             return data[toss];
         }

         public  int pop(int n) {
             if(isEmpty()){
                 System.out.println("Stack underflow no element to pop.");
                 return -1;
             }
             int val = data[toss];
             toss--;
             return  val;
         }
    }
}
