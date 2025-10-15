package Fundamental;

import java.util.Scanner;

public class Pattern_1st {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in) ;
        int n  = sc.nextInt();
//        first(n);
        second(n);


    }
    public static void first(int n) {
        for(int i = 0;i<n; i++){
            for(int j = 0; j<i+1;j++ ) {
                System.out.print("*"+" ");
            }
            System.out.println( " ");
        }

    }

    public static void second(int n) {
        for(int i = n; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print ("*" + " ");
            }
            System.out.println(" ");
        }
    }
}
