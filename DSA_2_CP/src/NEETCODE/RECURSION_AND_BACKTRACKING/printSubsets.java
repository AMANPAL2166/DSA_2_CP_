package NEETCODE.RECURSION_AND_BACKTRACKING;

import java.util.Scanner;

public class printSubsets {
    private static void subSet(String input, String output){
        //base case
        if(input.length()==0){
            System.out.println("\"" + output + "\"");
            return;
        }
        //find character
        char ch = input.charAt(0);
        String remainingInput = input.substring(1);
        //exclude
        subSet(remainingInput, output);
        //include
        subSet(remainingInput, output+ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();

        System.out.println("\nAll Subsets are:");
        // Initial call: input = str, output = "" (khali)
        subSet(str, "");

        sc.close();
    }
}
