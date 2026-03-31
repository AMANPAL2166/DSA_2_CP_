package NEETCODE.STACK;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parenthesis {
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(ans,"",0,0,n);
        return ans;

    }

     static void helper(List<String> res, String curr, int open, int close, int n) {
        //base case

         if(curr.length()==2*n){
             res.add(curr);
             return;
         }
         // //add'('
         if(open<n){
             helper(res,curr + "(", open+1, close,n);
         }
         //add ')'
         if(close<open){
             helper(res,curr+")", open, close+1,n);
         }

    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
