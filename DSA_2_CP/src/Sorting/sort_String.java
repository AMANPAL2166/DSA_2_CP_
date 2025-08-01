package Sorting;

import java.util.Arrays;

// https://www.geeksforgeeks.org/dsa/sort-string-characters/
public class sort_String {
    static final int MAX_CHAR = 26;
    static void sortString(String s ){
        int[] charCount = new int[MAX_CHAR];
        //Traverse the string and count character
        for(int i = 0; i<s.length();i++){
            charCount[s.charAt(i) -'a']++;
        }
        //Traverse the count array and print character
        for(int i = 0; i<MAX_CHAR;i++){
            for(int j = 0; j<charCount[i];j++){
                System.out.print((char)('a'+i) );
            }
        }
    }

    public static void main(String[] args) {
        String name = "geeksforgeeks";
      //
        sortString2(name);
        sortString(name);

     }

    //This is method 2nd
    static void sortString2(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        s = new String(arr);
        System.out.println(s+ " ");
    }

}
//