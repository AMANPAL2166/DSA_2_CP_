package Fundamental;

import java.util.Scanner;

public class count_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int count = 0;
        while(no != 0){
            no = no/10;
            count++;
        }
        System.out.println(count);
    }
}
