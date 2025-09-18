package String;

import java.util.Scanner;

public class Fundamental_String {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        String s1 = sc.next();
        String s2 = sc.nextLine();
//        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s2.length());
        // if want to char
        for( int i = 0; i<s2.length(); i++){
            char ch = s2.charAt(i);
            System.out.println(ch);

        }
        // we can't find char index of i
        //ex--
        char ch1 = s2.charAt(3);// won't work -- for this we've stringBuilder
        System.out.println(ch1);
        // ------->Substrin<---------
        System.out.println(s2.substring(1,8));
    }
}
