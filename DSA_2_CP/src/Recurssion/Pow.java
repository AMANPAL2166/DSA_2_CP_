package Recurssion;

import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print ("Enter {a} number: "  );
        int a = 2;
        System.out.print ("Enter {b} number: ");
        int b = 10;
//        double ans = Math.pow(a,b);
//        System.out.println("Ans: " + ans);
//        System.out.println("Ans: " + pow_(a,b));
        System.out.println("Ans : " + pow(a,b));



    }

    public static int pow(int a,int b) {
       int target = 1;
       while(b>0){
           target *= a;
           b--;
       }
       return target;

    }
    public static int pow_(int a,int b) {
        //base case
        if(b==0 ) return 1;
        int call = pow_(a,b/2);
        if(b%2 == 0) return call*call;
        else return a*call*call;
    }

}
