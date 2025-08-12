package Fundamental;

public class GCD {
    public static void main(String[] args) {
        int a = 33;
        int b =3;
        System.out.println(gcd(a,b));
    }
    public static int gcd(int a, int b) {
        // code here
        return (b == 0) ? a : gcd(b, a % b);
    }
}
