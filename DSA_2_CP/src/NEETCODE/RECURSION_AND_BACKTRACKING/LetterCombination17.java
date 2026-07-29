package NEETCODE.RECURSION_AND_BACKTRACKING;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination17 {
    private static final String[] map = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
    };
    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        //edge case
        if(digits.length() == 0 )return ans;
        helperFunction(digits,0, "", ans);
        return ans;
    }

    private static void helperFunction(String digits, int ind, String s, List<String> ans) {
        //base case
        if(ind == digits.length()){
            ans.add(s);
            return;
        }

        String letter = map[digits.charAt(ind)-'0'];
        for(int i = 0;i<letter.length();i++){
            letter.charAt(i);
            helperFunction(digits,ind+1, s+letter.charAt(i),ans);
        }
    }
    public static void main(String[] args) {
        String digits = "23"; // Input digits
        List<String> result = letterCombinations(digits); // Get combinations

        // Print the results
        for (String combination : result) {
            System.out.print(combination + " "); // Display each combination
            System.out.println();
        }
    }

}
