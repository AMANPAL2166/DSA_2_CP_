package CP;
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            char[] digits = s.toCharArray();

            for (int i = 0; i < digits.length; i++) {
                int d = digits[i] - '0';
                int inverted = 9 - d;

                // Pehla digit '9' hai toh use skip karo (0 nahi banana)
                if (i == 0 && inverted == 0) {
                    continue;
                }

                // Agar invert karne par chhota number mil raha hai toh replace karo
                if (inverted < d) {
                    digits[i] = (char) (inverted + '0');
                }
            }

            System.out.println(new String(digits));
        }
    }

