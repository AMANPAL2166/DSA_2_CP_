package String;

import java.util.HashMap;
import java.util.HashSet;

public class remove_Consecutve_character {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        System.out.println(removeConsecutiveCharacter(s1));

    }
    public static String removeConsecutiveCharacter(String s) {
        // code here
        StringBuilder str = new StringBuilder();
        for(int i = 0; i<s.length()-1; i++){
             if(s.charAt(i) != s.charAt(i+1)) {
                 str.append(s.charAt(i));

             }


        }
        str.append(s.charAt(s.length()-1));
        return str.toString();

    }

}
