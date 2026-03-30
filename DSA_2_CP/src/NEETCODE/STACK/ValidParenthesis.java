package NEETCODE.STACK;

import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s){
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            switch (ch){
                case '(':
                case '{':
                case '[':
                    st.push(ch);
                    break;
                case ')' :
                    if(st.isEmpty() || st.pop()!= ')'){
                        return false;
                    }
                    break;
                case '}' :
                    if(st.isEmpty() || st.pop()!= '}'){
                        return false;

                    }
                    break;
                case ']' :
                    if(st.isEmpty() || st.pop()!= ']'){
                        return false;

                    }
                    break;

            }

        }
        return st.isEmpty();
    }
}
