package Recurssion;

public class DecimalToBinary {
    public static void main(String[] args) {
//        int decimal = 25;
//        String binaryNumber  = "";
//        if(decimal == 0){
//            binaryNumber = "0";
//        }else{
//            int temp = decimal;
//            while(temp>0){
//                int rem = temp%2; //Get the remainder(last Bit)
//                binaryNumber = rem+binaryNumber;//Prepand the remainder to the string
//                temp = temp/2;//Divide the number by 2
//
//
//            }
//        }
//        System.out.println("Decimal- "+ decimal);
//        System.out.println("Binary- "+ binaryNumber);
//        System.out.println("Recursion solution: "+decToBin(decimal));
//        System.out.println("Recursion solution_2 : "+decToBin2(decimal));
        System.out.println("Sum of digits: "+ sumOfDigit(123456));

    }
    public static String decToBin(int d){
        if(d>1){
            return decToBin(d/2)+decToBin(d%2);
        }
        return String.valueOf(d);
    }
    public static int decToBin2(int d){
        if(d==0){
            return 0;
        }else{
            return (d%2+10 * decToBin2(d/2));
        }

    }
    public static int sumOfDigit(int d){
        if(d==0){
            return 0;
        }
        return (d%10 + sumOfDigit(d/10));

    }

}
