package Fundamental;

public class reverse_Array {
    public static void main(String[] args) {
        int n = 3453;
        while(n>0){
            int dig = n%10;
            n = n/10;
            System.out.println(dig);
        }
    }
}
