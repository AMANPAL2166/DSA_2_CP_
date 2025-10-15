package Fundamental;

import java.util.Scanner;

public class Pattern_All {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in) ;
        int n  = 5;
//        first(n);
//        second(n);
//        third(n);
        fourth(n);


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

    public static void third(int n) {
        int sp = n-1;
        int st = 1;
        for(int i  = 1; i<=n; i++){
            for(int j = 1; j<=sp; j++){
                System.out.print ("\t");
            }
            for(int k = 1; k<=st; k++){
                System.out.print("*\t");
            }
            sp--;
            st++;
            System.out.println();
        }
    }
    public static void fourth(int n) {
        int sp = 0 ;
        int st = n;
        for(int i  = 1; i<=n; i++){
            for(int j = 1; j<=sp; j++){
                System.out.print ("\t");
            }
            for(int k = 1; k<=st; k++){
                System.out.print("*\t");
            }
            sp++;
            st--;
            System.out.println();
        }
    }
}
