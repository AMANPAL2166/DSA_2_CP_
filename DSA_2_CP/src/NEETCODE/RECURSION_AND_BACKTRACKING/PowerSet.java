package NEETCODE.RECURSION_AND_BACKTRACKING;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static List<String> main(String s) {
        List<String> ans = new ArrayList<>();
        helper( ans, s,0, "");
        return ans;
    }

    public static void helper(List<String> st,String s, int index, String output) {
        //base case
        if(index == s.length()){
            st.add(output);
            return;
        }
        char ch = s.charAt(index);
        //include
        helper(st  , s, index+1, output+ch);
        //exclude
        helper(st, s, index+1, output);
    }

    public static void main(String[] args) {
        // Input string
        String s = "abc";


        // Get all subsequences
        List<String> subsequences = main(s);

        // Print all subsequences
        for (String subseq : subsequences) {
            System.out.println("\"" + subseq + "\"");
        }
    }
}
