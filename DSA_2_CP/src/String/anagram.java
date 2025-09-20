package String;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t =  "nagram";
        System.out.println(checkanagram1(s,t));

    }
    public static boolean checkanagram(String s, String t ){//this method approach is totally wrong--
        //base case check
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i<s.length(); i++){
            for(int j = 0; j<t.length(); j++){
                if(s.charAt(i) == t.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean checkanagram1(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        char[] s1Array = s.toCharArray();
        char[] s2Array = t.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        return Arrays.equals(s1Array,s2Array);
    }
}
