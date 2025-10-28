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
        st.push(22);
        System.out.println(st +" Peek ->" + st.peek()+" ") ;
//        st.pop();
//        System.out.println(st +" Peek ->" + st.peek()+" ") ;
        st.push(22);
        System.out.println(st +" Peek ->" + st.peek()+" ") ;
        st.push(22);
        System.out.println(st +" Peek ->" + st.peek()+"|| Size of Stack ->" +st.size()) ;






    }
}
