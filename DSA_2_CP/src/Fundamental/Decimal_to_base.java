package Fundamental;

public class Decimal_to_base {
    public static void main(String[] args) {
        int n = 8;
        int b = 236;
        int c = 754;
//        decimal_base(n,b);
//        base_decimal(n,b);
//        System.out.println(getValue(n, b, c));
        System.out.println(getsum(n, b , c));
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

    public static int getsum(int b, int b1, int b2) {
        int rv = 0;
        int c= 0;
        int p = 1;
        while(b1>0 || b2>0 || c>0){
            int d1 = b1%10;
            int d2 = b2%10;
            b1 = b1/10;
            b2 = b2/10;
            int d = d1+d2+ c;
            c = d/b;
            d = d%b;
            rv +=d*p;
            p = p *10;
        }
        return rv;

    }
}
