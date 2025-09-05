package Array;

public class mypow {
    public static void main(String[] args) {
        double x = 2.10000;
        int n = 3;
        System.out.println(my_pow1(x,n));
        System.out.println(myPow2(x,n));



    }
    public static double my_pow1(double x, int n){
        double ans = 1;
       int power = Math.abs(n);
        for(int i = 1; i<=power; i++){
            ans *= x;
        }
        if(n<0){
            return 1.0/ans;
        }
        return (int)ans;
    }
    public static double myPow2(double x, int n) {
        if (n == 0) return 1.0;

        long exp = n;
        if (exp < 0) {
            x = 1 / x;
            exp = -exp;
        }

        double ans = 1.0;
        while (exp > 0) {
            if ((exp & 1) == 1) ans *= x; // multiply when bit is 1
            x *= x;    // square the base
            exp >>= 1; // divide exp by 2
        }
        return ans;
    }

}
