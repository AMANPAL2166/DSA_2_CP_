package Fundamental;

public class Decimal_to_base {
    public static void main(String[] args) {
        int n = 683;
        int b = 8;
        int rv = 0;
        int p = 1;
        while(n>0){
            int dig = n%b;
            n = n/b;
            rv += dig*p;
            p = p*10;
        }
        System.out.println(rv);
    }
}
