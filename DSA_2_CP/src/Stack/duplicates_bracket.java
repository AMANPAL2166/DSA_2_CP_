package Stack;

import java.util.Scanner;
import java.util.Stack;

public class duplicates_bracket {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String st  = "(a+b)+((a+b))";
        Stack<Character> str = new Stack<>();
        for(int i = 0; i<st.length(); i++){
            char ch = st.charAt(i);
            if(ch ==  ')'){
                if(str.peek()=='('){
                    System.out.println(true);
                    return;
                }else {
                    while(str.peek() != '('){
                        str.pop();
                    }
                    str.pop();
                }
            }
            else{
                str.push(ch);
            }
        }
        System.out.println(false);
    }
}
