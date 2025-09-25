package Recurssion;

public class Basics {
    public static void main(String[] args) {
        int s = 5, d = 44;
        sequal_d(s,d);
        System.out.println ("Decreasing:- ");
        decreasing(s);
        System.out.println("Increasig: ");
        increasing(22);
        System.out.println("Both increasing and decreasing: ");
        Both_inc_dec(s);

    }
    public static void sequal_d(int s , int d){
        //Base case
        if(s==d) {
            return;
        }
        System.out.println( s );
        sequal_d(s+1, d );
    }

    public static void decreasing(int t) {
        //Base case
        if(t==0){
            return;
        }
        System.out.println(t);
        decreasing(t-1);

    }
    //Note:- Above recursion line it calls up side of recurion call and below the recursio line calls  the downside of the recursion
    public static void increasing(int s) {
        //base case
        if(s==0){
            return;
        }
        increasing(s-1);
        System.out.println(s);

    }

    public static void Both_inc_dec(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        Both_inc_dec(n-1);
        System.out.println(n);

    }
}
