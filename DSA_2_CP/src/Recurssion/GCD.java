package Recurssion;

import java.util.regex.PatternSyntaxException;

public class GCD {
    public static int gcd(int a, int b) {
        while(b != 0){
            int temp =b;
            b = a%b;
           a = temp;

        }
        return a;
    }
    public static int gcd_(int a, int b) {
        int gcd = 1;
        for(int i = 2;i<Math.min(a,b);i++){
            if(a%i ==0 && b%i == 0){
                gcd = i;
            }
        }

        return gcd;
    }


    public static void main(String[] args) {
        int a = 16, b = 38;
//        System.out.println(gcd(a,b));
//        System.out.println(gcd_(a,b));
        System.out.println("Recursive method: " + helper(a,b));
    }
    //recursive code
    public static int gcd__(int a, int b) {
        //base case
        if(b==0) return 1;
        return helper(Math.min(a,b), Math.max(a,b));
    }

    public static int helper(int a, int b) {
        if(a==0) return b;
        return helper(b%a, a);
    }
}
