package Fundamental;

public class Bitwise_OPE {
    public static void main(String[] args) {
        int a = 13, b = 2;
        AND(a,b);
        // 7 = 111 & 4 = 100
        //   111
        //  &100
        //   100= 2^0*0 + 2^1*0 + 2^2*1 = 4
        OR(a,b);
        XOR(a,b);
        NOT(a);
        Leftshift(a);
        Left_Binary(a);
        RightShift(a, b);
        System.out.println("Set number: "+set(a,b));
        System.out.println("Unset number: " + unset_clear(a,b));
        System.out.println("Toggle of a number: "+ toogle(a,b));
        System.out.println("At position: " + at_position(a,b));


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

    public static void Leftshift(int a) {
        System.out.println("Left swift: ");
        System.out.println(a + "<< 1 =" + (a << 1));
        //Every time we shift a number towards the left by 1 bit it multiply that number by 2.


    }
    //This method for binary converter
    public static void Left_Binary(int num1) {
        String bt1 = Integer.toBinaryString(num1);
        bt1 = String.format("%32s", bt1).replace(' ', '0');
        System.out.println(bt1);
        int num2 = num1<<1;
        String bt2 = Integer.toBinaryString(num2);
        bt2 = String.format("32s", bt2).replace(' ', '0');
        System.out.println(bt2);
        int num3 = num1<<2;
        String bitset13 = Integer.toBinaryString(num3);
        bitset13 = String.format("16s", bitset13).replace(' ', '0');
        System.out.println(bitset13);


    }

    public static void RightShift(int s, int num) {
        System.out.println("Right shift of binary number: ");
        System.out.println((s>>num) + " Right shift number ");
        //Note: Every time we shift a number towards the right by 1 bit it divides that number by 2.

    }
    //How to set a bit in the number?
    //If we want to set a bit at nth position in the number 'num', it can be done using the 'OR' operator
    //(| ).
    // First we left shift 1 to n position via (1<<n)
    //Then, use the "OR" operator to set the bit at the position. "OR" operator is used because it will set the bit
    // even  if the bit is unset previously in ths binary representation of the number 'num'.

    //If the bit would be already set then it would remain unchanged.
    public static int  set(int num, int pas ) {
        /// First step shift' 1', second
        //step is bitwise "OR"
        num |= (1<<pas);
        return num;

    }
    // How to unset/clear a bit at n'th position in the number
    public static int  unset_clear(int num, int pass) {
        num = num & ~(1<<pass);
        return num;

    }
    // Toggling a bit at nth position
    public static int  toogle(int num, int pos) {
        //first step to shift 1, then 2nd step is to XOR with given number
        num ^=(1<<pos);
        return num;

    }
    /// Checking if the bit at nth position is Set or Unset
    public static int at_position(int num, int pos) {
        int bit = num & (1<<pos);
        return bit;


    }

 }
