package NEETCODE.RECURSION_AND_BACKTRACKING;

public class GenerateParenthesis {
    public static void parenthesis(String s, int open, int close) {
        if(open == 0 && close== 0){
            System.out.println(s);
            return;
        }
        //conditon
        if(open>0){
            parenthesis(s+"(" , open-1, close);
        }
        if(close>open){
            parenthesis(s+")", open, close-1);
        }
    }

    public static void main(String[] args) {
        parenthesis("", 3,3);
    }
}
