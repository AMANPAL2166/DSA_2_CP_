package Fundamental;

public class prime_fac {
    public static void main(String[] args) {
        int n = 1440;
       for(int i = 2;i<n;i++){
           while(n%i==0){
               n= n/i;
               System.out.println(i);
           }
       }
       if(n!=1){
           System.out.println(n);
       }
    }
}
