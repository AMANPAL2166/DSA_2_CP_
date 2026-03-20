package String;

import java.util.ArrayList;
import java.util.List;

public class Substring {
    public static void main(String[] args) {
        String s = "abc";
        List<String> res = findSubString(s);
        for (String i : res) {
            System.out.print(i + " ");
        }

    }
    public static List<String> findSubString(String s){
        //to store all substring
        List<String> st = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            for(int j = i;j<s.length();j++){
                st.add(s.substring(i,j+1));
            }
        }
        return st;
    }



}
