package Fundamental;

public class Loop {
    public static void main(String[] args) {
        int n = 73 ;
        prime_opt(n);

    }

    public static void prime(int[] n) {//This is right method to find small number but when we'll go for long num. it goes to time limit exside..
        for(int i = 0; i<n.length; i++) {
            System.out.print ("[");

            if (n[i] % n[i] == 0 && n[i] % 2 != 0) {
                System.out.print("[Prime]");

            } else {
                System.out.print("[N-Prime]");
            }
            System.out.print ("]");
        }
    }

    public static void prime_opt(int n) {
        int count = 0;
        for(int i =2; i*i<=n; i++){
            if(n%i==0 ){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
    }
}

