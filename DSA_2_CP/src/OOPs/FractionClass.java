package OOPs;

public class FractionClass {
    static class Fraction{
        int num, den;
        Fraction(int n, int d){
            num  = n;
            den = d;
        }
        void print( ){
            System.out.println(this.num + "/" + this.den);
        }
    }

    public static void main(String[] args) {
        Fraction f = new Fraction(2,3);
        f.print();
    }
}
