package NEETCODE.RECURSION_AND_BACKTRACKING;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    private static  List<String> leeterPer(String s ){
        List<String> ans = new ArrayList<>();
        solver(s, "", 0, ans);
        return ans;
    }
    private static void solver(String input, String output, int index, List<String> ans){
        //base case
        if(index == input.length()){
            ans.add(output) ;
            return;
        }
        //make ch variable
        char ch = input.charAt(index);
        //conditon
        if(Character.isLetter(ch)){
            //choice 1: make it uppercae
            solver(input, output+Character.toUpperCase(ch), index+1, ans);
            /// choice 2: make it lowercase
            solver(input, output+Character.toLowerCase(ch), index+1, ans);
        }else{
            solver(input, output+ch, index+1, ans);
        }
    }
}
