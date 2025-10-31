package Stack;

import java.util.Stack;

public class check_balance {
    public static void main(String[] args) {
        String str = "(a+b)+(a+b)]";
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            //There are 3 cases:
            // 1st :- Balanced bracket;
            // 2nd :- Closing bracket > Opening bracket
            // 3rd :- Closing bracket < Opening bracket
            if(ch == '(' || ch== '{' || ch=='['){
                st.push(ch);
            } else if (ch == ')') {
                boolean val =handleclosing(st, '(');
                if(val==false){
                    System.out.println(val);
                    return;
                }
                
            } else if (ch=='}') {
                boolean val = handleclosing(st, '{');
                 if(val==false){
                    System.out.println(val);
                    return;
                }

            } else if (ch==']') {
                boolean val= handleclosing(st,'[');
                if(val==false){
                    System.out.println(val);
                    return;
                }

            }
        }
        if(st.size()==0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }

    public static boolean handleclosing(Stack<Character> str, char crossch) {
        if(str.size()==0){
            return false;
        }else if(str.peek() != crossch) {
            return false;
        }else{
            str.pop( );
            return true;
        }
    }
}
