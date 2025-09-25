package Recurssion;

public class CalculatePower {
    public static void main(String[] args) {
        int n = 2, s =-2;
        System.out.println(cal(n,3));

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
}
