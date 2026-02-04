package Pattern.TwoPointer;

import java.util.Arrays;

public class ReverseAString {
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        while(start<end){
            //swap
            char temp = s[end];
            s[end] = s[start];
            s[start] = temp;
            start++;
            end--;
        }
        System.out.println(s);

    }

    public static void main(String[] args) {
        char[] str = {'h','e','l','l','o'};
        reverseString(str);


    }
}
