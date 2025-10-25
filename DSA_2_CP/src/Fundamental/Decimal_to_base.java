package Fundamental;

public class Decimal_to_base {
    public static void main(String[] args) {
        int n = 1172;
        int b = 8;
//        decimal_base(n,b);
        base_decimal(n,b);
    }

    public static void decimal_base(int n, int b) {
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

    public static void base_decimal(int n, int m) {
        int rv = 0;
        int p = 1;
        while(n>0){
            int dig = n%10;
            n = n/10;
            rv +=dig*p;
            p = p*m;

        }
        System.out.println(rv);
    }
}
