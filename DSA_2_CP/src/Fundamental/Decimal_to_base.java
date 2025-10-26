package Fundamental;

public class Decimal_to_base {
    public static void main(String[] args) {
        int n = 172;
        int b = 8;
        int c = 2;
//        decimal_base(n,b);
//        base_decimal(n,b);
        System.out.println(getValue(n, b, c));
    }

    public static  int decimal_base(int n, int b) {
        int rv = 0;
        int p = 1;
        while(n>0){
            int dig = n%b;
            n = n/b;
            rv += dig*p;
            p = p*10;
        }
        return rv;

    }

    public static int base_decimal(int n, int m) {
        int rv = 0;
        int p = 1;
        while(n>0){
            int dig = n%10;
            n = n/10;
            rv +=dig*p;
            p = p*m;

        }
        return rv;
    }

    public static int getValue(int n, int b1, int b2) {
        int dec = decimal_base(n,b1);
        int dn = base_decimal(dec, b2);
        return dn;
    }
}
