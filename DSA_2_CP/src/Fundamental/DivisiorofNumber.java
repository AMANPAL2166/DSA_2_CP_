package Fundamental;

public class DivisiorofNumber {
    public static void main(String[] args) {
        int n = 25;
        printdivisior(n);

    }
    static void printdivisior(int n ){
        System.out.println("The divisior of " + n + " are: ");
        //Iterate up to the square root of a number 'n'
        for(int i = 1; i<=Math.sqrt(n);i++){
            //if i divide 'evenly'
            if(n%i == 0 ){
                //print the divisor i
                System.out.print(i + " ");
                //If 'i' is not the square root of 'n' print the other divisor
                if(i != n/i ){
                    System.out.print((n/i) + " ");
                }

            }

        }
        System.out.println(" " );
    }
}
