package Leetcode_Contest.JAN_CONTEST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Q1. Reverse Letters Then Special Characters in a String
//Attempted
//Easy
//3 pt.
//You are given a string s consisting of lowercase English letters and special characters.
//
//Your task is to perform these in order:
//
//Reverse the lowercase letters and place them back into the positions originally occupied by letters.
//Reverse the special characters and place them back into the positions originally occupied by special characters.
//Return the resulting string after performing the reversals.
//
// 
//
//Example 1:
//
//Input: s = ")ebc#da@f("
//
//Output: "(fad@cb#e)"
//
//Explanation:
//
//The letters in the string are ['e', 'b', 'c', 'd', 'a', 'f']:
//Reversing them gives ['f', 'a', 'd', 'c', 'b', 'e']
//s becomes ")fad#cb@e("
//​​​​​​​The special characters in the string are [')', '#', '@', '(']:
//Reversing them gives ['(', '@', '#', ')']
//s becomes "(fad@cb#e)"
//Example 2:
//
//Input: s = "z"
//
//Output: "z"
//
//Explanation:
//
//The string contains only one letter, and reversing it does not change the string. There are no special characters.©leetcode
public class ReverseSpecial {
    public String reverseByType(String s) {
        List<Character> letter = new ArrayList<>();
        List<Character> specialCharacter = new ArrayList<>();
        //separate special character and letter;
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                letter.add(ch);
            }else{
                specialCharacter.add(ch);
            }
        }
        //reverse both list
        Collections.reverse(letter);
        Collections.reverse(specialCharacter);
        //Build a string to store a value;
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                result.append(letter.get(i++));
            }else{
                result.append(specialCharacter.get(j++));
            }
        }
        return result.toString();
    }
}
