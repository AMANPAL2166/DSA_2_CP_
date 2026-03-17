package Pattern.Stack;

import java.util.Stack;

public class ReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s : tokens){
            if(s.equals("+")){
                int a = st.pop();
                int b = st.pop();
                st.push(a+b);
            }else if(s.equals("-")){
                int a = st.pop();
                int b = st.pop();
                st.push(b-a);

            } else if (s.equals("*")){
                int a = st.pop();
                int b = st.pop();
                st.push(a*b);

            } else if (s.equals("/")){
                int a = st.pop();
                int b = st.pop();
                st.push(b/a);

            }else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.peek();

    }

    public static void main(String[] args) {
        String[] st = {"2","1","+","3","*"};
        System.out.println(evalRPN(st));
    }
}
