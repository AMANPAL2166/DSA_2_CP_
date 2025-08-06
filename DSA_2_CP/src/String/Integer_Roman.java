package String;
//https://www.geeksforgeeks.org/dsa/converting-decimal-number-lying-between-1-to-3999-to-roman-numerals/
public class Integer_Roman {
    public static void main(String[] args) {
        int number = 3549;
        System.out.println(inttoroman(number));

    }

    public static String inttoroman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4,1};
        String[] symbol = {"M", "CM","D", "CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder roman = new StringBuilder();
        for(int i = 0; i< values.length && num >0; i++){
            while(num >= values[i]) {
                 roman.append(symbol[i]);
                 num -= values[i];
            }
        }
        return roman.toString();

    }
}
