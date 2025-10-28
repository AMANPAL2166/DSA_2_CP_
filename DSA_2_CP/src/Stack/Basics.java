package Stack;

import java.util.Stack;
public class Basics {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(29);
        st.push(33);
        st.push(22);
        System.out.println(st +" Peek ->" + st.peek()+" ") ;
        st.pop();
        System.out.println(st +" Peek ->" + st.peek()+" ") ;
        st.pop();
        st.pop();
        st.push(59);
        System.out.println(st +" Peek ->" + st.peek()+" ") ;
        st.pop();
        System.out.println("Is stack empty? "+ st.isEmpty()) ;
        st.push(33);
        System.out.println(st +" Peek ->" + st.peek()+" ") ;
        st.push(22);
        System.out.println(st +" Peek ->" + st.peek()+"|| Size of Stack ->" +st.size()) ;
        System.out.println("Size of stack before pop: " + st.size());

        // Use loop to pop the stack till last
        while (!st.isEmpty()){
            System.out.println(st.pop());
        }
        System.out.println("Size of stack after pop: " + st.size());

    }
}
