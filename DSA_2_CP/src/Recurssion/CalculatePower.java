package Recurssion;

public class CalculatePower {
    public static void main(String[] args) {
        int n = 10, s =2;
        System.out.println(cal1(n, 8));

    }

    public static double cal(double n, int s) {
        //n is a base and s is a power
        //base case
        if(s==0){
            return 1;
        }
        double xnm1 = cal(n, s-1);
        double xn = n*xnm1;
        return xn;

    }

    public static double cal1(int x, int n) {{
        //base case
        if(n == 0){
            return 1;
        }
        double xpn2 = cal1(x, n/2);
        double xn = xpn2*xpn2;
        //there are if case
        if(n%2 == 1){
            xn = xn*x;
        }
        return xn;
    }

    }

}
