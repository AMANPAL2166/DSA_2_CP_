package Fundamental;

import java.util.Scanner;

public class count_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = 2342;
//        int count = 0;
//        while(no != 0){
//            no = no/10;
//            count++;
//        }
//        System.out.println(count);
        printno(no);

    }

    public static void printno(int n) {
//        while(n!=0){
//            int rem = n%10;
//            System.out.println(rem);
//            n = n/10;
//        }
        //Method second
        int nod = 0;
        int temp = n;
        while(temp != 0){
            temp =temp/10;
            nod++;
        }
        int div = (int)Math.pow(10, nod-1);
        while(div!=0){
            int q = n/div;
            System.out.println(q);
            n= n%div;
            div = div/10;

        }
    }
}

