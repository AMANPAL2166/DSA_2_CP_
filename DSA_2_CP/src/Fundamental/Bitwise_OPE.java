package Fundamental;

public class Bitwise_OPE {
    public static void main(String[] args) {
        int a = 0, b = 4;
        AND(a,b);
        // 7 = 111 & 4 = 100
        //   111
        //  &100
        //   100= 2^0*0 + 2^1*0 + 2^2*1 = 4
        OR(a,b);
        XOR(a,b);
        NOT(a);


    }
    public static void AND(int a, int b){
        int result = a & b;
        System.out.println("AND :- "+result);
    }

    public static void OR(int a, int b) {
        //  0|0 = 0 rest of 1
        int result = a | b;
        System.out.println("OR :- "+result);

    }

    public static void XOR(int a, int b) {
       // 0^0 && 1^1 = 0 rest of 1
        int result = a ^ b ;
        System.out.println("XOR : " + result);

    }

    public static void NOT(int a ) {
        //Bitwise NOT Operator (!~)
        //All the above three bitwise operators are binary operators
        // (i.e, requiring two operands in order to operate).
        // Unlike other bitwise operators, this one requires only one operand to operate.
        //The bitwise Not Operator takes a single value and returns its one’s complement.
        // The one’s complement of a binary number is obtained by toggling all bits in it,
        // i.e, transforming the 0 bit to 1 and the 1 bit to 0.
        System.out.println(
                "Value of a without using NOT operators: " + a
        );
        System.out.println(
                "Inverting using not operator(with sign bit)" + (~a)
        );
        if(a !=1){
            System.out.println("\"Inverting using NOT operator (without sign bit): 1\"");
        }else{
            System.out.println( "Inverting using NOT operator (without sign bit): 0");
        }

    }
}
