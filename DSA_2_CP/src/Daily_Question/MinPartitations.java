package Daily_Question;

public class MinPartitations {
    public int minPartitions(String n) {
        int maxDigit = 0;
        for (int i = 0; i < n.length(); i++) {
            // Convert char to int ('0' is 48 in ASCII)
            int currentDigit = n.charAt(i) - '0';
            if (currentDigit > maxDigit) {
                maxDigit = currentDigit;
            }
            // Optimization: if we find a 9, we can't do worse
            if (maxDigit == 9) return 9;
        }
        return maxDigit;
    }

    public static void main(String[] args) {

    }
}
