package Recurssion;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 25;
        String binaryNumber  = "";
        if(decimal == 0){
            binaryNumber = "0";
        }else{
            int temp = decimal;
            while(temp>0){
                int rem = temp%2; //Get the remainder(last Bit)
                binaryNumber = rem+binaryNumber;//Prepand the remainder to the string
                temp = temp/2;//Divide the number by 2


            }
        }
        System.out.println("Decimal- "+ decimal);
        System.out.println("Binary- "+ binaryNumber);

    }
}
