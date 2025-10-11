package Fundamental;

import java.util.Scanner;

public class print_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int a = 0;
        int b = 1;//by default hote hai3
        for(int i = 0; i<s; i++){
            System.out.println(a);
            int c = a+b;
            a=b;
            b=c;

        }
    }
}
