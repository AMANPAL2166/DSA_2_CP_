package CP;
import java.util.*;
public class Poster_Problem {



        static List<Integer> getDivisors(int x) {
            List<Integer> res = new ArrayList<>();
            for (int i = 1; i * i <= x; ++i) {
                if (x % i == 0) {
                    res.add(i);
                    if (i != x / i) res.add(x / i);
                }
            }
            return res;
        }

        public static int solve(int[] a) {
            int n = a.length;
            int gcdEven = a[0];
            int gcdOdd = (n > 1 ? a[1] : 0);

            // compute GCDs
            for (int i = 2; i < n; i += 2) gcdEven = gcd(gcdEven, a[i]);
            for (int i = 3; i < n; i += 2) gcdOdd = gcd(gcdOdd, a[i]);

            // Case 1: even red, odd blue
            for (int d : getDivisors(gcdEven)) {
                boolean ok = true;
                for (int i = 1; i < n; i += 2) {
                    if (a[i] % d == 0) {
                        ok = false;
                        break;
                    }
                }
                if (ok) return d;
            }

            // Case 2: even blue, odd red
            if (n > 1) {
                for (int d : getDivisors(gcdOdd)) {
                    boolean ok = true;
                    for (int i = 0; i < n; i += 2) {
                        if (a[i] % d == 0) {
                            ok = false;
                            break;
                        }
                    }
                    if (ok) return d;
                }
            }

            return -1;
        }

        static int gcd(int a, int b) {
            return b == 0 ? a : gcd(b, a % b);
        }


}
