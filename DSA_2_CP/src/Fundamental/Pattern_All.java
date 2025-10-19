package Fundamental;

import java.util.Scanner;

public class Pattern_All {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in) ;
        int n  = 5;
//        first(n);
//        second(n);
//        third(n);
//        fourth(n);
//        fifth(n);
//        sixth(n);
//        seventh(n);
//        eighth(n);
//        eight_2(n);
//        nineth(n);
//        tenth(n);
//        eleventh(n);
//        twelveth(n);
//        thirteenth(n);
//        fourteenth(n);
        fitheenth(n);



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

    public static void fifth(int n) {//In this pattern there are some condition-- You should always give odd number.
         int sp = n/2;
         int st = 1 ;
         for(int i = 1; i<=n; i++){
             for(int j=1; j<=sp;j++){
                 System.out.print ("\t");

             }
             for (int j = 1; j<=st; j++){
                 System.out.print ("*\t");
             }
             if(i<=n/2){
                 sp--;
                 st+=2;
             }else{
                 sp++;
                 st -=2;
             }
             System.out.println(" ");
         }
    }

    public static void sixth(int n) {

        int sp = 1;
        int st = n/2+1 ;
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=st;j++){
                System.out.print ("*\t");

            }
            for (int j = 1; j<=sp; j++){
                System.out.print ("\t");
            }
            for(int j = 1;j<=st; j++){
                System.out.print ("*\t");
            }
            if(i<=n/2){
                sp+=2;
                st--;
            }else{
                sp-=2;
                st ++;
            }
            System.out.println(" ");
        }
    }

    public static void seventh(int n) {

        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=i; j++){
                if(i==j){
                    System.out.print ("*\t");
                }else{
                    System.out.print ("\t");
                }
            }
            System.out.println(" ");
        }

    }
    public static void eighth(int n) {

        for(int i = 1;i<=n;i++){
            for(int j = n; j>=i; j--){
                if(i==j){
                    System.out.print ("*\t");
                }else{
                    System.out.print ("\t");
                }
            }
            System.out.println(" ");
        }

    }
    public static void eight_2(int n) {

        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=n; j++){
                if(i+j == n+1){
                    System.out.print ("*\t");
                }else{
                    System.out.print ("\t");
                }
            }
            System.out.println(" ");
        }

    }
    public static void nineth(int n) {

        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=n; j++){
                if(i==j || i+j == n+1){
                    System.out.print ("*\t");
                }else{
                    System.out.print ("\t");

                }
            }
            System.out.println(" ");


        }

    }

    public static void tenth(int n) {
        int os = n/2;
        int is  = -1;
        for(int i =1; i<=n; i++){
            for(int j =1; j<=os;j++){
                System.out.print ("\t");
            }
            System.out.print ("*\t");
            for(int j =1; j<=is;j++){
                System.out.print ("\t");
            }
            if(i>1 && i<n){
                System.out.print ("*\t");
            }
            if(i<=n/2){
                os--;
                is +=2;
            }else{
                os++;
                is -=2;
            }
            System.out.println(" ");
        }
    }

    public static void eleventh(int n) {
        int count = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i;j++){
                System.out.print (count+" ");
                count++;
            }
            System.out.println(" ");
        }

    }

    public static void twelveth(int n) {
        int a = 0;
        int b = 1;
        for(int i = 1; i<=n; i++){

            for(int j = 1; j<=i; j++){
                System.out.print (a+ " ");
                int c = a+b;
                a=b;
                b=c;

            }
            System.out.println(" ");
        }
    }

    public static void thirteenth(int n){
        for(int i =0 ; i<n; i++){
            int icj = 1;
            for(int j = 0 ; j<=i; j++){
                System.out.print (icj + "\t");
                int icjp1 = icj*(i-j)/(j+1);
                icj = icjp1;
            }
            System.out.println(" ");

        }
    }

    public static void fourteenth(int n) {
        for(int i = 1; i<=10; i++){
            System.out.println (n +"X" + i +"=" + (n*i) );
        }
        System.out.println(" ");

    }

    public static void fitheenth(int n) {
        int sp = n/2;
        int st = 1;
        int count = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 0; j<=sp; j++){
                System.out.print ("\t");
                }
            int countin = count;
            for(int k = 1; k<=st; k++){
                System.out.print (countin+"\t" );
                if(k<=st/2){
                    countin++;
                }else {
                    countin--;
                }


            }
            if(i<=n/2){
                sp--;
                st+=2;
                count++;
            }else{
                sp++;
                st -=2;
                count--;
            }

            System.out.println(" ");


        }

    }
}
