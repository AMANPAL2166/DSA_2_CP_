package Pattern.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class RemoveAdjacentDuplicates {
    public static String removeDuplicates(String s) {
        int n  = s.length();
        Stack<Character> st = new Stack<>();
        for(int i =0;i<n;i++){
            char ch = s.charAt(i);
            if(!st.isEmpty() && st.peek() == ch) {
                st.pop();
            }else{
                st.push(ch);
            }


        }
        StringBuilder ans =  new StringBuilder();
        for(char c: st){
            ans.append(c);
        }
        return ans.toString();

    }

    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }
}
