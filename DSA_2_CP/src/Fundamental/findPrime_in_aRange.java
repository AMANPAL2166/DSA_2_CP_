package Fundamental;

import java.util.Scanner;

public class findPrime_in_aRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();

        if(s1>s2){
            return;
        }
        for(int i = s1; i<=s2; i++){
            int count = 0;
            for(int j = 2; j*j <= i;j++ ){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(i);
            }
        }
    }
}
