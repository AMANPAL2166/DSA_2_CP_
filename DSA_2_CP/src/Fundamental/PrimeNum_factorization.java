package Fundamental;
//https://www.geeksforgeeks.org/problems/prime-number2314/1?amp%3Butm_campaign&utm_source=geeksforgeeks&%3Butm_medium=ml_article_practice_tab
public class PrimeNum_factorization {
    public static void main(String[] args) {
        int n = 44;
        System.out.println(isPrime(n));

    }
    static boolean isPrime(int n) {
        // code here
        // corner cases
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0) return false;

        // check till √n
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}
